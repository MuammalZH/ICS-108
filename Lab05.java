public class Lab05 {
    public static void main(String[] args) {
        Point p1= new Point();
        Point p2 = new Point(10.0, 30.5);
        System.out.printf("The Distance between the Points is %.2f : ", p1.distance(p2));
    }
    
}
class Point{
    double x,y;

    Point(){
        x=0;
        y=0;
    }
    Point(double a, double b){
        x=a;
        y=b;
    }
    double getX(){return x;}
    double getY(){return y;}

    double distance(Point p2){
        double theDistance = Math.sqrt((Math.pow(p2.getX()-x, 2)) + Math.pow((p2.getY()-y),2));
        return theDistance;

    }
    


}