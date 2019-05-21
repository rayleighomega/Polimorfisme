package com.jobs.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;

public class EmployeeRepository {

        //An static field can be shared between instances
        //However we only need one instance to do the job
	private static List<AbsStaffMember> members = new ArrayList<>();
	
	public EmployeeRepository()
        {
            
	}
	
	public List<AbsStaffMember> getAllMembers()
        {
            return EmployeeRepository.members;
	}
	
	
	public void addMember(AbsStaffMember member) throws Exception
        {
            if(member == null) throw new Exception();
            members.add(member);
	}
        
	public AbsStaffMember getMember(int staffindex) throws Exception
        {
            return members.get(staffindex);
	}	
	
}
