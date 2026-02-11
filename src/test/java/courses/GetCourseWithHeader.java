package courses;

import io.restassured.http.Header;

import static io.restassured.RestAssured.given;

public class GetCourseWithHeader {

    public static void main(String[] args) {
        Header apiKeyHeader = new Header("API_KEY" ,"QAcart");
        given().baseUri("http://localhost:8080")
                .header(apiKeyHeader)
                .when().get("/courses")
                .then().log().all();
    }
}
