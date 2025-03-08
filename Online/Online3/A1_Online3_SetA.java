package Online.Online3;

class Student{
    private int totalMarks;
    private int totalSubject;

    public Student(int totalMarks, int totalSubject) {
        this.totalMarks = totalMarks;
        this.totalSubject = totalSubject;
    }

    public int getTotalSubject() {
        return totalSubject;
    }

    public void setTotalSubject(int totalSubject) {
        this.totalSubject = totalSubject;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
}

class GradeCalculator{
    GradeCalculator(){}

    public void calculateGrade(Student s){
        int avg = s.getTotalMarks()/s.getTotalSubject();
        System.out.println(avg);

        if(avg>=80) System.out.println("A");
        else if(avg>=60) System.out.println("B");
        else if(avg>=40) System.out.println("C");
        else System.out.println("F");
    }
}

public class A1_Online3_SetA {
    public static void main(String[] args) {
        Student s = new Student(800,8);
        GradeCalculator gc = new GradeCalculator();

        gc.calculateGrade(s);
    }
}
