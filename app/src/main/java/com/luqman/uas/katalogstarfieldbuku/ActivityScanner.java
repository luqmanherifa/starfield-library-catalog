package com.luqman.uas.katalogstarfieldbuku;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.Result;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class ActivityScanner extends AppCompatActivity implements ZXingScannerView.ResultHandler {
    ZXingScannerView ScannerView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScannerView = new ZXingScannerView(this);
        setContentView(ScannerView);
    }

    public void handleResult(Result result){
        MenuScanner.resultTextView.setText(result.getText());
        onBackPressed();
    }

    protected void onPause(){
        super.onPause();
        ScannerView.stopCamera();
    }

    protected void onResume(){
        super.onResume();
        ScannerView.setResultHandler(this);
        ScannerView.startCamera();
    }
}
