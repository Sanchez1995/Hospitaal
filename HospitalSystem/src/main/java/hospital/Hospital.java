package hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital {

	static List<Patient> records = new ArrayList<>();
	
	public static int id = 1;
	public static int patientWardCount;
	public static int wardCount = 1;
	
	public static void main(String[]args) 
	{
		while (id < 40)
		{
		addPatient();
		}
	}
	
	
	public static void addPatient()
	{
		patientWardCount++;
		Patient john = new Patient();
		john.setPatientname("john");
		john.setPatientnum(id);
		john.setTreatment("Lost Leg");
		id++;
		records.add(john);
		if (patientWardCount > 31)
		{
			patientWardCount = 0;
			wardCount++;
			john.setWardNo(wardCount);
			Ward ward = new Ward();
			ward.setWard(records);
		}
		else 
		{
			john.setWardNo(wardCount);
		}
		john.ToString();
	}
}
	
