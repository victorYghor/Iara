package com.iara.Question;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        TextView answerTextView = findViewById(R.id.answer_text_view);
        String answer = getIntent().getStringExtra("ANSWER");
        answerTextView.setText(answer);
    }
}
