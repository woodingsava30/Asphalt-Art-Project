import org.code.neighborhood.*;
public class PainterPlus extends Painter{

//turns right
  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
  }
    public void turnAround(){
    turnLeft();
    turnLeft();
  }
 
//takes all paint
  public void takeAllPaint(){
    while (isOnBucket() == true){
      takePaint();
    }  
     }
 
//moves until it can't
   public void moveFast(){
    while(canMove() == true){
      move();
    }
  }

  public void paintToEmpty(String color){
    while(hasPaint() == true){
    paint(color);
    move();

    }
  }

  //paints a donut
  public void paintPenguin(String color){
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
     
      }
    }



 
  //Last curly brace do not touch
  }