package Adapter;

import Adapter.PaymentGatewayAPIs.PayPalAPI;

public class PayPalAdapter implements Adapter{
    private final PayPalAPI payPalAPI = new PayPalAPI();

    @Override
    public void pay(Integer amount) {
        System.out.println("Executed Paypal");
        payPalAPI.makePayment(amount);
    }

    @Override
    public Integer getBankBalance() {
        return payPalAPI.getBankBalance();
    }

    public void deposit(int amount){
        payPalAPI.setBankBalance(1000);
    }
}
