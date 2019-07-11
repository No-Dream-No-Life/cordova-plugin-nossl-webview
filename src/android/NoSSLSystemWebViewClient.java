package org.apache.cordova.nossl.webview;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

import org.apache.cordova.engine.SystemWebViewClient;
import org.apache.cordova.engine.SystemWebViewEngine;

public class NoSSLSystemWebViewClient extends SystemWebViewClient {

    public NoSSLSystemWebViewClient(SystemWebViewEngine parentEngine) {
        super(parentEngine);
    }

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        //忽略https证书
        handler.proceed();
    }
}
