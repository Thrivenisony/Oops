package com.ciq.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.RandomAccess;

public class Accountt implements Serializable {
	
	private int acno;
	private String Acname;
	private double balance;
	private transient int chareges;
	private transient String password;
//	private char[] acc;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Accountt() {

	}

	public Accountt(int acno, String acname, double balance, int chareges, String password) {
		super();
		this.acno = acno;
		Acname = acname;
		this.balance = balance;
		this.chareges = chareges;
		this.password = password;
	}

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getAcname() {
		return Acname;
	}

	public void setAcname(String acname) {
		Acname = acname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getChareges() {
		return chareges;
	}

	public void setChareges(int chareges) {
		this.chareges = chareges;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Accountt [acno=" + acno + ", Acname=" + Acname + ", balance=" + balance + ", chareges=" + chareges
				+ ", password=" + password + "]";
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Accountt acc = new Accountt(25047956, "adhithya", 5200, 100, "shgshaa");
		//System.out.println(acc);
		FileOutputStream fos = new FileOutputStream("ac.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(acc);
		oos.flush();
		oos.close();
		System.out.println("sucess");
		
		File f1=new File("ac.ser");

		FileInputStream fis = new FileInputStream(f1);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Accountt acc1 = (Accountt) obj;
		System.out.println(acc1);
//System.out.println(acc1);
	}

}
