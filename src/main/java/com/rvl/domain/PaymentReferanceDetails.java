package com.rvl.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class PaymentReferanceDetails {
    private String paymentRef;
    private Timestamp transferDate;
    private BigDecimal amount;

    public PaymentReferanceDetails() {
    }

    public PaymentReferanceDetails(String paymentRef, BigDecimal amount, Timestamp transferDate) {
        this.paymentRef = paymentRef;
        this.amount = amount;
        this.transferDate = transferDate;
    }

    public String getPaymentRef() {
        return paymentRef;
    }

    public void setPaymentRef(String paymentRef) {
        this.paymentRef = paymentRef;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Timestamp getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Timestamp transferDate) {
        this.transferDate = transferDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaymentReferanceDetails that = (PaymentReferanceDetails) o;

        if (amount != that.amount) return false;
        if (paymentRef != null ? !paymentRef.equals(that.paymentRef) : that.paymentRef != null) return false;
        return transferDate != null ? transferDate.equals(that.transferDate) : that.transferDate == null;
    }

    @Override
    public int hashCode() {
        int result = paymentRef != null ? paymentRef.hashCode() : 0;
        result = 31 * result + (transferDate != null ? transferDate.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TransferDetails{" +
                "paymentRef='" + paymentRef + '\'' +
                ", transferDate=" + transferDate +
                ", amount=" + amount +
                '}';
    }
}
