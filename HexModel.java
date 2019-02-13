import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class HexModel extends Polygon{

    public static final int SIDES = 6;              // liczba boków szesciokata

    private Point[] points = new Point[SIDES];      // talica przechowujaca wierzcholki szesciokata
    private Point center;                           // srodkowy punkt szeciokata
    private int size;                               // określa wielkość boku szesciokata
    private int randomNumber;


    HexModel(Point center,int ranNum)
    {
        npoints = SIDES;
        xpoints = new int[SIDES];
        ypoints = new int[SIDES];
        randomNumber = ranNum;

        size = 60;

        this.center = center;

        updatePoints();
    }

    private Point findPoint(int i) {
        if(i==0) i=360;                   //warunek zapewniający poprawnosc obliczen

        int angleDeg = (60*i)-30;
        double angleRad =(Math.PI * angleDeg)/180;

        int x = (int) (center.x + Math.cos(angleRad) * size);
        int y = (int) (center.y + Math.sin(angleRad) * size);

        return new Point(x, y);
    }

    protected void updatePoints() {
        for (int p = 0; p < SIDES; p++) {
            Point point = findPoint(p);
            xpoints[p] = point.x;
            ypoints[p] = point.y;
            points[p] = point;
        }
    }

    public int getSides(){
        return npoints;
    }

    public int[] getXPoint(){
        return xpoints;
    }

    public int[] getYPoint(){
        return ypoints;
    }

    public Point[] getPoint(){
        return points;
    }

    public int getRandomNumber(){
        return randomNumber;
    }

}