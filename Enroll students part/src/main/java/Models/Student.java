/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Jason Lawrence
 */
public class Student 
{
   public String name;
   public String Address;
   public String DOB;
   public String EMAIIL;
   public String Phoneno;
   public String gender;
   public String NIC;
   
   public Student(String n,String Add,String DOB,String EMAIL,String P,String gen,String nic)
   {    
       this.name=n;
       this.Address=Add;
       this.DOB=DOB;
       this.EMAIIL=EMAIL;
       this.Phoneno=P;
       this.gender=gen;
       this.NIC=nic;
   }
    
      public String name()
      {
          return name;
      }
      public String Address()
      {
          return Address;
      }
      public String Dateofbirth()
      {
          return DOB;
      }
      public String email()
      {
          return EMAIIL;
      }
      public String Phoneno()
      {
          return Phoneno;
      }
      public String Gender()
      {
          return gender;
      }
      public String NAtional()
      {
          return NIC;
      }

}

