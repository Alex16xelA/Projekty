import java.awt.*;

public class CubeComponent {
    private CubesView cubView;
    private CubesModel cubModel;

    public CubeComponent(){
        cubView = new CubesView();
        cubModel = new CubesModel();
    }

    public void setCubesInBoard(Graphics2D g){
        cubModel.setNumberRandom();
        cubView.drawCubes(g,cubModel);
    }
}
