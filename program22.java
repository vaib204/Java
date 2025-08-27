///////////////////////////////////////////////////////
//
//  File name :     program22.java
//  Descreption :   Used to display star
//  Author :        vaibhav mukund kulkarni
//  Date :          26/8/2025
//
/////////////////////////////////////////////////////// 
import java.util.*;
class Printx
{
  public void Display(int val)
  {
    int i = 0;

    for(i = 1;i<=val;i++)
    {
      System.out.print("*"+"\t");
    }
  }
}


class program22
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter Number:");
    int no = sobj.nextInt();

    Printx pobj = new Printx();

    pobj.Display(no);

  }
}