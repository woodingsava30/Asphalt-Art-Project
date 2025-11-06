import org.code.neighborhood.*;
/* 
 * Imports the Neighborhood library.
 * This library provides classes like Painter, PainterPlus, and others
 * used to move around a grid world and paint tiles.
 */

public class NeighborhoodRunner {
  public static void main(String[] args) {

    // Creates a BackgroundPainter object named livvy — used to paint the background
    BackgroundPainter livvy = new BackgroundPainter();
    // Creates a PenguinOutline object named change — used to draw the outline of a penguin
    PenguinOutline change = new PenguinOutline();
    // Creates a PenguinDetails object named p — used to draw smaller details of the penguin
    PenguinDetails  p = new PenguinDetails();

 /*
     * Give each painter enough paint to complete their tasks.
     * The number represents paint units available for each painter.
     */
    livvy.setPaint(1000);
    change.setPaint(1000);
    p.setPaint(300);
    
 /*
     * Start the painting process:
     * 1. Paint the background white
     * 2. Draw the penguin outline
     * 3. Add the penguin’s details (eyes, beak, and feet)
     */
    livvy.paintBackground("white");
    change.idk();
    p.details();
  
}
    
  }