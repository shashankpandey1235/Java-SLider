import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Scanner;

public class sliderDemo implements ChangeListener {
    JFrame jFrame ;
    JLabel label ;
    Border border = BorderFactory.createLineBorder(Color.BLUE,9);
    JPanel panel ;
    JSlider jSlider;
    int slider ;
    sliderDemo(){
        jFrame = new JFrame("SLider Demo");
        label = new JLabel();

        label.setFont(new Font("MV Bali",Font.ITALIC,25));
        label.setForeground(Color.BLUE);

        panel =  new JPanel();
        System.out.println("Enter Your Choice : ");
        Scanner sc = new Scanner(System.in);
        slider =sc.nextInt();
        jSlider = new JSlider(0,100,slider);

        jSlider.setPreferredSize(new Dimension(400,300));
        jSlider.setPaintTicks(true);
        jSlider.setMinorTickSpacing(10);
        jSlider.setPaintTrack(true);
        jSlider.setMajorTickSpacing(25);

        jSlider.setPaintLabels(true);

        jSlider.setOrientation(SwingConstants.VERTICAL);

        jSlider.setFont(new Font(null,Font.ITALIC,15));
        label.setText("℃ =" + slider);
        jSlider.addChangeListener(this);


        panel.add(label);
        panel.add(jSlider);
        jFrame.add(panel);
        jFrame.setSize(420,420);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
       label.setBorder(border);

    }
    @Override
    public void stateChanged(ChangeEvent changeEvent) {
      label.setText("℃ =" + slider);

    }
}
