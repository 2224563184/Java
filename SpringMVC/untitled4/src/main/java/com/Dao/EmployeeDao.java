package com.Dao;

import com.bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    private   static Map<Integer,  Employee> employee;

    static {
        employee=new HashMap<>();
        employee.put(1001, new Employee(1001,"E-AA","@@1635", 100));
        employee.put(1002, new Employee(1002,"E-bb","@@1635", 100));
        employee.put(1003, new Employee(1003,"E-cc","@@1635", 100));
        employee.put(1004, new Employee(1004,"E-dd","@@1635", 100));
        employee.put(1005, new Employee(1005,"E-ee","@@1635", 100));
        employee.put(1006, new Employee(1006,"E-Aff","@@1635", 100));
        employee.put(1007, new Employee(1007,"E-AAe","@@1635", 100));
    }


    public  void  save(Employee employee){
                if (employee.getId()==null){
                    int id = employee.getId();
                    employee.setId(id++);
                }
    }


}
