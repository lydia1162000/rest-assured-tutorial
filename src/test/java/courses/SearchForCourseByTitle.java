package courses;

import static io.restassured.RestAssured.given;

public class SearchForCourseByTitle {
    public static void main(String[] args) {
        given().baseUri("http://localhost:8080")
                .queryParam("title","Selenium")
                .when().get("/courses/search")
                .then().log().all();
    }
}
