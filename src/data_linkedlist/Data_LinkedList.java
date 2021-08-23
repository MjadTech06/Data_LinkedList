/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data_linkedlist;

/**
 *
 * @author MjadTech06
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

   
    
public class Data_LinkedList {

    /**
     * @param args the command line arguments
     */
   
        // TODO code application logic here
  static String user_id, lname, fname, mname;
 
 private static ArrayList userid = new ArrayList();
 private static ArrayList userLname = new ArrayList();
 private static ArrayList userFname = new ArrayList();
 private static ArrayList userMname = new ArrayList();

  private static String ans;
 
  
    /**
     * @param args the command line arguments
     */
    static void displayMenu(){
        System.out.println(trimStr("",130,"-"));
        System.out.println("USERS INFORMATION MENU");
        System.out.println("====================================================");
        System.out.println("[1] Display Id Sort\n[2] Display Last name Sort\n[3] Display Unsort List\n[4] Add new Item\n[0] Exit");
        System.out.print("\nChoose:: ");
    }
    static void writeAccount()throws IOException{
        BufferedWriter out = new BufferedWriter(new FileWriter("info.txt", true));
        out.write(user_id + "," + lname + "," + fname + "," + mname);
        out.newLine();
        out.flush();
        out.close();
    }
    
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         BufferedReader in1 = new BufferedReader(new FileReader("info.txt"));
        String str = "";
        while( in1.ready() ){
            str = in1.readLine();
            String line[] = str.split(",");
            
            userid.add(line[0].toString().trim());
            userLname.add(line[1].toString().trim());
            userFname.add(line[2].toString().trim());
            userMname.add(line[2].toString().trim());


        }
        boolean flag = true;
        while(flag){
            displayMenu();
            int ch = Integer.parseInt(in.readLine());
            
            
            switch(ch){
                case 1:
       System.out.println("\n" + trimStr("",130,"-"));
       System.out.println("This is a for Display ID");
       System.out.println("\n" + trimStr("",130,"-"));
       System.out.println( trimStr("User ID",20, " "));
       System.out.println(trimStr("",130,"-"));
       Collections.sort(userid);
       viewIdSort();
                    break;
                case 2:
                    System.out.println("\n" + trimStr("",130,"-"));
       System.out.println("This is a for Display Lastname");
       System.out.println("\n" + trimStr("",130,"-"));
       System.out.println( trimStr("Lastame",20, " "));
       System.out.println(trimStr("",130,"-"));
       Collections.sort(userLname);
       viewLnameSort();
       
       break;
      case 3:
       System.out.println("\n" + trimStr("",130,"-"));
       System.out.println("This is a for Display Item Unsort");
       System.out.println("\n" + trimStr("",130,"-"));
       System.out.println( trimStr("User ID",20, " ") + trimStr("Lastame",20, " ") + trimStr("Firstname",20, " ") + trimStr("Middlename",20,""));
       System.out.println(trimStr("",130,"-"));
       viewListUnsort();
       
       break;
            
            
      case 4:
           System.out.print("Enter User's ID: ");
                    user_id = in.readLine();
                    System.out.print("Enter Last Name: ");
                    lname = in.readLine();
                    System.out.print("Enter First Name: ");
                    fname = in.readLine();
                    System.out.print("Enter Middle Name: ");
                    mname = in.readLine();
                    System.out.println("Item Saved!");
                    writeAccount();
                    System.out.println("\n" + trimStr("",130,"-"));
                    
                    flag = true;
       break;
                      
                case 0:
                    flag = false;
                    break;
                default:
                    flag  = true;
                 break;
             } // end switch
        } // end while flag
    }

    private static String trimStr(String word, int len, String sep) {
         String res = word;
        int i;
        for (i = word.length(); i<=len; i++){
            res += sep;
        }
        return res;
    }

    private static void viewIdSort() {
        
        try {
            connection s = new connection();
            // this is a method class in a class
            
           
            for(int i=0;i<userid.size();i++){
           
     
               s = new connection(trimStr(userid.get(i).toString(), 20, " "),
                       trimStr(userLname.get(i).toString(), 20, " ") ,
                       trimStr(userFname.get(i).toString(), 20, " ") ,
                       trimStr(userMname.get(i).toString(), 20, " "));
               s.displayid();
               
            }
          
            System.out.println(trimStr("",130,"-"));
            s.totalStud(userid.size());
            System.out.println(trimStr("",130,"-") + "\n");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void viewLnameSort() {
        try {
            connection s = new connection();
            // this is a method class in a class
            
           
            for(int i=0;i<userid.size();i++){
           
     
               s = new connection(trimStr(userid.get(i).toString(), 20, " "),
                       trimStr(userLname.get(i).toString(), 20, " ") ,
                       trimStr(userFname.get(i).toString(), 20, " ") ,
                       trimStr(userMname.get(i).toString(), 20, " "));
               s.DisplayName();
               
            }
          
            System.out.println(trimStr("",130,"-"));
            s.totalStud(userid.size());
            System.out.println(trimStr("",130,"-") + "\n");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void viewListUnsort() {
        try {
            connection s = new connection();
            // this is a method class in a class
            
           
            for(int i=0;i<userid.size();i++){
           
     
               s = new connection(trimStr(userid.get(i).toString(), 20, " "),
                       trimStr(userLname.get(i).toString(), 20, " ") ,
                       trimStr(userFname.get(i).toString(), 20, " ") ,
                       trimStr(userMname.get(i).toString(), 20, " "));
               s.IdDisplay();
               
            }
          
            System.out.println(trimStr("",130,"-"));
            s.totalStud(userid.size());
            System.out.println(trimStr("",130,"-") + "\n");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
       
}

