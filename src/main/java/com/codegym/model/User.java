package com.codegym.model;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NotEmpty(message = "ko duoc bo trong")
    @Size(min = 2, max = 12,message = "do dai tu 2 den 12")
    @Pattern(regexp="^[[A-Z]{1}[a-z]*]*$", message = "Phai la chu")
    private String firstname;
    @NotEmpty(message = "ko duoc bo trong")
    @Size(min = 2, max = 12,message = "do dai tu 2 den 12")
    @Pattern(regexp="^[[A-Z]{1}[a-z]*]*$", message = "Phai la chu")
    private String lastname;
    @NotEmpty(message = "ko duoc bo trong")
    @Size(min = 10, max = 11,message = "do dai tu 2 den 12")
    @Pattern(regexp="^[[0-9]{1}[0-9]*]*$", message = "Phai la chu")
    private String phone;
    @NotNull(message = "ko duoc bo trong")
    @Min(value = 18,message = "lon hon 18")
    @Max(value = 50,message = "nho hon 50")
    private int age;
    @NotEmpty(message = "ko duoc bo trong")
    @Email(message = "dung dinh dang email")
    private String email;

    public User() {
    }

    public User(Long id, @NotEmpty(message = "ko duoc bo trong") @Size(min = 2, max = 12, message = "do dai tu 2 den 12") @Pattern(regexp = "^[[A-Z]{1}[a-z]*]*$", message = "Phai la chu") String firstname, @NotEmpty(message = "ko duoc bo trong") @Size(min = 2, max = 12, message = "do dai tu 2 den 12") @Pattern(regexp = "^[[A-Z]{1}[a-z]*]*$", message = "Phai la chu") String lastname, @NotEmpty(message = "ko duoc bo trong") @Size(min = 10, max = 11, message = "do dai tu 2 den 12") @Pattern(regexp = "^[0-9]*$", message = "Phai la so") String phone, @NotEmpty(message = "ko duoc bo trong") @Size(min = 18, max = 50, message = "do tuoi tu 18 den 50") @Pattern(regexp = "^[0-9]*$", message = "Phai la so") int age, @NotEmpty(message = "ko duoc bo trong") @Email(message = "dung dinh dang email") String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
