package com.jarrodphilips.app;

/**
 * Human
 */
public class Human {

  private String name;
  private int health;
  private int armor;
  private int speed;

  public Human(String name, int health, int armor, int speed) {
    this.name = name;
    this.health = health;
    this.armor = armor;
    this.speed = speed;
  }

  public int getHealth() {
    return this.health;
  }
}
