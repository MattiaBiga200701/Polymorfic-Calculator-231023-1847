package operation;

public class Prodotto extends Operation {

    public Prodotto(){
        super();
        System.out.println("[JAVA PRINT] Prodotto child class done;");
    }

    @Override
    public double executeOperation(double x, double y) {
        x = this.getFirstNumber();
        y = this.getSecondNumber();
        double result;
        result = x * y;
        return result;

    }

}
