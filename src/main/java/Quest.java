import Enemies.Enemy;
import Enemies.Ogre;
import Enemies.Orc;
import Enemies.Zombie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Quest {
    Random rand;
    private ArrayList<Room> rooms;
    private Room currentRoom;

    public Quest() {
        this.currentRoom = rooms.get(0);
    }

    public String proceed () {
        if (this.currentRoom.getEnemy().getHealth() <= 0 || this.currentRoom.isTreasureTaken() == true) {
            int n = rand.nextInt(2);
            Ogre enemy1 = new Ogre("Ogre" ,50, 20);
            Orc enemy2 = new Orc("Orc", 40, 30);
            Zombie enemy3 = new Zombie("Zombie", 100, 10);
            ArrayList<Enemy> enemies = new ArrayList<Enemy>(
                    Arrays.asList(enemy1, enemy2, enemy3)
            );
            this.currentRoom = new Room(enemies.get(n));
            return "Moving to next room...";
        }
        else {
            return "You have unfinished business here!";
        }
    }
}
