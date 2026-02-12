package courses;

import io.restassured.http.ContentType;

import java.util.UUID;

import static io.restassured.RestAssured.given;

public class CreateCourse {
    public static void main(String[] args) {
        Course course = Course.builder().title("Selenium with java").price(20.5).numOfVideos(30).build();
     given().baseUri("http://localhost8080")
             .contentType(ContentType.JSON)
             .body(course)
             .when().post("/courses")
             .then().log().all()
             .assertThat().statusCode(201);
    }
}
