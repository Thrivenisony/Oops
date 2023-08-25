package Composition;

public class LeaveTraker {
private int sickleave;
private int metarnityleave;
private int emargencyleave;

public LeaveTraker() {
	
}

public LeaveTraker(int sickleave, int metarnityleave, int emargencyleave) {
	super();
	this.sickleave = sickleave;
	this.metarnityleave = metarnityleave;
	this.emargencyleave = emargencyleave;
}

public int getSickleave() {
	return sickleave;
}

public void setSickleave(int sickleave) {
	this.sickleave = sickleave;
}

public int getMetarnityleave() {
	return metarnityleave;
}

public void setMetarnityleave(int metarnityleave) {
	this.metarnityleave = metarnityleave;
}

public int getEmargencyleave() {
	return emargencyleave;
}

public void setEmargencyleave(int emargencyleave) {
	this.emargencyleave = emargencyleave;
}

@Override
public String toString() {
	return "LeaveTraker [sickleave=" + sickleave + ", metarnityleave=" + metarnityleave + ", emargencyleave="
			+ emargencyleave + "]";
}

	    
	    
}




