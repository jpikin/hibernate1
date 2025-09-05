package hibernate1lection.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="pets", schema = "public")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "person")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;
    @Column(name = "color")
    private String color;
    @Column(name = "type")
    private String type;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private Person person;

    public void setPerson(Person person) {
        if (person != null) {
            this.person = person;
        }
    }

    public Pet(String name, Integer age, String color, String type) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.type = type;
    }
}