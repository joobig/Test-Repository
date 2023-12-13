package model;
import java.lang.*;

public class NumberDTO {

    private double num1;
    private double num2;
    private double result;
    public NumberDTO(){}
    public NumberDTO(double num1, double num2, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    public double getnum1() {
        return num1;
    }

    public double getnum2() {
        return num2;
    }

    public double getResult() {
        return result;
    }

    public void setnum1(double num1) {
        this.num1 = num1;
    }

    public void setnum2(double num2) {
        this.num2 = num2;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "NumberDTO{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", result=" + result +
                '}';
    }
}
