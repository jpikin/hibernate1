package hibernate1lection.entity;

import jakarta.persistence.*;

@Entity
@Table(name="pets", schema = "public")
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

    @OneToOne(mappedBy = "pet", cascade = CascadeType.ALL, orphanRemoval = true)
    private Person person;
}