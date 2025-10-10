import java.util.*;

import java.io.*;


class program24
{
  public static void main(String[] args)
  {
    try{
     Scanner sobj = new Scanner(System.in);

     System.out.println("Enter the name of whiichcontains packed data:");
     String Packname = sobj.nextLine();

     File fobj = new File(Packname);

     if(!fobj.exists())
     {
      System.out.println("unable to acces packed file");
      return;
     }
     System.out.println("packed file gets succesfully opend");


     FileInputStream fiobj = new FileInputStream(fobj);

    }
    catch(Exception e)
    {}
  }
}