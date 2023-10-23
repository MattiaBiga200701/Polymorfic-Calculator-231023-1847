package operation;

public class Frazione extends Operation {

    public Frazione(){
        super();
        System.out.println("[JAVA PRINT] Frazione child class done;");
    }

    @Override
    public double executeOperation(double x, double  y){

        x = this.getFirstNumber();
        y = this.getSecondNumber();
        if(y != 0) {
            return x / y;
        }
        else{
            return 0.0F; //valore di ritorno formale
        }

    }
}
