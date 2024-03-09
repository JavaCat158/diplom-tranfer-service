package web;

import aplication.model.Violation;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

    @AllArgsConstructor
    @Getter
    class ValidationErrorResponse {
        private final List<Violation> violations;
    }

