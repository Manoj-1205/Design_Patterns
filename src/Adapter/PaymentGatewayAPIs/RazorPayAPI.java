package Adapter.PaymentGatewayAPIs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class RazorPayAPI {
    private Integer bankBalance = 500;
    public void sendMoney(Integer amount){
        System.out.println("RazorPay money sent Rs : "+amount);
        bankBalance-=amount;
    }

    public Integer viewBalance(){
        System.out.println("Balance checking using Razor Pay");
        return bankBalance;
    }
}
