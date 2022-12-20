package singleResponsibility.extra.best;

import java.io.File;

public class ProductController {

    private final FileService fileService;

    public ProductController(FileService fileService) {
        this.fileService = fileService;
    }

    public void add(ProductCreateDto productCreateDto) throws Exception {
        ValidationTool.validateProduct(productCreateDto);
        fileService.upload(productCreateDto.files);
        // add product using dao or service
        // return response
    }
}
