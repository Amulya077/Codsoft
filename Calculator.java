import java.util.Scanner;
public class Calculator{ 
   public static void main(String[] args){
    int Totalmarks=0;
    float avg=0;
    try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the number of subjects: ");
        int Subject=sc.nextInt();{
            for(int i=1;i<=Subject;i++){
                System.out.println("Enter the marks scored in each subject "+ i +": ");
                int marks=sc.nextInt();
                Totalmarks=Totalmarks+marks;
                avg=(Totalmarks/Subject);
            }
            System.out.println("----------------------------------------------------------");
            System.out.println("The total marks obtained in all subjects is:"+Totalmarks);
            System.out.println("The average marks of all subjects is :"+ avg );
            if(avg >=90.0){
                System.out.println("GRADE: A1");
            }
            else if(avg >= 80.0){
                System.out.println("GRADE: A2");
            }
            else if(avg>=70.0){
                System.out.println("GRADE: B1");
            }
            else if(avg>=60.0){
                System.out.println("GRADE: B2");
            }
            else if(avg>=50.0){
                System.out.println("GRADE: C1");
            }
            else if(avg>=40.0){
                System.out.println("GRADE: C2");
            }
            else if(avg>=30){
                System.out.println("GRADE: D");
            }
            else{
                System.out.println("FAILED");
            }
            System.out.println("---------------------------------------------------------");
        }
    }
    
   }
} 
