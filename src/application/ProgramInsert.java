package application;

import entities.Department;
import entities.Seller;
import models.dao.DaoFactory;
import models.dao.SellerDao;

import java.util.Date;

public class ProgramInsert {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Department dep = new Department(2, null);
        Seller seller = new Seller(null, "Neo", "neozion@gmail.com", new Date(), 1000.0, dep);
        sellerDao.insert(seller);
        System.out.println("Inserted! New id = " + seller.getId());
    }
}
