package models;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastname;

    @Column(unique = true, nullable = false)
    private String login;

    @Column(unique = true, nullable = false)
    private String password;

    @Column(name = "author_type", nullable = false)
    private short authorType;


    public Author() {
    }

    public Author(String name, String lastname, String login, String password, short authorType) {
        this.name = name;
        this.lastname = lastname;
        this.login = login;
        this.password = password;
        this.authorType = authorType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public short getAuthorType() {
        return authorType;
    }

    public void setAuthorType(short authorType) {
        this.authorType = authorType;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + lastname + " " + login + " " + authorType;
    }
}


