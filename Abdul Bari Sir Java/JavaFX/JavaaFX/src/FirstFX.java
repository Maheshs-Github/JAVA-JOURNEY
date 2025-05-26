import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.control.Alert.AlertType;
// import javafx.scene.control.TextArea;
// import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
// import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class FirstFX extends Application //As Application is a abstract class, we implemnt its abstract method start

{
    public static void main(String[] args) 
    {
        launch(args);
    }
    

 
    public void start(Stage stage) throws Exception 
    {
        // Button B1=new Button("Click Here"); //It's children
        // //Let's try to add some more component
        // TextField TF1=new TextField();
        // TextArea TA1=new TextArea();

        // FlowPane FW1=new FlowPane(); //it's parent
        // FW1.getChildren().add(B1); //Parent will contain all the children if there are more children) or single one too
        // FW1.getChildren().add(TF1);
        // FW1.getChildren().add(TA1);

        // Scene Sc=new Scene(FW1); //Scene will have the parent node or componenet

        //Let's about that can we create the another scene and add it to the stage
        //Yeah We can create multiple Scene but can't dispaly them all only one at a time
        // Button B2=new Button("Click Here"); 
        // TextField TF2=new TextField();

        // FlowPane FW2=new FlowPane();
        // FW2.getChildren().add(B2); 
        // FW2.getChildren().add(TF2);

        // Scene Sc2=new Scene(FW2);
        // stage.setScene(Sc2);
        // stage.setScene(Sc); //we are setting the scene on the Stage
        // stage.show();

        //So let's understand the Simple Hierarchy,
        //1stly, we take Button which is Children there can be more Children if we wish to add more
        //then we created the FlowPane which is a Parent, parent should have all the children so we added them
        //then we created the scene obj and assign the obj to it
        //then set scene on the stage , thats all there is to understand the hierrachy



        // Let's See about the properties of the Controls
        Button B1=new Button("Click _Here"); 
        B1.setTextFill(Color.RED); //to fill the text imside the Button
        B1.setMnemonicParsing(true);

        Tooltip TP1=new Tooltip("This is tool tip text");
        B1.setTooltip(TP1); //when we hover it will show that text 

        B1.setStyle("-fx-border-color:yellow;-fx-background-color:cyan;"); //to set the styles like bootstrap

        //to set action listener
        Alert A1=new Alert(AlertType.INFORMATION,"Button is Clicked");
        B1.setOnAction(e->A1.show());

        FlowPane FW1=new FlowPane(); 
        FW1.getChildren().add(B1);

        Scene Sc=new Scene(FW1,400,400); 

        stage.setScene(Sc); 
        stage.show();



    }
    // start method is starting point of the JavaFX Application, which already the Stage paramater, we need Stage to there 1st to pyt everything there

    //NOTE: You can create as many scenes as you like, but only one can be displayed on a stage at any given time.
    
}