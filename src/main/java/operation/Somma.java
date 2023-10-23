package operation;

public class Somma extends Operation {

    public Somma(){
        super();
        System.out.println("[JAVA PRINT] Somma child class done;");
    }

    @Override
    public double executeOperation(double  x, double  y){
        x = this.getFirstNumber();
        y = this.getSecondNumber();
        return x + y;
    }
}
