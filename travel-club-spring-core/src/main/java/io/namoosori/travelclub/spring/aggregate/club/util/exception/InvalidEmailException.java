package io.namoosori.travelclub.spring.aggregate.club.util.exception;

public class InvalidEmailException extends RuntimeException {
	//
	private static final long serialVersionUID = -8812955226330753784L;

	public InvalidEmailException(String message) {
		super(message);
	}
}