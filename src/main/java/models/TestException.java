package models;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author: Nick Humrich
 * @date: 6/19/14
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class TestException extends RuntimeException {

	public TestException(String s) {
		super(s);
	}
}
