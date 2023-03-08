package Labs.Lab14;

public class Point implements Comparable<Point> {
private int x,y;

public Point(int x, int y) {
    this.x = x;
    this.y = y;
}

public int getY() {
    return y;
}

public void setY(int y) {
    this.y = y;
}

public int getX() {
    return x;
}

public void setX(int x) {
    this.x = x;
}

@Override
public int compareTo( Point that ){
    if (this.x > that.getX() ) return 1;
    else if (this.x < that.getX() ) return -1;
    else if (this.y > that.getY() ) return 1;
    else if (this.y < that.getY() ) return -1;
    else return 0;
}

@Override
public boolean equals(Object that){
    if (this.x == ((Point)that).getX() && this.y== ((Point)that).getY()) return true;
    else return false;
}

@Override
public String toString() {
    return "(" + x + ',' + y +")";
}
}



