package org.apache.cordova.nossl.webview;

import android.content.Context;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.NativeToJsMessageQueue;
import org.apache.cordova.PluginManager;
import org.apache.cordova.engine.SystemWebViewEngine;

public class NoSSLSystemWebViewEngine extends SystemWebViewEngine {

    public NoSSLSystemWebViewEngine(Context context, CordovaPreferences preferences) {
        super(new NoSSLSystemWebView(context), preferences);
    }

    @Override
    public void init(CordovaWebView parentWebView, CordovaInterface cordova, Client client, CordovaResourceApi resourceApi, PluginManager pluginManager, NativeToJsMessageQueue nativeToJsMessageQueue) {
        webView.setWebViewClient(new NoSSLSystemWebViewClient(this));
        super.init(parentWebView, cordova, client, resourceApi, pluginManager, nativeToJsMessageQueue);
    }
}
