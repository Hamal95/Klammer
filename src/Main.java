import java.io.File;
import java.util.Scanner;
import java.util.*; // importing the stack class

public class Main {
    public static void main(String[] args){
        try {
            //-------------------------------------------------------------
            //Create a String fileContent with the text to analyze
            File file = new File("C:\\Users\\deniz\\IdeaProjects\\Klammer\\MyTextFile3.txt");
            Scanner sc = new Scanner(file);

            String fileContent = "";
            boolean correct = true;
            Stack<Character> brackets = new Stack<>();

            while(sc.hasNextLine()) {
                fileContent = fileContent.concat(sc.nextLine() + "\n");
            }
            System.out.println("-------------------------------------------------------");
            System.out.println("Dieser Text wird analysiert:\n");
            System.out.println(fileContent);
            System.out.println("-------------------------------------------------------");



            // Checke jedes Zeichen einzeln und bewerte die Stack-Aktion
            for(int i = 0; i < fileContent.length(); i++) {
                char chr = fileContent.charAt(i);

                //System.out.println(chr);

                if (chr == '(')
                    brackets.push(chr);
                if (chr == '[')
                    brackets.push(chr);
                if (chr == '{')
                    brackets.push(chr);
                if (chr == '<')
                    brackets.push(chr);
                //Closing brackets start here ------------------------------------------
                if (chr == ')')
                    if (brackets.pop() != '(') {
                        System.out.println("Der Quelltext ist nicht korrekt geklammert");
                        correct = false;
                        break;
                    }
                if (chr == ']')
                    if (brackets.pop() != '['){
                        System.out.println("Der Quelltext ist nicht korrekt geklammert");
                        correct = false;
                        break;
                    }
                if (chr == '}')
                    if (brackets.pop() != '{'){
                        System.out.println("Der Quelltext ist nicht korrekt geklammert");
                        correct = false;
                        break;
                    }
                if (chr == '>')
                    if (brackets.pop() != '<'){
                        System.out.println("Der Quelltext ist nicht korrekt geklammert");
                        correct = false;
                        break;
                    }
            }
            if(brackets.isEmpty() & correct)
                System.out.println("Der Quelltext ist korrekt geklammert");
        }
        catch(Exception ex){
            System.out.println("file read error!");
        }

    }
}