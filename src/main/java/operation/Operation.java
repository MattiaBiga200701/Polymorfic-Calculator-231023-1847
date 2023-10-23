package operation;

public abstract class Operation {
    protected double num1;
    protected double  num2;
    protected String op;

    //Costruttore
    public Operation(){
        System.out.println("[JAVA PRINT] Abstract Operation construction done;");
    }

    public double getFirstNumber(){
        return this.num1;
    }

    public double getSecondNumber(){
        return this.num2;
    }

    public String getOperator(){
        return this.op;
    }

    public void setOperation(double x, double y, String oper){
        this.num1 = x;
        this.num2 = y;
        this.op = oper;
    }
    public abstract double executeOperation(double x, double y);

}
