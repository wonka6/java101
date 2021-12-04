package java101.Classes.OBS;

public class Tutor {
    String name;
    String no;
    String branch;

    Tutor(String name, String no, String branch){
        this.name = name;
        this.no = no;
        this.branch = branch;
    }
    void printTutor(){
        System.out.println("Tutor information:");
        System.out.println("Name: " + this.name);
        System.out.println("No: " + this.no);
        System.out.println("Branch: " + this.branch);
    }
}
