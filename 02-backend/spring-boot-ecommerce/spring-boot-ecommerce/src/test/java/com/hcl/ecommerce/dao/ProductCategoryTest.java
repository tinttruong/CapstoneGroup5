package com.hcl.ecommerce.dao;

import com.hcl.ecommerce.entity.Product;
import com.hcl.ecommerce.entity.ProductCategory;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

import java.math.BigDecimal;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ContextConfiguration(classes = {ProductCategoryRepository.class})
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.hcl.ecommerce.entity"})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
@DataJpaTest
public class ProductCategoryTest {

    // Required Repos
    @Autowired
    private ProductCategoryRepository prodCatRepo;


    @BeforeAll
    public void setUp() {

        ProductCategory pc1 = ProductCategory.builder()
                .categoryName("Test Category")
                .thumbnailUrl("assets/images/test.jpg")
                .products(null)
                .build();

        ProductCategory pc2 = ProductCategory.builder()
                .categoryName("Test Category 2")
                .thumbnailUrl("assets/images/test.jpg")
                .products(null)
                .build();

        prodCatRepo.save(pc1);
        prodCatRepo.save(pc2);
    }


    @Test
    public void testCreateProductCategory() {

        ProductCategory pc3 = ProductCategory.builder()
                .categoryName("Test Category 2")
                .thumbnailUrl("assets/images/test.jpg")
                .products(null)
                .build();

        prodCatRepo.save(pc3);

        Assertions.assertTrue(pc3.getId() > 0);
    }

    @Test
    public void testReadProductCategory() {

        List<ProductCategory> prodCatList = prodCatRepo.findAll();

        System.out.println("Reading ProductCategories");
        for (ProductCategory productCategory : prodCatList) {

            System.out.println("ProductCategory ID: " + productCategory.getId());
            Assertions.assertNotNull(productCategory);
        }

    }

    @Test
    public void testUpdateProductCategory() {

        ProductCategory pcTest = prodCatRepo.getById(1L);

        Assertions.assertTrue(pcTest.getProducts().isEmpty());

        System.out.println("Product Category Name Original: " + pcTest.getCategoryName());
        System.out.println("Product Category Products Original: " + pcTest.getProducts().toString());

        Product p1 = Product.builder()
                .category(pcTest)
                .sku("TEST-PROD-0001")
                .name("Test Product")
                .description("this is a description for the test product")
                .unitPrice(new BigDecimal(9.99))
                .imageUrl("assets/images/products/placeholder.png")
                .active(true)
                .unitsInStock(100)
                .dateCreated(new Date())
                .lastUpdated(new Date())
                .build();

        Set<Product> pSet = new HashSet<>();
        pSet.add(p1);

        prodCatRepo.getById(1L).setProducts(pSet);

        prodCatRepo.save(pcTest);
        System.out.println("Product Category Name Original: " + prodCatRepo.getById(1L).getCategoryName());
        System.out.println("Product Category Products Original: " + prodCatRepo.getById(1L).getProducts().toString());
        Assertions.assertTrue(prodCatRepo.getById(1L).getProducts().size() > 0);
    }

    @Test
    public void testDeleteProductCategory() {

        ProductCategory pcDelete = prodCatRepo.getById(1L);
        System.out.println("Category for deletion:\n" + "Name: " + pcDelete.getCategoryName()
                            + "\nID: " + pcDelete.getId());

        prodCatRepo.delete(pcDelete);

        Assertions.assertFalse(prodCatRepo.findAll().contains(pcDelete));
    }
}
