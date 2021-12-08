package java101.Classes.BoxingMatch;

public class Fighter {
    String name;
    int weight;
    int damage;
    int health;
    double dodge;

    Fighter(String name, int weight, int damage, int health, double dodge) {
        this.name = name;
        this.weight = weight;
        this.damage = damage;
        this.health = health;
        this.dodge = dodge;
    }

    void swiped() {
        if(dodge()){
            System.out.println(this.name + " dodge incoming damage.");
        }else if(this.health - this.damage < 0)
            this.health = 0;
        else
            this.health -= this.damage;
    }

    boolean dodge(){
        double randValue = Math.random() * 100;
        return randValue <= this.dodge;
    }
}
