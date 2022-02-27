public class Main {
    public static void main(String[] args){
        StudentDB studentdb = new StudentDB();
        Student student = new Student("김지우",201911111, 4.01);
        studentdb.add(student);
        studentdb.add("이민준",201922222,3.85);
        studentdb.add("박서윤",201933333,3.90);

        System.out.println(studentdb.findBy("김지우"));
        System.out.println(studentdb.findBy(201922222));
        System.out.println(studentdb.findBy(3.90));
        System.out.println(studentdb.findBy(0,3.95));
        System.out.println(studentdb.findBy(1,3.95));
    }
}
