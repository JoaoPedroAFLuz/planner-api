package br.com.joaopedroafluz.timely.auth;

import br.com.joaopedroafluz.timely.exceptions.InvalidRequestException;

public class InvalidLoginRequestException extends InvalidRequestException {

    public InvalidLoginRequestException(String message) {
        super(message);
    }

}
