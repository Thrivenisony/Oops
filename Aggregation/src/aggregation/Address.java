package aggregation;

public class Address {
	private int id;
	private String city;
	private String state;
public Address() {
	}
public Address(int id,String city,String state) {
	this.id=id;
	this.city=city;
	this.state=state;
	}
public int getid() {
	return id;
	}
public void setid(int id) {
	this.id=id;
}
public String getcity() {
	return city;
	}
public void setcity(String city) {
	this.city=city;
}
public String getstate() {
	return state;
}
public void setstate(String state) {
	this.state=state;
}
public String toString() {
	return "id"+" "+id+"city"+" "+city+"state"+" "+state;
}
}
