package com.example.app.SpringBootWebContacts.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "surname")
    private String surname;
    @Column(name = "telephone")
    private String phone;
}
