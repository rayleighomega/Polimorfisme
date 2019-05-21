package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.persistence.EmployeeRepository;
import java.util.List;


public class JobsController {

	private EmployeeRepository repository  = new EmployeeRepository();
	
	public JobsController()
        {
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception
        {		
            Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
            repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception
        {		
            Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
            repository.addMember(employee);
	}

	public void createVolunteer(String name, String address, String phone, double salaryPerMonth) throws Exception
        {		
            Employee volunteer = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateVolunteer());
            repository.addMember(volunteer);
	}
        
	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception
        {
            Employee volunteer = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
            repository.addMember(volunteer);
	}


	public void payAllEmployeers()
        {
            List<AbsStaffMember> members = repository.getAllMembers();
            
            for (AbsStaffMember member : members)
            {
                member.pay();
            }
	}

	public String getAllEmployees()
        {
            List<AbsStaffMember> listEmployees;
            String employeesData = "";
            
            listEmployees = repository.getAllMembers();
            
            for (AbsStaffMember employee : listEmployees)
            {
                employeesData += employee.toString();
            }
            
            return employeesData;
            
	}
	
	
}
