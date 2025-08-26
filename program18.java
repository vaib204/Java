///////////////////////////////////////////////////////
//
//  File name :     program8.java
//  Descreption :   Used to countEven Digits
//  Author :        vaibhav mukund kulkarni
//  Date :          25/8/2025
//
///////////////////////////////////////////////////////

import java.util.*;

class Checkx
{
  public int CountEvenDigit(int no)
  {
    int idigit = 0;
    int icount = 0;
    
    while (no != 0)
    {
      idigit = no % 10;
      if(idigit % 2 == 0)
      {
      icount++;
      }
      no = no / 10;
    }
    return icount;
  }
}

class program18
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter a Number:");
    int no = sobj.nextInt();

    Checkx cobj = new Checkx();

   int iret =  cobj.CountEvenDigit(no);

    System.out.println("Even count is :"+iret);

    
  }
}