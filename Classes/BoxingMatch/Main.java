package java101.Classes.BoxingMatch;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 90, 10, 100, 20);
        Fighter f2 = new Fighter("B", 95, 10, 90, 20);

        //f1.randSwiped();
        Match m1 = new Match(f1, f2);
        m1.rounds(f1, f2);
    }
}
