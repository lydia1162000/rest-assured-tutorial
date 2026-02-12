package courses;

import io.restassured.RestAssured;
import io.restassured.http.Header;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class GetCourses {
    public static void main(String[] args) {
        Header header = new Header("API_KEY","QAcart");
        RestAssured.given().baseUri("http://localhost:8080")
                .header(header)
                .when().get("/courses")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("title", hasItem("Selenium WebDriver"));
//                .assertThat().body("[1].title", equalTo("Selenium WebDriver"));
    }
}
