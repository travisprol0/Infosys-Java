class Bill{
    private static int counter;
    private String billId;
    private String paymentMode;
    
    static {
        counter = 9000;
    }
    
    public Bill(String paymentMode){
        this.paymentMode = paymentMode;
    }
    
    public String getBillId(){
        billId = "B" + ++Bill.counter;
        return billId;
    }
    
    public void setBillId(String billId){
        this.billId = billId;
    }
    
    public String getPaymentMode(){
        return paymentMode;
    }
    
    public void setPaymentMode(String pyamentMode){
        this.paymentMode = paymentMode;
    }
    
    public static int getCounter(){
        return counter;
    }

}

class Tester {
    public static void main(String[] args) {

        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");
        
        //Create more objects and add them to the bills array for testing your code
              
        Bill[] bills = { bill1, bill2 };
              
        for (Bill bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
       }
    }
}

