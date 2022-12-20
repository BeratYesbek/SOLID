package singleResponsibility.extra.worse;

import java.io.File;

public class ProductController {


    public void add(ProductCreateDto productCreateDto) throws Exception {
        if (productCreateDto.name == null) {
            throw new Exception("Product name cannot be blank");
        } else if (productCreateDto.category == null) {
            throw new Exception("Product category cannot be blank");
        } else if (productCreateDto.price <= 0) {
            throw new Exception("Product price cannot be equals and less than 0");
        } else if (productCreateDto.file.length == 0) {
            throw new Exception("Product must have at least one picture");
        }

        for (File file : productCreateDto.file) {
         //   if (file.getName() == "jpg")
            // File service upload S3, Cloudinary or something else
        }

        // add product using dao or service
        // return response
    }
}
