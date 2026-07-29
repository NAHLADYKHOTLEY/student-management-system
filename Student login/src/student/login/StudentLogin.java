
package student.login;

import java.util.Scanner;


public class StudentLogin {

    static String firstname;
    static String lastname;
    static String dateofbirth;
    static String idnum;
    static String gender;
    static String course;
    static String phone;
    static String password;
    int option;
    
    public static void Capture(){
        Scanner S= new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("STUDENT REGISTRATION");
        System.out.println("------------------------------------");
        System.out.println("Enter your first name");
        firstname=S.nextLine();
        System.out.println("Enter your last name");
        lastname=S.nextLine();
        System.out.println("Enter your date of birth");
        dateofbirth=S.nextLine();  
        System.out.println("Enter your gender");
        gender=S.nextLine();
        System.out.println("Enter your ID number");
        idnum=S.nextLine();
        System.out.println("Enter your phone number");
        phone=S.nextLine();
        System.out.println("Enter your course");
        course=S.nextLine();
        

        System.out.println("Your information has successfully captured!!!!!!");
        System.out.println("Our response take 1-2 weeks");
    }
        public static void Menu(){
            Scanner S=new Scanner(System.in);
            int option;
            System.out.println("================================");
            System.out.println("KHOTLE IT SOLUTION MENU");
            System.out.println("================================");
            System.out.println("Enter 1 to login");
            System.out.println("Enter 2 to to view your details");
            
            option=S.nextInt();
            switch(option){
                case 1:
                    
                    System.out.println("Enter your first name");
                    firstname=S.nextLine();
                    System.out.println("Enter your last name");
                    lastname=S.nextLine();
                    System.out.println("Enter your password");
                    password=S.nextLine();
                    System.out.println("your are have successfully logged in");
                default:
                    System.out.println("Incorrect creditials...");
                    break;
                    
                    
                case 2:
                    System.out.println("First name:" +firstname);
                    System.out.println("Last name:" +lastname);
                    System.out.println("Date of birth" +dateofbirth);
                    System.out.println("ID number:" +idnum);
                    System.out.println("Phone number" +phone);
                    System.out.println("Course:" +course);
                    break;
                
            }

        
    }
    public static void main(String[] args) {
       Capture();
       Menu();
    }
    
}
