package com.rvl.resources;

import com.rvl.domain.BeneficiaryDetails;
import com.rvl.domain.PaymentReferanceDetails;
import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/payment")
public class PaymentTransferResource {

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/transfer")
    public String transferAmountPayee(String requestBody) throws Exception {
        //JSON string to Java Object
        ObjectMapper mapper = new ObjectMapper();
        BeneficiaryDetails beneficiaryDetails = mapper.readValue(requestBody, BeneficiaryDetails.class);
        Random randomNumber = new Random();
        PaymentReferanceDetails paymentReferanceDetails = new PaymentReferanceDetails();

        //Step1 valid if transfer for new payee or exsitng
        if (beneficiaryDetails.isNewPayee()) {
            paymentReferanceDetails.setAmount(beneficiaryDetails.getAmount());
            paymentReferanceDetails.setPaymentRef(randomNumber.nextInt() + "");
            paymentReferanceDetails.setTransferDate(new Timestamp(System.currentTimeMillis()));
        } else {
            paymentReferanceDetails.setAmount(beneficiaryDetails.getAmount());
            paymentReferanceDetails.setPaymentRef(randomNumber.nextInt() + "");
            paymentReferanceDetails.setTransferDate(new Timestamp(System.currentTimeMillis()));
        }

        return mapper.writeValueAsString(paymentReferanceDetails);
    }

    public BeneficiaryDetails getExistingBeneficiary(String beneficiryId) {
        return getAllBeneficiaryList().get(beneficiryId);
    }

    public Map<String, BeneficiaryDetails> getAllBeneficiaryList() {
        Map<String, BeneficiaryDetails> beneficiaryDetailsList = new HashMap<String, BeneficiaryDetails>();
        BeneficiaryDetails beneficiaryDetails1 = new BeneficiaryDetails("723355", "400377", new BigDecimal(500), false, "982322");
        BeneficiaryDetails beneficiaryDetails2 = new BeneficiaryDetails("723355", "400377", new BigDecimal(500), false, "997558");
        return beneficiaryDetailsList;
    }

}
