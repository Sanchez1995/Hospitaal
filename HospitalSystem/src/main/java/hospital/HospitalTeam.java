package hospital;

import java.util.ArrayList;
import java.util.List;

public class HospitalTeam 
{
	static List<Doctors> info = new ArrayList<>();
	List<Doctors> team = new ArrayList<>();
	private boolean consultant = false;{

		
		if (team.size() <9 && consultant == false) 
		{
			team.addAll(Consultant.consultantlist);
			consultant = true;
		}	
		else if (team.size() < 9 && consultant) 
		{
			team.addAll(getInfo());
		}
		else
		{
			System.out.println("Team is Full!!!");}
		}

	




	public static List<Doctors> getInfo() {
		return info;
	}

	public void setInfo(List<Doctors> info) {
		this.info = info;
	}

	/*
	 * max 10 1 consultant level doctor assign team to patient filter
	 */
}
