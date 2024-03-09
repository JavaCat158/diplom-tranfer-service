package aplication.controller;

import aplication.model.request.ConfirmOperationRequest;
import aplication.model.request.TransferRequest;
import aplication.model.response.ConfirmOperationResponse;
import aplication.model.response.TransferResponse;
import aplication.service.MoneyTransferService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin
public class Application {
    private final MoneyTransferService moneyTransferService;

    @PostMapping("/transfer")
    public TransferResponse postTransfer(@RequestBody TransferRequest transferRequest) {
        return moneyTransferService.transfer(transferRequest);
    }

    @PostMapping("/confirmOperation")
    public ConfirmOperationResponse postConfirmOperation(@RequestBody ConfirmOperationRequest confirmOperationRequest) {
        return moneyTransferService.confirmOperation(confirmOperationRequest);
    }
}

