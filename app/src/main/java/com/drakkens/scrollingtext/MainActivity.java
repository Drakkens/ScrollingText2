package com.drakkens.scrollingtext;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        TextView article = findViewById(R.id.article);

        button.setOnClickListener(v -> {
            if (article.isEnabled()) {
                article.setEnabled(false);

            } else {
                article.setEnabled(true);
            }
        });


    }



}
