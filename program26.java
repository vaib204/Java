///////////////////////////////////////////////////////
//
//  File name :     program26.java
//  Descreption :   Used to display Pattern
//  Author :        vaibhav mukund kulkarni
//  Date :          26/8/2025
//
/////////////////////////////////////////////////////// 
import java.util.*;
class Printx
{
  public void Display(int val,Character no)
  {
    int i = 0;

    if(val < 0)
    {
      val = -val;
    }
    for(i = 0;i<val;i++)
    {
      System.out.print(no+ "\t");
    }
    
  }
}


class program26
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter Number:");
    int no = sobj.nextInt();

    System.out.println("Enter charachter:");
    String input = sobj.next();
    Character val;

    if(input.length() > 0)
    {
      val = input.charAt(0);
    }
    else
    {
      System.out.println("no charchter enterd");
      return;
    }


    Printx pobj = new Printx();

    pobj.Display(no,val);

  }
}