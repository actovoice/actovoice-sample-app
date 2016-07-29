package sample.android.actovoice.com.actovoicesampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ActoVoice;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button feedbackBtn;
    private Button needAssistanceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        feedbackBtn = (Button) findViewById(R.id.giveFeedback);
        needAssistanceBtn = (Button) findViewById(R.id.needAssistance);
        feedbackBtn.setOnClickListener(this);
        needAssistanceBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.giveFeedback:
                ActoVoice.getInstance().setProductData(view, ActoVoice.Action.CREATE_FEEDBACK_LIST);
                break;
            case R.id.needAssistance:
                ActoVoice.getInstance().setProductData(view, ActoVoice.Action.CREATE_TICKET_LIST);
                break;
        }
    }
}
