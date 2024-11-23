package com.jarrodphilips.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

  /**
   * Rigorous Test :-)
   */
  Alien alien;
  Human human;

  @BeforeEach
  void createAlien() {
    alien = new Alien();
  }

  @BeforeEach
  void createHuman() {
    human = new Human("John Doe", 100, 5, 5);
  }

  @Test
  public void checkAlienHealth() {
    assertTrue(alien.getHealth() == 100);
  }

  @Test
  public void checkHumanHealth() {
    assertTrue(human.getHealth() == 100);
  }
}
