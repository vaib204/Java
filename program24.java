///////////////////////////////////////////////////////
//
//  File name :     program23.java
//  Descreption :   Used to display Numbers
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
    
    for(i = val;i>=1;i--)
    {
      System.out.print(i+"\t"+ "*"+"\t");
    }
  }
}


class program24
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