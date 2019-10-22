package resources;

import com.rvl.domain.BeneficiaryDetails;
import com.rvl.domain.RequestBodyResolver;
import com.rvl.domain.PaymentReferanceDetails;
import com.rvl.resources.PaymentTransferResource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.skyscreamer.jsonassert.JSONAssert;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class PaymentTransferResourceTest {


    RequestBodyResolver resolver = mock(RequestBodyResolver.class);

    @InjectMocks
    PaymentTransferResource paymentTransferResource;

    @Mock
    PaymentReferanceDetails paymentReferanceDetails;

    @Mock
    BeneficiaryDetails beneficiaryDetails;

    @Before
    public void init() {

    }

    @Test
    public void testTransferAmountNewPayee() throws Exception {
        // given
        String request = "{\"beneficiaryId\":\"1234\",\"accountID\":\"5678\",\"sortCode\":\"1111\",\"amount\":100,\"isNewPayee\":true}";

        // when
        String outPut = paymentTransferResource.transferAmountPayee(request);
        Assert.assertNotNull(outPut);

        JSONAssert.assertEquals("{amount:100}",outPut,false);

    }

    @Test
    public void testTransferAmountExistingPayee() throws Exception {
        // given
        BeneficiaryDetails beneficiaryDetails = new BeneficiaryDetails("723355", "400377", new BigDecimal(500), false, "982322");
        String request = "{\"beneficiaryId\":\"1234\",\"accountID\":\"5678\",\"sortCode\":\"1111\",\"amount\":50,\"isNewPayee\":false}";

        // when
        String outPut = paymentTransferResource.transferAmountPayee(request);
        Assert.assertNotNull(outPut);
        JSONAssert.assertEquals("{amount:50}",outPut,false);
    }

}
