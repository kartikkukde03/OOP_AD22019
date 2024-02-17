/*Aim: Create two objects of class ‘CompanyData’, one is with a default constructor and another one using a 
       parameterized constructor to display the output asName Employee, Age of Employee, Gender of 
       Employee ,Employee ID
  Author: Kartik Kukde
  Version:1.0
  Date: 30 jan 2024
*/
class PracticalNo1
{
	public static void main(String []argv)
	{ 

     	CompanyData SBJIT1 = new CompanyData();
	 	CompanyData SBJIT = new CompanyData("Kartik Kukde",19,"Male",19);
	 	SBJIT.display();
		
	}
}
class CompanyData
{
	String name;
	int age;
	String gender;
	int empid;

	CompanyData()
	{
	 /*default constructor*/
	 System.out.println("This is Default constructor");
	}	 
	
	CompanyData(String name,int age,String gender,int empid)
	{
	  /*Paramitarised contructor*/
	
	  System.out.println("\nThis is Parameterised constructor");
	  this.name = name;
	  this.age = age;
	  this.gender = gender;
	  this.empid = empid;
	}

	public void display()
	{
	 System.out.println("\nName-->"+this.name+"\nAge-->"+this.age+"\nGender-->"+this.gender+"\nEmpid-->"+this.empid);

	}
}









