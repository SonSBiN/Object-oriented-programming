public class Student {
    String name;
    int number;
    double gpa;
    Student (String name, int num, double dpa){
        this.name = name;
        this.number = num;
        this.gpa = dpa;
    }
    String getName(){
        return name;
    }
    int getNumber(){
        return number;
    }
    double getGPA(){
        return gpa;
    }
    public String toString(){
        return ("Name: "+name+", Number: "+number+", GPA: "+gpa);
    }
}
