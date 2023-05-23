
public class ManagingPeople {

	public static void main(String args[]) {
		Person p1 = new Person("Arial", 37);
		Person p2 = new Person("Joseph", 15);
		
		if(p1.getAge()==p2.getAge()) {
			System.out.println(p1.getAge() + " is the same age as " + p2.getAge());
		} else {
			System.out.println(p1.getAge() + " is NOT the same age as " + p2.getAge());
		}
	}
}
