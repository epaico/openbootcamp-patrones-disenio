package estructurales.proxy;

public interface ProductDao {

    void save(Product product);

    Product find(String name);

}
