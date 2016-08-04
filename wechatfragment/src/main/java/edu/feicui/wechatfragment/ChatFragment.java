package edu.feicui.wechatfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends Fragment {


    private TextView mTv;
    private static ChatFragment sFragment;

    public ChatFragment() {
        // Required empty public constructor
    }

    public static ChatFragment newInstance(String text) {
        if (sFragment != null) {
            //sFragment = new ChatFragment();
            Bundle bundle = new Bundle();
            bundle.putString("string", text);

            sFragment.setArguments(bundle);
        }
        return newInstance();
    }
    public static ChatFragment newInstance() {
        if (sFragment == null) {
            sFragment = new ChatFragment();

        }
        return sFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        mTv = (TextView) view.findViewById(R.id.frag_tv_show);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String string = bundle.getString("string");
            mTv.setText(string);
        }
        return view;
    }


}
