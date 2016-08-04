package edu.feicui.wechatfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoundFragment extends Fragment {


    public FoundFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_found, container, false);
        Button button = (Button) view.findViewById(R.id.frag_btn_show);

        //getActivity().getSupportFragmentManager().findFragmentByTag("chat");



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //chat.changeText("点击了Fragment里面的Button");
                ChatFragment fragment = ChatFragment.newInstance("点击了Fragment里面的Button");

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.rl_root,fragment);
                transaction.commit();

                Toast.makeText(getContext(), "点击了Fragment里面的Button", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
