package java101.Classes.OBS;

public class Main {
    public static void main(String[] args) {
        Tutor t1 = new Tutor("Kate", "123", "ING");
        //t1.printTutor();

       // System.out.println("--------------");

        Lecture l1 = new Lecture("english", "300", "ING", 20, 80);
        //l1.printTutorInfo(t1);
        Lecture l2 = new Lecture("math", "301", "MATH", 30, 70);
        Lecture l3 = new Lecture("art", "302", "ART", 60, 40);

        //System.out.println("---------------");
        Student s1 = new Student("elif", "34", l1, l2, l3);
        s1.addExamNote(80, 90, 85);
        System.out.println("---------------");
        s1.addVerbNote(70, 78, 100);
        System.out.println("---------------");
        s1.finalNote();
        System.out.println("---------------");
        s1.isPass();
    }
}
