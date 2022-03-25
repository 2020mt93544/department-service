package com.department.departmentservice.controller;

import com.department.departmentservice.entity.DepartmentEntity;
import com.department.departmentservice.entity.EmpDeptEntity;
import com.department.departmentservice.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentContoller {

    private final DepartmentService departmentService;

    public DepartmentContoller(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/getEmpDept")
    public EmpDeptEntity getEmpDeptDetails(@RequestParam String empId) {
        return departmentService.getEmpDept(empId);
    }

}
