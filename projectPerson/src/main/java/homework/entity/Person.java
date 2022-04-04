package homework.entity;

import lombok.*;

import static homework.entity.AnnotationCreation.MyColumn;
import static homework.entity.AnnotationCreation.MyTable;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-03 17:23
 */
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@MyTable(name = "person")
public class Person {

    @MyColumn(name = "id")
    private int id;

    @MyColumn(name = "name")
    private String name;

    @MyColumn(name = "surname")
    private String surname;

}
