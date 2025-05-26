import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
// import java.awt.Menu;
// import java.awt.MenuBar;
// import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
// import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.text.NumberFormatter;
import javax.swing.tree.DefaultMutableTreeNode;

public class Swings1 
{
    public static void main(String[] args) 
    {
    //First Swing Program
    // new SwiClass1();

    //Understanding about the diff Text Field in Swing
    // new SwiClass2();

    //Understanding JCheckbox and JRadioButton
    // new SwiClass3();

    //understanding about the Borders in Swing
    // new SwiClass4();

    //understanding about the JTree in Swing
    // new SwiClass5();

    //understanding about the JInternalFrame in Swing
    // new SwiClass7();

    //Understanding about the JSplitPane()
    // new SwiClass8();

    //Understanding about the JSlider() and JProgressBar()
    // new SwiClass9();

    // Understanding about the JList and JCheckBox
    // new SwiClass10();

    // Understanding about the JMenuBar and JToolBar
    new SwiClass11();







        
        
    }
    
}


// Understanding about the JMenuBar and JToolBar
class SwiClass11 extends JFrame implements ActionListener
{
    JToolBar TB1;
    JButton B1,B2,B3,B4,B5,B6,B7;
    JTextArea TA1;
    SwiClass11()
    {
        super("Understanding about the JMenuBar and JToolBar");

        TB1=new JToolBar();

        B1=new JButton(new ImageIcon("D:\\Programs\\Abdul Bari Sir Java\\GUI\\Images\\Save.png"));
        B2=new JButton(new ImageIcon("D:\\Programs\\Abdul Bari Sir Java\\GUI\\Images\\Open.png"));
        B3=new JButton(new ImageIcon("D:\\Programs\\Abdul Bari Sir Java\\GUI\\Images\\Split.png"));
        B4=new JButton(new ImageIcon("D:\\Programs\\Abdul Bari Sir Java\\GUI\\Images\\Cut.png"));
        B5=new JButton(new ImageIcon("D:\\Programs\\Abdul Bari Sir Java\\GUI\\Images\\Copy.png"));
        B6=new JButton(new ImageIcon("D:\\Programs\\Abdul Bari Sir Java\\GUI\\Images\\New.png"));

        TB1.add(B1);
        TB1.add(B2);
        TB1.add(B3);
        TB1.add(new JToolBar.Separator());
        TB1.add(B4);
        TB1.add(B5);
        TB1.add(B6);

        TA1=new JTextArea();
        JScrollPane SP1=new JScrollPane(TA1);

        add(TB1,BorderLayout.NORTH);
        add(SP1,BorderLayout.CENTER);

        JMenuBar MB1=new JMenuBar();
        JMenu File=new JMenu("File");
        JMenuItem Open=new JMenuItem("Open");
        JMenuItem Save=new JMenuItem("Save");
        Open.setMnemonic(KeyEvent.VK_0);
        Save.setMnemonic(KeyEvent.VK_1);

        setJMenuBar(MB1);
        MB1.add(File);
        File.add(Open);
        File.addSeparator();
        File.add(Save);

        B2.setActionCommand("Open");
        B2.addActionListener(this);
        Open.addActionListener(this);

        B1.setActionCommand("Save");
        B1.addActionListener(this);
        Save.addActionListener(this);

        setSize(800,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
  
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand()=="Open")
        {
        JFileChooser FC1=new JFileChooser();
        FC1.showOpenDialog(FC1);
        File F1=FC1.getSelectedFile();

        try
        {
            FileInputStream FIS1=new FileInputStream(F1);
            byte B1[]=new byte[FIS1.available()];
            FIS1.read(B1);
            String S1=new String(B1);
            TA1.setText(S1);
            FIS1.close();
        }catch(Exception e1){}
    }
    if(e.getActionCommand()=="Save")
        {
        Color C1=JColorChooser.showDialog(this, "Color", Color.CYAN);
        TA1.setForeground(C1);
    }
    }
}

// Understanding about the JList and JCheckBox
class SwiClass10 extends JFrame implements ActionListener, ListSelectionListener, ChangeListener
{
    @SuppressWarnings("rawtypes")
    JComboBox C1;
    @SuppressWarnings("rawtypes")
    JList L1;
    JSpinner S1,S2;
    JTextField TF1;
    SwiClass10()
    {
        super("Understading about the JList and JCheckBox");
        setLayout(new FlowLayout());

        String Countries[]={"India","China","US","UK","Japan","AUS"};
        String Months[]={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        String Days[]={"Mon","Tues","Wed","Thur","Fri","Sat","Sun"};

        C1=new JComboBox<>(Countries);
        //Swing Support MVC arch at Component Level
        //Countries have data which called as Model and JComboBox is a Component which is View and on the JChomboBox 
        //we handle the Event which will be the Controller
        L1=new JList<>(Months);
        L1.setVisibleRowCount(6);
        TF1=new JTextField(10);

        S1=new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
        S2=new JSpinner(new SpinnerListModel(Days));

        add(C1);
        add(S1);
        add(S2);
        add(L1);
        add(TF1);

        C1.addActionListener(this);
        L1.addListSelectionListener(this);
        S1.addChangeListener(this);
        S2.addChangeListener(this);

        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        TF1.setText((String)C1.getSelectedItem());

    }

   
    public void valueChanged(ListSelectionEvent e) 
    {
        TF1.setText((String)L1.getSelectedValue());
    }

    
    public void stateChanged(ChangeEvent e) 
    {
        if(e.getSource()==S1)
        TF1.setText(S1.getValue()+"");
        else
        TF1.setText((String)S2.getValue());
    }
}

//Understanding about the JSlider() and JProgressBar()
class SwiClass9 extends JFrame implements ChangeListener
{
    JSlider S1;
    JProgressBar PB1;
    JPanel P1,P2;
    int W1=50;
    SwiClass9()
    {
        setTitle("Understanding about JSlider");

        S1=new JSlider();
        S1.setMajorTickSpacing(10);
        S1.setMinorTickSpacing(1);
        S1.setPaintTicks(true);
        S1.setPaintLabels(true);

        PB1=new JProgressBar();
        PB1.setString("50%");
        PB1.setStringPainted(true);
        // PB1.setIndeterminate(true);

        P1=new JPanel()
        {
            public void paintComponent(Graphics G1)
            {
                G1.drawOval(100, 100, W1, W1);
            }
        };

        P2=new JPanel();
        P2.add(PB1);

        S1.addChangeListener(this);
        add(S1,BorderLayout.NORTH);
        add(P1,BorderLayout.CENTER);
        add(P2,BorderLayout.SOUTH);

        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
  
    public void stateChanged(ChangeEvent e) 
    {
        W1=S1.getValue();
        P1.repaint();
        PB1.setString(W1+"%");
        PB1.setValue(W1);
        PB1.setStringPainted(true);


    }
}


//Understanding about the JSplitPane()
class SwiClass8 extends JFrame implements ListSelectionListener
{
    JSplitPane SP1;
    @SuppressWarnings("rawtypes")
    JList L1;
    JScrollPane CP1;
    JLabel LB1;
    SwiClass8()
    {
        super("Understanding about the JSplitPane");

        String Colors[]={"Red","Cyan","Magenta","Orange","PINK"};//This is a Data which called as Model

        L1=new JList<>(Colors);//JList is a componenet which said to be View
        L1.setSelectedIndex(0);
        L1.addListSelectionListener(this);
        CP1=new JScrollPane(L1);
        LB1=new JLabel(" ");
        LB1.setOpaque(true);
        LB1.setBackground(Color.RED);

        JScrollPane CP2=new JScrollPane(LB1);
        // SP1=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,CP1,CP2);
        // SP1.setDividerLocation(150);
        // add(SP1);

        //for Tabbed Pane
        JTabbedPane TP1=new JTabbedPane();
        TP1.addTab("Colors", CP1);
        TP1.addTab("BG Change", CP2);
        add(TP1);

        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void valueChanged(ListSelectionEvent e) 
    {
        String Ans=(String) L1.getSelectedValue();
        switch(Ans)
        {
            case "Red": LB1.setBackground(Color.red);
            break;
            case "Cyan": LB1.setBackground(Color.CYAN);
            break;
            case "Magenta": LB1.setBackground(Color.MAGENTA);
            break;
            case "Orange": LB1.setBackground(Color.ORANGE);
            break;
            case "PINK": LB1.setBackground(Color.PINK);
            break;
        }
    }
}

//understanding about the JInternalFrame in Swing
//So basically we have the JFrame on that we take JDesktopPane i.e DP1=new JDesktopPane(); , It is the base on that 
//all the frames are generated 
class SwiClass7 extends JFrame implements ActionListener
{
    JDesktopPane DP1;
    SwiClass7()
    {
        setTitle("Internal Frame Understanding");

        DP1=new JDesktopPane(); //It is the base to genearte the Internal Frames on it
        setContentPane(DP1); //setting DP1 as teh Pane

        JMenuBar MB1=new JMenuBar(); //Content for the Base frame(or u can say 1st Frame)
        JMenu File=new JMenu("Document");
        JMenuItem Open=new JMenuItem("New");

        setJMenuBar(MB1); //MB1 is a JMenuBar
        MB1.add(File);  //File is a JMenu , we are adding it on the JMenuBar
        File.add(Open); //Open is a JmenuItem , we are adding it on the JMenu File
        Open.addActionListener(this); //addding ActionListener for Open,when we tap on the Open some Action will be perform

        setSize(700,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        SwiClass6 SWi1=new SwiClass6(); //here we created the obj of the JInternalFrame
        DP1.add(SWi1); // we adding the obj of JInternalFrame class i.e SWi1(It is bascially have the internal Frame Logic ) to the base class DP1
    }
} 
class SwiClass6 extends JInternalFrame
{
    static int Count=0;
    JTextArea JA1;
    JScrollPane JP1;
    SwiClass6()
    {
        super("Documnet "+(++Count),true,true,true,true);

        JP1=new JScrollPane();
        JA1=new JTextArea();
        JMenuBar MB1=new JMenuBar();
        JMenu File=new JMenu("File");
        JMenuItem Open=new JMenuItem("Open");

        add(JP1);
        add(JA1);
        File.add(Open);
        MB1.add(File);
        setJMenuBar(MB1);

        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}




//understanding about the JTree in Swing
class SwiClass5 extends JFrame implements TreeSelectionListener
{
    JLabel L1;
    JTree T1;
    SwiClass5()
    {
        setTitle("Understanding about the JTree");

        DefaultMutableTreeNode DNode1=new DefaultMutableTreeNode("D:\\Anime Store");
        File F1=new File("D:\\Anime Store");

        for(File X:F1.listFiles())
        {
            if(X.isDirectory())
            {
                DefaultMutableTreeNode DNode2=new DefaultMutableTreeNode(X.getName());
                for(File Y:X.listFiles())
                {
                    DNode2.add(new DefaultMutableTreeNode(Y.getName()));
                }
                DNode1.add(DNode2);

            }
            else
            DNode1.add(new DefaultMutableTreeNode(X.getName()));
        }

        T1=new JTree(DNode1);
        L1=new JLabel("No File Selected Yet");
        T1.addTreeSelectionListener(this);

        JScrollPane JS1=new JScrollPane(T1);

        add(JS1,BorderLayout.CENTER);
        add(L1,BorderLayout.SOUTH);

        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void valueChanged(TreeSelectionEvent e) 
    {
        String Ans=e.getPath().toString();
       int LastPartIndex= Ans.lastIndexOf(',');
       String LastPart=Ans.substring(LastPartIndex+1);
        L1.setText(LastPart); 
        // e.getPath().toString() this gives the whole path , but if i want to set albel with only the Last Part then
        //I can follow above procedure
    }
}


//understanding about the Borders in Swing
class SwiClass4 extends JFrame
{
    JLabel L1;
    JTextField JF1;
    JButton B1;
    JPanel P1;
    SwiClass4()
    {
        setTitle("Understanding about the Borders in Swing");
        setLayout(new FlowLayout());

        L1=new JLabel("Name");
        
        JF1=new JTextField(10);

        B1=new JButton("Click");

        P1=new JPanel();
        // Border BR1=BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        // Border BR1=BorderFactory.createLineBorder(Color.CYAN, 5, true);
        Border BR1=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.MAGENTA),"Title",TitledBorder.CENTER,TitledBorder.TOP);
        // Border BR1=BorderFactory.createTitledBorder()
        P1.setBorder(BR1);

        P1.add(L1);
        P1.add(JF1);
        P1.add(B1);
        add(P1);

        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

//Understanding JCheckbox and JRadioButton
class SwiClass3 extends JFrame implements ActionListener
{
    JCheckBox C1,C2;
    JRadioButton B1,B2;
    JTextField L1;
    SwiClass3()
    {
        setTitle("Understanding about JRadioButton & JCheckBox");
        setLayout(new FlowLayout());

        L1=new JTextField("The Label");
        L1.setColumns(10);

        C1=new JCheckBox("Bold");
        C2=new JCheckBox("Italic");

        B1=new JRadioButton("Lower");
        B2=new JRadioButton("UPPER");
        ButtonGroup BG1=new ButtonGroup();

        add(L1);
        add(C1);
        add(C2);
        add(B1);
        add(B2);
        BG1.add(B1);
        BG1.add(B2);

        C1.addActionListener(this); //In Swing can have ActionListener as well as ItemListener for CheckBox and radioButton
        C2.addActionListener(this);
        B1.addActionListener(this);
        B2.addActionListener(this);
        B1.setActionCommand("Lower");
        B2.setActionCommand("UPPER");

        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        int B=0,I=0;
        switch(e.getActionCommand())
        {
            case "Lower": L1.setText(L1.getText().toLowerCase());
            break;
            case "UPPER": L1.setText(L1.getText().toUpperCase());
            break;
        }

        if(C1.isSelected())
        B=(Font.BOLD);

        if(C2.isSelected())
        I=(Font.ITALIC);
        Font F1=new Font("Sans Serif", B | I,15);
        L1.setFont(F1);
    }
}

//Understanding about the diff Text Field in Swing
class SwiClass2 extends JFrame
{
    SwiClass2()
    {
        setTitle("Understanding about TextField");
        setLayout(new FlowLayout());

        //normal same as AWT
        JTextField JT1=new JTextField(10);

        //For Formmated Text Field
        //Lets give the Date Format to the JFormattedTextField
        DateFormat DF1=new SimpleDateFormat("dd-MM-YYYY"); //these dd/MM/YYYY,dd/MM/yyyy format only works 
        // DateFormat DF1=new SimpleDateFormat("dd/MMMM/YYYY"); //shows monrth in String form
        JFormattedTextField JFT1=new JFormattedTextField(DF1);
        JFT1.setValue(new Date());
        JFT1.setColumns(10);

        //Now Lets give the Number Format to the JFormattedTextField
        // NumberFormat NF1=NumberFormat.getInstance();
        //If i want user to enter only money count
        NumberFormat NF1=NumberFormat.getCurrencyInstance(Locale.CHINESE);
        NumberFormatter NFR1=new NumberFormatter(NF1);
        NFR1.setAllowsInvalid(false);
        NFR1.setMaximum(1000);
        NFR1.setMinimum(10);
        JFormattedTextField JFT2=new JFormattedTextField(NFR1);
        JFT2.setValue(1);
        JFT2.setColumns(10);

        //For Text Area
        JTextArea JA1=new JTextArea(10,10);


        add(JT1);
        add(JFT1);
        add(JFT2);
        add(JA1);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

//First Swing Program
class SwiClass1 extends JFrame implements ActionListener
{
    int Count=0;
    JLabel JTF1;
    JButton JB1;
    // JTextField JT1;
    SwiClass1()
    {
        setTitle("1st Swing");
        setLayout(new FlowLayout());

        JB1=new JButton("Click Here");
        JTF1=new JLabel(" "+Count,5);
        // JT1=new JTextField();

        // add(JT1);
        add(JTF1);
        add(JB1);
        JB1.addActionListener(this);

        //Here when we press the Spacebar the Button also clicks, but no for enter
        // getRootPane().setDefaultButton(JB1);//now even Enter works
        //what if we add another button
        add(new JButton("Canel"));

        //to set the Button Icon
        JB1.setIcon(new ImageIcon("D:\\Anime Store\\Pictures"));
        // JT1.setToolTipText("Counter"); //when we hover on it, it will show it
        JTF1.setToolTipText("Counter");

        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        


    }
  
    public void actionPerformed(ActionEvent e) 
    {
        Count++;
        JTF1.setText(" "+Count);
    }
}