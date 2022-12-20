package liskovSubstitution.chapter2;

import liskovSubstitution.chapter2.models.Product;

public class ProductRepository extends BaseRepository<Product>{
    @Override
    protected Product create(Product entity) {
        return null;
    }

    @Override
    protected Product update(Product entity) {
        return null;
    }

    public void delete(Product product) {

    }
}
