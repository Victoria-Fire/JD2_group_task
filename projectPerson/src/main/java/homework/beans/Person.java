package homework.beans;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Person {
    private int id;
    private String name;
    private String surname;
}
