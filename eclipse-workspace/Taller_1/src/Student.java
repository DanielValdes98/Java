
public class Student {
	private int stuId;
	private String fName;
	private String lName;
	private boolean stuStatus;	
	private String var;

	public Student(int x, String y, String a, boolean z) {
		stuId = x;
		fName = y;
		lName = a;
		stuStatus = z;
	} //end constructor
	
	public int getStudentId() {
		return stuId;
	} //end method getStudentId
	
	public String getName() {
		return fName + " " + lName;
	} //end method getStudentId
	
	public String getStatus() {
		if (this.stuStatus == true) {
			var = "Active";
		} else {
			var = "Not Acive";
		}
		return var;
	} //end method getStatus
	
	public void setStudentId(int x) {
		this.stuId = x;
	} //end method setStudentId
	
	public void setName(String y, String a) {
		this.fName = y;
		this.lName = a;
	} //end method setName

	public void setStatus(boolean z) {
		this.stuStatus = z;
	} //end method setStatus	

} //end class Student
