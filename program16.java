///////////////////////////////////////////////////////
//
//  File name :     program8.java
//  Descreption :   Used to Display Digits
//  Author :        vaibhav mukund kulkarni
//  Date :          25/8/2025
//
///////////////////////////////////////////////////////

import java.util.*;

class Checkx
{
  public void DisplayDigit(int no)
  {
    int idigit = 0;
    
    while (no != 0)
    {
      idigit = no % 10;
      System.out.println(idigit);
      no = no / 10;
    }
  }
}

class program16
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter a Number:");
    int no = sobj.nextInt();

    Checkx cobj = new Checkx();

    cobj.DisplayDigit(no);

    
  }
}