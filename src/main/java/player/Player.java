package player;

import behaviours.ICharacter;

public class Player {

    String name;
    int healthPoints;
    ICharacter iCharacter;

    public Player(String name, int healthPoints, ICharacter iCharacter) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.iCharacter = iCharacter;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
