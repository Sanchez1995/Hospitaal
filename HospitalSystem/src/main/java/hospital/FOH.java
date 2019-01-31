package hospital;

import java.util.ArrayList;
import java.util.List;

public class FOH {
	
	static List<Patient> wardrecords = new ArrayList<>();

	public static void addPatient(Patient patients) {
		wardrecords.add(patients);
	}

	public static void removePatient(Patient patients) {
		wardrecords.remove(patients);
	}

	public static List<Patient> checkPatient(Patient patients) {
		System.out.println(wardrecords);
		return wardrecords;

	}

	public static List<Patient> getRecords() {
		return wardrecords;
	}

	public static void setRecords(List<Patient> records) {
		FOH.wardrecords = records;
	}

}
