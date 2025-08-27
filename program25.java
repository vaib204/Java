///////////////////////////////////////////////////////
//
//  File name :     program25.java
//  Descreption :   Used to display Numbers in negative way
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

    if(val < 0)
    {
      val = -val;
    }
    
    for(i = -val;i<=0;i++)
    {
      System.out.print(i + "\t");
    }
    for(i = 1;i<=val;i++)
    {
      System.out.print(i+"\t");
    }
  }
}


class program25
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