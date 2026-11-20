package org.example.exception;

public class EmployeeDoesNotExistsException extends RuntimeException {
    public EmployeeDoesNotExistsException(String message) {
        super(message);
    }
}
