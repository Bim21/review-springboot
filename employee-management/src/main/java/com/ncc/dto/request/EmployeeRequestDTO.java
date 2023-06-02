package com.ncc.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequestDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<Integer> roleId;
}
