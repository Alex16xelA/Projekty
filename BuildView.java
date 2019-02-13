import java.awt.*;

public class BuildView {
    private BuildModel bMV;

    public void drawBuild(Graphics2D g,int x,int y, Color k){
        g.setColor(k);
         g.fillOval(x,y,14,14);

    }
}
