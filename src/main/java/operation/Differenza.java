package operation;

public class Differenza extends Operation{

    public Differenza(){
        super();
        System.out.println("[JAVA PRINT] Differenza child class done;");
    }

    @Override
    public double executeOperation(double x, double  y) {
        x = this.getFirstNumber();
        y = this.getSecondNumber();
        return x - y ;
    }
}
