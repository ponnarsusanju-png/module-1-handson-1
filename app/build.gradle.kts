plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.module1handson1"

    compileSdk {
        version = release(37) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.example.module1handson1"

        minSdk = 24
        targetSdk = 36

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner =
            "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    // Android
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)

    // Navigation
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    // Material Design
    implementation(libs.material)

    // Lifecycle
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.9.2")

    // Retrofit - for future AI API connection
    implementation("com.squareup.retrofit2:retrofit:3.0.0")

    // Gson JSON converter
    implementation("com.squareup.retrofit2:converter-gson:3.0.0")

    // OkHttp logging
    implementation("com.squareup.okhttp3:logging-interceptor:5.1.0")

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}