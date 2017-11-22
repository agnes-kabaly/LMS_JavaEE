package model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Column (name = "id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }


}
