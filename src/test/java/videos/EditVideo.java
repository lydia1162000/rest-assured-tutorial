package videos;

import com.qacart.spring_boot_tutorial.entity.Video;
import io.restassured.http.ContentType;

import java.util.UUID;

import static io.restassured.RestAssured.given;

public class EditVideo {
    public static void main(String[] args) {
        Video video = Video.builder().url("https:video.com").duration(20).build();
        given().baseUri("http://localhost:8080")
                .contentType(ContentType.JSON)
                .pathParams("id","92bf37e1-d012-4250-9de6-e5cbed8f5ea0")
                .when().put("/courses/{id}")
                .then().log().all();

    }
}
