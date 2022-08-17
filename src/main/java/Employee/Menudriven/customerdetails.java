package Employee.Menudriven;
import java.util.*;

import Employee.Menudriven.customer;
import Employee.Menudriven.customerComparator;
public class customerdetails {
public static void main(String[] args) {
List<customer> list = new ArrayList<>();

list.add(new customer(1,"rohit",24,1000));
list.add(new customer(2,"virat",22,17000));
list.add(new customer(3,"gull",22,11000));
list.add(new customer(4,"rahul",24,12000));
list.add(new customer(5,"dhoni",25,5000));
list.add(new customer(6,"shardul",26,6000));
list.add(new customer(7,"jaddu",27,7000));
list.add(new customer(8,"ashwin",28,8000));

list.add(new customer(9,"bhuvi",29,9000));
list.add(new customer(10,"shami",34,10000));
Scanner s=new Scanner(System.in);
int ch;
do
{
	System.out.println("1.Display");
	System.out.println("2. diplay all the Employee in ascending order by thier name");
	System.out.println("3. update customer age by their  id");
	System.out.println("enter you choice");
	ch=s.nextInt();
	switch (ch)
	{
	case 1:
		
		for(customer e: list)
        {
        	System.out.println(e);
        }
        break;
	case 2:
		 List<customer> l1 = new ArrayList<>(list);
		 Collections.sort(l1,new customerComparator());
		 for(customer e1:l1)
		 {
			 System.out.println(e1);
		 }
	break;
	case 3:
		boolean found =false;
		System.out.println("enter thecustomer id for update their purchase amount ");
		int id1=s.nextInt();
		ListIterator<customer> l2= list.listIterator();
	  while(l2.hasNext())
	  {
		  customer e3 = l2.next();
		  if(e3.getCusid()==id1)
		  {
			  System.out.println("enter the customer id");
			  int cusid=s.nextInt();
			  
			  System.out.println("enter the name");
			  String cusname=s.next();
			  
			  System.out.println("Enter the customer age");
			  int cusage=s.nextInt();
			  
			  System.out.println("Enter the customer purcahse amount");
			  int puramount=s.nextInt();
			  
			  l2.set(new customer(cusid,cusname,cusage,puramount));
			  found=true;
			  
		  }
		  
	 }
	  if(!found)
		  System.out.println("Employee nt found in the list");
	  else
		  System.out.println("update successful");
	  break;
		
    }
  }while(ch!=0);
}
}
