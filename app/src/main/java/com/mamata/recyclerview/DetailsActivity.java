package com.mamata.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {
    CircleImageView circImg;
    TextView tvFullName, tvPhoneNO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        circImg = findViewById(R.id.cicrImg);
        tvFullName = findViewById(R.id.tvFullName);
        tvPhoneNO = findViewById(R.id.tvPhoneNam);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            circImg.setImageResource(bundle.getInt("image"));
            tvFullName.setText(bundle.getString("name"));
            tvPhoneNO.setText(bundle.getString("phone"));
        }

    }
}
