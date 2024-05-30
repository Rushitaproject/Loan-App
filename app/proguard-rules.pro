# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-keepattributes Signature
-keep class com.google.api.** { *; }
-keep class unified.vpn.** { *; }
-keepattributes Annotation
-keepclassmembers class * {
    @org.greenrobot.eventbus.Subscribe <methods>;
}
-keep enum org.greenrobot.eventbus.ThreadMode { *; }

# And if you use AsyncExecutor:
-keepclassmembers class * extends org.greenrobot.eventbus.util.ThrowableFailureEvent {
    <init>(java.lang.Throwable);
}
-keep class com.facebook.ads.* { *; }
# Keep filenames and line numbers for stack traces
-keepattributes SourceFile,LineNumberTable

# Keep JavascriptInterface for WebView bridge
-keepattributes JavascriptInterface

# Sometimes keepattributes is not enough to keep annotations
-keep class android.webkit.JavascriptInterface {
   *;
}

# Keep all classes in Unity Ads package
-keep class com.unity3d.ads.** {
   *;
}

# Keep all classes in Unity Services package
-keep class com.unity3d.services.** {
   *;
}
-dontwarn com.unity3d.services.**

-keep public class com.google.android.gms.ads.** {
    public *;
}

-keep public class com.google.ads.** {
    public *;
}

-keep class com.tapdaq.sdk.* { *; }
-keep class com.tapdaq.adapters. { *; }
-keep class com.tapdaq.unityplugin. { *; }
-keep class com.google.android.gms.ads.identifier.* { *; }
-keep class nl.bryanderidder.themedtogglebuttongroup.**{*;}
# ADMOST
-keepattributes Exceptions, InnerClasses
-dontwarn admost.sdk.**
-keep class admost.sdk.** {*;}
-dontwarn com.amr.unity.**
-keep class com.amr.unity.** {*;}
-dontwarn admost.adserver.**
-keep class com.adjust.sdk.** {*;}
-dontwarn com.adjust.sdk.**
-keep class com.appsflyer.** {*;}
-dontwarn com.appsflyer.**
-keep class admost.adserver.** { *; }
-dontwarn com.google.android.exoplayer2.**
-keep class com.google.android.exoplayer2.**{ *;}
-keep class android.support.v4.app.DialogFragment { *; }
-keep class android.support.v4.util.LruCache { *; }


# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #

# ADCOLONY
-dontwarn com.adcolony.**
-keep class com.adcolony.** { *; }
-keepclassmembers class * { @android.webkit.JavascriptInterface <methods>; }
-keepclassmembers class com.adcolony.sdk.ADCNative** { *; }

# ADGEM
-keep class com.adgem.** { *; }
-dontwarn com.adgem.**

# ADMOB / ADX / GOOGLE
-keep class com.android.vending.billing.**
-keep public class com.google.android.gms.ads.** { public *; }
-keep public class com.google.ads.** { public *; }
-keep class com.google.android.gms.** { *; }
-dontwarn com.google.android.gms.**
-keep public class com.google.android.gms.common.internal.safeparcel.SafeParcelable { public static final *** NULL; }
-keepnames class * implements android.os.Parcelable
-keepclassmembers class * implements android.os.Parcelable { public static final *** CREATOR; }
-keep @interface android.support.annotation.Keep
-keep @android.support.annotation.Keep class *
-keepclasseswithmembers class * { @android.support.annotation.Keep <fields>; }
-keepclasseswithmembers class * { @android.support.annotation.Keep <methods>; }
-keep @interface com.google.android.gms.common.annotation.KeepName
-keepnames @com.google.android.gms.common.annotation.KeepName class *
-keepclassmembernames class * { @com.google.android.gms.common.annotation.KeepName *; }
-keep @interface com.google.android.gms.common.util.DynamiteApi
-keep public @com.google.android.gms.common.util.DynamiteApi class * { public <fields>; public <methods>; }
-keep public @com.google.android.gms.common.util.DynamiteApi class * { *; }
-keep class com.google.android.apps.common.proguard.UsedBy*
-keep @com.google.android.apps.common.proguard.UsedBy* class *
-keepclassmembers class * { @com.google.android.apps.common.proguard.UsedBy* *; }
-dontwarn android.security.NetworkSecurityPolicy
-dontwarn android.app.Notification

#ADTIMING
-dontwarn com.aiming.mdt.**.*
-dontoptimize
-dontskipnonpubliclibraryclasses
-keepattributes *Annotation*
#adt
-keep class com.aiming.mdt.**{ *; }
-keepattributes *Annotation*,InnerClasses
-keepnames class * implements android.os.Parcelable {
public static final ** CREATOR;
}
#R
-keepclassmembers class **.R$* {
public static <fields>;
}

#AFA
-dontwarn com.admost.**
-keep class com.admost.** {*;}

# AMAZON
-dontwarn com.amazon.**
-keep class com.amazon.** { *; }
-dontwarn org.apache.http.**
-keepattributes *Annotation*

