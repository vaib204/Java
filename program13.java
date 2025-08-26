///////////////////////////////////////////////////////
//
//  File name :     program8.java
//  Descreption :   Used to Display Addition of factors
//  Author :        vaibhav mukund kulkarni
//  Date :          25/8/2025
//
///////////////////////////////////////////////////////

import java.util.*;

class Checkx
{
  public int SumFactors(int no)
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
    return isum;
  }
}

class program13
{
  public static void main(String a[])
  {
    int iret = 0;
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter a Number:");
    int no = sobj.nextInt();

    Checkx cobj = new Checkx();

     iret = cobj.SumFactors(no);
     System.out.println("Sum of factors is:"+iret);
    
  
  }
}