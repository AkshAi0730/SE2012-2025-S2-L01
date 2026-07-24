import java.util.Scanner;

public class Marks{
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    boolean run = true;

    System.out.print("Enter the No of Students : ");
    int no_std = scanner.nextInt();
    int n = 100;
    int[][] matrix = new int [n][4];
    for(int i=0;i < no_std;i++){
        System.out.printf("Enter the %d student id     : ", (i+1));
        matrix[i][0] = scanner.nextInt();
        System.out.print("Enter the Mathematics Marks  : ");
        matrix[i][1] = scanner.nextInt();
        System.out.print("Enter the Chemistry Marks    : ");
        matrix[i][2] = scanner.nextInt();
        System.out.print("Enter the Physics Marks      : ");
        matrix[i][3] = scanner.nextInt();
        System.out.print("\n");
        }

    while(run){
        System.out.print("\n\n--- System Menu ---\n");
        System.out.print("1.Add Student Marks\n");
        System.out.print("2.Update Student Marks\n");
        System.out.print("3.Avarage for a Subject\n");
        System.out.print("4.Average for a student\n");
        System.out.print("5.Total Marks of a Student\n");
        System.out.print("6. Exit\n");
        
        System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1 :
                {
                    
                    System.out.printf("Enter the %d student id     : ", (no_std+1) );
                    matrix[no_std][0] = scanner.nextInt();
                    System.out.print("Enter the Mathematics Marks  : ");
                    matrix[no_std][1] = scanner.nextInt();
                    System.out.print("Enter the Chemistry Marks    : ");
                    matrix[no_std][2] = scanner.nextInt();
                    System.out.print("Enter the Physics Marks      : ");
                    matrix[no_std][3] = scanner.nextInt();
                    no_std++;
                    break;

                }
            case 2 :
                {
                    System.out.print("Enter the id of student to Update :");
                    int stdid = scanner.nextInt();
                    int found = 0;

                    for(int i= 0; i< no_std; i++){
                        if(stdid == matrix[i][0]){
                            matrix[i][0] = stdid;
                            System.out.print("Enter the Mathematics Marks  : ");
                            matrix[i][1] = scanner.nextInt();
                            System.out.print("Enter the Chemistry Marks    : ");
                            matrix[i][2] = scanner.nextInt();
                            System.out.print("Enter the Physics Marks      : ");
                            matrix[i][3] = scanner.nextInt();
                            found++;
                        }
                    }
                    
                    if(found == 0){
                            System.out.print("No Results Found");
                        }else if(found == 1){
                            System.out.print("Updated the marks");
                        }else{
                            System.out.print("value found more than once");
                        }
                        break;
                }
            case 3 :
                {
                    System.out.print("1. Mathematics\n");
                    System.out.print("2. Chemistry\n");
                    System.out.print("3. Physics\n");
                    System.out.print("Select Subject to find Average : ");
                    int subject = scanner.nextInt();

                    if(subject >= 1 && subject <= 3){
                        int sub_total = 0;
                        for(int i = 0; i < no_std; i++){
                            sub_total = sub_total + matrix[i][subject];
                        }
                        double sub_average = (double)sub_total / no_std;

                        System.out.printf("Average of selected subject is %.2f ",sub_average);
                    }else{
                        System.out.printf("Wrong input");
                    }
                    break;
                }
            case 4 :
                {
                    System.out.print("Enter the stdent id to find Average : ");
                    int stdid = scanner.nextInt();
                    int place = -1;

                    for(int i = 0; i < no_std; i++){
                        if(matrix[i][0]==stdid){
                            place = i;
                        }
                    }
                    if(place == -1){
                        System.out.print("Student id not found");
                        break;
                    }
                    int std_total = 0;
                    for(int j = 1; j < 4 ; j++){
                        std_total = std_total + matrix[place][j];
                    }
                    double std_average = (double)std_total / 3;
                    System.out.printf("Average of selected student %d is %.2f ", stdid , std_average);
                    break;
                }
            case 5 :
                {

                    System.out.print("Enter the stdent id to find Average : ");
                    int stdid = scanner.nextInt();
                    int place = -1;

                     for(int i = 0; i < no_std; i++){
                        if(matrix[i][0]==stdid){
                            place = i;
                        }
                    }

                    if(place == -1){
                        System.out.print("Student id not found");
                        break;
                    }

                    int std_total = 0;
                    for(int j = 1; j < 4 ; j++){
                        std_total = std_total + matrix[place][j];
                    }

                    System.out.printf("Total of selected student %d is %d ", stdid , std_total);
                    break;
                }
            case 6 :
                {
                    run =  false;
                    System.out.print("---Exiting...");
                    break;
                }
            default :
                {
                    System.out.println("Invalid Menu Option! Please try again.");
                }
                
        }
    }
   }
}