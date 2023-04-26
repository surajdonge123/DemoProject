package Examples;

public class ex2foreachloop {

	public int empid;

	public String empname;
	public String empaddress;;;;;
	public String empdept;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public String getEmpdept() {
		return empdept;
	}

	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

	@Override
	public String toString() {
		return " [empid=" + empid + ", empname=" + empname + ", empaddress=" + empaddress + ", empdept="
				+ empdept + "]";
	}

}
