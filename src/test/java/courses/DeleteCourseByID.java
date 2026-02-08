package courses;

import static io.restassured.RestAssured.given;

public class DeleteCourseByID {
    public static void main(String[] args) {
        given().baseUri("http://localhost:8080")
                .pathParams("id",1)
                .when().delete("/courses/{id}")
                .then().log().all();
    }
}
