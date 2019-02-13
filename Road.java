import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Road {
    private List<Point> ton;
    private List<Point> minT=new ArrayList<>();
    private List<Point> minT1=new ArrayList<>();
    private Point minN;
    private Point minO;

    public  Road (){
        ton = new ArrayList<Point>();
    }

    public void setTon() {
        ton.add(new Point(548, 192));
        ton.add(new Point(548, 253));
        ton.add(new Point(497, 283));
        ton.add(new Point(445, 253));
        ton.add(new Point(445, 192));
        ton.add(new Point(497, 163));

        ton.add(new Point(651, 192));
        ton.add(new Point(651, 253));
        ton.add(new Point(600, 283));
        ton.add(new Point(600, 163));

        ton.add(new Point(753, 192));
        ton.add(new Point(753, 253));
        ton.add(new Point(702, 283));
        ton.add(new Point(702, 163));

        ton.add(new Point(497, 341));
        ton.add(new Point(445, 371));
        ton.add(new Point(394, 341));
        ton.add(new Point(394, 283));

        ton.add(new Point(600, 341));
        ton.add(new Point(548, 371));

        ton.add(new Point(702, 341));
        ton.add(new Point(651, 371));

        ton.add(new Point(804, 283));
        ton.add(new Point(804, 341));
        ton.add(new Point(753, 371));

        ton.add(new Point(446, 430));
        ton.add(new Point(394, 460));
        ton.add(new Point(343, 430));
        ton.add(new Point(343, 371));

        ton.add(new Point(548, 430));
        ton.add(new Point(497, 460));

        ton.add(new Point(651, 430));
        ton.add(new Point(600, 460));

        ton.add(new Point(753, 430));
        ton.add(new Point(702, 460));

        ton.add(new Point(855, 371));
        ton.add(new Point(855, 430));
        ton.add(new Point(804, 460));

        ton.add(new Point(497, 518));
        ton.add(new Point(446, 548));
        ton.add(new Point(394, 518));

        ton.add(new Point(600, 518));
        ton.add(new Point(548, 548));

        ton.add(new Point(702, 518));
        ton.add(new Point(651, 548));

        ton.add(new Point(804, 518));
        ton.add(new Point(753, 548));

        ton.add(new Point(548, 607));
        ton.add(new Point(497, 637));
        ton.add(new Point(445, 607));

        ton.add(new Point(651, 607));
        ton.add(new Point(600, 637));

        ton.add(new Point(753, 607));
        ton.add(new Point(702, 637));

    }

    public void setRoad(Point d){
        int minMX=70;
        int minMY=70;
        int newMIN=70;
        for(Point m:ton){
            if(minMX>Math.abs(m.x-d.x) && minMY>Math.abs(m.y-d.y)){
                setMinT(m);
            }
        }
        for(Point n:minT){
            if(newMIN>Math.abs(n.x-d.x) && newMIN>Math.abs(n.y-d.y)){
                newMIN=Math.abs(n.x-d.x);
                setMinN(n);
            }
        }
        minT.remove(getMinN());
        int newMINo=70;
        for(Point o:minT){
            if(newMINo>Math.abs(o.x-d.x) && newMINo>Math.abs(o.y-d.y)){
                newMINo=Math.abs(o.x-d.x);
                if(getMinN()==o);
                else setMinO(o);
            }
        }
        minT.clear();

    }
    private void setMinT(Point s){
        minT.add(new Point(s));
    }
    private void setMinT1(Point s){
        minT1.add(new Point(s));
    }
    private void setMinN(Point s){
        minN =s;
    }
    private void setMinO(Point po){
        minN =po;
    }

    public Point getMinN(){
        return minN;
    }
    public Point getMinO(){
        return minN;
    }

}
