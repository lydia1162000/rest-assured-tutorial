package videos;

import com.qacart.spring_boot_tutorial.entity.Video;
import io.restassured.http.ContentType;

import java.util.UUID;

import static io.restassured.RestAssured.given;

public class CreateVideo {
    public static void main(String[] args) {
        Video video = new Video(UUID.randomUUID(),"localhost:8080/videos",20);
        given().baseUri("http://localhost:8080")
                .contentType(ContentType.JSON)
                .body(video)
                .when().post("/videos")
                .then().log().all();
    }
}
