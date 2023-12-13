package View;
import Service.ICalcService;

import java.util.*;
import Controller.*;
import model.NumberDTO;

public class CalcView {
    Scanner scan = new Scanner(System.in);
    public String inputNum(NumberDTO num){
        System.out.println("-------------계산기 프로그램------------");
        System.out.println("(종료를 원하시면 연산자에 영문 E를 입력하세요)");
        System.out.print("첫 번째 수를 입력하세요 : ");
        double inputNum1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("------------------------------------");
        System.out.println("+ : 더하기");
        System.out.println("- : 빼기");
        System.out.println("/ : 나누기");
        System.out.println("* : 곱하기");
        System.out.println("% : 나머지");
        System.out.println("^ : 제곱근");
        System.out.print("연산자를 입력하세요 : ");
        String oper = scan.nextLine();
        System.out.println("------------------------------------");
        System.out.print("두 번째 수를 입력하세요 : ");
        double inputNum2 = scan.nextDouble();

        num.setnum1(inputNum1);
        num.setnum2(inputNum2);

        return oper;
    }

    public void result(NumberDTO num, String oper){
        System.out.println("------------------------------------");
        System.out.print(num.getnum1()+" "+oper+" "+num.getnum2()+" = ");
        switch (oper){
            case "+":case "-":case "/":case "*":case "%":case "^":
                System.out.println(num.getResult());
                break;
            case "E": case "e":
                System.out.println("프로그램을 종료합니다.");
                return;
            default:
                throw new IllegalStateException("Unexpected value: " + oper);
        }
    }

}
