package com.greatlearning.oops.driver;

import com.greatlearning.oops.departments.AdminDepartment;
import com.greatlearning.oops.departments.HrDepartment;
import com.greatlearning.oops.departments.SuperDepartment;
import com.greatlearning.oops.departments.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperDepartment superDepartment = new AdminDepartment();
		System.out.println(" Welcome to" + superDepartment.departmentName());
		System.out.println(superDepartment.getTodaysWork());
		System.out.println(superDepartment.getWorkDeadline());
		System.out.println(superDepartment.isTodayAHoliday());

		System.out.println();

		HrDepartment hrDepartment = new HrDepartment();
		System.out.println(" Welcome to" + hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());

		System.out.println();

		TechDepartment techDepartment = new TechDepartment();
		System.out.println(" Welcome to" + techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
	}

}
