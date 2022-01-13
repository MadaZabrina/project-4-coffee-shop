package com.example.vouchersteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeleteAcountActivity extends AppCompatActivity {

    private Button btn_deleted;

    @Override        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_acount
        protected void onCreate(Bundle savedInstanceState) {
);

        btn_deleted = (Button) findViewById(R.id.btn_backtoregis);
        btn_deleted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backtoregis();
            }
        });
    }

    public void backtoregis(){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}

