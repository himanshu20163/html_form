package school;

public class student {
    
    String name;
    private int rollno;
    int marks;

    // public student(String name, int rollno) {
    //     this.name = name;
    //     this.rollno = rollno;
    // }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    
}
