package com.corona.exceptions;

public class CoronaErrorResponse {

	int status;
	String message;
	long timestamp;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "CoronaErrorResponse [status=" + status + ", message=" + message + ", timestamp=" + timestamp + "]";
	}

}
