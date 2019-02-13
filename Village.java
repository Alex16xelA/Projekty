import java.awt.*;

public class Village {
    private boolean village;
    private Point pVillage;
    private final int rawMaterialTaken = 1;
    private final int victoryPoints = 1; //KOSZT WIOSKI!!!!!
    private String name;

    public Village(Point pV){
        pVillage = new Point(pV);
        village = true;
        name = "VILLAGE";
    }

    public boolean getThatsVillage(Point a){
        if(a.x==pVillage.x && a.y==pVillage.y) return true;
        else return false;
    }

    public boolean getVillige(){
        return village;
    }

    public int getX(){
        return pVillage.x;
    }

    public int getY(){
        return pVillage.y;
    }

    public String getName(){
        return name;
    }
}
