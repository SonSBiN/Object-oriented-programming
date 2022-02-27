import java.awt.Point;

public class Block2 {
    private Rectangle[] rectangles = new Rectangle[4];
    Block2(Point p){
        Rectangle B1 = new Rectangle(p);
        Rectangle B2 = new Rectangle(p);
        Rectangle B3 = new Rectangle(p);
        Rectangle B4 = new Rectangle(p);
        B2.translate(0,B2.HEIGHT);
        B3.translate(0,B2.HEIGHT*2);
        B4.translate(0,B3.HEIGHT*3);
        rectangles[0] = B1;
        rectangles[1] = B2;
        rectangles[2] = B3;
        rectangles[3] = B4;
    }
    Block2(int x, int y){
        Point p = new Point(x,y);
        Rectangle B1 = new Rectangle(p);
        Rectangle B2 = new Rectangle(p);
        Rectangle B3 = new Rectangle(p);
        Rectangle B4 = new Rectangle(p);
        B2.translate(0,B2.HEIGHT);
        B3.translate(0,B2.HEIGHT*2);
        B4.translate(0,B3.HEIGHT*3);
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
