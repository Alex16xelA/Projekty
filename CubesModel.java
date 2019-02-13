
import java.util.Random;

public class CubesModel {
    private final int sizeSidesCubes = 50;
    private int[] Xcube1 = {110,110+sizeSidesCubes,110+sizeSidesCubes,110,110};
    private int[] Xcube2 = {180,180+sizeSidesCubes,180+sizeSidesCubes,180,180};
    private int[] Ycube1 = {375,375,375+sizeSidesCubes,375+sizeSidesCubes,375};
    private int[] Ycube2 = {375,375,375+sizeSidesCubes,375+sizeSidesCubes,375};
    private int numerRandomCube1;
    private int numerRandomCube2;

    public CubesModel(){
    }

    public int[] getXCube1(){
        return Xcube1;
    }

    public int[] getYCube1(){
        return Ycube1;
    }

    public int[] getXCube2(){
        return Xcube2;
    }

    public int[] getYCube2(){
        return Ycube2;
    }

    public void setNumberRandom(){
        Random rnd = new Random();
        numerRandomCube1 = rnd.nextInt(6) + 1;
        numerRandomCube2 = rnd.nextInt(6) + 1;
    }

    public int getNumerRandomCube1(){
        return numerRandomCube1;
    }

    public int getNumerRandomCube2(){
        return numerRandomCube2;
    }
}
