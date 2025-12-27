package org.example;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class Country_Pincodes {
    public static void main(String[] args) {
        given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("us/90210")
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }

}
