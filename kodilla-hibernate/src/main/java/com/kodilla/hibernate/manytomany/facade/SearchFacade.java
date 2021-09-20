package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmploeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmploeeDao employeeDao;

    public List<Company> retrieveCompanyLike(String name) {
        return companyDao.retrieveByCompanyNameLike(name);
    }

    public List<Employee> retrieveEmployeeLike(String name) {
        return employeeDao.retrieveByLastnameLike(name);
    }

}
