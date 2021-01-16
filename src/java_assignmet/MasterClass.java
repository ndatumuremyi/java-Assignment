/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_assignmet;

/**
 *
 * @author paterne
 */
public class MasterClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(checkEmail("paterneou@gmail.com"));
    }
    public static boolean checkEmail(String email){
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if( email.matches(regex)){
            if(email.contains("@gmail.com") || email.contains("@yahoo.com") || email.contains("@hotmail.com"))
                return true;
        }
        return false;
    }
    public int getStringLength(String txt){
        return txt.length();
    }
    public String changeToUpper(String txt){
        return txt.toUpperCase();
    }
    
    
    
}
