import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.CheckboxMenuItem;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;

public class LayoutManagers 
{
    public static void main(String[] args) 
    {
        //Flow Layout Practice
        // new Class11();
 
        //Border Layout Practice
        // new Class12();

        //Grid Layout Practice
        // new Class13();

         //Grid Layout Practice
        //  new Class14();

        //Card Layout Understanding problem
        new Class15();

        //Understanding about the keyEvents
        // new Class16();

        //Understanding about the Mouse Events
        // new Class17();

        //Understanding about the Window Events
        // new Class18();

        //Understanding about the Adapter classes
        // new Class19();

        //different ways of Handling Event
        //1. Frame class as Listeneer
        // new Class20();

        // 2. Inner Class
        // new Class21();

        //3. With Anonymous Class
        // new Class22();

        //4. With Lamda Expression
        // new Class23();


        //Understanding about the Menues
        // new Class25() ;





        
    }
    
}

//Understanding about the Menues
class Class25 extends Frame 
{
    Menu File,SubMClose;
    MenuItem Open,Save,Close,CloseAll;
    TextField TF1;
    CheckboxMenuItem AutoSave;
    Class25()
    {
        setTitle("Menu Understanding");;
        setLayout(new FlowLayout());

        Open=new MenuItem("Open");
        Save=new MenuItem("Save");
        Close=new MenuItem("Close");
        CloseAll=new MenuItem("CloseAll");

        TF1=new TextField(10);

        AutoSave=new CheckboxMenuItem("AutoSave");

        File=new Menu("File");
        SubMClose=new Menu("Close");

        File.add(Open); //File is the Menu and Open,Save,etc are its MenuItem
        File.add(Save);
        File.add(SubMClose);
        File.add(AutoSave);

        SubMClose.add(Close); //SubMClse is a Menu too and Close and CloseAll are the MenuItem, actuallySubMClose is a MenuItem 
        //of teh File Menu but it also have further Sub Menu tharts why Close and CloseAll are treated as MenuItem and 
        //SubMClose as a Menu
        SubMClose.add(CloseAll);

        add(TF1);

        // Open.addActionListener(this);
        // Save.addActionListener(this);
        // Close.addActionListener(this);
        // CloseAll.addActionListener(this);
        // AutoSave.addItemListener(this);

        //Lets try to write it with Anonymous Class
        Open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae)
            {
                TF1.setText("Open");
            }
        });

        //other remaining ones with Lamda Expression
        Save.addActionListener((ActionEvent Ae)->
        {
            TF1.setText("Save");
        });

        Close.addActionListener((ActionEvent Ae)->
        {
        TF1.setText("Close");
        });

        CloseAll.addActionListener((ActionEvent Ae)->
        {
        TF1.setText("Close All");
        });

        AutoSave.addItemListener((ItemEvent Ie)->
        {
            if(AutoSave.getState())
            TF1.setText("Auto Save On");
            else
            TF1.setText("Auto Save Off");
        });




        MenuBar MB1=new MenuBar(); //creatinfg the menubar
        MB1.add(File); //adding File to the MenuBar
        setMenuBar(MB1); //we are setting the MenuBar MB1 to the frame with rthis
        //lets c the elements from the bottom

        setSize(400,400);
        setVisible(true);



    }
  
    // public void actionPerformed(ActionEvent e) 
    // {
    //     if(e.getSource()==Open)
    //     TF1.setText("Open");
        
    //     if(e.getSource()==Save)
    //     TF1.setText("Save");

    //     if(e.getSource()==Close)
    //     TF1.setText("Close");

    //     if(e.getSource()==CloseAll)
    //     TF1.setText("CloseAll");
        
    // }

    
    // public void itemStateChanged(ItemEvent e) 
    // {
    //     if(AutoSave.getState())
    //     TF1.setText("Auto Save On");
    //     else
    //     TF1.setText("Auto Save Off");
    // }
}


//different ways of Handling Event
//1. Frame class as Listeneer


//lets take example counter
class Class20 extends Frame implements ActionListener
{
    Label L1;
    Button B1;
    int Count=0;
    Class20()
    {
        setTitle("1. Frame class as Listeneer");;
        setLayout(null);
        L1=new Label(" "+Count);
        B1=new Button("Click Here");

        L1.setBounds(20,40,50,20);
        B1.setBounds(50,40,160,20);

        add(L1);
        add(B1);
        B1.addActionListener(this);

        setSize(400,400);
        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent e) 
    {
        Count++;
        // L1.setText(" "+Count); //concatenation btw String and int
        L1.setText(String.valueOf(Count)); //it also converts the int into the String

    }
}


//2. Inner Class
//lets take example counter
class Class21 extends Frame 
{
    Label L1;
    Button B1;
    int Count=0;
    Class21()
    {
        setTitle("2. Inner Class");;
        setLayout(null);
        L1=new Label(" "+Count);
        B1=new Button("Click Here");

        L1.setBounds(20,40,50,20);
        B1.setBounds(50,40,160,20);

        add(L1);
        add(B1);
        B1.addActionListener(new InnerClass());

        setSize(400,400);
        setVisible(true);

    }
    
    class InnerClass implements ActionListener
    {
    public void actionPerformed(ActionEvent e) 
    {
        Count++;
        // L1.setText(" "+Count); //concatenation btw String and int
        L1.setText(String.valueOf(Count)); //it also converts the int into the String

    }
   }
}

//3. With Anonymous Class
//lets take example counter
class Class22 extends Frame 
{
    Label L1;
    Button B1;
    int Count=0;
    Class22()
    {
        setTitle("2. Inner Class");;
        setLayout(null);

        L1=new Label(" "+Count);
        B1=new Button("Click Here");

        L1.setBounds(20,40,50,20);
        B1.setBounds(50,40,160,20);

        add(L1);
        add(B1);
        //In 2nd we were just creating the sepearte Innere class and its anonymous obj is given to the B1.addActionListener
        //but here rather than creating sepearate class , we just created the simulattuion of class and direcly wrote it
        B1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
                {
                    Count++;
                    // L1.setText(" "+Count); //concatenation btw String and int
                    L1.setText(String.valueOf(Count)); //it also converts the int into the String

                }
        });

        setSize(400,400);
        setVisible(true);

    }
    
    
    
   
}


//4. With Lamda Expression
//lets take example counter
class Class23 extends Frame 
{
    Label L1;
    Button B1;
    int Count=0;
    Class23()
    {
        setTitle("2. Inner Class");;
        setLayout(null);

        L1=new Label(" "+Count);
        B1=new Button("Click Here");

        L1.setBounds(20,40,50,20);
        B1.setBounds(50,40,160,20);

        add(L1);
        add(B1);
        //just see what we changes than the 3rd one
        B1.addActionListener((ActionEvent e)->
        {
            
                    Count++;
                    // L1.setText(" "+Count); //concatenation btw String and int
                    L1.setText(String.valueOf(Count)); //it also converts the int into the String

                }
        );

        setSize(400,400);
        setVisible(true);

    }
    
    
    
   
}
//understanding about Adapter Classes
class Class19 extends Frame
{
    Label L1;
    Class19()
    {
        setTitle("Adapter Classes Unerstanding");
        setLayout(null);

        L1=new Label();
        L1.setBounds(20,40,100,100);

        add(L1);
        addWindowListener(new IClass1());

        setSize(400,400);;
        setVisible(true);
    }

    //we need to extend one more class but in Java we can't do so we will taje the inner class obj for to make it do
    class IClass1 extends WindowAdapter
    {
        public void windowDeactivated(WindowEvent e)
        {
            L1.setText("Window Deactiveted");
        }
        public void windowActivated(WindowEvent e)
        {
            L1.setText("Window Activeted");
        }

        /*
         Inner Class Access: An inner class has a reference to the instance of the outer class, allowing it to access the outer class's members 
         directly without needing to create a separate instance of the outer class.
Scope: Since the L1 label is declared in the outer class, it's within the scope of the inner class, meaning you can directly
 refer to it within any method inside the inner class.
         */
    }
}

//Understanding about the Window Events
class Class18 extends Frame implements WindowListener
{
    Label L1;
    Class18()
    {
        setTitle("Understaindng about Window Events");
        setLayout(null);

        L1=new Label("");

        L1.setBounds(20,40,100,100);

        add(L1);
        addWindowListener(this);

        setSize(400,400);
        setVisible(true);
    }
   
    public void windowOpened(WindowEvent e) 
    {
        L1.setText("Window Opened");
    }
    
    public void windowClosing(WindowEvent e) 
    {
        L1.setText("Window Closed");
        System.exit(0); //0 tells execution is successful
    }
   
    public void windowClosed(WindowEvent e) 
    {
        L1.setText("Window Closed");
    }
    
    public void windowIconified(WindowEvent e) 
    {
        L1.setText("Window Iconified");
    }
   
    public void windowDeiconified(WindowEvent e) 
    {
        L1.setText("Window Deiconified");
    }
  
    public void windowActivated(WindowEvent e) 
    {
        L1.setText("Window activeted");
    }
            
    public void windowDeactivated(WindowEvent e) 
    {
        L1.setText("Window Deactiveted");
    }
}

//Understanding about the MouseEvents
class Class17 extends Frame implements MouseListener,MouseMotionListener
{
    Label L1,L2;
    Class17()
    {
        setTitle("Understanding about teh Mouse Events");
        setLayout(null);

        L1=new Label("");
        L2=new Label("");

        L1.setBounds(20,40,100,50);
        L2.setBounds(20,80,100,50);

        add(L1);
        add(L2);
        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(400,400);
        setVisible(true);
    }
    
    public void mouseDragged(MouseEvent e) 
    {
        L1.setText("Mouse Dragged");
    }
    
    public void mouseMoved(MouseEvent e) 
    {
        L1.setText("Mouse Moved");
        L2.setText("X: "+e.getX()+", Y: "+e.getY());
    }
    
    public void mouseClicked(MouseEvent e) 
    {
        L1.setText("Mouse Clicked");
    }
    
    public void mousePressed(MouseEvent e) 
    {
        L1.setText("Mouse Pressed");
    }
    
    public void mouseReleased(MouseEvent e) 
    {
        L1.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) 
    {
        L1.setText("Mouse Entered");
        L2.setText("X: "+e.getX()+", Y: "+e.getY());
    }
   
    public void mouseExited(MouseEvent e) 
    {
        L1.setText("Mouse Exited");
    }
}


//Understanding about the keyEvents
//we are taking 4 labels which will be shown as the event occurs, last label will show the date and time when 
//key was pressed
class Class16 extends Frame implements KeyListener //KeyListener is a inteface so we need implement all the methods  
{
    Label L1,L2,L3,L4;
    Class16()
    {
        setTitle("Key Events Understanding");

        L1=new Label("");
        L2=new Label("");
        L3=new Label("");
        L4=new Label("");

        setLayout(null);

        L1.setBounds(30,30,50,20);
        L2.setBounds(30,70,80,20);
        L3.setBounds(30,110,80,20);
        L4.setBounds(30,150,200,20);

        add(L1);
        add(L2);
        add(L3);
        add(L4);
        addKeyListener(this); //adding Listener to the frame

        setSize(400,400);
        setVisible(true);

    }
    public void keyTyped(KeyEvent e) 
    {
        L3.setText("Key Typed.....");
        // L4.setText(new Date(e.getWhen())); //i dont undersatnd how does it not giving the errror now Date to String conversion errror
        // L4.setText((String)(new Date(e.getWhen())));//Cannot cast from Date to String errror
        L4.setText("Date:"+new Date(e.getWhen()));
    }

    public void keyPressed(KeyEvent e) 
    {
        L1.setText("Key Pressed....");
        
        // L2.setText("");
        
    }
    public void keyReleased(KeyEvent e) 
    {
        L1.setText(""); //setting other labnel to null
        L3.setText("");
        L2.setText("Key Released...");
        L4.setText("");
        
    }
    
}


//Card Layout Understanding problem
//Problem is to give 2 checkbox,when 1st one is checked one panel will appear with 3 buttons when other checkbox is 
//selected other panel with 3 text box will be appeared
class Class15 extends Frame implements ItemListener
{
    Button B1,B2,B3;
    TextField TF1,TF2,TF3;
    Panel P1,P2,CBP,MainP;
    Checkbox C1,C2;
    CardLayout CL1;
    
    Class15()
    {
        setTitle("Card Problem");

        B1=new Button("One");
        B2=new Button("Two");
        B3=new Button("Three");

        TF1=new TextField(10);
        TF2=new TextField(10);
        TF3=new TextField(10);

        CheckboxGroup CBG1=new CheckboxGroup();
        C1=new Checkbox("One",CBG1,false);
        C2=new Checkbox("Two",CBG1,false);

        CBP=new Panel(); 
        CBP.add(C1); //adding checkbox on the one panel
        CBP.add(C2);

        P1=new Panel(); //adding those 3 buttons on the panel 1
        P1.add(B1);
        P1.add(B2);
        P1.add(B3);

        P2=new Panel(); //adding those 3 text fields on panel 2
        P2.add(TF1);
        P2.add(TF2);
        P2.add(TF3);

        MainP=new Panel();
        CL1=new CardLayout();
        MainP.setLayout(CL1);
        MainP.add(P1); //adding Panel 1 and 2 on the main panel
        MainP.add("Two",P2);

        //the defalut layout is the border layout , we ant to add the button on the north(up side)
        add(CBP,BorderLayout.NORTH);  
        add(MainP,BorderLayout.CENTER);

        C1.addItemListener(this);
        C2.addItemListener(this);

        setSize(400, 400);
        setVisible(true);

    }

    
    public void itemStateChanged(ItemEvent e) 
    {
        if(C1.getState())
        CL1.first(MainP);
        else
        CL1.next(MainP);

    }
    
}


//GridBag Layout Practice
class Class14 extends Frame
{
    Button B1,B2,B3,B4,B5,B6;
    Class14()
    {
        setTitle("GridBag Layout Practice");

        GridBagLayout GBL1=new GridBagLayout();
        GridBagConstraints GBC1=new GridBagConstraints();
        setLayout(GBL1);

        B1=new Button("One");
        B2=new Button("Two");
        B3=new Button("Three");
        B4=new Button("Four");
        B5=new Button("Five");
        B6=new Button("Six");


        GBC1.gridx=1;
        GBC1.gridy=1;
        add(B1,GBC1);

        GBC1.gridx=2;
        GBC1.gridy=2;
        add(B2,GBC1);

        GBC1.gridx=3;
        GBC1.gridy=2;
        add(B3,GBC1);

        GBC1.gridx=3;
        GBC1.gridy=4;
        add(B4,GBC1);

        // GBC1.gridx=3;
        // GBC1.gridy=2;
        // add(B5,GBC1);

        // GBC1.gridx=1;
        // GBC1.gridy=1;
        // add(B6);
        //We will seee about it later

        setSize(300,300);
        setVisible(true);

    }
}


//Grid Layout Practice
class Class13 extends Frame
{
    Button B1,B2,B3,B4,B5,B6;
    Class13()
    {
        setTitle("Grid Layout Practice");

        B1=new Button("One");
        B2=new Button("Two");
        B3=new Button("Three");
        B4=new Button("Four");
        B5=new Button("Five");
        B6=new Button("Six");

        // setLayout(new GridLayout(3, 2)); //3 rows and 2 cols
        GridLayout GL1=new GridLayout(3, 2);
        // GridLayout GL1=new GridLayout(3, 5); //Here only we have 6 Button, but there are 15 places still it will show 15 places
        setLayout(GL1);
        GL1.setVgap(30);
        GL1.setHgap(30); //we can also set layout like creating different obj, then passing, this way we can set the vertical and horizontal gap

        add(B1);
        add(B2);
        add(B3);
        add(B4);
        add(B5);
        add(B6);

        setSize(300,300);
        setVisible(true);

    }
}


//Border Layout Practice
class Class12 extends Frame
{
    Button B1,B2,B3,B4,B5,B6;
    Class12()
    {
        setTitle("Border Layout Practice");

        B1=new Button("One");
        B2=new Button("Two");
        B3=new Button("Three");
        B4=new Button("Four");
        B5=new Button("Five");
        // B6=new Button("Six");

        // BorderLayout BL1=new BorderLayout();
        // BL1.setVgap(20);
        // BL1.setHgap(30);
        // add(BL1.WEST,B2); i guess we can't set it like this
        //we set Horizontal and Vertical Gap too
        // add(B1,BorderLayout.EAST);
        // add(BorderLayout.WEST,B2);
        add(B3,BorderLayout.NORTH);
        add(B4,BorderLayout.SOUTH);
        add(B5,BorderLayout.CENTER);

        Panel P1=new Panel(); //Panel is just like the small frame whitin the frame
        P1.add(new Button("Mon")); //here we just adding some button to the panel
        P1.add(new Button("Tues")); //hierarchy is like Button is inside the Panel and Panel is inside the Frame
        P1.add(new Button("Wed"));
        P1.setLayout(new FlowLayout()); //3 rows and 1 col layout set for the Panel
        add(P1,BorderLayout.EAST); //And here we just adding the that Panel to the frame to its East side
        

        setSize(400,400);
        setVisible(true);

    }

}

//Flow Layout Practice
class Class11 extends Frame
{
    Button B1,B2,B3,B4,B5,B6;
    Class11()
    {
        setTitle("Flow Layout Practice");

        B1=new Button("One");
        B2=new Button("Two");
        B3=new Button("Three");
        B4=new Button("Four");
        B5=new Button("Five");
        B6=new Button("Six");

        FlowLayout FL=new FlowLayout();
        FL.setAlignment(FlowLayout.LEFT);//by deaflut is a center
        setLayout(FL);
        FL.setHgap(100);//nthg just to set the horizonatl gap
        FL.setVgap(30);

        add(B1);
        add(B2);
        add(B3);
        add(B4);
        add(B5);
        add(B6);

        setSize(300,300);
        setVisible(true);

    }
}



