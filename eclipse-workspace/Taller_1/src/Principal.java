
public class Principal {
	public static void main(String args[]) {
		Student s1 = new Student(123456789, "Lisa", "Palombo", true);
		System.out.println("Student Name: " + s1.getName());
		System.out.println("Student ID: " + s1.getStudentId());
		System.out.println("Student Status: " + s1.getStatus());
	}
}
