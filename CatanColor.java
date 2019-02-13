import java.awt.*;

public enum CatanColor {
    RED, ORANGE, YELLOW, BLUE, GREEN, GREY, TEA, FOREST, MINT, TAWNY, ALABASTER, MARINE;

    private Color color;

    static {
        RED.color = new Color(0XB80000);
        ORANGE.color = new Color(0XFFA500);
        YELLOW.color = new Color(0XF9E04B);
        BLUE.color = new Color(0X4169E1);
        GREEN.color = new Color(0X006633);
        GREY.color = new Color(0XC6CECE);
        TEA.color = new Color(0XCC5D2B);
        FOREST.color = new Color(0X2E8B57);
        MINT.color = new Color(0XBCE27F);
        TAWNY.color = new Color(0XE1D9AC);
        ALABASTER.color = new Color(223, 223, 223);
        MARINE.color = new Color(0X9F9FDF);
    }

    public Color getJavaColor() {
        return color;
    }

    public static String getStringColor(CatanColor color) {
        switch (color) {
            case BLUE:
                return "blue";
            case GREY:
                return "grey";
            case GREEN:
                return "green";
            case ORANGE:
                return "orange";
            case TEA:
                return "tea";
            case FOREST:
                return "forest";
            case RED:
                return "red";
            case MINT:
                return "mint";
            case YELLOW:
                return "yellow";
            case TAWNY:
                return "tawny";
            case MARINE:
                return "marine";
            case ALABASTER:RINE:
                return "alabaster";
            default:
                return null;
        }
    }

    public static CatanColor getCatanColor(String color) {
        switch (color) {
            case "blue":
                return CatanColor.BLUE;
            case "grey":
                return CatanColor.GREY;
            case "green":
                return CatanColor.GREEN;
            case "orange":
                return CatanColor.ORANGE;
            case "tea":
                return CatanColor.TEA;
            case "forest":
                return CatanColor.FOREST;
            case "red":
                return CatanColor.RED;
            case "mint":
                return CatanColor.MINT;
            case "yellow":
                return CatanColor.YELLOW;
            case "tawny":
                return CatanColor.TAWNY;
            case "marine":
                return CatanColor.MARINE;
            case "alabaster":
                return CatanColor.ALABASTER;
            default:
                return null;
        }
    }
}