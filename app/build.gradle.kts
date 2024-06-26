plugins {
    alias(libs.plugins.common.android.application.compose)
    alias(libs.plugins.common.android.application)
    alias(libs.plugins.common.android.hilt)
}

android {
    namespace = "uz.megasoft.mymulti_module"

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    testImplementation(libs.junit)
    androidTestImplementation(libs.test.ext.junit)
    androidTestImplementation(libs.espresso.core)

}