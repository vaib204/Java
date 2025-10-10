import java.util.*;
import java.io.*;

class program21
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of Directory that you want to pack : ");
            String DirName = sobj.nextLine();

            System.out.println("Enter the name of file that you want to create for packing : ");
            String PackName = sobj.nextLine();

            File PackObj = new File(PackName);

            boolean bRet = PackObj.createNewFile();

            if(bRet == false)
            {
                System.out.println("Unable to create pack file");
                return;
            }
            
            File fobj = new File(DirName);

            if((fobj.exists()) && (fobj.isDirectory()))
            {
                System.out.println("Directory is present");

                File Arr[] = fobj.listFiles();

                System.out.println("Number of files in the directory are : "+Arr.length);
            
                int i = 0,j = 0;

                FileOutputStream foobj = new FileOutputStream(PackObj);
                
                byte Buffer[] = new byte[1024];
                int iRet = 0;

                String header = null;

                for(i = 0; i < Arr.length; i++)
                {
                   header = Arr[i].getName()+" "+Arr[i].length();

                   System.out.println(header+"length of header is:"+header.length());

                   for(j = header.length();j<100;j++)
                   {
                    header = header + " ";
                   }
                    foobj.write(header.getBytes());
                }          
                System.out.println("Packing activity done");
            }
            else
            {
                System.out.println("There is no such directory");
            }
        }
        catch(Exception eobj)
        {}
    }
}