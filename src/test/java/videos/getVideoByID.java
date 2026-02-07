package videos;

import static io.restassured.RestAssured.given;

public class getVideoByID {
    public static void main(String[] args) {
        given().pathParams("id",1)
                .baseUri("http://localhost:8080")
                .when().get("/video/{id}")
                .then().log().all();
    }
}
