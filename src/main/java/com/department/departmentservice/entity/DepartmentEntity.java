package com.department.departmentservice.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "departments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderClassName = "DepartmentEntityBuilder")
@ToString
@EqualsAndHashCode(callSuper = false)
public class DepartmentEntity {
    private String id;
    @Field("dept_name")
    private String deptName;
}
