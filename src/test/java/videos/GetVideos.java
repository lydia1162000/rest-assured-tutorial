package videos;

import static io.restassured.RestAssured.given;

public class GetVideos {
    public static void main(String[] args) {
        given().baseUri("http://localhost:8080")
                .when().get("videos")
                .then().log().all();
    }
}
