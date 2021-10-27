package com.ranganayaki.accessibilityapp

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent

class MyAccessibilityService : AccessibilityService(){

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        Log.i("@ani", "Event Captured")
    }

    override fun onInterrupt() { }
}