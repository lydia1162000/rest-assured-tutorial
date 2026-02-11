package courses;

import java.util.UUID;

import static io.restassured.RestAssured.given;

public class EditCourse {
    public static void main(String[] args) {
        Course course = new Course(UUID.randomUUID(),"Selenium with java",20.5,100);
        given().baseUri("http://localhost:8080")
                .pathParams("id","7905b7e3-38e8-4935-b20a-f588f3bf2f4c")
                .body(course)
                .when().get("/courses/{id}")
                .then().log().all();

    }
}
