abstract class Payment {
    private int customerId;
    protected String paymentId;
    protected double serviceTaxPercentage;

    public Payment(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getServiceTaxPercentage() {
        return serviceTaxPercentage;
    }

    public void setServiceTaxPercentage(double serviceTaxPercentage) {
        this.serviceTaxPercentage = serviceTaxPercentage;
    }

    public abstract double payBill(double amount);
}

class DebitCardPayment extends Payment {
    private static int counter = 1000;
    private double discountPercentage;

    public DebitCardPayment(int customerId) {
        super(customerId);
        String paymentId = "D" + ++counter;
        super.setPaymentId(paymentId);
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        DebitCardPayment.counter = counter;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double payBill(double amount) {
        if (amount <= 500) {
            super.setServiceTaxPercentage(2.5);
            setDiscountPercentage(1);
        }
        else if (amount <= 1000 && amount > 500) {
            super.setServiceTaxPercentage(4);
            setDiscountPercentage(2);
        } else if (amount > 1000) {
            super.setServiceTaxPercentage(5);
            setDiscountPercentage(3);
        }
        return amount + (amount * (super.getServiceTaxPercentage()*.01)) - (amount * getDiscountPercentage() * 0.01);
    }
}

class CreditCardPayment extends Payment {
    private static int counter = 1000;

    public CreditCardPayment(int customerId) {
        super(customerId);
        String paymentId = "C" + ++counter;
        super.setPaymentId(paymentId);
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        CreditCardPayment.counter = counter;
    }

    public double payBill(double amount) {
        if (amount <= 500) {
            super.setServiceTaxPercentage(3);
        } else if (amount <= 1000 && amount > 500) {
            super.setServiceTaxPercentage(5);
        } else if (amount > 1000) {
            super.setServiceTaxPercentage(6);
        }
        return amount + (amount * (super.getServiceTaxPercentage()*0.01));
    }

}