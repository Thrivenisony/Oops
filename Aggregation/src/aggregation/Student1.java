package aggregation;

public class Student1 {
private int id;
private String Firstname;
private String Lastname;
private char gender;
private Course1 Course1;
public Student1() {
	}
 public Student1(int id,String Firstname,String Lastname,char gender,Course1 Course1) {
	 this.id=id;
	 this.Firstname=Firstname;
	 this.Lastname=Lastname;
	 this.gender=gender;
	 this.Course1=Course1;
	 }
  

public int getid() {
	 return id;
 }
 public void setid() {
	 this.id=id;
 }
 public String getFirstname() {
	 return Firstname;
 }
 public void setFirstname() {
	 this.Firstname=Firstname;
 }
 public String getLastname() {
	 return Lastname;
 }
 public void setLastname() {
	 this.Lastname=Lastname;
 }
 public char getgender() {
	 return gender;
 }
 public void setgender() {
	 this.gender=gender;
 }
 public Course1 getCourse1() {
	 return Course1;
 }
 public void setCourse1() {
	 this.Course1=Course1;
 }
 public String toString() {
	 return "id"+" "+id+"Firstname"+" "+Firstname+"lastname"+" "+Lastname+"gender"+" "+gender+"Course1"+" "+Course1;
 }
}
