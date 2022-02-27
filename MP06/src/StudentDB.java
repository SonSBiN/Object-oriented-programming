public class StudentDB {
    Student[] students;
    int count = 0;
    int LOWER_THAN = 0;
    int HIGHER_THAN = 1;
    StudentDB(){
        students = new Student[3];
    }
    void add(Student student){
        if (count >= 3){
            System.out.println("갯수 초과");
            return;
        }
        else{
            students[count] = student;
            count++;
            return;
        }
    }
    void add(String name, int num, double gpa){
        if (count >= 3){
            System.out.println("갯수 초과");
            return;
        }
        else{
            Student st = new Student(name,num,gpa);
            students[count] = st;
            count++;
            return;
        }
    }
    Student findBy(String name){
        for(int i = 0; i < 3; i++){
            if ((students[i].getName()).equals(name)){
                return students[i];
            }
        }
        return null;
    }
    Student findBy(int number){
        for(int i = 0; i < 3; i++){
            if (students[i].getNumber() == number){
                return students[i];
            }
        }
        return null;
    }
    Student findBy(int param, double gpa){
        for(int i = 0; i < 3; i++){
            if (param == LOWER_THAN && students[i].getGPA() < gpa){
                return students[i];
            }
            else if(param == HIGHER_THAN && students[i].getGPA() > gpa){
                return students[i];
            }
        }
        return null;
    }
    Student findBy(double gpa){
        for(int i = 0; i < 3; i++){
            if (students[i].getGPA() == gpa){
                return students[i];
            }
        }
        return null;
    }
}
