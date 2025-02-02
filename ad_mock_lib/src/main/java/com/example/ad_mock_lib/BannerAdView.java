package com.example.ad_mock_lib;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BannerAdView extends FrameLayout {
    private ImageView adImage;
    private AdApiService apiService;
    private String packageId;
    private AdData currentAd;

    public BannerAdView(Context context, String packageId) {  // Removed baseUrl parameter
        super(context);
        this.packageId = packageId;
        this.apiService = ApiClient.getClient(Constants.getBaseUrl()).create(AdApiService.class);
        initializeView();
    }

    private void initializeView() {
        inflate(getContext(), R.layout.banner_ad_layout, this);

        adImage = findViewById(R.id.adImage);

        setOnClickListener(v -> {
            if (currentAd != null) {
                trackAdClick(currentAd);
            }
        });
    }

    public void loadAd(AdData adData) {
        this.currentAd = adData;
        // Load image using Glide
        Glide.with(getContext())
                .load(adData.getImageUrl())
                .centerCrop()
                .into(adImage);

        // Track view
        trackAdView(adData);
    }

    private void trackAdView(AdData adData) {
        TrackingData trackingData = new TrackingData(
                packageId,
                adData.getId(),
                Settings.Secure.getString(getContext().getContentResolver(),
                        Settings.Secure.ANDROID_ID)
        );

        apiService.trackAdView(trackingData).enqueue(new Callback<TrackingResponse>() {
            @Override
            public void onResponse(Call<TrackingResponse> call, Response<TrackingResponse> response) {
                Log.d("BannerAd", "View tracked successfully");
            }

            @Override
            public void onFailure(Call<TrackingResponse> call, Throwable t) {
                Log.e("BannerAd", "Failed to track view", t);
            }
        });
    }

    private void trackAdClick(AdData adData) {
        TrackingData trackingData = new TrackingData(
                packageId,
                adData.getId(),
                Settings.Secure.getString(getContext().getContentResolver(),
                        Settings.Secure.ANDROID_ID)
        );

        apiService.trackAdClick(trackingData).enqueue(new Callback<TrackingResponse>() {
            @Override
            public void onResponse(Call<TrackingResponse> call, Response<TrackingResponse> response) {
                Log.d("BannerAd", "Click tracked successfully");
            }

            @Override
            public void onFailure(Call<TrackingResponse> call, Throwable t) {
                Log.e("BannerAd", "Failed to track click", t);
            }
        });
    }
}
