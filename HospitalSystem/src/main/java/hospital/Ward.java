package hospital;

import java.util.ArrayList;
import java.util.List;

public class Ward {
	List<Patient> ward = new ArrayList<>();

	{
		if (ward.size()<29) {
			ward.addAll(FOH.getRecords()); 
			}
		else {
			System.out.println("No Space In Ward Go Home");
			}
	}

	public List<Patient> getWard() {
		return ward;
	}

	public void setWard(List<Patient> ward) {
		this.ward = ward;
	}
}
