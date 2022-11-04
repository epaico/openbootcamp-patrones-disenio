package estructurales.proxy;

public class ProductDaoProxy implements ProductDao {

    private final ProductDao productDao;

    public ProductDaoProxy(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void save(Product product) {
        System.out.println("LOGGER INFO -> before save product...");
        productDao.save(product);
        System.out.println("LOGGER INFO -> after save product...");
    }

    @Override
    public Product find(String name) {
        System.out.println("LOGGER INFO -> before find product...");
        Product product = productDao.find("test");
        System.out.println("LOGGER INFO -> after find product...");
        return product;
    }
}
