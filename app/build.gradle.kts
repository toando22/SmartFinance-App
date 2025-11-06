plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.smartfinanceapp"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.smartfinanceapp"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("androidx.sqlite:sqlite:2.4.0")
    implementation("at.favre.lib:bcrypt:0.10.2")
    implementation("com.github.yukuku:ambilwarna:2.0.1")


}