package edu.feicui.wechatfragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChat = (Button) findViewById(R.id.btn_chat);
        Button btnFound = (Button) findViewById(R.id.btn_found);
        btnChat.setOnClickListener(this);
        btnFound.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        switch (v.getId()) {
            case R.id.btn_chat:
                transaction.replace(R.id.rl_root, ChatFragment.newInstance(),"chat");
                break;

            case R.id.btn_found:
                transaction.replace(R.id.rl_root,new FoundFragment(),"found");
                break;
        }
        transaction.commit();
    }
}
