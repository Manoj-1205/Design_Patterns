package AdapterPattern;

public class Main {
    public static void main(String[] args) {
    Adapter adapter = new RazorPayAdapter();
    adapter.pay(100);
    int amount = adapter.getBankBalance();
        System.out.println("Amount "+ amount);
    }
}
