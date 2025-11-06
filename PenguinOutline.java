import org.code.neighborhood.*;
// Imports the Neighborhood library, which provides classes like PainterPlus for drawing in the grid 
public class PenguinOutline extends PainterPlus {
  
  // The idk() method draws the outline of a penguin using paint commands
  public void idk(){
    
    // Moves the painter forward 3 times to reach the starting position
    move();
    move();
    move();

    // Turns right and moves to the starting edge for the outline
    turnRight();
    move();
    move();

    // Begins painting the penguin outline in black
    paint("Black");

    // Starts moving up the left side of the penguin outline
    turnLeft();
    move();
    paint("Black");
    move();
    paint("Black");
    move();
    paint("Black");
    move();
    paint("Black");
    move();

    // Turns to paint the top of the penguin’s body
    turnRight();
    move();
    paint("Black");
    move();
    paint("Black");
    move();
    paint("Black");
    move();
    paint("Black");

    // Turns down to paint the right side
    turnLeft();
    move();
    paint("Black");

    // Moves and repositions for next section
    turnRight();
    move();
    turnRight();
    move();

    // Paints lower section of the penguin
    paint("Black");
    turnLeft();
    paint("Black");
    move();
    paint("Black");
    move();

    // Starts drawing the penguin’s belly and feet area
    turnRight();
    move();
    paint("Black");
    move();
    paint("Yellow");  // Yellow represents the beak and feet
    move();
    paint("Black");
    move();
    paint("Yellow");
    move();
    paint("Black");
    move();

    // Paints the right bottom edge
    turnRight();
    move();
    paint ("Black");
    move();
    paint ("Black");
    move();
    paint ("Black");

    // Finishes the right edge
    turnLeft();
    move();
    paint ("Black");

    // Repositions painter to continue or finish drawing
    turnRight();
    turnRight();
    move();
    turnLeft();
    move();

    // Paints more of the lower outline
    paint ("Black");
    move();
    paint ("Black");
    move();
    paint ("Black");

    // Adjusts position for final movements
    turnRight();
    turnLeft();
    move();
    move();
    move();
    turnLeft();
    move();
    move();

    // End of penguin outline drawing
    
  }
  
}