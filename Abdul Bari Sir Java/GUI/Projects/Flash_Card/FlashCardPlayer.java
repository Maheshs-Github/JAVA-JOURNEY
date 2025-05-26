package Projects.Flash_Card;

import java.awt.BorderLayout;
import java.awt.Font;
// import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;

public class FlashCardPlayer 
{
    private JTextArea Display;
    // private JTextArea Answer;
    private ArrayList<FlashCard> CardList;
    private Iterator<FlashCard> CardIterator;
    private FlashCard CurrentCard;
    // private int CurrentcardIndex;
    private JFrame Frame;
    private boolean isShowAnswer;
    private JButton ShowButton;

    FlashCardPlayer()
    {
        Frame=new JFrame("Flash Card Player");
        JPanel MainP=new JPanel();
        Font NewFont=new Font("Algerian", Font.BOLD, 22);

        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Display=new JTextArea(10,20);
        Display.setFont(NewFont);

        JScrollPane QScrollPane=new JScrollPane(Display);
        QScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        QScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ShowButton=new JButton("Show Answer");

        MainP.add(QScrollPane);
        MainP.add(ShowButton);

        ShowButton.addActionListener(new ShowAnsListener());

        JMenuBar MB1=new JMenuBar();
        Frame.setJMenuBar(MB1);
        JMenu File=new JMenu("File");
        JMenuItem LoadCards=new JMenuItem("Load Card Set");
        LoadCards.addActionListener(new OpenCardsListListener());

        MB1.add(File);
        File.add(LoadCards);

        Frame.getContentPane().add(BorderLayout.CENTER, MainP);
        Frame.setSize(640,500);
        Frame.setVisible(true); 
    }
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run()
            {
                new FlashCardPlayer();
            }
        });
        
        
    }

    class ShowAnsListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(isShowAnswer) //when flag is true i.e Show Ans Button clicked we have to dispaly the Ans
            {
                Display.setText(CurrentCard.GetAnswer()); //As we know that Dispaly is text Area we will set the Ans to it
                ShowButton.setText("Next Card"); //after rthe Ans we will set the button to Next card to show next Question
                isShowAnswer=false;// and ofc setting flag flase as set ans

            }
            //In else if teh flag is false we need to show Question for that
            else
            {
                if(CardIterator.hasNext())
                {
                    ShowNextCard();
                }
                else
                {
                    //If there no further Card
                    Display.setText("That was a Last CARd");
                    ShowButton.setEnabled(false);
                }

            }
            
        }
        
    }

    class OpenCardsListListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            JFileChooser FileOpen=new JFileChooser();
            FileOpen.showOpenDialog(FileOpen);
            LoadFile(FileOpen.getSelectedFile());
            //when we click on Open Card Menu, it should pop up the functionality to chosse the file 
            //then we call the LoadFile method for furhther functionalty
        }
        
        
    }
    void LoadFile(File SelectedFile)
    {
        CardList=new ArrayList<FlashCard>();

        //Then LoadFile function
        try 
        {
            BufferedReader Reader=new BufferedReader(new FileReader(SelectedFile));
            //creates the Buffred Reader obj pass the file anme as of type Filereader not a File as per required in synatax
            String Line=null;
            while((Line= Reader.readLine()) !=null) //we assign (Reader.readLine()) to the Line which basically have the data of the 
            //selected File line by line that's the while loop to take all the lines
            {
                Makecard(Line); //so makeCard will make actual Card with for now we are passing the whole line
            }
            Reader.close();
        } catch (Exception e) 
        {
            System.out.println("Couldn't read the File");
            e.printStackTrace();
        }

        //Now as we have each question and Ans Lets make the Cards 
        CardIterator=CardList.iterator(); //cardList have all the Cards which we putting in the CardIterator
        ShowNextCard(); //with this method we will craete the seperate question and Ans cards 
            
    }

    void Makecard(String LineToParse)
    {
        // String[] Result=LineToParse.split("/"); //so basically we just seperating the question and answer with this
        // //as we know our format was like that
        // //so now Result[0]=Question and Result[1]=Answer i.e [Question,Answer]

        // FlashCard Card=new FlashCard(Result[0], Result[1]);
        // CardList.add(Card);
        // System.out.println("made a Card");

        //so here as we dissussed the LineToparse is actually the whole line, we need to split its part into the question and the Ans
        StringTokenizer Result=new StringTokenizer(LineToParse,"/"); //well Tokenizer is doing that, process is pretty
        {                                                                   //much straight forward
            if(Result.hasMoreTokens())
            {
                FlashCard Card=new FlashCard(Result.nextToken(), Result.nextToken()); //here we got question and ans
                CardList.add(Card);  //just it remains to add those Ans and Que to the Card as we wanted 
                //Fierst Que then after click the Button the Ans
                System.out.println("made a Card"); 
            }
        }


    }
    void ShowNextCard()
    {
        CurrentCard=(FlashCard)CardIterator.next(); //dont understabnd this one 
        //see Currentcard is the reference of Flashcard  and CardIterator will give the all the cards one by one
        Display.setText(CurrentCard.GetQuestion()); //setting Question on the card(Display is the Text Area on which we will set Question)
        //so question will be Apper on the card
        ShowButton.setText("Show Answer"); //and when there is question , we need Button which will tell rthe Ans
        isShowAnswer=true; //and setting the flag(isShowAnswer) to the true

    }
}


//Lets see about implemting the Final Flash Card
//Great Woek keep it up.........
