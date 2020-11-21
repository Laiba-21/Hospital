package General;


public class Time {
	private String hour,min,sec;
	public Time() {
		hour="";
		min="";
		sec="";
	}
public Time(String h,String m,String s)
{
	hour=h;min=m;sec=s;
}
public void sethour(String h)
{
	this.hour=h;
}
public void setmin(String m)
{
	this.min=m;
}
public void setsec(String s)
{
	this.sec=s;
}
String gethour()
{
	return this.hour;
}
String getmin()
{
	return this.min;
}
String getsec()
{
	return this.getsec();
}
public String toString()
{
	return(hour+"/"+min+"/"+sec);
}
}


