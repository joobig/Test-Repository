package Controller;

import Service.ICalcService;
import View.CalcView;
import model.NumberDTO;

import java.util.*;

public class CalcController {
    ICalcService service;
    public CalcController(ICalcService service){
        this.service = service;
    }
    Scanner scan = new Scanner(System.in);
    public void applicationStart(){
        CalcView view = new CalcView();
        NumberDTO num = new NumberDTO();
        while (true){
            String oper = view.inputNum(num);
            switch (oper){
                case "+":
                    service.add(num);
                    view.result(num, oper);
                    break;
                case "-":
                    service.sub(num);
                    view.result(num, oper);
                    break;
                case "/":
                    service.div(num);
                    view.result(num, oper);
                    break;
                case "*":
                    service.mul(num);
                    view.result(num, oper);
                    break;
                case "%":
                    service.rem(num);
                    view.result(num, oper);
                    break;
                case "^":
                    service.pow(num);
                    view.result(num, oper);
                    break;
                case "E": case"e":
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("입력이 올바르지 않습니다.");
            }
        }
    }
}
