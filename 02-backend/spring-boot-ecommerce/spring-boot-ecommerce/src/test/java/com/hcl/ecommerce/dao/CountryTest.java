package com.hcl.ecommerce.dao;

import com.hcl.ecommerce.entity.Country;
import com.hcl.ecommerce.entity.ProductCategory;
import com.hcl.ecommerce.entity.State;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.List;

@ContextConfiguration(classes = {CountryRepository.class})
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.hcl.ecommerce.entity"})
@DataJpaTest
public class CountryTest {

    @Autowired
    private CountryRepository countryRepo;

    @Autowired
    private StateRepository stateRepo;

    @BeforeEach
    public void setUp() {

        List<State> stateListUS = new ArrayList<>();
        List<State> stateListCA = new ArrayList<>();

        Country c1 = Country.builder()
                .code("US")
                .name("United States")
                .states(stateListUS)
                .build();
        Country c2 = Country.builder()
                .code("CA")
                .name("Canada")
                .states(stateListCA)
                .build();

        State s1 = State.builder()
                .name("North Carolina")
                .country(c1)
                .build();
        State s2 = State.builder()
                .name("South Carolina")
                .country(c1)
                .build();
        State s3 = State.builder()
                .name("Washington")
                .country(c1)
                .build();

        State s4 = State.builder()
                .name("Quebec")
                .country(c2)
                .build();
        State s5 = State.builder()
                .name("Ontario")
                .country(c2)
                .build();
        State s6 = State.builder()
                .name("Nova Scotia")
                .country(c2)
                .build();

        stateRepo.save(s1);
        stateRepo.save(s2);
        stateRepo.save(s3);
        stateRepo.save(s4);
        stateRepo.save(s5);
        stateRepo.save(s6);

        stateListUS.add(s1);
        stateListUS.add(s2);
        stateListUS.add(s3);

        stateListCA.add(s4);
        stateListCA.add(s5);
        stateListCA.add(s6);

        countryRepo.save(c1);
        countryRepo.save(c2);

        System.out.println("\n=========================\n");
    }

    @Test
    void testCreateCountry() {

        System.out.println("TEST CREATE CRUD OPERATION");

        Country countryCreate = Country.builder()
                .code("GB")
                .name("Great Britain")
                .states(null)
                .build();

        countryRepo.save(countryCreate);

        System.out.println("New Country's ID: " + countryCreate.getId());
        Assertions.assertTrue(countryCreate.getId() > 0);

        System.out.println("=============================");
    }

    @Test
    void testReadCountry() {

        System.out.println("TEST READ CRUD OPERATION");

        List<Country> countryList = countryRepo.findAll();

        System.out.println("Reading Countries");
        for (Country country : countryList) {

            System.out.println("Country ID: " + country.getId()
                                + "\nCountry Name: " + country.getName());
            Assertions.assertNotNull(country);
        }

        System.out.println("=============================");
    }

    @Test
    void testUpdateCountry() {

        System.out.println("TEST UPDATE CRUD OPERATION");

        List<Country> countryList = countryRepo.findAll();
        Country countryUpdate = countryList.get(1);
        int id = countryUpdate.getId();
        System.out.println("Before Update");
        System.out.println("ID: " + id + "\nName: " + countryUpdate.getName());
        System.out.println("After Update");

        countryUpdate.setName("United States of America");
        countryRepo.save(countryUpdate);

        System.out.println("ID: " + id + "\nName: " + countryUpdate.getName());
        String newName = "United States of America";
        Assertions.assertSame(countryUpdate.getName(), newName);

        System.out.println("=============================");
    }

    @Test
    void testDeleteCountry() {

        System.out.println("TEST UPDATE CRUD OPERATION");

        Country countryCreate = Country.builder()
                .code("GB")
                .name("Great Britain")
                .states(null)
                .build();

        countryRepo.save(countryCreate);

        List<Country> countryList = countryRepo.findAll();
        int sizeBefore = countryList.size();
        System.out.println("Countries in repo before: " + sizeBefore);

        for (int i = 0; i < countryList.size(); i++) {

            if (countryList.get(i).getCode() == "GB") {
                countryRepo.deleteById(countryList.get(i).getId());
            }
        }

        List<Country> countryListAfter = countryRepo.findAll();
        int sizeAfter = countryListAfter.size();
        System.out.println("Countries in repo after: " + sizeAfter);

        Assertions.assertTrue(sizeBefore > sizeAfter);
        System.out.println("=============================");
    }
}
