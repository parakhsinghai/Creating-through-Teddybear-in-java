import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class myapplet2 extends Applet implements ActionListener
{
public void paint(Graphics g)
{
g.setColor(Color.green);
g.fillOval(240,385,60,115);
g.drawOval(240,385,60,110);
g.setColor(Color.blue);
g.fillOval(160,390,60,110);
g.drawOval(160,390,60,110);
g.setColor(Color.pink);
g.fillOval(72,260,80,40);
g.drawOval(72,260,80,40);
g.setColor(Color.pink);
g.fillOval(300,260,80,40);
g.drawOval(300,260,80,40);
g.setColor(Color.magenta);
g.fillOval(285,126,20,40);
g.drawOval(285,126,20,40);
g.setColor(Color.magenta);
g.fillOval(135,127,20,40); 
g.drawOval(135,127,20,40);
g.setColor(Color.green);
g.fillOval(155,80,130,120);
g.drawOval(155,80,130,120);
g.setColor(Color.black);
g.fillOval(210,150,20,20);
g.drawOval(210,150,20,20);
g.setColor(Color.black);
g.fillOval(238,120,20,20);
g.drawOval(238,120,20,20);
g.setColor(Color.black);
g.fillOval(178,122,20,20);
g.drawOval(178,122,20,20);
g.setColor(Color.black);
g.drawArc(180,150,80,40,196,160);
g.setColor(Color.yellow);
g.fillOval(150,200,150,200);
g.drawOval(150,200,150,200);
g.setColor(Color.red);
g.fillOval(200,200,50,50);
g.drawOval(200,200,50,50);
}
Button b1,b2,b3;
public void init()
{
b1=new Button("cyan");
b2=new Button("gray");
b3=new Button("white");
add(b1);
add(b2);
add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
Object o=e.getSource();
if(o==b1)
setBackground(Color.cyan);
else
if(o==b2)
setBackground(Color.gray);
else
setBackground(Color.white);
}
}
//<applet code=myapplet2 height=555 width=444>
//</applet>

