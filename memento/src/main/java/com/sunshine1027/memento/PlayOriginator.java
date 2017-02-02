package com.sunshine1027.memento;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class PlayOriginator {
    private String name;
    private int attack;
    private int defence;
    private int health;

    public PlayOriginator(String name, int attack, int defence, int health) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.health = health;
    }

    public final PlayerMemento createMemento() {
        return new PlayerMemento(this);
    }

    public void loadMemento(PlayerMemento playerMemento) {
        this.name = playerMemento.getName();
        this.attack = playerMemento.getAttack();
        this.defence = playerMemento.getDefence();
        this.health = playerMemento.getHealth();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "PlayOriginator{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defence=" + defence +
                ", health=" + health +
                '}';
    }
}
