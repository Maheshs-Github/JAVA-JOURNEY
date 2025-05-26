package Projects.Flash_Card;

import java.awt.BorderLayout;
import java.awt.Font;
// import java.awt.Menu;
// import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
// import java.awt.ScrollPane;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
// import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.Iterator;

public class FlashCardBuilder 
{
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run()
            {
                new FlashCardBuilder();
            }
        });
        
        
    }

    //FlashCardBuilder Code
    private JTextArea Ques;
    private JTextArea Ans;
    private JFrame F1;
    private ArrayList<FlashCard> CardList; //we want to create the ArrayListt of FlashCard type and we havent create the 
    //FlashCard class yet so its showing some error
    //CardList is a instance(Reference) of ArrayList
    FlashCardBuilder()
    {
        F1=new JFrame("Flash Card");
        F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //The Main Panel which will hold all the stuff
        JPanel MainP=new JPanel();

        //Setting The font up
        Font FO1=new Font("Algerian", Font.BOLD , 20);

        //Setting the questions and Ans Text Area
        Ques=new JTextArea(6,20);
        Ques.setLineWrap(true);
        Ques.setWrapStyleWord(true);
        Ques.setFont(FO1);

        Ans=new JTextArea(6,20);
        Ans.setLineWrap(true);
        Ans.setWrapStyleWord(true);
        Ans.setFont(FO1);


        //Setting ScrollBar to the Ans
        JScrollPane SP1=new JScrollPane(Ans);
        SP1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        SP1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        //For the Ans of Flash Card we want it scroll vertically but never horizontally
        //also for the setVerticalScrollBarPolicy we should only set verical propeties such as here VERTICAL_SCROLLBAR_ALWAYS
        //else it will throw exception about the illegalArgument exception
        //Now let's do same thing for the Ques(Setting ScrollBar to the Ques)
        JScrollPane SP2=new JScrollPane(Ques);
        SP2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        SP2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        //Now lets create teh Button
        JButton Nextbtn=new JButton("Next card");

        //Now Craeting teh Labels for Ques and Ans
        JLabel QLabel=new JLabel("Question");
        JLabel ALabel=new JLabel("Answer");

        
        // Now Let's add the components to the Main Panel
        MainP.add(QLabel);
        MainP.add(SP2);
        MainP.add(ALabel);
        MainP.add(SP1);
        // We are follwing sequence 1st adding Label then its ScrollBar
        MainP.add(Nextbtn);
        Nextbtn.addActionListener(new NextcardListener());
        //nthg just adding the ActionListener to the Button and for that we are passing the class to it i.e NextcardListener
        //so that class should have its actionPerformed method 
        //we were always used the this, which means we were refering to the same class and in that class we used to write that method


        //lets create the obj of ArrayList
        CardList=new ArrayList<>();




        //For the Functionalty to the add new Flash Card we need add MenuBar
        JMenuBar MB1=new JMenuBar();
        F1.setJMenuBar(MB1);
        JMenu File=new JMenu("File");
        JMenuItem New=new JMenuItem("New");
        JMenuItem Save=new JMenuItem("Save");

        F1.add(MB1);
        MB1.add(File);
        File.add(New);
        File.add(Save);
        New.addActionListener(new NewMenuItemListener());
        Save.addActionListener(new SaveMenuItemListener());


        F1.getContentPane().add(BorderLayout.CENTER,MainP);
        //Now we want to add the everything to the Frame, so we taking the Obj of Frame F1 and adding the main(base ) panel at the center of the frame

        F1.setSize(400,500);
        F1.setVisible(true);
    }


class NextcardListener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // System.out.println("Next Button Clicked!!!");

        FlashCard Flash1=new FlashCard(Ques.getText(), Ans.getText());
        //let's talk about it little
        //so FlashCard is a class where we had all the getter,Setter,constructor related to the FlashCard
        //its looks interesting
        //here we just created its FlashCard Obj and in the Constructor of the FlashCard just passed the Question and Answer
        // input by the user with getText(), so when we click the button, this functionalty will occur

        CardList.add(Flash1);
        //Let's just add the Flash1 to the CardList, so the Question and the Answer got from the Flash card from the user
        //will be store inside the CardLsit Array

        //So let's see how its working
        // System.out.println("Size of the Flash Card Array: "+CardList.size());
        //the moment we write something and hit nextButton
        // Size of the Flash Card Array: 1
        // Size of the Flash Card Array: 2

        //so now that we took the Question and Answer from user and saved in array now we want to enter next question
        //answer, so what we can to do is just clear the old question and answer frames 
        //for that
        ClearCard();
    }
    
}
public void ClearCard()
{
    Ques.setText("");
    Ans.setText("");
    Ques.requestFocus();
}
class NewMenuItemListener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // System.out.println("New Menu Button Clicked!!!");
    }
    
}
class SaveMenuItemListener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        FlashCard Flash1=new FlashCard(Ques.getText(), Ans.getText());
        CardList.add(Flash1);
        //so what was happening is that when was about to add the last Card, we weren't hitting the Next Button and 
        //it couldn't be saved for that, we wrote code save the current question and answer when we hit the save button

        // System.out.println("Open Menu Button Clicked!!!");

        //we want to add the functionalty to save the card, Qustion and Answer, so lets create the JF
        JFileChooser FileSave=new JFileChooser(); //shows all the file to chose from them
        FileSave.showSaveDialog(F1); //it opens the dialog box with option to save the file in local storage

        SaveFile(FileSave.getSelectedFile());

        
    }
    
}
public void SaveFile(File SelectedFile)
{
    try 
    {
        //BufferedWriter to the save the data of the File, we wanted the Writer type obj for BufferedWriter
        //so we wrote the new FileWriter and passed the variable of the file SelectedFile
        //so (new FileWriter(SelectedFile)); is a Writer type which have file type, kinda like that
        BufferedWriter Writer=new BufferedWriter(new FileWriter(SelectedFile));

        //So now to iterate thriught the ArrayList, we need the some machnisum
        // Iterator<FlashCard> Iterator of the type FlashCard, CardList.iterator() gives all the elements from the 
        //CardList which consist of the all Flash Card
        Iterator<FlashCard> CardIterator=CardList.iterator();
        while(CardIterator.hasNext())//it returns true if there is any elemnet avaliable and our loop will be true and it will goes on performing the task
        {
            FlashCard Cards=(FlashCard)CardIterator.next(); //we are storing all the FlashCard in the Cards from CardIterator
            Writer.write(Cards.GetQuestion()+"/");
            Writer.write(Cards.GetAnswer()+"\n");
            //as u know we had creater Flashcard class with all methods and stuff, so here we created FlashCard's Obj
            //cards here and with that accessed its methods GetQuestion and GetAnswer
            //and we wanted the format be like-->
            //Where are u from?/Earth
            //that's how it will be get stored in the file

        }
        //As CardIterator have all the Info or data about the CardLsit, with .hasNext we can take all the data 
        Writer.close(); //and closed the Writer


        //Without Writing iterator we could also able to store all the cards Ans and Question
        // for(FlashCard Cards:CardList)
        // {
        //     Writer.write(Cards.GetQuestion());
        //     Writer.write(Cards.GetAnswer());
        // }
        //Using for each loop we did same thing
        
    } catch (Exception e) 
    {
        //so there is Exception means happened that prevented us from writing into the File
        System.out.println("Couldn't able Write into the File");
        e.printStackTrace();
    }

    
}

}