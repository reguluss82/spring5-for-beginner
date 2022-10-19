package io.namoosori.travelclub.spring.aggregate.club.util.exception;

public class NoSuchMembershipException extends RuntimeException {
	//
	private static final long serialVersionUID = 5867172506387382920L;

	public NoSuchMembershipException(String message) {
		super(message); 
	}
}