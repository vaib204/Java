///////////////////////////////////////////////////////
//
//  File name :     program8.java
//  Descreption :   Used to Display prime number
//  Author :        vaibhav mukund kulkarni
//  Date :          25/8/2025
//
///////////////////////////////////////////////////////

import java.util.*;

class Checkx
{
  public boolean prime(int no)
  {
    boolean bflag = true;
    int isum = 0;
    if(no < 0)
    {
      no = -no;
    }
    for(int i = 2;i<=(no/2);i++)
    {
      if(no % i == 0)
      {
       bflag = false;
       break; 
      }
    }
    return bflag;
  }
}

class program15
{
  public static void main(String a[])
  {
    boolean iret = false;
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter a Number:");
    int no = sobj.nextInt();

    Checkx cobj = new Checkx();

     iret = cobj.prime(no);
    if(iret == true)
    {
      System.out.println(no +":Number is prime");
    }
    else
    {
      System.out.println("Number is not  prime");
    }
    
  }
}