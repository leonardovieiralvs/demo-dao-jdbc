package application;

import entities.Seller;
import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.dao.impl.SellerDaoJDBC;



public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

    }
}
