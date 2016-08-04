package edu.feicui.facetointerfacefragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {


    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment2, container, false);
        TextView tv = (TextView) view.findViewById(R.id.frag_textview);

        Bundle bundle = getArguments();
        String name = bundle.getString("name");
        tv.setText(name);
        System.out.println("接受到的内容是："+name);
        return view;
    }

}
