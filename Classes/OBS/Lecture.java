package java101.Classes.OBS;

public class Lecture {
    Tutor tutor;
    String name;
    String code;
    String prefix;
    int verbNote;
    int examNote;
    int perVerbNote;
    int perExamNote;

    Lecture(String name, String code, String prefix,int perVerbNote, int perExamNote){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.perVerbNote = perVerbNote;
        this.perExamNote = perExamNote;
    }

    void FinalNote(int examNote, int verbNote, int e1, int v1){
        this.examNote = examNote;
        this.verbNote = verbNote;
        int finalNote = examNote * e1 + verbNote * v1;
        System.out.println("The grade is: " + finalNote);
    }

    void printTutorInfo(Tutor tutor){
        this.tutor = tutor;
        tutor.printTutor();
    }
}
