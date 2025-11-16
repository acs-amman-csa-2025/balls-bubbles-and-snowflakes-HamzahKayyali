import processing.core.PApplet;

public class Sketch extends PApplet {

//these create each ball, bubble, snowflake
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;

    private Bubble bubble1;
    private Bubble bubble2;
    private Bubble bubble3;
    private Bubble bubble4;

    private Snowflake snowflake1;
    private Snowflake snowflake2;
    private Snowflake snowflake3;
    private Snowflake snowflake4;
    

    /**
     * This method can only be used to change the window size. It runs before the
     * window is created.
     */
    public void settings() {
        size(500, 500);
    }

    //This code is when I make a new ball in the world, decide their widths, length, speeds, etc.
    public void setup() {
        ball1 = new Ball(this, 50, 100, 100, 1, 1);
        ball2 = new Ball(this, 25, 25, 32, 2, 2);
        ball3 = new Ball(this, 20, 300, 300, 5, 5);
        ball4 = new Ball(this, 10, 15, 25, 6, 7);
        //This code makes the colors of the ball I made the colors of my balls random.
        ball1.setColors(color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)),(int)(Math.random()*256));
        ball2.setColors(color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)),(int)(Math.random()*256));
        ball3.setColors(color((int)(Math.random()*256),(int)(Math.random()*256),(int)Math.random()*256), (int)Math.random()*256);
        ball4.setColors(color((int)(Math.random()*256),(int)(Math.random()*256),(int)Math.random()*256), (int)(Math.random()*256));

     
//This is the same code as the balls to put it in the world
        bubble1 = new Bubble(this, 38, 34, 400, 2, 2);
        bubble2 = new Bubble(this, 34, 100, 125, 2, 2);
        bubble3 = new Bubble(this, 45, 67, 382, 3, 2);
        bubble4 = new Bubble(this, 34, 66, 180, 1, 2);
        
    //This is the same as bubbles and balls
        snowflake1 = new Snowflake(this, 39, 345, 200, 2, 2);
        snowflake2 = new Snowflake(this, 50, 400, 200, 2, 2);
        snowflake3 = new Snowflake(this, 39, 25, 200, 2, 2);
        snowflake4 = new Snowflake(this, 39, 67, 200, 2, 2);



    }

    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {
        background(180, 180, 255);
        ball1.draw();
        ball1.move();
        ball2.draw();
        ball2.move();
        ball3.draw();
        ball3.move();
        ball4.draw();
        ball4.move();

        bubble1.draw();
        bubble1.move();
        bubble2.draw();
        bubble2.move();
        bubble3.draw();
        bubble3.move();
        bubble4.draw();
        bubble4.move();

        snowflake1.draw();
        snowflake1.move();
        snowflake2.draw();
        snowflake2.move();
        snowflake3.draw();
        snowflake3.move();
        snowflake4.draw();
        snowflake4.move();

        
        

    }


    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
