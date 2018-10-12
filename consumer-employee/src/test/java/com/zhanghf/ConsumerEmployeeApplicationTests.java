package com.zhanghf;

import com.zhanghf.employee.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerEmployeeApplicationTests {

	@Autowired
	EmployeeService employeeService;
	@Test
	public void contextLoads() {

	}

}
