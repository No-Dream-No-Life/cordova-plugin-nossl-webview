package org.apache.cordova.nossl.webview;

import android.content.Context;
import android.util.AttributeSet;

import org.apache.cordova.engine.SystemWebView;

public class NoSSLSystemWebView extends SystemWebView {

    public NoSSLSystemWebView(Context context) {
        super(context);
    }

    public NoSSLSystemWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
