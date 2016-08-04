package edu.feicui.facetointerfacefragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Fragment1.MyListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.rl_root, new Fragment1()).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();

    }

    @Override
    public void sendText(String text) {
        Toast.makeText(MainActivity.this, "接收到的值是" + text, Toast.LENGTH_SHORT).show();

        Fragment2 f2 = new Fragment2();

        Bundle bundle = new Bundle();
        bundle.putString("name", text);

        f2.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().replace(R.id.rl_root,f2).addToBackStack(null).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
    }
}
