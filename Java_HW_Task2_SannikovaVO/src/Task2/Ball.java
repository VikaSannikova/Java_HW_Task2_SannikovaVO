package Task2;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        if(Math.abs(direction)>360){
            direction=direction%360;
            if(Math.abs(direction)>180){
                direction = -(int)Math.signum(direction) * (Math.abs(direction)-180);
            }
        }
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta =speed*(float)Math.cos(Math.toRadians(direction));
        this.yDelta =-speed*(float)Math.sin(Math.toRadians(direction));

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move(){
        this.x+=this.xDelta;
        this.y+=this.yDelta;
    }

    public void reflectionHorizontal(){
        this.xDelta*=-1;
    }

    public void reflectionVertical(){
        this.yDelta*=-1;
    }

    @Override
    public String toString() {
        return "Ball[" +
                "(" + x +
                "," + y +
                ")" +
                ",speed=(" + xDelta +
                "," + yDelta +
                ")]";
    }
}