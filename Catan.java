import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class Catan extends JPanel{
    private final int width = 1200;
    private final int height = 800;
    private final int circleSize = 660;
    private Point centerPoint;
    private Graphics2D g2D;
    private Road road;


    private HexComponent hexComponent = new HexComponent();


    public Catan(){
        setPreferredSize(new Dimension(width,height));
        road = new Road();
        road.setTon();
    }

    @Override
    public void paintComponent(Graphics g){
        g2D = (Graphics2D) g;

        centerPoint = new Point(width/2,height/2);

        int x1= centerPoint.x - (circleSize/2);
        int y1= centerPoint.y - (circleSize/2);

        g2D.setColor(new Color(0x008080));
        g2D.fillOval(x1,y1,circleSize,circleSize);

        hexComponent.drawHexGrid(g2D,5, centerPoint);

    }

    public void but() {
        BuildModel bM = new BuildModel();
        bM.setPon();
        Point helper;
        for (int i = 0; i < bM.getPonSize(); i++) {
            helper = bM.getBM(i);
            JButton j = new JButton();
            j.setBounds(helper.x-7,helper.y-7, 14,14);
            this.add(j);
            j.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    Point r = new Point(j.getX(),j.getY());
                    //System.out.println("X = "+j.getX()+"    Y = "+j.getY());
                    Color a= new Color(0xAABB7);
                    int pom = bM.Build(r);
                    if(pom == 1) {
                        j.setOpaque(true);
                        j.setContentAreaFilled(true);
                        j.setBackground(a);
                    }
                    if(pom==2){
                        j.setBackground(new Color(0x568900));
                        ((Component) e.getSource()).removeMouseListener(this);
                    }
                }
            });
            j.setOpaque(false);
            j.setContentAreaFilled(false);
            j.setBorderPainted(false);

            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    road.setRoad(e.getPoint());
                    System.out.println("E: "+e.getPoint()+"  "+ road.getMinN().x+"  "+road.getMinN().y+"   "+road.getMinO().x+"   "+road.getMinO().y);
                    g2D.drawLine(road.getMinN().x,road.getMinN().y,road.getMinO().x,road.getMinO().y);
                }
            });
        }

        //hexComponent.setBM();
        //for (int i = 0; i < hexComponent.getImportanatPoint().size(); i++) {
         //   this.add(hexComponent.getCopyPoint().get(i));
        //}
    }

    protected void createAndShowGUI() {
        JFrame mainWindow = new JFrame();
        Catan board = new Catan();
        board.setLayout(null);
        board.but();
        mainWindow.setContentPane(board);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.pack();
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
    }

        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run()
                {
                    Catan app = new Catan();
                    app.createAndShowGUI();
                }
            });
        }
    }

