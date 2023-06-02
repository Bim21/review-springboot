package com.ncc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.CodePointLength;

import java.util.List;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id ")
    private int id;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "password", length = 255)
    private String password;

    @Column(name = "email", length = 100, unique = true, nullable = false)
    private String email;

    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private List<EmployeeRole> employeeRoles;
}
