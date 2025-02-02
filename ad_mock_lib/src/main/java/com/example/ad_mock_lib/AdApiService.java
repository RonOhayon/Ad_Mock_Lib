package com.example.ad_mock_lib;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AdApiService {
    @POST("api/adtrack/view")
    Call<TrackingResponse> trackAdView(@Body TrackingData trackingData);

    @POST("api/adtrack/click")
    Call<TrackingResponse> trackAdClick(@Body TrackingData trackingData);
}

