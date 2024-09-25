package com.promad.test.processo.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private Instant timesatamp;
	private Integer status;
	private String error;
	private String message;
	private String Path;
	
	public StandardError() {
		
	}

	public StandardError(Instant timesatamp, Integer status, String error, String message, String path) {
		super();
		this.timesatamp = timesatamp;
		this.status = status;
		this.error = error;
		this.message = message;
		Path = path;
	}

	public Instant getTimesatamp() {
		return timesatamp;
	}

	public void setTimesatamp(Instant timesatamp) {
		this.timesatamp = timesatamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return Path;
	}

	public void setPath(String path) {
		Path = path;
	}

	
}
