import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BuildModel extends JButton {
    //private List<Button> copyPoint;
    private List<Point> pon;
    private List<Village> vill;
    private BuildView bV;

    public BuildModel(){
        //copyPoint = new ArrayList<Button>();
        pon = new ArrayList<Point>();
        vill = new ArrayList<Village>();
        bV=new BuildView();
    }

    public void setCopyPoint(List<Point> a){
        /*Point helper = new Point();
        for(int i=0; i<a.size(); i++){
            helper = a.get(i);
            copyPoint.add(new Button());
            copyPoint.get(i).setBounds(helper.x -7,helper.y - 7,14,14);
        }*/
    }

    public void setPon() {
        pon.add(new Point(548, 192));
        pon.add(new Point(548, 253));
        pon.add(new Point(497, 283));
        pon.add(new Point(445, 253));
        pon.add(new Point(445, 192));
        pon.add(new Point(497, 163));

        pon.add(new Point(651, 192));
        pon.add(new Point(651, 253));
        pon.add(new Point(600, 283));
        pon.add(new Point(600, 163));

        pon.add(new Point(753, 192));
        pon.add(new Point(753, 253));
        pon.add(new Point(702, 283));
        pon.add(new Point(702, 163));

        pon.add(new Point(497, 341));
        pon.add(new Point(445, 371));
        pon.add(new Point(394, 341));
        pon.add(new Point(394, 283));

        pon.add(new Point(600, 341));
        pon.add(new Point(548, 371));

        pon.add(new Point(702, 341));
        pon.add(new Point(651, 371));

        pon.add(new Point(804, 283));
        pon.add(new Point(804, 341));
        pon.add(new Point(753, 371));

        pon.add(new Point(446, 430));
        pon.add(new Point(394, 460));
        pon.add(new Point(343, 430));
        pon.add(new Point(343, 371));

        pon.add(new Point(548, 430));
        pon.add(new Point(497, 460));

        pon.add(new Point(651, 430));
        pon.add(new Point(600, 460));

        pon.add(new Point(753, 430));
        pon.add(new Point(702, 460));

        pon.add(new Point(855, 371));
        pon.add(new Point(855, 430));
        pon.add(new Point(804, 460));

        pon.add(new Point(497, 518));
        pon.add(new Point(446, 548));
        pon.add(new Point(394, 518));

        pon.add(new Point(600, 518));
        pon.add(new Point(548, 548));

        pon.add(new Point(702, 518));
        pon.add(new Point(651, 548));

        pon.add(new Point(804, 518));
        pon.add(new Point(753, 548));

        pon.add(new Point(548, 607));
        pon.add(new Point(497, 637));
        pon.add(new Point(445, 607));

        pon.add(new Point(651, 607));
        pon.add(new Point(600, 637));

        pon.add(new Point(753, 607));
        pon.add(new Point(702, 637));


    }

    public int getPonSize(){
        return pon.size();
   }
    public Point getBM(int i){
        return pon.get(i);
    }

    public int Build(Point w){
        int zm=0;
        for (Point p: pon){
            if(CheekRange(p,w)){
                    if(vill.isEmpty()){
                        vill.add(new Village(p));
                        return 1;
                        //System.out.println("halo  " + p.x +"  "+p.y);
                    }
                    else{
                        if(CheekVill(p)) return 2;
                        else{
                            vill.add(new Village(p));
                            return 1;
                        }
                        //System.out.println("PPP  " + p.x +"  "+p.y);
                    }
            }
        }
        return zm;
    }

    private boolean CheekVill(Point h){
        for(Village v:vill){
            if(v.getThatsVillage(h)) return true;
        }
        return false;
    }

    private boolean CheekRange(Point t,Point b){
        //System.out.println(b.x + " = " + t.x +"    " + b.y + " = " + t.y );
        if (b.x <= t.x +7 && b.y <= t.y +7 &&  b.x >= t.x -7 && b.y >= t.y -7) return true;
        else return false;
    }
}
