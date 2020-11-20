package Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        frame = new JFrame();
        JButton btn = new JButton("It's real?");
        btn.addActionListener(new AngelListener());
        btn.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, btn);
        // frame 속성 설정
        frame.setSize(200,200);
        frame.setVisible(true);
    }

    class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event){
            System.out.println("안돼요~ 짱구어린이");
        }


    }

   class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event){
            System.out.println("좋아요 짱구어린이");
        }


   }
}
