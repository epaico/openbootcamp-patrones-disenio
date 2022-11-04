package estructurales.proxy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        ProductDaoImpl productDao = new ProductDaoImpl();
        productDao.save(new Product("laptop", new BigDecimal(20)));

        System.out.println("=======================");

        ProductDaoProxy productDaoProxy = new ProductDaoProxy(productDao);
        productDaoProxy.save(new Product("mouse", new BigDecimal(10)));

    }
}
