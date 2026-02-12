package courses;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetCourseByID {
    public static void main(String[] args) {
       Response response= given().baseUri("http://localhost:8080")
                .pathParam("id", "7c5b17f8-8231-4fe1-b556-32c1f3b82b7d")
                .when().get("/courses/{id}")
                .then().extract().response();

       int status = response.statusCode();
       String id = response.path("id");
       float price = response.path("price");
       int numOfVideos = response.path("numOfVideos");
        System.out.println(status+id+price+numOfVideos);
    }
}
