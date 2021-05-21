import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of Students> ");
        int stuCount = input.nextInt();

        Student[] students = new Student[stuCount];
        int id = 0;

        for (int i = 0; i < stuCount; i++)
        {
            id++;
            System.out.print("Student Name> ");
            input.nextLine();
            String name = input.nextLine();

            System.out.print("Number of Tests Given> ");
            int testCount = input.nextInt();
            int[] marks = new int[testCount];

            for (int j = 0; j < testCount; j++)
            {
                System.out.printf("Enter Marks for Test # %d> ", j+1);
                marks[j] = input.nextInt();;
            }

            Student student = new Student(id, name, marks);
            students[i] = student;
        }

        System.out.print("Enter Course Name> ");
        input.nextLine();
        String courseName = input.nextLine();

        GradeBook gradeBook = new GradeBook(courseName, students);
        Student[] stuTemp = gradeBook.getStudents();

        //1. Maximum Tests Given
        int maxTest = 0;
        int stuId = 0;

        for (int i = 0; i < stuTemp.length; i++) {
            int[] markTemp = stuTemp[i].getMarks();

            if(maxTest < markTemp.length){
                maxTest = markTemp.length;
                stuId = stuTemp[i].getId();
            }
        }
        System.out.printf("\nMax Test> %d \nStudent ID> %d\n\n", maxTest, stuId);

        //2. Maximum Average Marks
        float maxAverage = 0.0F;
        float avg = 0.0F;
        stuId = 0;

        for (int i = 0; i < stuTemp.length; i++)
        {
            int[] markTemp = stuTemp[i].getMarks();
            float sum = 0.0F;

            for (int j = 0; j < markTemp.length; j++)
            {
                sum += markTemp[j];
            }

            avg = (sum/markTemp.length);
            if(maxAverage < avg){
                maxAverage = avg;
                stuId = stuTemp[i].getId();
            }
        }
        System.out.printf("Maximum Average> %.2f \nStudent ID> %d\n\n", maxAverage, stuId);

        //3. Average Marks of Class
        float classAverage = 0.0F;
        int noOfTests = 0;
        float sum = 0.0F;

        for (int i = 0; i < stuTemp.length; i++) {
            int[] markTemp = stuTemp[i].getMarks();

            for (int j = 0; j < markTemp.length; j++) {
                sum += markTemp[j];
            }
            noOfTests += markTemp.length;
        }

        classAverage = (sum/noOfTests);
        System.out.printf("Average of Class> %.2f\n\n", classAverage);

        //4. Average Marks of All Students
        avg = 0.0F;
        sum = 0.0F;
        stuId = 0;

        for (int i = 0; i < stuTemp.length; i++) {
            int[] markTemp = stuTemp[i].getMarks();
            sum = 0.0F;
            avg = 0.0F;

            for (int j = 0; j < markTemp.length; j++) {
                sum += markTemp[j];
            }

            avg = (sum/markTemp.length);
            stuId = stuTemp[i].getId();

            System.out.printf("Student ID> %d Average> %.2f\n", stuId, avg);

        }
        System.out.println();

        //5. Minimum Marks of All Students
        int minMarks = 0;

        for (int i = 0; i < stuTemp.length; i++) {
            int[] markTemp = stuTemp[i].getMarks();
            minMarks = markTemp[0];

            for (int j = 0; j < markTemp.length; j++) {
                if(minMarks > markTemp[j]){
                    minMarks = markTemp[j];
                }
            }
            System.out.printf("Student ID> %d Minimum Marks> %d\n", stuTemp[i].getId(), minMarks);
        }
        System.out.println();

        //6. Maximum Marks of All Students
        int maxMarks = 0;

        for (int i = 0; i < stuTemp.length; i++)
        {
            int[] markTemp = stuTemp[i].getMarks();
            maxMarks = markTemp[0];

            for (int j = 0; j < markTemp.length; j++)
            {
                if(maxMarks < markTemp[j]){
                    maxMarks = markTemp[j];
                }
            }
            System.out.printf("Student ID> %d Maximum Marks> %d\n", stuTemp[i].getId(), maxMarks);
        }
        System.out.println();

        //7. Average, Minimum and Maximum Marks of a specific student
        //   asked from the user
        System.out.print("Enter Student ID whose Avg. Min and Max Marks You Want to Display> ");
        stuId = input.nextInt();

        Student temp = stuTemp[stuId-1];
        int[] stuMarks = temp.getMarks();;

        avg = 0.0F;
        sum = 0.0F;
        minMarks = stuMarks[0];
        maxMarks = stuMarks[0];

        for (int i = 0; i < stuMarks.length; i++)
        {
            if(minMarks > stuMarks[i])
            {
                minMarks = stuMarks[i];
            }

            if(maxMarks < stuMarks[i])
            {
                maxMarks = stuMarks[i];
            }

            sum += stuMarks[i];
        }

        avg = (sum/stuMarks.length);
        System.out.printf("Student ID> %d\n", stuTemp[stuId-1].getId());
        System.out.printf("Minimum Marks> %d\n", minMarks);
        System.out.printf("Maximum Marks> %d\n", maxMarks);
        System.out.printf("Average> %.2f\n", avg);
    }
}