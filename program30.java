///////////////////////////////////////////////////////
//
//  File name :     program30.java
//  Descreption :   Used to display Pattern
//  Author :        vaibhav mukund kulkarni
//  Date :          26/8/2025
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
        if(j % 2 == 0)
        {
        System.out.print("*"+"\t");
        }else
        {
         System.out.print(j+"\t");
       
        }
      }
         System.out.println();
    } 
  }
}


class program30
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