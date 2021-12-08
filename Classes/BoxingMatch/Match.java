package java101.Classes.BoxingMatch;

public class Match {
    Fighter f1;
    Fighter f2;
    boolean isWin;

    Match(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    void rounds(Fighter f1, Fighter f2) {
        int i = 1;
        while (f1.health > 0 && f2.health > 0) {
            System.out.println("=============================");
            System.out.println("Round " + i);
            if (randSwiped()){
                f1.swiped();
            }else{
                f1.swiped();
            }
            i++;

            printSore();
        }
    }
    boolean randSwiped(){
        double chance = Math.random() * 100;
        return chance < 50;
    }

    void printSore(){
        System.out.println(f1.name + " fighter remaining health : " + f1.health);
        System.out.println(f2.name + " fighter remaining health : " + f2.health);
        System.out.println();
        result(isWin);
    }

    void result(boolean isWin){
        if (f1.health == 0){
            isWin = true;
            System.out.println(f2.name + " fighter won the match.");
        }else if(f2.health == 0){
            isWin = true;
            System.out.println(f2.name + " fighter won the match.");
        }else
            isWin = false;
    }


}
