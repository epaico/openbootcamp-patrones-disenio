package estructurales.proxy;

import java.math.BigDecimal;

public class ProductDaoImpl implements ProductDao {
    @Override
    public void save(Product product) {
        System.out.println("save product success...");
    }

    @Override
    public Product find(String name) {
        return new Product("laptop", new BigDecimal(100));
    }
}
