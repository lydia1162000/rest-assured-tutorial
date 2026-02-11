package courses;

import static io.restassured.RestAssured.given;

public class GetCourseByID {
    public static void main(String[] args) {
        given().baseUri("http://localhost:8080")
                .pathParam("id", 1)
                .when().get("/course/{id}")
                .then().log().all()
                .assertThat().statusCode(200);
    }
}
