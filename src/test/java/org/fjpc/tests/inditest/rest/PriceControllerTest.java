package org.fjpc.tests.inditest.rest;

import org.fjpc.tests.inditest.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc
public class PriceControllerTest {

    @Autowired
    private MockMvc mvc;

    // Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1 (ZARA)
    @Test
    public void test1() throws Exception {
        mvc.perform(get("/v1/prices?brand=1&product=35455&date=2020-06-14-10.00.00"))
                .andExpect(status().isOk())
                .andExpect(content().json("{" +
                        "\"priceId\": 1," +
                        "\"brandId\": 1," +
                        "\"productId\": 35455," +
                        "\"price\":  35.50," +
                        "\"date\": \"2020-06-14-10.00.00\"" +
                        "}"));
    }

    // Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1 (ZARA)
    @Test
    public void test2() throws Exception {
        mvc.perform(get("/v1/prices?brand=1&product=35455&date=2020-06-14-16.00.00"))
                .andExpect(status().isOk())
                .andExpect(content().json("{" +
                        "\"priceId\": 2," +
                        "\"brandId\": 1," +
                        "\"productId\": 35455," +
                        "\"price\":  25.45," +
                        "\"date\": \"2020-06-14-16.00.00\"" +
                        "}"));
    }

    // Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1 (ZARA)
    @Test
    public void test3() throws Exception {
        mvc.perform(get("/v1/prices?brand=1&product=35455&date=2020-06-14-21.00.00"))
                .andExpect(status().isOk())
                .andExpect(content().json("{" +
                        "\"priceId\": 1," +
                        "\"brandId\": 1," +
                        "\"productId\": 35455," +
                        "\"price\":  35.50," +
                        "\"date\": \"2020-06-14-21.00.00\"" +
                        "}"));
    }

    // Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1 (ZARA)
    @Test
    public void test4() throws Exception {
        mvc.perform(get("/v1/prices?brand=1&product=35455&date=2020-06-15-10.00.00"))
                .andExpect(status().isOk())
                .andExpect(content().json("{" +
                        "\"priceId\": 3," +
                        "\"brandId\": 1," +
                        "\"productId\": 35455," +
                        "\"price\": 30.50," +
                        "\"date\": \"2020-06-15-10.00.00\"" +
                        "}"));
    }

    // Test 5: petición a las 21:00 del día 16 del producto 35455 para la brand 1 (ZARA)
    @Test
    public void test5() throws Exception {
        mvc.perform(get("/v1/prices?brand=1&product=35455&date=2020-06-16-21.00.00"))
                .andExpect(status().isOk())
                .andExpect(content().json("{" +
                        "\"priceId\": 4," +
                        "\"brandId\": 1," +
                        "\"productId\": 35455," +
                        "\"price\": 38.95," +
                        "\"date\": \"2020-06-16-21.00.00\"" +
                        "}"));
    }
}
