package com.company.final_.final_project.client;

import com.company.final_.final_project.query_builder.QueryBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class App {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        QueryBuilder builder = new QueryBuilder();
        builder.bool().mustMatch("item", "Milk").mustMatch("item_type", "Dairy");
        builder.bool().shouldMatch("product_location", "New Mexico").shouldMatch("warehouse_number", 37);
        try {
            // Java objects to JSON string - pretty-print
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(builder);

            System.out.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
