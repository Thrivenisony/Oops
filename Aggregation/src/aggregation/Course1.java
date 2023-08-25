package aggregation;

public class Course1 {
	private int id;
	private String groupname;
	private String subject;
	public Course1() {
		}
	 public Course1(int id,String groupname,String subject) {
		 this.id=id;
		 this.groupname=groupname;
		 this.subject=subject;
		 }
	 public int getid() {
		 return id;
	 }
	 public void setid() {
		 this.id=id;
	 }
	 public String getgroupname() {
		 return groupname;
	 }
	 public void setgroupname() {
		 this.groupname=groupname;
	 }
	 public String getsubject() {
		 return subject;
	 }
	 public void setsubject() {
		 this.subject=subject;
	 }
	
	 public String toString() {
		 return "id"+" "+id+"groupname"+" "+groupname+"subject name"+" "+groupname;
	 }


}
