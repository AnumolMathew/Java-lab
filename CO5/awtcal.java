import java.awt.*;
import java.awt.event.*;
public class awtcal implements ActionListener
{
    Frame f=new Feame();
    Label l1=new Label("enter celcious");
    Label l2=new Label("fahrenheit");
    TextField t1=new TextField();
    TextField t2=new TextField();
    Button b1=new Button("cancel");
    Button b2=new Button("find");

     awtcal() {
   
    l1.setBounds{100,200,150,20};
    l2.setBounds{100,150,50.20};

    t1.setBounds{100,150,110,30};
    t2.setBounds{100,150,110,30};
    b1.addactionListner(this);
    b2.AddactionListner(this);
    f.add(l1);
    f.add(l2);
    f.add(t1);
    f.add(t2);
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(100,200);
    
    }
     public void actionPerformed(ActionEvent e)
     {
   
   
    {
        
    }
    
    
            
}