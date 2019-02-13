import java.awt.*;

public class HexView {
    private HexModel hexModel ;
    private Font font ;
    private FontMetrics metrics;
    private Color colorValue;

    public HexView(){
        font = new Font("Arial",Font.BOLD,18);
    }


    public void drawHex (Graphics2D g, int x, int y, String nameSour, int numberValue){
        Point example = new Point(x,y);
        hexModel= new HexModel(example,numberValue);
        g.setColor(getColorValue(nameSour));
        g.fillPolygon(hexModel.getXPoint(),hexModel.getYPoint(),hexModel.getSides());
        g.setColor(new Color(0xFFE5B4));
        g.drawPolygon(hexModel.getXPoint(),hexModel.getYPoint(),hexModel.getSides());
        if(numberValue!=0)
        {   g.setFont(font);
            g.setColor(new Color(0xFAFFFA));
            metrics = g.getFontMetrics();
            String text = " " +numberValue + " .";
            int width = metrics.stringWidth(text);
            int height = metrics.getHeight();
            g.drawString(text,x-width/2,y+height/3);
        }
    }

    public Color getColorValue(String nameS){
        switch(nameS){
            case "DESERT":
                return colorValue = new Color(0XE1D9AC);
            case "MOUNTAIN":
                return colorValue = new Color(0XC8CFCF);
            case "FOREST":
                return colorValue = new Color(0X2E8B57);
            case "PASTURE":
                return colorValue = new Color(0XBCE27F);
            case "FARMLAND":
                return colorValue = new Color(0XF9E04B);
            case "HILL":
                return colorValue = new Color(0XCC5D2B);
            default:
                return null;

        }
    }
}
