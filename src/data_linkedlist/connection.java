/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data_linkedlist;

/**
 *
 * @author MjadTech06
 */
public class connection {
    private String User_id, Lname,Fname, Mname;
private static Boolean isMatch;
public connection(){
        User_id = "";
        Lname = "";
        Fname = "";
        Mname = "";
    }

    public connection(String newUser, String newLname, String newFname, String newMname){
        User_id = newUser;
        Lname = newLname;
        Fname = newFname;
        Mname = newMname;

    }

    public void display(){
        System.out.println(User_id + Lname + Fname + Mname);
    }
    public void totalStud(int totalStud){
       System.out.println("Total Item = " + totalStud );
    }

public void IdDisplay(){

    System.out.println(User_id + "" + Lname + "" + Fname + "" + Mname);
}
public void DisplayName(){
    System.out.println(Lname);
}
public void findId(){
    isMatch = User_id.equals(User_id);
if(isMatch == true){
    System.out.println(User_id + "" + Lname + "" + Fname + "" + Mname);
   
}else {
    System.out.println("Not Found!");
}

}
public void displayid(){
    
       
    System.out.println(User_id);
}

}
