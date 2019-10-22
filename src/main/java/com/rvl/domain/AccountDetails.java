package com.rvl.domain;

import java.util.List;

public class AccountDetails {

    private String accountID;
    private String accountNumber;
    private String sortCode;
    private int balanceAmount;
    private List<BeneficiaryDetails> beneficiaryDetailsList;

    public AccountDetails() {
    }

    public AccountDetails(String accountID, String sortCode, int balanceAmount,List<BeneficiaryDetails>beneficiaryDetailsList) {
        this.accountID = accountID;
        this.sortCode = sortCode;
        this.balanceAmount = balanceAmount;
        this.beneficiaryDetailsList=beneficiaryDetailsList;
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


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(int balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public List<BeneficiaryDetails> getBeneficiaryDetailsList() {
        return beneficiaryDetailsList;
    }

    public void setBeneficiaryDetailsList(List<BeneficiaryDetails> beneficiaryDetailsList) {
        this.beneficiaryDetailsList = beneficiaryDetailsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountDetails that = (AccountDetails) o;

        if (balanceAmount != that.balanceAmount) return false;
        if (accountID != null ? !accountID.equals(that.accountID) : that.accountID != null) return false;
        if (accountNumber != null ? !accountNumber.equals(that.accountNumber) : that.accountNumber != null)
            return false;
        if (sortCode != null ? !sortCode.equals(that.sortCode) : that.sortCode != null) return false;
        return beneficiaryDetailsList != null ? beneficiaryDetailsList.equals(that.beneficiaryDetailsList) : that.beneficiaryDetailsList == null;
    }

    @Override
    public int hashCode() {
        int result = accountID != null ? accountID.hashCode() : 0;
        result = 31 * result + (accountNumber != null ? accountNumber.hashCode() : 0);
        result = 31 * result + (sortCode != null ? sortCode.hashCode() : 0);
        result = 31 * result + balanceAmount;
        result = 31 * result + (beneficiaryDetailsList != null ? beneficiaryDetailsList.hashCode() : 0);
        return result;
    }
}
