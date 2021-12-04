package java101.Classes.OBS;

public class Student {
    Lecture l1;
    Lecture l2;
    Lecture l3;
    String name;
    String no;
    double average;
    int exnote1;
    int exnote2;
    int exnote3;
    int vernote1;
    int vernote2;
    int vernote3;
    int finalnote1;
    int finalnote2;
    int finalnote3;

    boolean isPass;

    Student(String name, String no, Lecture l1, Lecture l2, Lecture l3){
        this.name = name;
        this.no = no;
        this.average = 0.0;
        this.exnote1 = 0;
        this.exnote2 = 0;
        this.exnote3 = 0;
        this.vernote1 = 0;
        this.vernote2 = 0;
        this.vernote3 = 0;
        this.finalnote1 = 0;
        this.finalnote2 = 0;
        this.finalnote3 = 0;
        this.isPass = false;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;


    }
    void addExamNote( int note1, int note2, int note3){
        this.l1.examNote = note1;
        this.l2.examNote = note2;
        this.l3.examNote = note3;
        note1 *= this.l1.perExamNote;
        note2 *= this.l2.perExamNote;
        note3 *= this.l3.perExamNote;
        this.exnote1 = note1 / 100;
        this.exnote2 = note2 / 100;
        this.exnote3 = note3 / 100;

        System.out.println("Total Exam Grades(%) : ");
        printNote(this.exnote1, this.exnote1, this.exnote1);
    }
    void addVerbNote(int note1, int note2, int note3){
        this.l1.verbNote = note1;
        this.l2.verbNote = note2;
        this.l3.verbNote = note3;
        note1 *= this.l1.perVerbNote;
        note2 *= this.l2.perVerbNote;
        note3 *= this.l3.perVerbNote;
        this.vernote1 = note1 / 100;
        this.vernote2 = note2 / 100;
        this.vernote3 = note3 / 100;
        System.out.println("Total Verbal Grades(%) : ");
        printNote(this.vernote1, this.vernote2, this.vernote3);
    }
    void printNote(int note1, int note2, int note3){
        System.out.println(this.l1.name + " : " + note1);
        System.out.println(this.l2.name + " : " + note2);
        System.out.println(this.l3.name + " : " + note3);

    }

    void finalNote(){
        this.finalnote1 = this.exnote1 + this.vernote1;
        this.finalnote2 = this.exnote2 + this.vernote2;
        this.finalnote3 = this.exnote3 + this.vernote3;
        System.out.println("Total Grades : ");
        printNote(this.finalnote1, this.finalnote2, this.finalnote3);

    }

    void calcAverage(){
        this.average = (this.finalnote1 + this.finalnote2 + this.finalnote3) / 3.0;
        System.out.println("GPA: " + this.average);
    }

    void isPass(){
        calcAverage();
        if(this.average >= 55)
            System.out.println("Passed!");
        else
            System.out.println("Failed");
    }



}
