package AdapterPattern.PaymentGatewayAPIs;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class PayPalAPI {
    private Integer bankBalance=500;

    public void makePayment(Integer amount){
        System.out.println("Paypal : payment done of Rs : "+amount);
        bankBalance-=amount;
    }
    public Integer getBalance(){
        System.out.println("Balance checking using Razor Pay");
       return bankBalance;
    }
}
