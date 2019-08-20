package com.instagram.application.model;

public class Photo {

	////profileId-s.no : photoName
	private String fileName;
	private String extension;
	//meta-data
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
}
