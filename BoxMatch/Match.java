package BoxMatch;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Fighter starter;
    Fighter opponent;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void fight(){
        if(weightCheck()){
            int round = 1;
            while(true){
                System.out.printf("Sağlık durumları --> %s = %d | %s = %d%n%n", this.f1.name, this.f1.health, this.f2.name, this.f2.health);
                double randomNumber = Math.random() * 100;
                if(randomNumber < 50){
                    this.starter = this.f1;
                    this.opponent = this.f2;
                }else{
                    this.starter = this.f2;
                    this.opponent = this.f1;
                }
                System.out.printf("==== %d. ROUND BAŞLIYOR ====%n",round);
                this.opponent.health = this.starter.hit(this.opponent);
                if(checkWin()){
                    break;
                }
                this.starter.health = this.opponent.hit(this.starter);
                if(checkWin()){
                    break;
                }
                round++;
                System.out.println();
            }
        }else{
            System.out.println("Boksörlerin sikletleri müsabaka için uygun değil.");
        }
    }

    boolean weightCheck(){
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && 
                (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    boolean checkWin(){
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " KAZANDI !!!");
            return true;
        }
        if(this.f2.health == 0){
            System.out.println(this.f1.name + " KAZANDI !!!");
            return true;
        }
        return false;
    }
}
