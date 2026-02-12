package testing;

import jakarta.persistence.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "Alien_machines")
public class Alien {

    @Id
    private int aid;
    @Column (name = "Good_names")
    private String name;
    private int marks;
    @OneToMany(mappedBy = "alien")
    private List<laptop> laptops;
    public Alien() {
        this.name = name;
        this.aid = aid;
        this.marks = marks;
    }
    public void getstudent(){

    }

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return aid;
    }

    public int getMarks() {
        return marks;
    }


    // setters


    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.aid = aid;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    public void setLaptop(List<laptop> laptops) { this.laptops = laptops; }


    @Override
    public String toString() {
        return  "Student name "+name+" rollno "+aid+" marks "+marks+"laptop "+laptops;
    }

    static void main(String[] args) {

    }

}