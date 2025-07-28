package application;

import entities.Department;
import models.dao.DaoFactory;
import models.dao.DepartmentDao;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao depDao = DaoFactory.createDepartmentDao();
        System.out.println("=== TEST 1: department findById ===");
        Department dep = depDao.findById(1);
        System.out.println(dep);

    }
}
