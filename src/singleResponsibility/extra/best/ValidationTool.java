package singleResponsibility.extra.best;

public class ValidationTool {

    public static boolean validateProduct(ProductCreateDto productCreateDto) throws Exception {
        if (productCreateDto.name == null) {
            throw new Exception("Product name cannot be blank");
        } else if (productCreateDto.category == null) {
            throw new Exception("Product name cannot be blank");
        } else if (productCreateDto.price <= 0) {
            throw new Exception("Product price cannot be equals and less than 0");
        } else if (productCreateDto.files.length == 0) {
            throw new Exception("Product must have at least one picture");
        }
        return true;
    }
}
