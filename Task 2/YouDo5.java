
class Printer{
    public void printData(String text){
        System.out.println("Printing text: " + text);
    }

    public void printData(int number){
        System.out.println("Printing number: " + number);
    }
}


public class main5 {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        myPrinter.printData("Hello, World!");
        myPrinter.printData(42);
    }
}
