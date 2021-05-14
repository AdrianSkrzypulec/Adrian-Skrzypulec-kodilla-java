package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "List test name";

    @Test
    void testTaskListDaoSave() {

        //Given
        TaskList taskList = new TaskList(0, LISTNAME, "Description");
        taskListDao.save(taskList);

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);

        String result = "";
        for (TaskList test : readTaskList) {
            result = test.getListName();
        }

        //Then
        Assert.hasText(LISTNAME, result);
        Assert.hasText(LISTNAME, readTaskList.get(0).getListName());

        //CleanUp
        taskListDao.deleteAll();
    }
}
