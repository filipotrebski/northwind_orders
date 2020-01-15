package pl.agh.db2.northwind.mapper;

import org.springframework.stereotype.Component;
import pl.agh.db2.northwind.model.Product;
import pl.agh.db2.northwind.model.ProductDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    public Product mapToProduct(final ProductDto productDto){
        return new Product(
                productDto.getProductId(),
                productDto.getProductName(),
                productDto.getSupplierId(),
                productDto.getCategoryId(),
                productDto.getQuantityPerUnit(),
                productDto.getUnitPrice(),
                productDto.getUnitsInStock(),
                productDto.getUnitsInOrder(),
                productDto.getReorderLevel(),
                productDto.getDiscountinued()
        );
    }
    public ProductDto mapToProductDto(final Product product) {
        return new ProductDto(
                product.getProductId(),
                product.getProductName(),
                product.getSupplierId(),
                product.getCategoryId(),
                product.getQuantityPerUnit(),
                product.getUnitPrice(),
                product.getUnitsInStock(),
                product.getUnitsInOrder(),
                product.getReorderLevel(),
                product.getDiscountinued()
        );
    }

    public List<ProductDto> mapToProductDtoList(final List<Product> productList) {
        return productList.stream()
                .map( t -> new ProductDto(
                        t.getProductId(),
                        t.getProductName(),
                        t.getSupplierId(),
                        t.getCategoryId(),
                        t.getQuantityPerUnit(),
                        t.getUnitPrice(),
                        t.getUnitsInStock(),
                        t.getUnitsInOrder(),
                        t.getReorderLevel(),
                        t.getDiscountinued()
                ))
                .collect(Collectors.toList());
    }
}
