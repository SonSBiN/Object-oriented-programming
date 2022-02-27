public class Circle extends Shape {
    Point center;
    int radius;
    Circle (Point p, int r){
        center = p;
        radius = r;
    }
    Circle (int x, int y, int r){
        center = new Point(x,y);
        radius = r;
    }
    double getArea(){
        return (Math.PI * radius * radius);
    }
    double getPerimeter(){
        return (Math.PI * radius * 2);
    }
    public String toString(){
        return "Circle: \ncenter: " + center + "\nradius: "+ radius;
    }
}
