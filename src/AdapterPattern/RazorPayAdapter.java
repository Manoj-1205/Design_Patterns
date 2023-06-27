package AdapterPattern;

import AdapterPattern.PaymentGatewayAPIs.RazorPayAPI;

public class RazorPayAdapter implements Adapter {

    private final RazorPayAPI razorPayAPI = new RazorPayAPI();

    @Override
    public void pay(Integer amount) {
        razorPayAPI.sendMoney(amount);
    }

    @Override
    public Integer getBankBalance() {
        return razorPayAPI.viewBalance();
    }

    public void deposit(int amount) {
        razorPayAPI.setBankBalance(amount);
    }
}
