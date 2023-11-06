package Test;

import java.util.List;

import Beans.Dept;
import Beans.Emp;
import Utils.DBUtils;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dept> list = DBUtils.queryDepartments();
		for (var dept : list) {
			System.out.println(dept.getDeptName());
			for (Emp emp : dept.getEmployees()) {
				if(!emp.getEmpName().equals(null))
					System.out.println(emp.getEmpName() + "-" + emp.getJob());
			}
		}
	}

}