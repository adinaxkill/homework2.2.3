package com.company;

public class LimitException extends Exception{

  private String message;
  private double rainingAmount;

    public double getRainingAmount() {
        return rainingAmount;
    }
    public void setRainingAmount (double rainingAmount) {
        this.rainingAmount=rainingAmount;
    }

    public LimitException(String message, double amount) {
       super(message);
        this.rainingAmount = rainingAmount;


    }
}
