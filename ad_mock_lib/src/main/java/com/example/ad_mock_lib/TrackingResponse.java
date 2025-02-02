package com.example.ad_mock_lib;

// TrackingResponse.java
public class TrackingResponse {
    private boolean success;
    private String message;
    private String documentId;

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    // Add getters and setters
}
