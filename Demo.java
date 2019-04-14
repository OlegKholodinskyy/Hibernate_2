package lesson1_hw;

import org.hibernate.Session;

public class Demo {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
/*
        Product product = new Product();
        product.setId(376);
        product.setName("Bred3");
        product.setDescription("Some description");
        product.setPrice(20);

        productRepository.save(product);

        product.setName("Bred3");
        product.setDescription("Some other description");
        product.setPrice(20);

        productRepository.update(product);
*/
        productRepository.delete(376);


    }
}
