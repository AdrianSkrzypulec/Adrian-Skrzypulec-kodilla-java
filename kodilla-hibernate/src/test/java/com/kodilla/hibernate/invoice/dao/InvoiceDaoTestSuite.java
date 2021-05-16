package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product("Rower");
        Product product2 = new Product("Koło");
        Product product3 = new Product("Dętka");
        Item item1 = new Item(product1,new BigDecimal(1399), 1, new BigDecimal(1399));
        Item item2 = new Item(product2,new BigDecimal(200), 2, new BigDecimal(400));
        Item item3 = new Item(product3, new BigDecimal(20), 3, new BigDecimal(60));
        Invoice invoice = new Invoice("1/2021");
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        int result = invoice.getItems().size();

        //Then
        assertNotEquals(0, result);

        //Cleanup
        invoiceDao.deleteById(id);
    }
}
