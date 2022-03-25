package com.department.departmentservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "db_emp_department")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderClassName = "EmpDeptEntityBuilder")
@ToString
@EqualsAndHashCode(callSuper = false)
public class EmpDeptEntity {
    private String id;
    @Field("emp_id")
    @JsonProperty("emp_id")
    private String empId;
    @Field("dept_id")
    @JsonProperty("dept_id")
    private String deptId;
    @Field("dept_name")
    @JsonProperty("dept_name")
    private String deptName;
}
