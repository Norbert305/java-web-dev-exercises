package Classes;

public class Student {

    //Project contains a constructor with instance fields and an object in the main method that generates the values in the parameters to output the answer.


    //Here are my instance fields
    String name;
    int studentId;
    int numberOfCredits;
    double gpa;
        //Here is my constructor. A constructor can contain instance fields.
    public Student(String studentName, int Id, int Cred, double grade) {
        name = studentName;
        studentId = Id;
        numberOfCredits = Cred;
        gpa = grade;

    }

    //Here is my main method
    public static void main(String[] args) {
            //Here I created a new object that contains the values of the instance fields above
            Student gradeChecker = new Student("Bob",1234,24,90.7);
            System.out.println(gradeChecker.name+ " scored a "+gradeChecker.gpa+" on his test. His school id is "+gradeChecker.studentId+" and number of credits is "+gradeChecker.numberOfCredits);

    }

}
