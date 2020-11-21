package General;

public class Date {
	private String day,month,year;
	public Date() {
		day="";
		month="";
		year="";
	}
public Date(String d,String m,String y)
{
	day=d;month=m;year=y;
}
public void setday(String d)
{
	this.day=d;
}
public void setmonth(String m)
{
	this.month=m;
}
public void setyear(String y)
{
	this.year=y;
}
public String getday()
{
	return this.day;
}
public String getmonth()
{
	return this.month;
}
public String getyear()
{
	return this.year;
}
public String toString()
{
	return(day+"/"+month+"/"+year);
}
}


