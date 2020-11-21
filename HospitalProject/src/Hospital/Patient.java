package Hospital;

import General.Date;
import General.Time;

import javax.swing.JOptionPane;
public class Patient {
	private String name,cnic,phno,gender,address,age;
	Patient()
	{
		name="";cnic="";phno="";gender="";address="";age="";
	}
	Patient(String n,String c,String p,String ad,String a,String g)
	{
		name=n;
		cnic=c;
		phno=p;
		address=ad;
		age=a;
		gender=g;
	}
void setname(String n)
{
	this.name=n;
}
void setcnic(String c)
{
	this.cnic=c;
}
void setphno(String p) {
	this.phno=p;
}
void setadd(String ad)
{
	this.address=ad;
}
void setage(String a)
{
	this.age=a;
}
String getname()
{
	return this.name;
}
String getphno()
{
	return this.phno;
}
String getcnic()
{
	return this.cnic;
	
}
String getadd()
{
	return this.address;
}
String getage()
{
	return this.age;
}
void setgender(String g)
{
	this.gender=g;
}
String getgender()
{
	return this.gender;
}
public void getdata()
{
name=JOptionPane.showInputDialog("enter your name");
cnic=JOptionPane.showInputDialog("enter your cnic no");
	phno=JOptionPane.showInputDialog("enter your phone no");
	age=JOptionPane.showInputDialog("enter your age");
	gender=JOptionPane.showInputDialog("enter your gender");
	address=JOptionPane.showInputDialog("enter your address");
}
}
class IndoorPatient extends Patient
{
	private String wardno,roomno,bedno;
	Doctor doc;
	private Date DOA;
	private String fee;
	IndoorPatient()
	{
		wardno="";roomno="";
		bedno="";fee="";
	}
	IndoorPatient(String wn,String rn,String bn,String f)
	{

		wardno=wn;roomno=rn;
		bedno=bn;fee=f;
	}
	void setwn(String wn)
	{
		this.wardno=wn;
	}
	String getwardno()
	{
		return this.wardno;
	}
	void setrn(String rn)
	{
		this.roomno=rn;
	}
	String getrno()
	{
		return this.roomno;
	}
	void setbn(String bn)
	{
		this.bedno=bn;
	}
	String getbno()
	{
		return this.bedno;
	}

	void setfee(String f)
	{
		this.fee=f;
	}
	String getfee()
	{
		return this.fee;
	}
	public void getdata()
	{
		String doctor;
		String day,month,year;
		super.getdata();
		wardno=JOptionPane.showInputDialog("enter ward no");
		roomno=JOptionPane.showInputDialog("enter room no");
		bedno=JOptionPane.showInputDialog("enter bed no");
		doctor=JOptionPane.showInputDialog("enter doctor name");
		day=JOptionPane.showInputDialog("enter day of admission");
		month=JOptionPane.showInputDialog("enter month of admission");
		year=JOptionPane.showInputDialog("enter YEAR OF ADMISSION");
		doc.setname(doctor);
		DOA.setday(day);
		DOA.setmonth(month);
		DOA.setyear(year);
fee=JOptionPane.showInputDialog("enter fee in Rs");
		}
	public String toString()
	{
		super.toString();
		return("wardno: "+wardno+"roomno:"+roomno+"bed no: "+bedno+"Date of admission:"+DOA.toString()+" fee: "+fee);
	}
}
class OutdoorPatient extends Patient
{
	private String fee;
private Date DOA;
private Time TOA;
private Doctor DOC;
OutdoorPatient()
{
	fee="";
}
OutdoorPatient(Date d,Time t,Doctor D)
{
	DOA=d;
	TOA=t;
	DOC=D;
}
public void setDoc(Doctor doc)
{
	this.DOC=doc;
}
public Doctor getDoc()
{
	return this.DOC;
}
public void setdoa(Date d)
{
	this.DOA=d;
}
public Date getdoa()
{
	return this.DOA;
}

public void getdata()
{
	String doctor;
	String day,month,year,hour,min,sec;
	super.getdata();
	doctor=JOptionPane.showInputDialog("enter doctor name");
	day=JOptionPane.showInputDialog("enter day of appointment");
	month=JOptionPane.showInputDialog("enter month of appointment");
	year=JOptionPane.showInputDialog("enter YEAR OF appointment");
	Date d=new Date(day,month,year);
	DOC.setname(doctor);
	DOA.setday(day);
	DOA.setmonth(month);
	DOA.setyear(year);
	hour=JOptionPane.showInputDialog("enter hour of appointment");
	min=JOptionPane.showInputDialog("enter min of appointment");
	sec=JOptionPane.showInputDialog("enter sec OF appointment");
	TOA.sethour(hour);
	TOA.setmin(min);
	TOA.setsec(sec);
}
public void changedatetime()
{
	String d,m,y,h,M,s;
	d=JOptionPane.showInputDialog("enter day of appointment");
	m=JOptionPane.showInputDialog("enter month of appointment");
	y=JOptionPane.showInputDialog("enter YEAR OF appointment");
	Date DT=new Date();
	DT.setday(d);
	DT.setmonth(m);;
	DT.setyear(y);
	
	h=JOptionPane.showInputDialog("enter hour of appointment");
	M=JOptionPane.showInputDialog("enter min of appointment");
	s=JOptionPane.showInputDialog("enter sec OF appointment");
	Time t=new Time();
	t.sethour(h);
	t.setmin(M);
	t.setsec(s);
}
public String toString()
{
	super.toString();
	return ("fee: "+fee+" Date of appointment: "+DOA+"Time of appointment: "+TOA+"doctor: "+DOC);
}
}

