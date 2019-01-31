package hospital;

import java.util.ArrayList;
import java.util.List;

public class NonConsultant extends Doctors {
	static List<NonConsultant> nonconsultantlist = new ArrayList<>();

	public void main(String[] args) {
		if (getGrade() < 3) {
			setConsultant(false);
			nonconsultantlist.add((NonConsultant) HospitalTeam.getInfo());
		} else  
		{
			setConsultant(true);
			System.out.println("This dude is too damn good!!!");
		}
	}

	public static List<NonConsultant> getNonconsultantlist() {
		return nonconsultantlist;
	}

	public static void setNonconsultantlist(List<NonConsultant> nonconsultantlist) {
		NonConsultant.nonconsultantlist = nonconsultantlist;
	}
}
