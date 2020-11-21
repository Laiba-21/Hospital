package Hospital;


public class Doctor {
	private String name,cnic,phno,gender,dep,spec;
	Doctor()
	{
		name="";cnic="";phno="";gender="";dep="";spec="";
	}
	Doctor(String n,String c,String p,String g,String d,String s)
	{
		name=n;
		cnic=c;
		phno=p;
		dep=d;
		spec=s;
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
void setdep(String d)
{
	this.dep=d;
}
void setspec(String s)
{
	this.spec=s;
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
String getdep()
{
	return this.dep;
}
String getspec()
{
	return this.spec;
}
String getgender()
{
	return this.gender;
}
public String toString()
{
return("NAME: "+name+"CNIC: "+cnic+"PHONE NO: "+phno+"GENDER: "+gender+"DEPARTMENT: "+dep+"SPECIALITY: "+spec);
}

}