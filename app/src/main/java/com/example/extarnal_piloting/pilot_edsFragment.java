package com.example.extarnal_piloting;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link pilot_edsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class pilot_edsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public pilot_edsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment pilot_edsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static pilot_edsFragment newInstance(String param1, String param2) {
        pilot_edsFragment fragment = new pilot_edsFragment();
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pilot_eds, container, false);
    }

    public void onViewCreated (View view, Bundle savedInstanceState){
        WebClient webViewClient = new WebClient();

        WebView sborka = (WebView) getView().findViewById(R.id.sborka);
        WebView parashut = (WebView) getView().findViewById(R.id.parashut);
        WebView plan = (WebView) getView().findViewById(R.id.plan);

        String video1 = "https://youtu.be/mGNPX4eOHGE";
        String video2 = "https://youtu.be/BxuvOp4MLqo";
        String video3 = "https://youtu.be/gJREURn_vws";


        sborka.getSettings().setJavaScriptEnabled(true);
        sborka.setWebViewClient(webViewClient);
        sborka.loadUrl(video1);

        parashut.getSettings().setJavaScriptEnabled(true);
        parashut.setWebViewClient(webViewClient);
        parashut.loadUrl(video2);

        plan.getSettings().setJavaScriptEnabled(true);
        plan.setWebViewClient(webViewClient);
        plan.loadUrl(video3);
    }

    public class WebClient extends WebViewClient {
        @Override
        public  boolean shouldOverrideUrlLoading(WebView webView, String Url){
            return false;
        }
    }
}