package com.ncc.dto.response;

import com.ncc.entity.Role;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeResponseDTO {
    private int id;
    private String fullName;
    private String userName;
    private String email;
    private List<Role> role;
}
