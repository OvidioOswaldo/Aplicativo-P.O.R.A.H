package com.ovidiooswaldo.projetoporah;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button1 = findViewById(R.id.instagram);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.instagram.com/blueguyinspace/"; // Substitua com o URL desejado
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        final String textToCopy = "----- .---- ----- ----- .---- ----- ----- ----- / ----- .---- .---- ----- ----- .---- ----- .---- / ----- .---- .---- ----- .---- .---- ----- ----- / ----- .---- .---- ----- .---- .---- .---- .---- / ----- .---- .---- ----- .---- ----- ----- .---- / ----- .---- .---- .---- ----- ----- .---- .---- / ----- .---- .---- ----- ----- ----- ----- .---- / ----- ----- .---- ----- .---- .---- ----- ----- / ----- ----- .---- ----- ----- ----- ----- ----- / ----- .---- .---- .---- ----- .---- .---- ----- / ----- .---- .---- ----- .---- .---- .---- .---- / ----- .---- .---- ----- ----- ----- .---- .---- / ----- .---- .---- ----- ----- .---- ----- .---- / ----- ----- .---- ----- ----- ----- ----- ----- / ----- .---- .---- ----- ----- ----- ----- .---- / ----- .---- .---- ----- ----- ----- .---- .---- / ----- .---- .---- ----- ----- .---- ----- .---- / ----- .---- .---- ----- .---- ----- ----- .---- / ----- .---- .---- .---- ----- .---- ----- ----- / ----- .---- .---- ----- ----- ----- ----- .---- / ----- ----- .---- ----- ----- ----- ----- ----- / ----- .---- .---- ----- .---- .---- .---- ----- / ----- .---- .---- ----- ----- ----- ----- .---- / ----- .---- .---- ----- .---- .---- ----- .---- / ----- .---- .---- ----- .---- .---- .---- .---- / ----- .---- .---- .---- ----- ----- .---- ----- / ----- .---- .---- ----- ----- ----- ----- .---- / ----- .---- .---- .---- ----- ----- .---- ----- / ----- ----- .---- ----- ----- ----- ----- ----- / ----- .---- .---- ----- ----- ----- .---- .---- / ----- .---- .---- ----- .---- .---- .---- .---- / ----- .---- .---- ----- .---- .---- ----- .---- / ----- .---- .---- ----- .---- ----- ----- .---- / ----- .---- .---- ----- ----- .---- .---- .---- / ----- .---- .---- ----- .---- .---- .---- .---- / ----- ----- .---- .---- .---- .---- .---- .---- /";

        Button button = findViewById(R.id.btnCopy);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Texto Copiado", textToCopy);
                clipboard.setPrimaryClip(clip);
                Toast.makeText(SecondActivity.this, "Easter Egg copiado!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
