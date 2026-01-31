package Advanced_Stubbing.Void_Methods;

public class Printer_Service{
    Printer printer;

    public Printer_Service(Printer printer) {
        this.printer = printer;
    }

    void do_job(String data){
        printer.print(data);
    }
}