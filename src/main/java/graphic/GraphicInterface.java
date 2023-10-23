package graphic;


import java.util.InputMismatchException;
import java.util.Scanner;

public class GraphicInterface {

    Scanner in;
    String rosso = "\u001B[31m";
    String reset = "\u001B[0m";

    public GraphicInterface() {
        in = new Scanner(System.in);
        System.out.println("[JAVA PRINT] GraphicInterface class done;");

    }

    public void welcome() {
        System.out.println("+--------------------------------------+");
        System.out.println("+|||| WELCOME TO BIGA CALCULATOR  |||||+");
        System.out.println("+--------------------------------------+");
    }

    public double  scanNumber() {
        boolean controlVar = true;
        double value = 0F;
        while (controlVar) {
            System.out.print("Inserisci numero qui: ");
            try {
                value = in.nextDouble();
                controlVar = false;
            } catch (InputMismatchException e) {
                System.out.println(rosso + "ERROR: " + reset + "non hai inserito un numero Riprova;");
                in.nextLine();
            }

        }
        return value;
    }

    public String scanOperator() {
        boolean controlVar = true;
        int counter = 0;
        String operator = null;
        String[] tokens = {"+", "/", "-", "*"};
        System.out.println("Inserisci operatore  tra le seguenti scelte (+, /, -, *)");
        while (controlVar) {
            operator = in.next();
            for (String token : tokens) {
                if (operator.equalsIgnoreCase(token)) {
                    counter++;
                }
            }
            if (counter > 0) {
                controlVar = false;
            } else {
                System.out.println(rosso + "ERROR:" + reset + "Non hai inserito un operatore adeguato tra i seguenti (+, /, -, *) riprova;");
                System.out.println("Inserisci operatore: ");
            }
        }
        return operator;

    }

    public boolean isRestart() {
        String answer;
        System.out.println("vuoi eseguire una nuova operazione ?");
        while (true) {
            answer = in.next();
            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("si")) {
                return  true;
            } else if (answer.equalsIgnoreCase("no")) {
                return false;

            } else {
                System.out.println(rosso + "ERROR:" + reset + "Risposta non conforme;");
                System.out.println("Rispondi si no;");
            }
        }
    }
    public void printResult(double result){
        System.out.println("\nRisultato: " + result);
    }

    public void goodBye(){
        System.out.println("GoodBye;");
    }
}
