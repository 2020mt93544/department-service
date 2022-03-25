package com.department.departmentservice.repository;

import com.department.departmentservice.entity.DepartmentEntity;
import com.department.departmentservice.entity.EmpDeptEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpDeptRepository extends MongoRepository<EmpDeptEntity, String> {
    EmpDeptEntity findByEmpId(String empId);
}
