package hospital;

import java.util.ArrayList;
import java.util.List;

public class Consultant extends Doctors {
	static List<Consultant> consultantlist = new ArrayList<>();

	public void main(String[] args) {
		if (getGrade() > 3) {
			setConsultant(true);
			consultantlist.add((Consultant) HospitalTeam.getInfo());
		} else  {
			setConsultant(false);
		}

	}

	public List<Consultant> getConsultantlist() {
		return consultantlist;
	}

	public void setConsultantlist(List<Consultant> consultantlist) {
		this.consultantlist = consultantlist;
	}
}
