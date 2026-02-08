package testing;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {

    @Id
    private int roll_no;
    private String name;
    private int marks;

    public student() {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }
    public void getstudent(){

    }

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public int getMarks() {
        return marks;
    }


    // setters


    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    @Override
    public String toString() {
        return  "Student name "+name+" rollno "+roll_no+" marks "+marks;
    }

    static void main(String[] args) {
        student s=new student();
        s.setMarks(15);
        System.out.println(s.getMarks());
    }

}