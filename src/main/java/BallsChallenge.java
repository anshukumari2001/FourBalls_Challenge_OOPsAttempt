import processing.core.PApplet;

class Balls{
    private PApplet parent;
    private int positionX;
    private int positionY;
    private int diameter;
    private int speed;

    public Balls(PApplet parent, int positionX, int positionY, int diameter, int speed)
    {
        this.parent= parent;
        this.positionX= positionX;
        this.positionY = positionY;
        this.diameter = diameter;
        this.speed = speed;
    }
    public void move()
    {
        parent.ellipse(positionX, positionY, diameter, diameter);
    // It shows in X direction how this ball will move
        positionX+= speed;
    }
}


public class BallsChallenge extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static  final int DIAMETER=10;
    public int BALL_X_POSITION=0;
    public static int BALL1_SPEED = 1;
    public static int BALL2_SPEED = 2;
    public static int BALL3_SPEED = 3;
    public static int BALL4_SPEED = 4;
    public int BALL1_Y_POSITION= BALL1_SPEED * HEIGHT/5;
    public int BALL2_Y_POSITION= BALL2_SPEED * HEIGHT/5;
    public int BALL3_Y_POSITION= BALL3_SPEED * HEIGHT/5;
    public int BALL4_Y_POSITION= BALL4_SPEED * HEIGHT/5;

    Balls ball1= new Balls(this, BALL_X_POSITION, BALL1_Y_POSITION, DIAMETER, BALL1_SPEED);
    Balls ball2= new Balls(this, BALL_X_POSITION, BALL2_Y_POSITION, DIAMETER, BALL2_SPEED);
    Balls ball3= new Balls(this, BALL_X_POSITION, BALL3_Y_POSITION, DIAMETER, BALL3_SPEED);
    Balls ball4= new Balls(this, BALL_X_POSITION, BALL4_Y_POSITION, DIAMETER, BALL4_SPEED);

    public static  void main(String[] args)
    {
        PApplet.main("BallsChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ball1.move();
        ball2.move();
        ball3.move();
        ball4.move();
    }
}
