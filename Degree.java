package models;
---------------------------------------------------------------------------------degree class diagram 
public class degree {
public int DNO;
public String D_name;
public int D_Duration;
public  String Qualification;

///////////////////////////////////////////////////methods
public String update_Dname()
{}
public String update_Qualification()
{}
}
------------------------------------------------------------------------------- student class diagram
public class Student{
    
public int SID;
public String S_name;
public String S_address;
public int phone_no;

/////////////////////////////////////////////////// methods
public String student_info()
{}
public int Rank ()
{}
public String Student_Acedemics()
{}

}
-------------------------------------------------------------------------------- Receptopnlist class diagram

public class Receptionlist{

public int RID;
public String R_name;
public int Phone_no;
public String R_email_address;

/////////////////////////////////////////////////// methods
public String provide_course_defults()
{}
public String Recommand_courses()
{}
}