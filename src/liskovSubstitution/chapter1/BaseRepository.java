package liskovSubstitution.chapter1;

import liskovSubstitution.chapter1.models.Category;
import liskovSubstitution.chapter1.models.Product;

public class BaseRepository<T> {

    protected T create(T entity) {

        try {
            if (entity.getClass() == Category.class) {
                if (((Category) entity).getName().isEmpty()) {
                    throw new NullPointerException("Category name cannot be blank");
                }
                // Db Conn Logic
            } else if (entity.getClass() == Product.class) {
                if (((Product) entity).getPrice() <= 0) {
                    throw new Exception("Product price cannot be less then 0");
                } else if (((Product) entity).getDescription().length() < 100) {
                    throw new Exception("Product description length has to be grater than 100");
                }
                //Db Conn Logic
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return entity;
    }
}
