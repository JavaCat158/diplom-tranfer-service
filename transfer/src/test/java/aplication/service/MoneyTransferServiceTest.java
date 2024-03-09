package aplication.service;

import aplication.exception.InputDataException;
import aplication.model.request.ConfirmOperationRequest;
import aplication.model.response.ConfirmOperationResponse;
import aplication.model.response.TransferResponse;
import aplication.repository.MoneyTransferRepositoryTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static aplication.data.TestData.*;

class MoneyTransferServiceTest {


    private final MoneyTransferService service;

    public MoneyTransferServiceTest() {
        this.service = new MoneyTransferService(new MoneyTransferRepositoryTest());
    }


    @Test
    void transferShouldReturnWrongCardNumber() {
        InputDataException exc = Assertions.assertThrows(InputDataException.class, () -> {
            service.transfer(TRANSFER_REQUEST_WITH_NON_EXIST_CARD_NUMBER);
        });
        Assertions.assertEquals("Incorrect data entered: Wrong cardFrom number", exc.getMessage());
    }


    @Test
    void transferShouldReturnOperationIdAndCode() {
        TransferResponse expected = new TransferResponse("1", "0000");
        TransferResponse actual = service.transfer(TRANSFER_REQUEST_1);
        Assertions.assertEquals(expected, actual);
    }
}

