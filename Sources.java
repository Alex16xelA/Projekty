import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sources {
    private List<String> rawMaterials;

    public Sources() {
        rawMaterials = new ArrayList<String>();
    }

    public void setRawMaterials(){
        for(int i = 0; i<4; i++){
            if(i==0) rawMaterials.add("DESERT");

            if(i<3){
            rawMaterials.add("MOUNTAIN");
            rawMaterials.add("FOREST");
            rawMaterials.add("PASTURE");
            rawMaterials.add("FARMLAND");
            rawMaterials.add("HILL");
            }

            if(i==3){
            rawMaterials.add("FOREST");
            rawMaterials.add("PASTURE");
            rawMaterials.add("FARMLAND");
            }
        }
        Collections.shuffle(rawMaterials);

    }

    public String getRawMaterial(int j){
        return rawMaterials.get(j);
    }

}
