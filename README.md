# 📢 ad\_mock\_lib

A simple and efficient Android library for displaying mock ads. This library provides a lightweight ad system that can be used as an alternative to traditional ad networks, making it ideal for testing and development purposes.

## 🚀 Features

- 🖼️ Display mock ads using **Glide** for image loading.
- 🛠️ Easy integration into any Android project.
- 📡 Supports **Retrofit** for potential API-based ad fetching.
- 🔧 Customizable ad UI with buttons to **navigate** or **close** the ad.
- 🔥 Minimal dependencies for better performance.

---

## 📦 Installation

### **Using JitPack**

Add JitPack to your root `build.gradle`:

```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

Then, add the dependency to your app-level `build.gradle`:

```gradle
dependencies {
    implementation 'com.github.RonOhayon:ad_mock_lib:1.0.4'
}
```

---

## 🛠️ Usage

### **1️⃣ Create and Load a Banner Ad**

```java
// Create banner
String packageId = getPackageName();  // Or your specific package ID
BannerAdView bannerAdView = new BannerAdView(this, packageId);

// Add banner to layout (assuming you have a container)
LinearLayout adContainer = findViewById(R.id.adContainer);
adContainer.addView(bannerAdView);

// Create test ad data
AdData adData = new AdData(
    "test_ad_1",
    "Test Banner Ad",
    "This is a test banner advertisement",
    //add your image
    "https://i.ibb.co/hxCZ5m4/naknik.jpg"
);

// Load the ad
bannerAdView.loadAd(adData);
```

### **2️⃣ Customize the UI**

You can customize the ad appearance using XML or dynamically in Java/Kotlin:

```xml
<com.example.ad_mock_lib.MockAdView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:adImageUrl="https://example.com/ad.jpg"
    app:adCloseButtonVisible="true" />
```

---

## 🔧 Configuration

| Property               | Type      | Description                                   |
| ---------------------- | --------- | --------------------------------------------- |
| `setImageUrl(url)`     | `String`  | Loads an ad image from a URL. Uses **Glide**. |
| `setAdClickListener()` | `Void`    | Callback for ad clicks.                       |
| `setCloseButton()`     | `Boolean` | Show/hide the close button. Default: `true`.  |

---

## 🛠️ Dependencies

- **Glide** – Efficient image loading
- **Retrofit** – Potential network ad fetching
- **AndroidX** – Modern UI components

---

## 📜 License

This project is licensed under the **MIT License** – see the [LICENSE](LICENSE) file for details.

---

## 🤝 Contributing

Feel free to submit **issues** or **pull requests** to improve the library!

📩 Contact: [GitHub Issues](https://github.com/RonOhayon/ad_mock_lib/issues)

---

## ⭐ Support

If you like this project, please **star** ⭐ the repository on GitHub!

