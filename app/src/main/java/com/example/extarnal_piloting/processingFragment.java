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

        WebView sborka1 = (WebView) getView().findViewById(R.id.video1);
        String video1 = "https://youtu.be/mGNPX4eOHGE";



        sborka1.getSettings().setJavaScriptEnabled(true);
        WebClient webViewClient = new WebClient();
        sborka1.setWebViewClient(webViewClient);

        sborka1.loadUrl(video1);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        return inflater.inflate(R.layout.fragment_processing, container, false);
    }

    public class WebClient extends WebViewClient {
        @Override
        public  boolean shouldOverrideUrlLoading(WebView webView, String Url){
            return false;
        }
    }
}