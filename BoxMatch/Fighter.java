package BoxMatch;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodgeLevel;
    
    Fighter(String name, int damage, int health, int weight, int dodgeLevel){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        
        if(dodgeLevel>=0 && dodgeLevel<=100){
            this.dodgeLevel = dodgeLevel;
        }else{
            this.dodgeLevel = 0;
        }
    }

    int hit(Fighter opponentFighter){
        if(opponentFighter.dodge()){
            System.out.println(opponentFighter.name + " blokladı!");
            return opponentFighter.health;
        }
        System.out.println(this.name + " => " + opponentFighter.name + " " + this.damage + " değerinde hasar verdi!");
        if(opponentFighter.health - this.damage < 0){
            return 0;
        }
        return opponentFighter.health - this.damage;
    }

    boolean dodge(){
        double randomNumber = Math.random() * 100;
        return this.dodgeLevel >= randomNumber;
    }
}
