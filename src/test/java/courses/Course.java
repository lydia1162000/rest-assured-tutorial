package courses;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {

    private UUID id;
    private String title;
    private double price;
    private int numOfVideos;


}