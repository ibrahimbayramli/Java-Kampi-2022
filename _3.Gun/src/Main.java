import business.ProductManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.JdbcProductDao;
import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1=new Product(1,"Iphone XR",10000);
        List<Logger> loggers= new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());
        ProductManager productManager=new ProductManager(new JdbcProductDao(),loggers);
        try {
            productManager. add(product1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}