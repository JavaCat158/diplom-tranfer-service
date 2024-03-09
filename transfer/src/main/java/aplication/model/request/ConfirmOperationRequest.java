package aplication.model.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ConfirmOperationRequest {
    @NotNull
    private String operationId;
    @NotNull
    private String code;
}