plugins {
	alias(libs.plugins.androidApplication)
	alias(libs.plugins.kotlinAndroid)
}

android {
	namespace = "me.flavienlefebvre.androidwidgetsamples"
	compileSdk = 33

	defaultConfig {
		applicationId = "me.flavienlefebvre.androidwidgetsamples"
		minSdk = 32
		targetSdk = 33
		versionCode = 1
		versionName = "1.0"
		vectorDrawables {
			useSupportLibrary = true
		}
	}

	buildTypes {
		release {
			isMinifyEnabled = false
			proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
		}
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
	kotlinOptions {
		jvmTarget = "1.8"
	}
	buildFeatures {
		compose = true
	}
	composeOptions {
		kotlinCompilerExtensionVersion = "1.4.3"
	}
	packaging {
		resources {
			excludes += "/META-INF/{AL2.0,LGPL2.1}"
		}
	}
}

dependencies {

	implementation(libs.core.ktx)
	implementation(libs.lifecycle.runtime.ktx)
	implementation(libs.activity.compose)
	implementation(platform(libs.compose.bom))
	implementation(libs.ui)
	implementation(libs.ui.graphics)
	implementation(libs.ui.tooling.preview)
	implementation(libs.material3)
	implementation(libs.material)
	debugImplementation(libs.ui.tooling)
}