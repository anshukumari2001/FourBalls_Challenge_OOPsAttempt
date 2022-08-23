import processing.core.PApplet;

class Ball{
    int positionX;
    int positionY;
    int diameter;
    int speed;

    public Ball(int positionX, int positionY, int diameter, int speed)
    {
        this.positionX= positionX;
        this.positionY = positionY;
        this.diameter = diameter;
        this.speed = speed;
    }
}


public class BallsChallengeAnotherAttempt extends PApplet{

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

    Ball ball1= new Ball(BALL_X_POSITION, BALL1_Y_POSITION, DIAMETER, BALL1_SPEED);
    Ball ball2= new Ball(BALL_X_POSITION, BALL2_Y_POSITION, DIAMETER, BALL2_SPEED);
    Ball ball3= new Ball(BALL_X_POSITION, BALL3_Y_POSITION, DIAMETER, BALL3_SPEED);
    Ball ball4= new Ball(BALL_X_POSITION, BALL4_Y_POSITION, DIAMETER, BALL4_SPEED);

    public static  void main(String[] args)
    {
        PApplet.main("BallsChallengeAnotherAttempt", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        move(ball1, ball1.positionX, ball1.positionY, ball1.diameter, ball1.speed);
        move(ball2, ball2.positionX, ball2.positionY, ball2.diameter, ball2.speed);
        move(ball3, ball3.positionX, ball3.positionY, ball3.diameter, ball3.speed);
        move(ball4, ball4.positionX, ball4.positionY, ball4.diameter, ball4.speed);
    }

    public void move(Ball b, int positionX, int positionY, int diameter, int speed)
    {
        ellipse(positionX, positionY, diameter, diameter);
        // It shows in X direction how this ball will move
        b.positionX+= speed;
    }
}

