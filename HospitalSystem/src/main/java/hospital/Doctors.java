package hospital;

import java.util.Date;

public class Doctors {

	private static int grade;
	private Date dob2;
	private String doctorname;
	private int team;
	private boolean consultant = false;

	public static int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Date getDob2() {
		return dob2;
	}

	public void setDob2(Date dob2) {
		this.dob2 = dob2;
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public int getTeam() {
		return team;
	}

	public void setTeam(int team) {
		this.team = team;
	}

	public boolean isConsultant() {
		return consultant;
	}

	public void setConsultant(boolean consultant) {
		this.consultant = consultant;
	}

}
