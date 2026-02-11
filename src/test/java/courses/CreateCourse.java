package courses;

import io.restassured.http.ContentType;

import java.util.UUID;

import static io.restassured.RestAssured.given;

public class CreateCourse {
    public static void main(String[] args) {
     Course course = new Course(UUID.randomUUID(),"selenium course",50.5,120);
     given().baseUri("http://localhost8080")
             .contentType(ContentType.JSON)
             .body(course)
             .when().post("/courses")
             .then().log().all()
             .assertThat().statusCode(201);
    }
}
