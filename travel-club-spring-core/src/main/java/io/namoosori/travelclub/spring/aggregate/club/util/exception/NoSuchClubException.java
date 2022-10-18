package io.namoosori.travelclub.spring.aggregate.club.util.exception;

public class NoSuchClubException extends RuntimeException {
	//
	private static final long serialVersionUID = 5867172506387382920L;

	public NoSuchClubException(String message) {
		super(message); 
	}
}