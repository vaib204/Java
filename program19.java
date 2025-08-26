///////////////////////////////////////////////////////
//
//  File name :     program8.java
//  Descreption :   Used to display sum of Digits
//  Author :        vaibhav mukund kulkarni
//  Date :          25/8/2025
//
///////////////////////////////////////////////////////

import java.util.*;

class Checkx
{
  public int sumdigit(int no)
  {
    int idigit = 0;
    int isum = 0;
    
    while (no != 0)
    {
      idigit = no % 10;
      isum = isum + idigit;
      no = no / 10;
    }
    return isum;
  }
}

class program19
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter a Number:");
    int no = sobj.nextInt();

    Checkx cobj = new Checkx();

   int iret =  cobj.sumdigit(no);

    System.out.println("Addition is :"+iret);

    
  }
}