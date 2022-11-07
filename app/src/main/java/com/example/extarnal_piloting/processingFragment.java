package com.example.extarnal_piloting;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link processingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class processingFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public processingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment pilot_dvsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static processingFragment newInstance(String param1, String param2) {
        processingFragment fragment = new processingFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_processing, container, false);}




    public void onViewCreated (View view, Bundle savedInstanceState){


        WebView processing1 = (WebView) getView().findViewById(R.id.video1);
        WebView processing2 = (WebView) getView().findViewById(R.id.video2);
        WebView processing3 = (WebView) getView().findViewById(R.id.video3);
        WebView processing4 = (WebView) getView().findViewById(R.id.video4);
        WebView processing5 = (WebView) getView().findViewById(R.id.video5);
        WebView processing6 = (WebView) getView().findViewById(R.id.video6);
        WebView processing7 = (WebView) getView().findViewById(R.id.video7);

        Button lesson1 = (Button)  getView().findViewById(R.id.lesson1);
        Button lesson2 = (Button)  getView().findViewById(R.id.lesson2);
        Button lesson3 = (Button)  getView().findViewById(R.id.lesson3);
        Button lesson4 = (Button)  getView().findViewById(R.id.lesson4);
        Button lesson5 = (Button)  getView().findViewById(R.id.lesson5);
        Button lesson6 = (Button)  getView().findViewById(R.id.lesson6);
        Button lesson7 = (Button)  getView().findViewById(R.id.lesson7);

        WebClient webViewClient = new WebClient();

        String video1 = "https://www.youtube.com/watch?v=jVohCPkaqVY&list=PLNLqotQpxb3nUX8nYVzU30YFJcoPCT5V0";
        String video2 = "https://www.youtube.com/watch?v=OtADQaojTK8&list=PLNLqotQpxb3nUX8nYVzU30YFJcoPCT5V0&index=2";
        String video3 = "https://youtu.be/BbEqox2ZmFc";
        String video4 = "https://www.youtube.com/watch?v=_ZJT2A3jX-M&list=PLNLqotQpxb3nUX8nYVzU30YFJcoPCT5V0&index=4";
        String video5 = "https://www.youtube.com/watch?v=vDmt0GCXKgs&list=PLNLqotQpxb3nUX8nYVzU30YFJcoPCT5V0&index=5";
        String video6 = "https://www.youtube.com/watch?v=VKmomw1-4qE&list=PLNLqotQpxb3nUX8nYVzU30YFJcoPCT5V0&index=6";
        String video7 = "https://www.youtube.com/watch?v=QIDTgRqqjic&list=PLNLqotQpxb3nUX8nYVzU30YFJcoPCT5V0&index=7";

        processing1.getSettings().setJavaScriptEnabled(true);
        processing1.setWebViewClient(webViewClient);
        processing1.loadUrl(video1);
        processing1.setVisibility(View.INVISIBLE);

        processing2.getSettings().setJavaScriptEnabled(true);
        processing2.setWebViewClient(webViewClient);
        processing2.loadUrl(video2);


        processing3.getSettings().setJavaScriptEnabled(true);
        processing3.setWebViewClient(webViewClient);
        processing3.loadUrl(video3);

        processing4.getSettings().setJavaScriptEnabled(true);
        processing4.setWebViewClient(webViewClient);
        processing4.loadUrl(video4);

        processing5.getSettings().setJavaScriptEnabled(true);
        processing5.setWebViewClient(webViewClient);
        processing5.loadUrl(video5);

        processing6.getSettings().setJavaScriptEnabled(true);
        processing6.setWebViewClient(webViewClient);
        processing6.loadUrl(video6);

        processing7.getSettings().setJavaScriptEnabled(true);
        processing7.setWebViewClient(webViewClient);
        processing7.loadUrl(video7);

        processing1.setVisibility(View.GONE);
        processing2.setVisibility(View.GONE);
        processing3.setVisibility(View.GONE);
        processing4.setVisibility(View.GONE);
        processing5.setVisibility(View.GONE);
        processing6.setVisibility(View.GONE);
        processing7.setVisibility(View.GONE);

        lesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processing1.setVisibility(View.VISIBLE);
                processing2.setVisibility(View.GONE);
                processing3.setVisibility(View.GONE);
                processing4.setVisibility(View.GONE);
                processing5.setVisibility(View.GONE);
                processing6.setVisibility(View.GONE);
                processing7.setVisibility(View.GONE);
            }
        });

        lesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processing1.setVisibility(View.GONE);
                processing2.setVisibility(View.VISIBLE);
                processing3.setVisibility(View.GONE);
                processing4.setVisibility(View.GONE);
                processing5.setVisibility(View.GONE);
                processing6.setVisibility(View.GONE);
                processing7.setVisibility(View.GONE);
            }
        });

        lesson3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processing1.setVisibility(View.GONE);
                processing2.setVisibility(View.GONE);
                processing3.setVisibility(View.VISIBLE);
                processing4.setVisibility(View.GONE);
                processing5.setVisibility(View.GONE);
                processing6.setVisibility(View.GONE);
                processing7.setVisibility(View.GONE);
            }
        });


        lesson4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                processing1.setVisibility(View.GONE);
                processing2.setVisibility(View.GONE);
                processing3.setVisibility(View.GONE);
                processing4.setVisibility(View.VISIBLE);
                processing5.setVisibility(View.GONE);
                processing6.setVisibility(View.GONE);
                processing7.setVisibility(View.GONE);

            }
        });


        lesson5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processing1.setVisibility(View.GONE);
                processing2.setVisibility(View.GONE);
                processing3.setVisibility(View.GONE);
                processing4.setVisibility(View.GONE);
                processing5.setVisibility(View.VISIBLE);
                processing6.setVisibility(View.GONE);
                processing7.setVisibility(View.GONE);
            }
        });

        lesson6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processing1.setVisibility(View.GONE);
                processing2.setVisibility(View.GONE);
                processing3.setVisibility(View.GONE);
                processing4.setVisibility(View.GONE);
                processing5.setVisibility(View.GONE);
                processing6.setVisibility(View.VISIBLE);
                processing7.setVisibility(View.GONE);
            }
        });

        lesson7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processing1.setVisibility(View.GONE);
                processing2.setVisibility(View.GONE);
                processing3.setVisibility(View.GONE);
                processing4.setVisibility(View.GONE);
                processing5.setVisibility(View.GONE);
                processing6.setVisibility(View.GONE);
                processing7.setVisibility(View.VISIBLE);
            }
        });
    }
    public class WebClient extends WebViewClient {
        @Override
        public  boolean shouldOverrideUrlLoading(WebView webView, String Url){
            return false;
        }
    }
}