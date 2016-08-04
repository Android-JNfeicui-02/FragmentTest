package edu.feicui.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {


    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1, container, false);
        view.findViewById(R.id.btn_change_world).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 f2 = (Fragment2) getActivity().getSupportFragmentManager().findFragmentByTag("f2");
                f2.updateText("hello");
            }
        });

        return view;
    }

}
