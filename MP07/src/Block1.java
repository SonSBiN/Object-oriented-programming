import java.awt.Point;

public class Block1 {
    private Rectangle[] rectangles = new Rectangle[4];
    Block1(Point p){
        Rectangle B1 = new Rectangle(p);
        Rectangle B2 = new Rectangle(p);
        Rectangle B3 = new Rectangle(p);
        Rectangle B4 = new Rectangle(p);
        B2.translate(B2.WIDTH,0);
        B3.translate(0,B3.HEIGHT);
        B4.translate(B4.WIDTH,B3.HEIGHT);
        rectangles[0] = B1;
        rectangles[1] = B2;
        rectangles[2] = B3;
        rectangles[3] = B4;
    }
    Block1(int x, int y){
        Point p = new Point(x,y);
        Rectangle B1 = new Rectangle(p);
        Rectangle B2 = new Rectangle(p);
        Rectangle B3 = new Rectangle(p);
        Rectangle B4 = new Rectangle(p);
        B2.translate(B2.WIDTH,0);
        B3.translate(0,B3.HEIGHT);
        B4.translate(B4.WIDTH,B3.HEIGHT);
        rectangles[0] = B1;
        rectangles[1] = B2;
        rectangles[2] = B3;
        rectangles[3] = B4;
    }
    void translate(int x, int y){
        for(int i = 0; i < 4; i++){
            rectangles[i].translate(x,y);
        }
    }
    public String toString() {
        String str = new String();
        for(int i = 0; i < 4; i++) {
            if ( i == 3){
                str += rectangles[i].toString();
            }
            else {
                str += rectangles[i].toString() + "\n";
            }
        }
        return str;
    }
}
