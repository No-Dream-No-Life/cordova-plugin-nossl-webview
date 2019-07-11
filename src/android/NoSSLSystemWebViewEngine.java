package org.apache.cordova.nossl.webview;

import android.content.Context;

import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.engine.SystemWebView;
import org.apache.cordova.engine.SystemWebViewEngine;

public class NoSSLSystemWebViewEngine extends SystemWebViewEngine {

    public NoSSLSystemWebViewEngine(Context context, CordovaPreferences preferences) {
        super(context, preferences);
    }

    public NoSSLSystemWebViewEngine(SystemWebView webView) {
        super(webView);
    }

    public NoSSLSystemWebViewEngine(SystemWebView webView, CordovaPreferences preferences) {
        super(webView, preferences);
    }
}
