package com.rbs.womenhomeworkout

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.google.android.gms.ads.*
import com.google.android.gms.ads.nativead.MediaView
import com.google.android.gms.ads.nativead.NativeAd
import com.google.android.gms.ads.nativead.NativeAdOptions
import com.google.android.gms.ads.nativead.NativeAdView
import com.rbs.womenhomeworkout.common.Constant


object ConstantAd {

    var adView: AdView? = null
    var adRequest: AdRequest? = null
    var TAG = "baseActivity"
    var sessionManager: SessionManager? = null

    fun setBannerAdd(adContainer: View , context: Context) {
        sessionManager = SessionManager(context)
        adView = AdView(context)
        adRequest = AdRequest.Builder().build()
        if (sessionManager!!.getBooleanValue(Constant.Adshow)) {
            adView!!.setAdSize(AdSize.BANNER)
            adView!!.adUnitId = sessionManager!!.getStringValue(Constant.bannerAdId)
            (adContainer as RelativeLayout).addView(adView)
            adView!!.loadAd(adRequest!!)
        }
    }


}
