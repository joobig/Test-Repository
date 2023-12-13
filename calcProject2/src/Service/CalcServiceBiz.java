package Service;

import model.NumberDTO;
import Service.*;


public class CalcServiceBiz implements ICalcService {
    @Override
    public double add(NumberDTO num){
        double result = num.getnum1() + num.getnum2();
        num.setResult(result);
        return result;
    }
    @Override
    public double sub(NumberDTO num){
        double result = num.getnum1() - num.getnum2();
        num.setResult(result);
        return result;
    }
    @Override
    public double div(NumberDTO num){
        double result = num.getnum1() / num.getnum2();
        num.setResult(result);
        return result;
    }
    @Override
    public double mul(NumberDTO num){
        double result = num.getnum1() * num.getnum2();
        num.setResult(result);
        return result;
    }
    @Override
    public double rem(NumberDTO num){
        double result = num.getnum1() % num.getnum2();
        num.setResult(result);
        return result;
    }
    @Override
    public double pow(NumberDTO num){
        double result = Math.pow(num.getnum1(), num.getnum2());
        num.setResult(result);
        return result;
    }
}
