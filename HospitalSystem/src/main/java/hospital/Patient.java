package hospital;

import java.util.Date;

import javax.print.attribute.standard.RequestingUserName;
import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Patient 
{
	

	private Date dob1;
	private int wardNo;
	private Date dateadmitted;
	private Date datereleased;
	private static String patientname;
	private String treatment;
	private int patientnum;

	
	
/*	public static void main(String[]args) {
		setPatientname("Sanchez"); {
			System.out.println(patientname);*/
		
	public void ToString()
	{
		System.out.println("Ward No : " + wardNo);
		System.out.println("Name : "+ patientname);
		System.out.println("ID : "+ patientnum);
		System.out.println("Treatment : " + treatment);
	}
	
	public Date getDob1() {
		return dob1;
	}

	public void setDob1(Date dob1) {
		this.dob1 = dob1;
	}

	public int getWardNo() {
		return wardNo;
	}

	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}

	public Date getDateadmitted() {
		return dateadmitted;
	}

	public void setDateadmitted(Date dateadmitted) {
		this.dateadmitted = dateadmitted;
	}

	public Date getDatereleased() {
		return datereleased;
	}

	public void setDatereleased(Date datereleased) {
		this.datereleased = datereleased;
	}

	public static String getPatientname() {
		return patientname;
	}

	public  void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getTreatment() {
		return treatment;
	} 

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public int getPatientnum() {
		return patientnum;
	}

	public void setPatientnum(int patientnum) {
		this.patientnum = patientnum;
	}

}
