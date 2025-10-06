import java.util.*;
import java.io.*;


class program9
{
  public static void main(String a[])
  {
    try{
    int iret = 0;
    Scanner sobj = new Scanner(System.in);
   
    System.out.println("Enter the file name that you want open");
    String fname  = sobj.nextLine();

    File fobj = new File(fname);

   if(fobj.exists())
   {
    FileInputStream fiobj = new FileInputStream(fobj);

    byte Arr[] = new byte[1024];

    System.out.println("Data from file is:");

    while ((iret = fiobj.read(Arr))!= -1)
    {
       String str  = new String(Arr,0,iret);
       System.out.println(str);

    }
  }
  else
  {
    System.out.println("file is not present in current directory");
    return;
  }
}
 catch(IOException iobj)
 {}
 catch(Exception eobj)
 {}
}
}