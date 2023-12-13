import Controller.CalcController;
import Service.CalcServiceBiz;
import Service.ICalcService;

public class Java2CalcMain {
    public static void main(String[] args) {
        ICalcService service = new CalcServiceBiz();
        CalcController controller = new CalcController(service);
        controller.applicationStart();
    }
}
