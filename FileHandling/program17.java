import java.util.*;
import java.io.*;


class program17
{
  public static void main(String[] args)
  {
    try
    {
       String str  = "   marvellous infosystem pune   ";

       System.out.println("original string is :"+str.length());
       

       str = str.trim();

      System.out.println("original string  after trim is :"+str.length());
      
      String arr[] = str.split(" ");

      System.out.println("number of tokens"+arr.length);

    }
    catch(Exception eobj)
    {}
    
  }
}