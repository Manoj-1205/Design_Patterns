package FacadePattern;

public class OrderProcessor {
    private static InventoryService inventoryService=new InventoryService();
    private static PaymentService paymentService=new PaymentService();
    private static ShippmentService shippmentService=new ShippmentService();
    void process(){
        inventoryService.checkInventory();
        paymentService.pay();
        shippmentService.ship();

    }
}
