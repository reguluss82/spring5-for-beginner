package io.namoosori.travelclub.spring.aggregate.club.util.exception;

public class ClubDuplicationException extends RuntimeException {
	//
	private static final long serialVersionUID = -4246979292397269539L;

	public ClubDuplicationException(String message) {
		super(message); 
	}
}