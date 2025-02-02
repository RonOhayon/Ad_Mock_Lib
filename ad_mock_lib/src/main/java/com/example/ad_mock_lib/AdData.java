package com.example.ad_mock_lib;

public class AdData {
    private String id;

    private String imageUrl;

    public String getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public AdData(String id, String title, String description, String imageUrl) {
        this.id = id;
        this.imageUrl = imageUrl;
    }
}