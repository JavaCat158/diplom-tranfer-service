package aplication.repository;

import aplication.model.Card;
import aplication.model.request.TransferRequest;
import org.junit.jupiter.api.BeforeEach;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static aplication.data.TestData.*;

public class MoneyTransferRepositoryTest extends MoneyTransferRepository{
    private final Map<String, Card> testCardMap = new ConcurrentHashMap<>();

    @BeforeEach
    void setUp() {
        testCardMap.put(CARD_NUMBER_1, CARD_1);
        testCardMap.put(CARD_NUMBER_2, CARD_2);
    }

    @Override
    public TransferRequest removeTransfer(String operationId) {
        if (operationId.equals("1")) {
            return TRANSFER_REQUEST_1;
        }
        return null;
    }
    @Override
    public String removeCodes(String operationId) {
        if (operationId.equals("1")) {
            return "0000";
        }
        return null;
    }
}
