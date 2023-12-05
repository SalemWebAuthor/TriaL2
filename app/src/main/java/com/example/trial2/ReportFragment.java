package com.example.trial2;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ReportFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ReportFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ReportFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ReportFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ReportFragment newInstance(String param1, String param2) {
        ReportFragment fragment = new ReportFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_report, container, false);

        // Find the buttons in the fragment's layout
        Button buttonLowStock = rootView.findViewById(R.id.btn_lstock);
        Button buttonOutStock = rootView.findViewById(R.id.btn_ostock);
        Button buttonTotalStock = rootView.findViewById(R.id.btn_tstock);
        Button buttonRecycle = rootView.findViewById(R.id.btn_rec);


        buttonLowStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLowStock();
            }
        });

        buttonOutStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOutStock();
            }
        });

        buttonTotalStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTotalStock();
            }
        });

        buttonRecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRecycle();
            }
        });


        return rootView;
    }

    // Open the LowStock activity
    private void openLowStock() {
        Intent intent = new Intent(getActivity(), LowStock.class);
        startActivity(intent);
    }

    // Open the OutStock activity
    private void openOutStock() {
        Intent intent = new Intent(getActivity(), OutStock.class);
        startActivity(intent);
    }

    // Open the TotalStock activity
    private void openTotalStock() {
        Intent intent = new Intent(getActivity(), TotalItems.class);
        startActivity(intent);
    }

    private void openRecycle() {
        Intent intent = new Intent(getActivity(), RecyclePrac.class);
        startActivity(intent);
    }

    }
