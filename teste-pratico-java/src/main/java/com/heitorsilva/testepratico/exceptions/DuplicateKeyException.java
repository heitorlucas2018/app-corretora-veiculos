package com.heitorsilva.testepratico.exceptions;

import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = EXPECTATION_FAILED, value = EXPECTATION_FAILED)
@ResponseBody
public class DuplicateKeyException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DuplicateKeyException() {
		// TODO Auto-generated constructor stub
	}

	public DuplicateKeyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DuplicateKeyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public DuplicateKeyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DuplicateKeyException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
