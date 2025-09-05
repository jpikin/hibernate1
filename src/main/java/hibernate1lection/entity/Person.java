package hibernate1lection.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="persons", schema = "public")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "pet")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "email")
    private String email;


    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    private Pet pet;



}
