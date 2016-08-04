package edu.feicui.facetointerfacefragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 *
 * 捕获输入的内容以后 发送到 另外一个Fragment中显示
 */
public class Fragment1 extends Fragment {

    MyListener mListener;
    private EditText mEt;
    private Button mButton;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mListener = (MyListener) context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1, container, false);
        mEt = (EditText) view.findViewById(R.id.frag_et_input);
        mButton = (Button) view.findViewById(R.id.frag_btn_send);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mEt.getText().toString().trim();
                mListener.sendText(text);
            }
        });

        return view;
    }

    // 定义一个interface 目的是和Actitivy 共享数据
    public interface MyListener {
        void sendText(String text);
    }

}
