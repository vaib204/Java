///////////////////////////////////////////////////////
//
//  File name :     program8.java
//  Descreption :   Used to display frequency of digit
//  Author :        vaibhav mukund kulkarni
//  Date :          25/8/2025
//
///////////////////////////////////////////////////////

import java.util.*;

class Checkx
{
  public int frequency(int no)
  {
    int idigit = 0;
    int irev = 0;
    
    while (no != 0)
    {
      idigit = no % 10;
      irev = irev * 10 + idigit;
      no = no / 10;
      
    }
    return irev;
  }
}

class program21
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter a Number:");
    int no = sobj.nextInt();

    Checkx cobj = new Checkx();

   int iret =  cobj.frequency(no);

    System.out.println("reverse Digits are :"+iret);

    
  }
}