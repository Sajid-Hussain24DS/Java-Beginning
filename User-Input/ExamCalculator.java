import java.util.Scanner;

class ExamCalculator {
    public static void main(String[] args) {
        //Grade calculator

        Scanner s = new Scanner(System.in);
        //Total Subjects
        int numberSubjects = 7;
        String[] subjects ={"Math" , "Physics" , "Chemistry" , "Biology" , "English" , "Urdu" , "Islamiat"};
        int totalMarks = 0;

        System.out.println("Enter the marks for each subject out of 100 ");
        // Input marks for each subject
        for (int i = 0; i < numberSubjects; i++) {
            System.out.print(subjects[i] + ":");
            int marks = s.nextInt();
            totalMarks += marks; // Sum the marks
        }
            // claculate percentage

            double percentage = (double) totalMarks / (numberSubjects * 100) * 100;

            // Determine the Grade
            char grade;
            if (percentage >= 90) {
                grade = 'A';
            } else if (percentage >= 80) {
                grade = 'B';
            } else if (percentage >= 70) {
                grade = 'C';
            }else{
                grade= 'D';//Added grade for below 70
            }
            //The result
            System.out.println("Total Marks: " + totalMarks + "/" + (numberSubjects * 100));
            System.out.printf("Percentage : %.2f%%\n", percentage);
            System.out.printf("Grade" + grade);
        }
    }






