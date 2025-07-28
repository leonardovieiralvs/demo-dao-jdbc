package application;

import entities.Department;
import models.dao.DaoFactory;
import models.dao.DepartmentDao;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao depDao = DaoFactory.createDepartmentDao();
        System.out.println("=== TEST 1: department findById ===");
        Department dep = depDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: department findAll ===");
        List<Department> depList = depDao.findAll();
        for (Department department : depList) {
            System.out.println(department);
        }

        System.out.println("\n=== TEST 3: department insert ===");
        dep = new Department(null, "Music");
        depDao.insert(dep);
        System.out.println("Successful");
    }
}
