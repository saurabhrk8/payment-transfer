package com.rvl.domain;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class BeneficiaryDetails {
    @JsonProperty("beneficiaryId")
    private String beneficiaryId;
    @JsonProperty("accountID")
    private String accountID;
    @JsonProperty("sortCode")
    private String sortCode;
    @JsonProperty("amount")
    private BigDecimal amount;
    @JsonProperty("isNewPayee")
    boolean isNewPayee = false;

    public BeneficiaryDetails() {
    }

    public BeneficiaryDetails(String accountID, String sortCode, BigDecimal amount, boolean isNewPayee, String beneficiaryId) {
        this.accountID = accountID;
        this.sortCode = sortCode;
        this.amount = amount;
        this.isNewPayee = isNewPayee;
        this.beneficiaryId = beneficiaryId;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public boolean isNewPayee() {
        return isNewPayee;
    }

    public void setNewPayee(boolean newPayee) {
        isNewPayee = newPayee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BeneficiaryDetails that = (BeneficiaryDetails) o;

        if (isNewPayee != that.isNewPayee) return false;
        if (beneficiaryId != null ? !beneficiaryId.equals(that.beneficiaryId) : that.beneficiaryId != null)
            return false;
        if (accountID != null ? !accountID.equals(that.accountID) : that.accountID != null) return false;
        if (sortCode != null ? !sortCode.equals(that.sortCode) : that.sortCode != null) return false;
        return amount != null ? amount.equals(that.amount) : that.amount == null;
    }

    @Override
    public int hashCode() {
        int result = beneficiaryId != null ? beneficiaryId.hashCode() : 0;
        result = 31 * result + (accountID != null ? accountID.hashCode() : 0);
        result = 31 * result + (sortCode != null ? sortCode.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (isNewPayee ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BeneficiaryDetails{" +
                "beneficiaryId='" + beneficiaryId + '\'' +
                ", accountID='" + accountID + '\'' +
                ", sortCode='" + sortCode + '\'' +
                ", amount=" + amount +
                ", isNewPayee=" + isNewPayee +
                '}';
    }
}
