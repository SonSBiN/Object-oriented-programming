import java.awt.Point;
public class Rectangle {
    static final int WIDTH = 50;
    static final int HEIGHT = 50;
    private Point upperLeft;
    private Point lowerRight;
    Rectangle (Point uL){
        upperLeft = new Point((int)uL.getX(),(int)uL.getY());
        lowerRight = new Point((int)uL.getX()+WIDTH,(int)uL.getY()+HEIGHT);
    }
    Rectangle (Point uL, Point lR){
        upperLeft = uL;
        lowerRight = lR;
    }
    void translate(int x, int y){
        upperLeft.translate(x,y);
        lowerRight.translate(x,y);
    }
    public String toString(){
        return ("UL: "+upperLeft+", LR: "+lowerRight);
    }
}
