package Service;

import model.NumberDTO;
import Service.*;

public interface ICalcService{
    public double add(NumberDTO num);
    public double sub(NumberDTO num);
    public double div(NumberDTO num);
    public double mul(NumberDTO num);
    public double rem(NumberDTO num);
    public double pow(NumberDTO num);
}
