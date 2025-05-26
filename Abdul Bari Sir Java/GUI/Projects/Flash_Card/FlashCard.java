package Projects.Flash_Card;

public class FlashCard 
{
    private String Question,Answer;
    FlashCard(String Q1,String A1)//so throught the constructor we will be passing the Question and the Answer
    {
        Question=Q1;
        Answer=A1;
    }

    //Lets Create the Getters and Setters for Question and The Answer
    String GetQuestion()
    {
        return Question;
    }
    void SetQuestion(String Question)
    {
        this.Question=Question;
    }
    String GetAnswer()
    {
        return Answer;
    }
    void SetAnswer(String Answer)
    {
        this.Answer=Answer;
    }

    
}
