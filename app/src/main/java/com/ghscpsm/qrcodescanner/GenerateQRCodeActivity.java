package com.ghscpsm.qrcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.textfield.TextInputEditText;

public class GenerateQRCodeActivity extends AppCompatActivity {

    private TextView qrCodeTV;
    private ImageView qrCodeIV;
    private TextInputEditText dataEdt;
    private Button generateQRBtn;
    private QRGEncoder qrgEncoder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_qrcode);
        qrCodeTV = findViewById(R.id.idTVGenerateQR);
        qrCodeIV = findViewById(R.id.idIVQRCode);
        generateQRBtn = findViewById(R.id.idBtnGenerateQR);

        generateQRBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = dataEdt.getText().toString();
                if(data.isEmpty()) {
                    Toast.makeText(GenerateQRCodeActivity.this, "Please enter some data to generate QR Code...", Toast.LENGTH_LONG).show();
                } else {
                    WindowManager manager = (WindowManager) getSystemService(WINDOW_SERVICE);
                    Display display = manager.getDefaultDisplay();
                    Point point = new Point();
                    display.getSize(point);
                    int width = point.x;
                    int height = point.y;
                    int dimen = width<height ? width:height;
                    dimen = dimen * 3/4;
                }
            }
        });
    }
}