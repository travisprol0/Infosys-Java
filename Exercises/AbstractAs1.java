abstract class Payment{
    private int customerId;
    protected String paymentId;
    protected double serviceTaxPercentage;
    
    public Payment(int customerId){
        this.customerId = customerId;
    }
    
    public int getCustomerId(){
        return customerId;
    }
    
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }
    
    public String getPaymentId(){
        return paymentId;
    }
    
    public void setPaymentId(String paymentId){
        this.paymentId = paymentId;
    }
    
    public double getServiceTaxPercentage(){
        return serviceTaxPercentage;
    }
    
    public void setServiceTaxPercentage(double serviceTaxPercentage){
        this.serviceTaxPercentage = serviceTaxPercentage;
    }
    
    public abstract double payBill(double amount);
}

class DebitCardPayment extends Payment{
    private static int counter;
    private double discountPercentage;
    
    static {
        counter = 1000;
    }
    
    public DebitCardPayment(int customerId){
        super(customerId);
        String paymentId = "D" + counter++;
        super.setPaymentId(paymentId);
    }
    
    public static int getCounter(){
        return counter;
    }
    
    public static void setCounter(int counter){
        DebitCardPayment.counter = counter;
    }
    
    public double getDiscountPercentage(){
        return discountPercentage;
    }
    
    public void setDiscountPercentage(double discountPercentage){
        this.discountPercentage = discountPercentage;
    }
    
    public double payBill(double amount){
        if(amount<=500){
            super.setServiceTaxPercentage(1.03);
            setDiscountPercentage(.99);
        }
        if(amount <=1000){
            super.setServiceTaxPercentage(1.05);
            setDiscountPercentage(.98);
        }else if(amount > 1000){
            super.setServiceTaxPercentage(1.06);
            setDiscountPercentage(.97);
        }
        return amount * super.getServiceTaxPercentage() * getDiscountPercentage();
    }
}

class CreditCardPayment{
    //Implement your code here
}

class Tester{
    public static void main(String args[]){
        DebitCardPayment debitCardPayment = new DebitCardPayment(101);
        double billAmount=Math.round(debitCardPayment.payBill(500)*100)/100.0;
		System.out.println("Customer Id: " + debitCardPayment.getCustomerId());
		System.out.println("Payment Id: " + debitCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + debitCardPayment.getServiceTaxPercentage());
		System.out.println("Discount percentage: " + debitCardPayment.getDiscountPercentage());
		System.out.println("Total bill amount: " + billAmount);
		
		CreditCardPayment creditCardPayment = new CreditCardPayment(102);
        billAmount=Math.round(creditCardPayment.payBill(1000)*100)/100.0;
		System.out.println("Customer Id: " + creditCardPayment.getCustomerId());
		System.out.println("Payment Id: " + creditCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + creditCardPayment.getServiceTaxPercentage());
		System.out.println("Total bill amount: " + billAmount);
    }
}