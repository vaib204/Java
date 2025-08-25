///////////////////////////////////////////////////////
//
//  File name :     program8.java
//  Descreption :   Used to Display factorial of number
//  Author :        vaibhav mukund kulkarni
//  Date :          25/8/2025
//
///////////////////////////////////////////////////////

import java.util.*;

class Checkx
{
  public int Factorial(int no)
  {
    int ifact = 1;

    for(int i = 1;i<=no;i++)
    {
      ifact = ifact * i;
    }
     return ifact;
  }
}


class program8
{
  public static void main(String a[])
  {
    int iret = 0;
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter a Number:");
    int no = sobj.nextInt();

    Checkx cobj = new Checkx();

    iret = cobj.Factorial(no);
    System.out.println("Factorial is:\n"+iret);
    
  
  }
}