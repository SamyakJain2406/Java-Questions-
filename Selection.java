import java.util.Scanner;


public class Selection {

    public static void main(String[] args) {

        String Names;
        Double cgpa;
        String PGcode;
        String fresher;
        String intership;

        Scanner userinput = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        Names = userinput.nextLine();

        System.out.println("Enter your CGPA : ");
        cgpa = userinput.nextDouble();

        System.out.println("Enter your course : ");
        PGcode = userinput.next();

        System.out.println("Are you fresher Y/N : ");
        fresher = userinput.next();

        System.out.println(" done any intrship ");
        intership = userinput.next();


        Selection students = new Selection();

        students.Iseligible(Names, cgpa, PGcode, fresher, intership);

        userinput.close();

        
    }

    public void  Iseligible (
            String name, Double cgpa, String PGcode, String fresher,  String intership ) 
            {
        Double iscgpa = 7.5;
        String course = "MCA";
        String isfresher = "S";
        String isintership = "G";
       

        if (cgpa > iscgpa && PGcode.equals(course)
        &&  fresher.equals(isfresher) && intership.equals(isintership)
        ) {
            System.out.println(name + " You are Selected" );
        }else{

            System.out.println(name + " You are not Selected");

            
        }

    }

}