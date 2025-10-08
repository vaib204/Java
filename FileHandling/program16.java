import java.util.*;
import java.io.*;


class program16
{
  public static void main(String[] args)
  {
    try
    {
       String str  = "marvellous infosystem pune";

       System.out.println("original string is :"+str.length());
       System.out.println("original updated string is :"+str);

       str = str.trim();

      System.out.println("original string  after trim is :"+str.length());
       System.out.println("original updated string is :"+str);

    }
    catch(Exception eobj)
    {}
    
  }
}