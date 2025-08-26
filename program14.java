///////////////////////////////////////////////////////
//
//  File name :     program8.java
//  Descreption :   Used to Display perfect Number
//  Author :        vaibhav mukund kulkarni
//  Date :          25/8/2025
//
///////////////////////////////////////////////////////

import java.util.*;

class Checkx
{
  public boolean perfect(int no)
  {
    int isum = 0;
    if(no < 0)
    {
      no = -no;
    }
    for(int i = 1;i<no;i++)
    {
      if(no % i == 0)
      {
          isum = isum + i;
      }
    }
    if(no == isum)
    {
       return true;
    }
    else
    {
      return false;
    }
    
  }
}

class program14
{
  public static void main(String a[])
  {
    boolean iret = false;
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter a Number:");
    int no = sobj.nextInt();

    Checkx cobj = new Checkx();

     iret = cobj.perfect(no);
    if(iret == true)
    {
      System.out.println(no +":Number is perfect");
    }
    else
    {
      System.out.println("Number is not  perfect");
    }
    
  }
}