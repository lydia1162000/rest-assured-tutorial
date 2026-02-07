package videos;

import static io.restassured.RestAssured.given;

public class SearchForVideoByURL {
    public static void main(String[] args) {
        given().baseUri("http://localhost:8080")
                .queryParam("title","hhttps")
                .when().get("/videos/search")
                .then().log().all();
    }
}
