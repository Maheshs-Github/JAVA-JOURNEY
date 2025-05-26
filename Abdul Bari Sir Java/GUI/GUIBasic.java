import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
// import java.util.logging.Handler;
public class GUIBasic 
{
    public static void main(String[] args) 
    {
        //Approch 1. Writing the Frame in main class(GUIBasic) which shows "hasA" relationship(Containership) i.e GUIBasic has a Frame
        // Frame F1=new Frame("Frame 1");
        // F1.setLayout(new FlowLayout());
        // //these 2 lines creates the frame and setlayout so all the component looks in the proper size

        // Label L1=new Label("Name");
        // TextField TF1=new TextField();
        // Button B1=new Button("Click me");

        // F1.add(L1);  //order of adding the elemnts is important bcoz that's how elements gets displayed too
        // F1.add(TF1);
        // F1.add(B1);

        // F1.setSize(600,400); //if u dont set size it will so samller one
        // F1.setVisible(true);   //also always tr to write setVisible at last, check for urself



        // new Class1(); //we just craeted the obj here, as we dont need refernce and its type t mentioned 
        //We can also do that , about creating reference
        // Class1 C1=new Class1(); //there will be one warning fp that



        //Button & ActionListener Problem
        // new Class2();



        //CheckBox & ItemLsitener Problem
        // new Class3();



        //RadioBox & ItemLsitener Problem
        // new Class4();



        //TextField Practice
        // new Class5();


        //TextArea Practice
        // new Class6();

        //ListBox and Choice Practice
        // new Class7();

        //Self Task
        // new Class8();

        //Modified Self task
        // new SelfTask();

        //Scrollbar and AdjustmentEvent Practice
        new Class9();


        
    }
    
}


//Scrollbar and AdjustmentEvent Practice
class Class9 extends Frame implements AdjustmentListener
{
    Scrollbar Red,Green,Blue;
    TextField TF1;
    Class9()
    {
        setTitle("Scrollbar and AdjustmentEvent Practice");
        setLayout(null);

        Red=new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 255);//The R,G& B have the range of 0-255
        /* The Para are:
        orientation--> indicates the orientation of the scroll bar(Horizontal or Vartical).
        value--> the initial value of the scroll bar
        visible--> the visible amount of the scroll bar, typically represented by the size of the bubble
        minimum--> the minimum value of the scroll bar
        maximum--> the maximum value of the scroll bar */
        Green=new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 255);
        Blue=new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 255);
        TF1=new TextField(20);
        // ScrollPane SB1=new ScrollPane();

        //Here we are not following any Layout as it, we will try bounds to give it x,y points and Height and Width
        //we know how to find the co-ordinates and stuff
        //1stly Height, Width is a easy 
        //2ndly x is a left distance of obj and y is top distance 

        TF1.setBounds(50, 50, 300, 50);
        Red.setBounds(50,150,300,30);
        Green.setBounds(50,200,300,30);
        Blue.setBounds(50,250,300,30);
        // SB1.setBounds(50,300,300,30);
        

        add(TF1);
        add(Red);
        add(Blue);
        add(Green);
        // add(SB1);
        Red.addAdjustmentListener(this);
        Blue.addAdjustmentListener(this);
        Green.addAdjustmentListener(this);

        setSize(600,600); //if we aint setSize then also the it shows output but we need minimize(as it doesn't show really)
        setVisible(true);

    }
    
    public void adjustmentValueChanged(AdjustmentEvent e) 
    {
        TF1.setBackground(new Color(Red.getValue(),Green.getValue(),Blue.getValue()));
        // Color C1=new Color(10, 243, 33); //so thats how we set the color to it
    }
}


// Self Task: accept Day,Month & Year from user and tell them their Age
class Class8 extends Frame implements ActionListener
{
    List LS1,LS2,LS3;
    Label L1,L2;
    Button B1;
    Class8()
    {
        setTitle("The Age Calculate ");
        setLayout(new FlowLayout());

        LS1=new List(10, false);
        LS2=new List(6, false);
        LS3=new List(15, false);
        L1=new Label("\n  ");
        L2=new Label("Age Calulator");
        B1=new Button("Click to check u r Age:");

        LS1.add("1995");
        LS1.add("1996");
        LS1.add("1997");
        LS1.add("1998");
        LS1.add("1999");
        LS1.add("2000");
        LS1.add("2001");
        LS1.add("2002");
        LS1.add("2003");
        LS1.add("2004");
        LS1.add("2005");
        LS1.add("2006");
        LS1.add("2007");
        LS1.add("2008");
        LS1.add("2009");
        LS1.add("2010");
        LS1.add("2011");
        LS1.add("2012");
        LS1.add("2013");
        LS1.add("2014");

        LS2.add("january");
        LS2.add("February");
        LS2.add("March");
        LS2.add("April");
        LS2.add("May");
        LS2.add("June");
        LS2.add("July");
        LS2.add("Augest");
        LS2.add("September");
        LS2.add("October");
        LS2.add("November");
        LS2.add("December");


        LS3.add("1");
        LS3.add("2");
        LS3.add("3");
        LS3.add("4");
        LS3.add("5");
        LS3.add("6");
        LS3.add("7");
        LS3.add("8");
        LS3.add("9");
        LS3.add("10");
        LS3.add("11");
        LS3.add("12");
        LS3.add("13");
        LS3.add("14");
        LS3.add("15");
        LS3.add("16");
        LS3.add("17");
        LS3.add("18");
        LS3.add("19");
        LS3.add("20");
        LS3.add("21");
        LS3.add("22");
        LS3.add("23");
        LS3.add("24");
        LS3.add("25");
        LS3.add("26");
        LS3.add("27");
        LS3.add("28");
        LS3.add("29");
        LS3.add("30");
        LS3.add("31");

        add(L2);
        add(LS1);
        add(LS2);
        add(LS3);
        add(L1);
        add(B1);
        B1.addActionListener(this);


        setSize(600,600);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent Ae)
    {
        int MAns=0,YANs=0;
        if(LS1.getSelectedItem()=="1995")
        YANs=1995;
        if(LS1.getSelectedItem()=="1996")
        YANs=1996;
        if(LS1.getSelectedItem()=="1997")
        YANs=1997;
        if(LS1.getSelectedItem()=="1998")
        YANs=1998;
        if(LS1.getSelectedItem()=="1999")
        YANs=1999;
        if(LS1.getSelectedItem()=="2000")
        YANs=2000;
        if(LS1.getSelectedItem()=="2001")
        YANs=2001;
        if(LS1.getSelectedItem()=="2002")
        YANs=2002;
        if(LS1.getSelectedItem()=="2003")
        YANs=2003;
        if(LS1.getSelectedItem()=="2004")
        YANs=2004;
        if(LS1.getSelectedItem()=="2005")
        YANs=2005;
        if(LS1.getSelectedItem()=="2006")
        YANs=2006;
        if(LS1.getSelectedItem()=="2007")
        YANs=2007;
        if(LS1.getSelectedItem()=="2008")
        YANs=2008;
        if(LS1.getSelectedItem()=="2009")
        YANs=2009;
        if(LS1.getSelectedItem()=="2010")
        YANs=2010;
        if(LS1.getSelectedItem()=="2011")
        YANs=2011;
        if(LS1.getSelectedItem()=="2012")
        YANs=2012;
        if(LS1.getSelectedItem()=="2013")
        YANs=2013;
        if(LS1.getSelectedItem()=="2014")
        YANs=2014;



        if(LS2.getSelectedItem()=="january")
        MAns=1;
        if(LS2.getSelectedItem()=="February")
        MAns=2;
        if(LS2.getSelectedItem()=="March")
        MAns=3;
        if(LS2.getSelectedItem()=="April")
        MAns=4;
        if(LS2.getSelectedItem()=="May")
        MAns=5;
        if(LS2.getSelectedItem()=="June")
        MAns=6;
        if(LS2.getSelectedItem()=="July")
        MAns=7;
        if(LS2.getSelectedItem()=="Augest")
        MAns=8;
        if(LS2.getSelectedItem()=="September")
        MAns=9;
        if(LS2.getSelectedItem()=="October")
        MAns=10;
        if(LS2.getSelectedItem()=="November")
        MAns=11;
        if(LS2.getSelectedItem()=="December")
        MAns=12;

        
        L1.setText("You are"+(2024-YANs)+" Years,"+MAns+" Months &"+LS3.getSelectedItem()+"Days Old!!!");
        //Well ans is not all that presious but it will work
        

    }
}

//Let's see about the Self Task with some optimized code
class SelfTask extends Frame implements ActionListener
{
    List LS1,LS2,LS3;
    Label L1,L2;
    Button B1;
    Panel P1;
    SelfTask()
    {
        setTitle("The Age Calculate ");
        // setLayout(new FlowLayout());

        LS1=new List(10, false);
        LS2=new List(6, false);
        LS3=new List(15, false);
        L1=new Label();
        L1.setFont(new Font("serif",Font.BOLD,15));
        L1.setPreferredSize(new Dimension(300, 20)); //we wanted the Font of Ans to be Large thats all
        L2=new Label("Age Calulator");
        B1=new Button("Click to check u r Age:");
        P1=new Panel();


        for(int i=1995;i<=2014;i++)
        {
            LS1.add(String.valueOf(i));
        }

        String[] Months={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        for(String Month:Months)
        {
            LS2.add(Month);
        }

        for(int i=1;i<=31;i++)
        {
            LS3.add(String.valueOf(i)); //Here i is the int value of with the String.valueOf() we convert the int to the String
        }

         // add(L1);
        // add(LS1);
        // add(LS2);
        // add(LS3);
        // add(L2);
        // add(B1);
        //with this we just added the component but to keep componenet in some specifc places 

        //Let's try something else
        //we will add element in our P1 the main panel, but there are 3 elemnets to add in the center but we cant't add
        //3 in center like below
        // P1.add(BorderLayout.CENTER,LS1);
        // P1.add(BorderLayout.CENTER,LS2);
        // P1.add(BorderLayout.CENTER,LS3);
        //so we will create another Panel and then add it on anotehr

        P1.add(BorderLayout.NORTH,L2);
        Panel CenterPanel=new Panel(new GridLayout(1,3));
        CenterPanel.add(LS1);
        CenterPanel.add(LS2);
        CenterPanel.add(LS3);

        P1.add(BorderLayout.CENTER,CenterPanel);

        Panel SouthPanel=new Panel(new GridLayout(2,1));
        SouthPanel.add(B1);
        SouthPanel.add(L1);


        P1.add(BorderLayout.SOUTH,SouthPanel);
      

        add(P1);

       
        

        B1.addActionListener(this);

        setSize(400,400);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        int Month=0;
        int Year=Integer.parseInt(LS1.getSelectedItem());
        // LS1.getSelectedItem() gives the String Ans for that we need to convert it back to the int
        switch(LS2.getSelectedItem())
        {
            case "Jan": Month=1;
            break;
            case "Feb": Month=2;
            break;
            case "Mar": Month=3;
            break;
            case "Apr": Month=4;
            break;
            case "May": Month=5;
            break;
            case "June": Month=6;
            break;
            case "July": Month=7;
            break;
            case "Aug": Month=8;
            break;
            case "Sep": Month=9;
            break;
            case "Oct": Month=10;
            break;
            case "Nov": Month=11;
            break;
            case "Dec": Month=12;
            break;
        }
        L1.setText("You are"+(2024-Year)+" Years,"+Month+" Months &"+LS3.getSelectedItem()+"Days Old!!!");

    }
}



//ListBox and Choice
//In ListBox we can select the mutliple items while in a Choice we can select only one item
//we handle two types of Event ItemEvent(when click the Item) and ActionEvent(when click the Item and hit enrter)
//ListBox is nthg but a CheckBox but only difference is that when there are lots of checkbox it will be better to go for listBox rather than CheckBox
//As Choice also enables us to select on;ly one element,just like radio button, for multiple radio button we can go with Choice
class Class7 extends Frame 
{
    List LS1;
    Choice C1;
    TextArea TA1,TA2;
    Button B1;
    Class7()
    {
        setTitle("ListBox and Choice Demo");
        setLayout(new FlowLayout());


        LS1=new List(4, false);
        //rows the number of items to show.
        // multipleMode if true, then multiple selections are allowed; otherwise, only one item can be selected at a time.
        C1=new Choice();
        TA1=new TextArea(20, 30); //1st para tells 20 rows and 2nd tells 30 cols(i.e 20 lines and in each line 30 words or maybe not like that )
        B1=new Button("Click");
        TA2=new TextArea(5, 10);

        LS1.add("Monday");
        LS1.add("Tuesday");
        LS1.add("Wednesday");
        LS1.add("Thursday");
        LS1.add("Friday");
        LS1.add("Sturday");
        LS1.add("Sunday");

        C1.add("january");
        C1.add("February");
        C1.add("March");
        C1.add("April");
        C1.add("May");
        C1.add("June"); 
        C1.add("january");
        C1.add("February");
        C1.add("March");
        C1.add("April");
        C1.add("May");
        C1.add("June"); 

        add(LS1);
        add(C1);
        add(TA1);
        add(TA2);
        add(B1);
        // LS1.addItemListener(this);
        // C1.addItemListener(this);
        // LS1.addActionListener(this);

        //Let's see how we can write the code with using getSource(), nthg just created the seperate classes for it
        LS1.addItemListener(new ListBoxListener());
        C1.addItemListener(new ChoiceListener());


        setSize(600,600);
        setVisible(true);
        
    }
    // public void itemStateChanged(ItemEvent Ie)
    // {
    //     if(Ie.getSource()==LS1)  //getSource tells the Source of the Obj(the Obj here are the LS1 or C1)
    //     {
    //         TA1.setText(LS1.getSelectedItem()); //getSelectedItem gives single selected item
    //     }
    //     else
    //     {
    //         TA1.setText(C1.getSelectedItem());
    //     }
    //     //this logic prints the single elemnet from each List or Choice only one at a time
    // }
    // public void actionPerformed(ActionEvent Ae)
    // {
    //     String S1[]=LS1.getSelectedItems();
    //     String Ans="";

    //     for(String OP:S1)
    //     {
    //         Ans+=OP+"\n";
    //     }

    //     TA2.setText(Ans);
    //     // LS1.addItem("NO Day");
    // }
    class ListBoxListener implements ItemListener
    {
        public void itemStateChanged(ItemEvent Ie)
        { 
            TA1.setText(LS1.getSelectedItem()); //getSelectedItem gives single selected item
        }
    }
    class ChoiceListener implements ItemListener
    {
        public void itemStateChanged(ItemEvent Ie)
        { 
            TA1.setText(C1.getSelectedItem()); //getSelectedItem gives single selected item
        }
    }
}




//TextArea Demo
class Class6 extends Frame implements ActionListener
{
    TextArea TA1;
    TextField TF1;
    Label L1;
    Button B1;
    Class6()
    {
        setTitle("TextArea Demo");
        setLayout(new FlowLayout());

        TA1=new TextArea(10, 30);
        TF1=new TextField(20);
        L1=new Label("Enter Label");
        B1=new Button("Click me");


        add(TA1);
        add(TF1);
        add(L1);
        add(B1);
        B1.addActionListener(this);

        setSize(400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent Ae)
    {
        // L1.setText(TA1.getSelectedText());  //just setting the selected text to the Label when hit the enter button
        // TA1.append(TF1.getText());//appending Textfield Text into the textarea
        TA1.insert(TF1.getText(), TA1.getCaretPosition()); //appending Textfield Text into the textarea but using TA1.insert 
        //enable us to enter the text at any position, 1st para for the data,2nd para gives the position(getCaretPosition()-gives position of cursor)

    }
}

//Approch 2. creating our own class for Frame which shows "isA" realtionship(Inheritance) i.e Class1 is a Frame
class Class1  extends Frame
{
    Label L1;
    Button B1;
    TextField TF1;

    Class1()
    {
        super("Frame 2"); //with super we are calling the constructor  of a superclass Frame and giving tehname 
        //to the Frame
        // setTitle("Frame 2"); //this way we can set name as well
        setLayout(new FlowLayout());

        L1=new Label("Name");
        B1=new Button("Click me");
        TF1=new TextField();

        add(B1);
        add(L1);
        add(TF1);

        setSize(600,600);
        setVisible(true);
    }

}


//Problem using Component=Button & Listener=ActionListener
//The Problem when we click on the button number of label should be increased by 1
class Class2 extends Frame implements ActionListener 
{
    Label L1;
    Button B1;
    int Count=0;
    Class2()
    {
        // super("No Name");
        setTitle("Frame 2");
        setLayout(new FlowLayout());

        B1=new Button("Click me");
        L1=new Label("           "+Count+"            ");

        add(L1);
        add(B1);
        B1.addActionListener(this); //here we have to modify the value of Label when clicked the button
        //so with B1.addActionListener(this); we are setting the actionListener to the current class obj to the B1(i.e Button)
        //Any action performed on the Button will invoke the method associated to ActionListener i.e actionPerformed
        //so here that method is setting new count to the Label 

        setSize(400,400);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        Count++;
        L1.setText("          "+Count+"           ");
    }
    //we implemented the ActionListener interface ,so need to define all the methods of it actionPerformed is that method
   



}



//Problem 3. CheckBox Demo 
//Select the Subject from the Check box and dispaly the selected ones in Label

class Class3 extends Frame implements ItemListener
{
    Label L1;
    Checkbox C1,C2,C3;
    Class3()
    {
        super("Check Box Understanding");
        setLayout(new FlowLayout());

        L1=new Label("Nthg is Selected RN");
        C1=new Checkbox("Java");
        C2=new Checkbox("Python");
        C3=new Checkbox("C");

        add(C1);
        add(C2);
        add(C3);
        add(L1);
        C1.addItemListener(this);
        C2.addItemListener(this);
        C3.addItemListener(this);


        setSize(500,500);
        setVisible(true);

    }
    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        String OutPut="";
        if(C1.getState()==true)
        {
            OutPut+=" "+C1.getLabel();
        }
        if(C2.getState()==true)
        {
            OutPut+=" "+C2.getLabel();
        }
        if(C3.getState()==true)
        {
            OutPut+=" "+C3.getLabel();
        }
        L1.setText(OutPut);
        if(OutPut.isEmpty())
        {
            L1.setText("Nthg is Selected");
        }
    }
}


class Class4 extends Frame implements ItemListener
{
    Label L1;
    Checkbox C1,C2,C3;
    CheckboxGroup CBG1;
    Class4()
    {
        super("Check Box Understanding");
        setLayout(new FlowLayout());

        L1=new Label("Nthg is Selected RN");
        CBG1=new CheckboxGroup();
        C1=new Checkbox("Java",false,CBG1);
        C2=new Checkbox("Python",false,CBG1);
        C3=new Checkbox("C",false,CBG1);

        add(C1);
        add(C2);
        add(C3);
        add(L1);
        C1.addItemListener(this);
        C2.addItemListener(this);
        C3.addItemListener(this);


        setSize(500,500);
        setVisible(true);

    }
    @Override
    public void itemStateChanged(ItemEvent e) 
    {   
        Checkbox SCBox=CBG1.getSelectedCheckbox();
        if(SCBox !=null)
        {
            L1.setText(SCBox.getLabel());
        }
        else
        {
            L1.setText("Nthg is Selected");
        }
    }
}

class Class5 extends Frame implements ActionListener,TextListener
{
    Label L1,L2;
    TextField TF1;
    Class5()
    {
        setTitle("Frame 5(Textfield Demo)");
        setLayout(new FlowLayout());


        L1=new Label("No Text is Entered Yet");
        L2=new Label("Enter key is not hit yet");
        TF1=new TextField(20);
        TF1.setEchoChar('*');

        add(L1);
        add(TF1);
        add(L2); 
        TF1.addActionListener(this);
        TF1.addTextListener(this);
        //sometimes this  from above gives error that to resolve we can create new class
        // Handler H1=new Handler();
        // TF1.addActionListener(H1);
        // TF1.addTextListener(H1);
        //with this actually we are creating just other class and passing it obj to it 
        //we also write as below
        // TF1.addActionListener(new Handler() );
        

        setSize(600,600);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent Ae)
    {
        L2.setText(TF1.getText());
    }

    public void textValueChanged(TextEvent Te)
    {
        L1.setText(TF1.getText());
    }
    
    // class Handler implements ActionListener,TextListener
    // {
    //     public void actionPerformed(ActionEvent Ae)
    // {
    //     L2.setText(TF1.getText());
    // }

    // public void textValueChanged(TextEvent Te)
    // {
    //     L1.setText(TF1.getText());
    // }
    // }
}