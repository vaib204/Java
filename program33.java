///////////////////////////////////////////////////////
//
//  File name :     program33.java
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
    char ch = 'A',ch2 = 'a';

    for(i = 1,ch = 'A',ch2 = 'a';i<=rows;i++,ch++,ch2++)
    {
      for(j = 1;j<=col;j++)
      {
        if( i % 2 == 0)
        {
        System.out.print(ch2+"\t");
        }
        else
        {
          System.out.print(ch+"\t");
        }
      }
         System.out.println();
    } 
  }
}


class program33
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