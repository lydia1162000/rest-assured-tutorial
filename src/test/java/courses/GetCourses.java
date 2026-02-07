package courses;

import io.restassured.RestAssured;

public class GetCourses {
    public static void main(String[] args) {

        RestAssured.given().baseUri("http://localhost:8080")
                .when().get("/courses")
                .then().log().all();
    }
}
