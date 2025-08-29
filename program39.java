///////////////////////////////////////////////////////
//
//  File name :     program39.java
//  Descreption :   Used to display Pattern
//  Author :        vaibhav mukund kulkarni
//  Date :          29/8/2025
//
/////////////////////////////////////////////////////// 
import java.util.*;
class Printx
{
  public void Display(int rows,int col)
  {
    int i = 0,j = 0;
   

    for(i = 1;i<=rows;i++)
    {
      for(j = 1;j<=col;j++)
      {
        if(i == j||i > j)
        {
          System.out.print("o"+"\t");
        }
        else
        {
          System.out.print("*"+"\t");
        }
      }
         System.out.println();
    } 
  }
}


class program39
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter rows:");
    int irow = sobj.nextInt();

     System.out.println("Enter column:");
    int icol = sobj.nextInt();

    Printx pobj = new Printx();

    pobj.Display(irow,icol);

  }
}