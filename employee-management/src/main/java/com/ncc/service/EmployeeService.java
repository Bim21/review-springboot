package com.ncc.service;

import com.ncc.dto.request.EmployeeRequestDTO;
import com.ncc.dto.response.EmployeeResponseDTO;

import java.util.List;

public interface EmployeeService {
    List<EmployeeResponseDTO> syncData(EmployeeResponseDTO employeeResponseDTO);

    EmployeeResponseDTO updateEmployee(EmployeeRequestDTO employeeRequestDTO);

    String deleteEmployee(Integer id);

    EmployeeResponseDTO addEmployee(EmployeeRequestDTO employeeRequestDTO);

}
