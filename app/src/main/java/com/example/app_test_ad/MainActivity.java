package com.example.app_test_ad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.ad_mock_lib.AdData;
import com.example.ad_mock_lib.BannerAdView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create banner
        String packageId = getPackageName(); // Or your specific package ID
        BannerAdView bannerAdView = new BannerAdView(this, packageId);

        // Add banner to layout (assuming you have a container)
        LinearLayout adContainer = findViewById(R.id.adContainer);
        adContainer.addView(bannerAdView);

        // Create test ad data
        AdData adData = new AdData(
                "test_ad_1",
                "Test Banner Ad",
                "This is a test banner advertisement",
                "https://i.ibb.co/hxCZ5m4F/naknik.jpg"
        );

        // Load the ad
        bannerAdView.loadAd(adData);
    }

}