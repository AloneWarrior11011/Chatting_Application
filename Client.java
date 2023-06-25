
package chatting.application;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Client implements ActionListener
{
    
        static  JFrame jf=new JFrame();
       JPanel a1;
       JTextField jt;
       ImageIcon i,i3,i4,i6,i7,i9,i10,i12,i13,i15;
    
    Client()
    {
                jf.setLayout(null);
               jf.setSize(450,700);
               jf.setLocation(200,50);
               jf.getContentPane().setBackground(Color.WHITE);

               JPanel p=new JPanel();
               p.setBackground(new Color(7,94,84));
               p.setBounds(0,0,450,70);
               p.setLayout(null);
               jf.add(p);

               i=new ImageIcon(ClassLoader.getSystemResource("chatting\\3.png"));
               Image i2=i.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
               i3=new ImageIcon(i2);
               JLabel back=new JLabel(i3);
               back.setBounds(5,20,25,25);
               p.add(back);

                i4=new ImageIcon(ClassLoader.getSystemResource("chatting\\ClientProfilePic.jpg"));
               Image i5=i4.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
               i6=new ImageIcon(i5);
               JLabel propic=new JLabel(i6);
               propic.setBounds(40,20,25,25);
               p.add(propic);

                i7=new ImageIcon(ClassLoader.getSystemResource("chatting\\video.png"));
               Image i8=i7.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
               i9=new ImageIcon(i8);
               JLabel videoico=new JLabel(i9);
               videoico.setBounds(310,20,25,25);
               p.add(videoico); 

               i10=new ImageIcon(ClassLoader.getSystemResource("chatting\\phone.png"));
               Image i11=i10.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
               i12=new ImageIcon(i11);
               JLabel callLogo=new JLabel(i12);
               callLogo.setBounds(360,20,25,25);
               p.add(callLogo); 

               i13=new ImageIcon(ClassLoader.getSystemResource("chatting\\3icon.png"));
               Image i14=i13.getImage().getScaledInstance(10, 22, Image.SCALE_DEFAULT);
               i15=new ImageIcon(i14);
               JLabel option=new JLabel(i15);
               option.setBounds(400,20,25,25);
               p.add(option); 

               back.addMouseListener(new MouseAdapter()      // this action performed for back arrow and thats how frame close.
               {
               public void mouseClicked(MouseEvent k)
               {
                   System.exit(0);
               }
               });

              jf. setVisible(true);
    }
  
            @Override
            public void actionPerformed(ActionEvent e) 
            {

             }
    
    
            public static void main(String[] args)
            {
                new Client();
            }
}
