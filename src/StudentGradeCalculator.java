import java.util.Scanner;

public class StudentGradeCalculator {
    /*Input: Take marks obtained (out of 100) in each subject.
    Calculate Total Marks: Sum up the marks obtained in all subjects.
    Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
    average percentage.
    Grade Calculation: Assign grades based on the average percentage achieved.
    Display Results: Show the total marks, average percentage, and the corresponding grade to the use*/

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the below Subjects out of 100 :- ");
        float dcom, mech, ss;
        
        
            System.out.println("Enter the marks of DCom: ");
            dcom = sc.nextFloat();

            while (dcom < 0 || dcom > 100) {
                System.out.println("Invalid marks! Enter a value between 0 and 100.");
                System.out.println("Enter the marks of Mechatronics: ");
                dcom = sc.nextFloat();
            }

            System.out.println("Enter the marks of Mechatronics: ");
            mech = sc.nextFloat();

            while (mech < 0 || mech > 100) {
                System.out.println("Invalid marks! Enter a value between 0 and 100.");
                System.out.println("Enter the marks of Mechatronics: ");
                mech = sc.nextFloat();
            }
    
            // Input and validate marks for SS
            System.out.println("Enter the marks of SS: ");
            ss = sc.nextFloat();
            while (ss < 0 || ss > 100) {
                System.out.println("Invalid marks! Enter a value between 0 and 100.");
                System.out.println("Enter the marks of SS: ");
                ss = sc.nextFloat();
            }
            

            System.out.println("Marks obtained in DCom "+dcom);
            System.out.println("Marks obtained in Mechatronics "+mech);
            System.out.println("Marks obtained in SS "+ss);
            System.out.println("");


            double total = dcom+mech+ss;
            System.out.println("The total of your marks out of 300 is : "+total);
            System.out.println("");


            double avg = total/3;
            System.out.println("Average percantage marks you obtained are: "+avg+"%");

            if(avg >=90){
                System.out.println("Grade A+");
            }
            else if(avg >=80 && avg <90){
                System.out.println("Grade A");
            }
            else if(avg >=70 && avg <80){
                System.out.println("Grade B+");
            }else if(avg >=60 && avg <70){
                System.out.println("Grade B");
            }else if(avg >=50 && avg <60){
                System.out.println("Grade C");
            }
            else{
                System.out.println("Grade F");
            }   
    }
}
