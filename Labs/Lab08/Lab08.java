package Labs.Lab08;


import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        String Qus = "Variables that are shared by every instance of a class are: ";
        String a = "public variables";
        String b = "private variables";
        String c = "instance variables";
        String d = "class variables";
        String CorrectAns = "d";

        Question ques1 = new MCQuestion(Qus, a, b, c, d, CorrectAns);
        System.out.println(ques1.toString());
    }
}

class Question{
    private String text;

    Question(String text){
        this.text= text;

    }
    
    public String toString(){
        return this.text;
    }
}
class MCQuestion extends Question{
    String Choice1, Choice2, Choice3,Choice4,Answer;


    MCQuestion(String text, String choice1, String Choice2, String Choice3, String Choice4, String Answer){
        super(text);
        this.Choice1 = choice1;
        this.Choice2 = Choice2;
        this.Choice3 = Choice3;
        this.Choice4 = Choice4;
        this.Answer = Answer;
    }
    @Override
    public String toString() {
        return super.toString()+ "\n"
        + "a. " + Choice1 + "\n"
        + "b. " + Choice2 + "\n"
        + "c. " + Choice3 + "\n"
        + "d. " + Choice4 + "\n"
        + " The answer is: " + Answer;

    }
}


