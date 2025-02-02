package com.example.ad_mock_lib;

public class TrackingData {
    private String packageId;
    private String adId;
    private String deviceId;
    private long timestamp;

    public TrackingData(String packageId, String adId, String deviceId) {
        this.packageId = packageId;
        this.adId = adId;
        this.deviceId = deviceId;
        this.timestamp = System.currentTimeMillis();
    }

    public String getPackageId() {
        return packageId;
    }

    public String getAdId() {
        return adId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }
    // Add getters and setters
}
