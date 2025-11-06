import org.code.neighborhood.*;
// Imports the Neighborhood library so we can use PainterPlus and painting commands

public class PenguinDetails extends PainterPlus {

  // The details() method adds smaller features (like eyes and feet) to the penguin
  public void details(){

    // Move forward 4 times to reach the area where details should start
    move();
    move();
    move();
    move();

    // Turn right to face the correct direction for painting details
    turnRight();

    // Move 4 more steps to reach the penguin's head or upper body area
    move();
    move();
    move();
    move();

    // Paint one black square — represents an eye
    paint("Black");

    // Turn left to move downward or across the penguin’s body
    turnLeft();
    move();
    move();

    // Paint another black square — represents the second eye
    paint ("Black");

    // Reposition to another area to add the beak
    turnRight();
    move();
    turnRight();
    move();

    // Paint yellow — representing the penguin’s beak
    paint ("Yellow");

    // Move across to reposition after painting the beak
    move();
    move();
    move();
    move();
    move();

    // Turn to move to another section for cleaner finish
    turnRight();
    move();
    move();
    move();
    move();
    move();

    // End of details method — penguin detailing complete

  }
}