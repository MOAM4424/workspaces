package inclass;

public class avgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s = new student ("Mark", 23);
		student q = new student ("Meg", 20);
		
		double avg = (s.getAge() + q.getAge())/2.00;
		
		System.out.println(avg);
		
		
	}

}
