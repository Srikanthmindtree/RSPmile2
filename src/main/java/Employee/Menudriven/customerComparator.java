package Employee.Menudriven;

import java.util.Comparator;

public class customerComparator implements Comparator<customer>{

	@Override
	public int compare(customer o1, customer o2) {
		// TODO Auto-generated method stub
		return o1.getCusname().compareTo(o2.getCusname());
	}

}
