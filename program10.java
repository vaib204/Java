///////////////////////////////////////////////////////
//
//  File name :     program8.java
//  Descreption :   Used to Display factors of number by reducing timecomplexity
//  Author :        vaibhav mukund kulkarni
//  Date :          25/8/2025
//
///////////////////////////////////////////////////////

import java.util.*;

class Checkx
{
  public void Factors(int no)
  {
    if(no < 0)
    {
      no = no-1;
    }
    for(int i = 1;i<=(no/2);i++)
    {
      if(no % i == 0)
      {
          System.out.println("factors Are:"+i);
      }
    }
    
  }
}

class program10
{
  public static void main(String a[])
  {
    int iret = 0;
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter a Number:");
    int no = sobj.nextInt();

    Checkx cobj = new Checkx();

     cobj.Factors(no);
    
  
  }
}