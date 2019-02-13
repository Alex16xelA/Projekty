import java.awt.*;

public class CubesView {
    private Font fontCube;
    private FontMetrics met;
    private CubesModel cube;

    public CubesView(){
        fontCube = new Font("Arial",Font.BOLD,30);
        cube = new CubesModel();
    }

    public void drawCubes(Graphics2D g, CubesModel c){
        cube = c;
        g.setColor(new Color(226,30,19));
        g.fillPolygon(cube.getXCube1(),cube.getYCube1(),5);
        g.fillPolygon(cube.getXCube2(),cube.getYCube2(),5);
        g.setFont(fontCube);
        g.setColor(new Color(0xFDE9110));
        met = g.getFontMetrics();
        String text = " "+cube.getNumerRandomCube1();
        int heightText = met.getHeight();
        g.drawString(text,118,400+heightText/3);
        text = " "+cube.getNumerRandomCube2();
        g.drawString(text,188,400+heightText/3);
    }


}
