import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameWindow extends JFrame {


    JFrame window;
    JLabel totalLabel;
    JLabel nameLabel;
    JLabel introLabel;
    JLabel belongLabel;
    JLabel srcLabel;
    JLabel tagLabel;
    JLabel prizeLabel;
    JTextField nameField;
    JTextField introField;
    JTextField belongField;
    JTextField srcField;
    JTextField tagField;
    JTextField prizeField;
    JButton commit;
    public static JPanel imgPanel;
    public JFrameWindow() {

        window = new JFrame("服务端");
        window.setLayout(null);
        window.setSize(600, 600);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setResizable(false);
        totalLabel = new JLabel("商品信息");
        totalLabel.setBounds(150, 60, 250, 50);
        window.add(totalLabel);
        //name
        nameLabel = new JLabel("商品名");
        nameLabel.setBounds(150, 110, 250, 50);
        window.add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(200, 127, 250, 20);
        window.add(nameField);
        //belong
        belongLabel = new JLabel("店铺");
        belongLabel.setBounds(150, 160, 250, 50);
        window.add(belongLabel);
        belongField = new JTextField();
        belongField.setBounds(200, 177, 250, 20);
        window.add(belongField);
        //src
        srcLabel = new JLabel("图片");
        srcLabel.setBounds(150, 210, 250, 50);
        window.add(srcLabel);
        srcField = new JTextField();
        srcField.setBounds(200, 227, 250, 20);
        window.add(srcField);
        //tag
        tagLabel = new JLabel("标签");
        tagLabel.setBounds(150, 260, 250, 50);
        window.add(tagLabel);
        tagField = new JTextField();
        tagField.setBounds(200, 277, 250, 20);
        window.add(tagField);
        //prize
        prizeLabel = new JLabel("价格");
        prizeLabel.setBounds(150, 310, 250, 50);
        window.add(prizeLabel);
       prizeField = new JTextField();
       prizeField.setBounds(200, 327, 250, 20);
        window.add(prizeField);
        //intro
        introLabel = new JLabel("介绍");
        introLabel.setBounds(150, 360, 250, 50);
        window.add(introLabel);
        introField = new JTextField();
        introField.setBounds(200, 377, 250, 150);
        window.add(introField);
        //commit
        commit = new JButton("提交");
        commit.setBounds(390, 70, 60, 30);
        window.add(commit);
        commit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Server.s = nameField.getText()+" "+introField.getText()+" "+belongField.getText()+" "+srcField.getText()+" "+tagField.getText()+" "+prizeField.getText();
                System.out.printf("数据发送成功");
            }
        });
        window.setVisible(true);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }


}


