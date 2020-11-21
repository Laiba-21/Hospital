package Hospital;
import javax.swing.JOptionPane;
import General.Date;
class Demo
{
	public static void main(String args[])
	{
		String choice;
		int C;
		String no;
		int n;
		General.Date objdate=new General.Date();
		no=JOptionPane.showInputDialog("enter the no of entries");
		n=Integer.parseInt(no);
		Doctor[] obj=new Doctor[n];
		Patient[] objpatient=new Patient[n];
		System.out.println("enter doctors data;");
		for(int i=0;i<obj.length;i++)
		{
			String N,c,p,g,d,s;
			N=JOptionPane.showInputDialog("enter the name of " +i+1+" doctor:");
			c=JOptionPane.showInputDialog("enter the cnic of " +i+1+" doctor:");
			p=JOptionPane.showInputDialog("enter the phone no of " +i+1+" doctor:");
			g=JOptionPane.showInputDialog("enter the gender of " +i+1+" doctor:");
			d=JOptionPane.showInputDialog("enter the department of " +i+1+" doctor:");
			s=JOptionPane.showInputDialog("enter the specialization of " +i+1+" doctor:");
					obj[i]=new Doctor(N,c,p,g,d,s);
		}
		do {
		System.out.println("displaying menu");
		System.out.println("1.add an indoor patient");
		System.out.println("2.add an outdoor patient");
		System.out.println("3.display doctor's list");
		System.out.println("4.search doctor by name or department");
		System.out.println("5.see the list of al indoor patients;");
		System.out.println("6.see the list of all appointments on a certain day");
		System.out.println("7.see the list of all appointments of a certain doctor");
		System.out.println("8.change the date and time of a appointment of certain patient");
		System.out.println("9.exit");
		choice=JOptionPane.showInputDialog("entyer your choice");
		C=Integer.parseInt(choice);
		switch(C){
		case 1:
		{
			for(int i=0;i<objpatient.length;i++)
			{
				Patient objindoor=new IndoorPatient();
				objpatient[i]=objindoor;
				objpatient[i].getdata();
			}
			break;
		}
		case 2:
		{
			for(int i=0;i<objpatient.length;i++)
			{
				Patient objoutdoor=new OutdoorPatient();
				objpatient[i]=objoutdoor;
				objpatient[i].getdata();
			}
			break;
		}
		case 3:
		{
			for(int i=0;i<=obj.length;i++)
			{
				 obj[i]=new Doctor();
				 System.out.println(obj[i].toString());
			}
			break;
		}
		case 4:
		{
			String S;
			S=JOptionPane.showInputDialog("enter n if you want to search doctor by name or d if you want to search doctor by department");
		if(S=="n")
		{
			String name=JOptionPane.showInputDialog("enter the doctor's name you want to search ");
					for(int i=0;i<obj.length;i++)
					{
						if(name==obj[i].getname())
						{
							System.out.println(obj[i].toString());
						}
					}
		}
		else if(S=="d")
		{
			String name=JOptionPane.showInputDialog("enter the doctor's department you want to search ");
			for(int i=0;i<obj.length;i++)
			{
				if(name==obj[i].getdep())
				{
					System.out.println(obj[i].toString());
				}
			}
		}
		break;
		}
		case 5:
		{
			for(int i=0;i<objpatient.length;i++)
			{
				Patient objindoor=new IndoorPatient();
				objpatient[i]=objindoor;
				objpatient[i].toString();
			}
			break;
		}
		case 6:
		{
			int flag=0;
			String d,m,y;
			d=JOptionPane.showInputDialog("enter day you want to search:");
			m=JOptionPane.showInputDialog("enter month you want to search:");
		y=JOptionPane.showInputDialog("enter year you want to search:");
		for(int i=0;i<n;i++)
		{
			if(objpatient[i] instanceof OutdoorPatient)
			{
				if(d==objdate.getday() && m==objdate.getmonth()&& y==objdate.getyear())
				{
					System.out.println(objpatient.toString());
					flag++;
				}
				else if(flag==0)
				{
					System.out.println("no appointmenton this day");
				}
			}
		}
		break;
		}
		case 7:
		{

			int flag=0;
			String doc=JOptionPane.showInputDialog("enter the name of doctor to check appointments");
			for(int i=0;i<objpatient.length;i++) {
				if(objpatient[i] instanceof OutdoorPatient)
				{
					if(doc==obj[i].getname())
					{
						flag=1;
						System.out.println(objpatient.toString());
					}
					else
					{
System.out.println("no such dioctor found");						
					}
				}
			}
			break;
		}
		case 8:
		{
			for(int i=0;i<objpatient.length;i++)
			{ 
				int flag=0;
				String patn=JOptionPane.showInputDialog("enter patient name to change date and time");
				if(objpatient[i] instanceof OutdoorPatient) 
				{
					if(patn==objpatient[i].getname())
					{
						objpatient[i].changedatetime();
						flag=1;
						System.out.println(objpatient[i].toString());
						
					}
					else
					{
						System.out.println("no such patient");
					}
			}
			
		}
			break;
		}
		default:
		{
			System.out.println("invalid input");
		}
		}
	}while((C>=0) && (C<=8));
	}}
