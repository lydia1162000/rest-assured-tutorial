package videos;

import com.qacart.spring_boot_tutorial.entity.Video;
import io.restassured.http.ContentType;

import java.util.UUID;

import static io.restassured.RestAssured.given;

public class CreateVideo {
    public static void main(String[] args) {
        Video video = Video.builder().url("https:video.com").duration(20).build();
        given().baseUri("http://localhost:8080")
                .contentType(ContentType.JSON)
                .body(video)
                .when().post("/videos")
                .then().log().all();
    }
}
