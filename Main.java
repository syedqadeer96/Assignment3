package com.company;
/*import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class PingAddress{
public void runCommand(String command){
    try {
        Process p = Runtime.getRuntime().exec(command);
        BufferedReader inputStream = new BufferedReader(
                new InputStreamReader(p.getInputStream()));

        String s = "";
        // reading output stream of the command
        while((s = inputStream.readLine())!=null)
            System.out.println(s);
    }

    catch (Exception e) {
        e.printStackTrace();
    }
}
}



public class Main {

    public static void main(String[] args) {
	String a;
        PingAddress p1=new PingAddress();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the ip address");
        a=s.nextLine();
        p1.runCommand(a);


    }
}*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void runSystemCommand(String command) {

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            // reading output stream of the command
            while((s = inputStream.readLine())!=null)
                System.out.println(s);
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String ip ;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the ip address");
        ip=scanner.nextLine();
        runSystemCommand("ping " + ip);


    }
}