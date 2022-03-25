package com.department.departmentservice.service.impl;

import com.department.departmentservice.entity.DepartmentEntity;
import com.department.departmentservice.entity.EmpDeptEntity;
import com.department.departmentservice.repository.DepartmentRepository;
import com.department.departmentservice.repository.EmpDeptRepository;
import com.department.departmentservice.service.DepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final EmpDeptRepository empDeptRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository, EmpDeptRepository empDeptRepository) {
        this.departmentRepository = departmentRepository;
        this.empDeptRepository = empDeptRepository;
    }


    @Override
    public EmpDeptEntity getEmpDept(String empId) {
        EmpDeptEntity empDeptEntity = empDeptRepository.findByEmpId(empId);
        if (!ObjectUtils.isEmpty(empDeptEntity)) {
            DepartmentEntity departmentEntity = departmentRepository.findById(empDeptEntity.getDeptId()).orElse(new DepartmentEntity());
            empDeptEntity.setDeptName(departmentEntity.getDeptName());
        }
        return empDeptEntity;
    }
}
