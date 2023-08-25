package Composition;

import java.util.Arrays;

public class CustomerA {

private int id;
private String name;
private AddressA[] addressa;
public CustomerA() {
	
}
public CustomerA(int id,String name,AddressA[] addressa) {
	this.id=id;
	this.name=name;
	this.addressa=addressa;
}
public int getid() {
	return id;
}
public void setid(int id) {
	this.id=id;
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
	
}
public AddressA[] getAddressa() {
	return addressa;
}
public void setaddressa(AddressA[] adressa) {
	this.addressa=addressa;
}
public String toString() {
	return "id"+" "+id+"name"+" "+name+"address"+" "+Arrays.toString(addressa);
}

}
