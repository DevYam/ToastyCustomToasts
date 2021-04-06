package com.ncertguruji.toasty_demo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button success = this.findViewById(R.id.button);
        Button warning = this.findViewById(R.id.button2);

        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toasty.success(MainActivity.this, "Comment Added!", Toast.LENGTH_SHORT, true).show();
                Toasty.custom(MainActivity.this, "Comment Added !", R.drawable.ic_baseline_mark_chat_read_24, R.color.successColor, Toast.LENGTH_LONG, true,
                        true).show();
            }
        });

        warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toasty.warning(MainActivity.this, "Press Again to exit.", Toast.LENGTH_SHORT, true).show();

                Toasty.custom(MainActivity.this, "Press again to exit the app", R.drawable.ic_sign_out, R.color.warningColor, Toast.LENGTH_LONG, true,
                        true).show();

            }
        });


    }
}