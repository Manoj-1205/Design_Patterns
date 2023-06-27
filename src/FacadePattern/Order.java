package FacadePattern;

public class Order {

    public static void main(String[] args) {
        OrderProcessor orderProcessor=new OrderProcessor();
        orderProcessor.process();
    }
}
