package business;

import core.logging.Logger;
import dataAccess.JdbcProductDao;
import dataAccess.ProductDao;
import entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;


    public ProductManager(ProductDao productDao,List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception {
        if(product.getUnitPrice()<10){
            throw new Exception("Urun fiyati 10 dan kucuk olamaz.");
        }
        ProductDao productDao=new JdbcProductDao();
        productDao.add(product);
        for(Logger logger:loggers){
            logger.log(product.getName());
        }
    }
}
