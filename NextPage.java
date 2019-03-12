import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class NextPage extends Template implements ActionListener
{
    JLabel label;
    JButton pack,unpack;
    
    NextPage(String value)
    {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        label = new JLabel("Welcome:"+value);
        Dimension size = label.getPreferredSize();
        label.setBounds(40,50,size.width+60,size.height);
        label.setFont(new Font("Century",Font.BOLD,17));
        label.setForeground(Color.blue);
        
        pack = new JButton("Pack");
        Dimension dsize = pack.getPreferredSize();
        pack.setBounds(100,100,dsize.width,dsize.height);
        pack.addActionListener(this);
        
        unpack = new JButton("Unpack");
        Dimension d2size = unpack.getPreferredSize();
        unpack.setBounds(300,100,d2size.width,d2size.height);
        unpack.addActionListener(this);
        
        _header.add(label);
        _content.add(pack);
        _content.add(unpack);
        
        ClockHome();
        this.setSize(500,450);
        this.setResizable(false);
        this.setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == exit)
        {
            this.setVisible(false);
            System.exit(0);
        }
        if(ae.getSource() == minimize)
        {
            this.setState(JFrame.ICONIFIED);
        }
        if(ae.getSource() == pack)
        {
            this.setVisible(false);
            try{
                MarvellousPackFront obj = new MarvellousPackFront();
            }
            catch(Exception e){}
        }
        if(ae.getSource() == unpack)
        {
            this.setVisible(false);
            MarvellousUnpackFront obj = new MarvellousUnpackFront();
        }
    }  
}