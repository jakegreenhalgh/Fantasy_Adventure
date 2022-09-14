import Enemies.Enemy;

public class Room {
    private Enemy enemy;
    private boolean treasureTaken;

    public Room(Enemy enemy) {
        this.enemy = enemy;
        this.treasureTaken = false;
    }

    public String takeTreasure(){
        if (treasureTaken == false) {
            treasureTaken = true;
            return "You've taken the treasure!";
        }
        else {
            return "You've already grabbed the treasure!";
        }
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public boolean isTreasureTaken() {
        return treasureTaken;
    }
}
