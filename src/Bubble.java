
class Bubble {


    //these instance variables were missing and were needed as part of the code.
private Sketch s;
private float radius;
private float x;
private float y;
private float xSpeed;
private float ySpeed;
private int fillColor;
private int borderColor;
    //These constructors were added from the missing code to initialize the bubbles speeds and things like that just like the ball
    //constructor
public Bubble(Sketch sketch) {
        s = sketch;
        radius = 20;
        x = 100;
        y = 100;
        xSpeed = 2;
        ySpeed = -1;
        fillColor = s.color(255, 255,255,50);
        borderColor = s.color(0, 0, 0);
        

    }

    public Bubble(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = -yspeed;
          fillColor = s.color(255, 255, 255,50);
        borderColor = s.color(0, 0, 0);
    }
    // accessors for the radius, diameter, x, and y values 
    public float getRadius() {
        return radius;
    }

    public float getDiameter() {
        return radius * 2;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void draw() {
        s.stroke(borderColor);
        s.fill(fillColor);
        s.circle(x, y, radius*2);
    }

    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius) {
            x = radius;
        } else if(x < radius) {
            x = s.width - radius;
        } else if (y > s.height - radius) {
            y = radius;
        } else if (y < radius) {
            y = s.height - radius;
        }
    }

}
