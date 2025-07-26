package application;

import entities.Seller;
import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.dao.impl.SellerDaoJDBC;



public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

    }
}
