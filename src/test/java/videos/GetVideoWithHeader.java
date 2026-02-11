package videos;

import io.restassured.http.Header;

import static io.restassured.RestAssured.given;

public class GetVideoWithHeader {
    public static void main(String[] args) {
        Header apiKeyHeader = new Header("API_KEY","QAcart");
        given().baseUri("http://localhost:8080")
                .header(apiKeyHeader)
                .when().get().then().log().all();
    }
}
