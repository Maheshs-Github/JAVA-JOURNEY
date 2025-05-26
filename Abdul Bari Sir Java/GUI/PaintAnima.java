import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class PaintAnima 
{
    public static void main(String[] args) 
    {
        //Painting
        // new PClass1();        

        //Ball Animation
        new PClass2();
    }

    
}

//Understanding about the Animation
class PClass2 extends Frame implements Runnable
{
    int X=100,Y=100;
    int Tx,Ty=1;
    
    PClass2()
    {
        setTitle("Animation");
        setLayout(null);

        Thread T1=new Thread(this);
        T1.start();


        setSize(400,400);
        setVisible(true);
    }
    public void run()
    {
        while(true)
        {
            X+=Tx;
            Y+=Ty;

            if(X<0 || X>350)
            Tx=Tx*-1;
            if(Y<0 || Y>350)
            Ty=Ty*-1;
            repaint();
            try
            {
                Thread.sleep(5);
            }catch(InterruptedException I)
            {

            }

            }
        }
    
    public void paint(Graphics G1)
    {
        G1.setColor(Color.CYAN);
        G1.fillRect(X, Y, 50, 50);
    }
}

//Understanding about the Painting
class PClass1 extends Frame
{
    int X=10,Y=10;
    PClass1()
    {
        setTitle("Painting");
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent Me)
            {
                X=Me.getX();
                Y=Me.getY();
                repaint(); //we are calling the paint method with repaint as it will internally call the paint method
            }
        });

        setSize(400,400);
        setVisible(true);
    }
    public void paint(Graphics g) //paint is a method of teh Frame which takes the Graphics Para
    {
        g.setColor(Color.ORANGE);
        // g.drawRoundRect(X,Y,70,70,30,30);
        // g.fill3DRect(X,Y,90,90,true);
        g.setFont(new Font("Algerian", Font.BOLD, 40));
        g.drawString("Mahesh", X, Y);
    }
}