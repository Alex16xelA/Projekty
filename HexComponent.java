import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class HexComponent {
    private HexModel hexModel;
    private List<HexModel> hextable;
    private Sources primarySources;
    private HexView hexView;
    private int[] numbers;
    private List<Point> importanatPoint;
    private List<Button> copyPoint;
    private CubeComponent cu;

    public HexComponent(){
       primarySources= new Sources();
       primarySources.setRawMaterials();
       numbers = new int[]{5,2,6,3,8,10,9,12,11,4,8,10,9,4,5,6,3,11};
       hextable = new ArrayList<>();
       importanatPoint = new ArrayList<>();
       cu = new CubeComponent();

    }

    public void setImportantPoint(Point[] p){
        for(int i= 0 ; i<hexModel.getSides(); i++){
                importanatPoint.add(p[i]);
        }
    }


    public void drawHexGrid(Graphics2D g, int sizeGrid,Point orgin){
        hexView = new HexView();
        int counter =0;
        int count =0;
        int value;
        String nameSources;
        double angle30=Math.toRadians(30);
        double xOff=Math.cos(angle30)*(59);
        double yOff=Math.sin(angle30)*(59);
        int half = sizeGrid/2 ;
        for (int row = 0; row < sizeGrid; row++) {
            int cols = sizeGrid - java.lang.Math.abs(row - half);

            for (int col = 0; col < cols; col++) {
                int x = (int) (orgin.x + xOff * (col * 2 + 1 - cols));
                int y = (int) (orgin.y + yOff * (row - half) * 3);
                nameSources=primarySources.getRawMaterial(counter);
                if(nameSources=="DESERT") value = 0;
                else {value = numbers[count];
                        count ++;
                }
                Point examp = new Point(x,y);
                hexModel = new HexModel(examp,value);
                setImportantPoint(hexModel.getPoint());
                hextable.add(hexModel);
                hexView.drawHex(g,x,y,nameSources,value);
                counter++;
            }
        }
        cu.setCubesInBoard(g);
    }

    public void setBM(){
        copyPoint = new ArrayList<Button>();
        for (int i = 0; i < getImportanatPoint().size(); i++) {
            copyPoint.add(new Button());
            copyPoint.get(i).setBounds(getImportanatPoint().get(i).x -7,getImportanatPoint().get(i).y - 7,14,14);
        }
    }

    public List<Point> getImportanatPoint(){
        return importanatPoint;
    }
    public List<Button> getCopyPoint(){
        return copyPoint;
    }
    public List<HexModel> getHextable(){
        return hextable;
    }

}
