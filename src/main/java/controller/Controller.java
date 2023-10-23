package controller;

import graphic.GraphicInterface;
import operation.*;

public class Controller {

    private Operation a;
    private GraphicInterface anInterface;

    private double result;

    public Controller() {
        anInterface = new GraphicInterface();
        System.out.println("[JAVA PRINT] Controller class done;");
    }

    public void initializer() {

        double value1;
        double value2;
        String op;
        boolean controlVar = true;
        anInterface.welcome();
        while (controlVar) {
            value1 = anInterface.scanNumber();
            op = anInterface.scanOperator();
            value2 = anInterface.scanNumber();
            if (op.equalsIgnoreCase("/")) {
                a = new Frazione();
            } else if (op.equalsIgnoreCase("*")) {
                a = new Prodotto();
            } else if (op.equalsIgnoreCase("+")) {
                a = new Somma();
            } else if (op.equalsIgnoreCase("-")) {
                a = new Differenza();
            }

            a.setOperation(value1, value2, op );
            result = a.executeOperation(a.getFirstNumber(), a.getSecondNumber());
            anInterface.printResult(result);
            controlVar = anInterface.isRestart();
        }
        anInterface.goodBye();


    }
}