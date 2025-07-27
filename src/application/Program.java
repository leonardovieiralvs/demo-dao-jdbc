package application;

import entities.Department;
import entities.Seller;
import models.dao.DaoFactory;
import models.dao.SellerDao;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(15);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        List<Seller> list = sellerDao.findByDepartment(new Department(1, null));
        for (Seller seller1 : list) {
            System.out.println(seller1);
        }

        System.out.println("\n=== TEST 3: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller seller1 : list) {
            System.out.println(seller1);
        }

//        System.out.println("\n=== TEST 4: seller insert ===");
//        seller = new Seller(null, "Neo", "neozion@gmail.com", new Date(), 1000.0, new Department(2, null));
//        sellerDao.insert(seller);
//        System.out.println("Inserted! New id = " + seller.getId());

        System.out.println("\n=== TEST 5: seller update ===");
        seller = sellerDao.findById(15);
        seller.setName("Heisenberg");
        sellerDao.update(seller);
    }
}
