package application;

import entities.Department;
import models.dao.DaoFactory;
import models.dao.DepartmentDao;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDao depDao = DaoFactory.createDepartmentDao();
        System.out.println("=== TEST 1: department findById ===");
        Department dep = depDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: department findAll ===");
        List<Department> depList = depDao.findAll();
        for (Department department : depList) {
            System.out.println(department);
        }

//        System.out.println("\n=== TEST 3: department insert ===");
//        dep = new Department(null, "Music");
//        depDao.insert(dep);
//        System.out.println("Inserted! New id: " + dep.getId());

        System.out.println("\n=== TEST 4: department update ===");
        dep = depDao.findById(3);
        dep.setName("Dark");
        depDao.update(dep);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 5: department delete ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        depDao.deleteById(id);
        System.out.println("Delete completed!");
    }
}
