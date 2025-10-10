import java.util.*;
import java.io.*;

class MarvellousPacker {
    private String PackName;
    private String DirName;

    public MarvellousPacker(String A, String B) {
        this.PackName = A;
        this.DirName = B;
    }

    public void PackingActivity() {
        try {
            System.out.println("--------------------------------------------------------");
            System.out.println("----------- Marvellous Packer Unpacker -----------------");
            System.out.println("--------------------------------------------------------");
            System.out.println("------------------ Packing Activity --------------------");       
            System.out.println("--------------------------------------------------------");

            int iRet = 0, iCountFile = 0;

            File fobj = new File(DirName);

            // Check the existence of Directory
            if (fobj.exists() && fobj.isDirectory()) {
                System.out.println(DirName + " is successfully opened");

                File PackObj = new File(PackName);

                // Create a packed file
                boolean bRet = PackObj.createNewFile();

                if (!bRet) {
                    System.out.println("Unable to create pack file");
                    return;
                }

                System.out.println("Packed file gets successfully created with name : " + PackName);

                File[] Arr = fobj.listFiles();

                FileOutputStream foobj = new FileOutputStream(PackObj);
                byte[] Buffer = new byte[1024];

                for (File file : Arr) 
                {
                    String Header = file.getName() + " " + file.length();

                    // Pad header to 20 characters
                    Header = String.format("%-20s", Header);

                    // Add newline at the end of header
                    Header += "\n";

                    // Write header
                    foobj.write(Header.getBytes());

                    FileInputStream fiobj = new FileInputStream(file);

                    while ((iRet = fiobj.read(Buffer)) != -1) {
                        foobj.write(Buffer, 0, iRet);
                    }

                    fiobj.close();
                    iCountFile++;

                    // Console output for feedback
                    System.out.println("File Scanned: " + file.getName());
                    System.out.println("File size read: " + file.length());
                    System.out.println();
                }

                System.out.println("Packing activity done");
                System.out.println("--------------------------------------------------------");
                System.out.println("------------------ Statistical Report ------------------");
                System.out.println("Total files Packed : " + iCountFile);
                System.out.println("--------------------------------------------------------");
                System.out.println("--------- Thank you for using our application ----------");
                System.out.println("--------------------------------------------------------");
            } else {
                System.out.println("There is no such directory");
            }
        } catch (Exception eobj) {
            eobj.printStackTrace();
        }
    }
}

class program23 {
    public static void main(String[] args) {
        try {
            Scanner sobj = new Scanner(System.in);

            System.out.print("Enter the name of Directory that you want to pack: ");
            String DirName = sobj.nextLine();

            System.out.print("Enter the name of file that you want to create for packing: ");
            String PackName = sobj.nextLine();

            MarvellousPacker mobj = new MarvellousPacker(PackName, DirName);
            mobj.PackingActivity();
        } catch (Exception eobj) {
            eobj.printStackTrace();
        }
    }
}