package com.example.try_fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NUtrition1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NUtrition1Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NUtrition1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NUtrition1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NUtrition1Fragment newInstance(String param1, String param2) {
        NUtrition1Fragment fragment = new NUtrition1Fragment();
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
    ImageButton imageButton6;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_n_utrition1, container, false);
        imageButton6=view.findViewById(R.id.imageButton39);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment next1 = new NutritionFragment();
                FragmentTransaction fm1 = getActivity().getSupportFragmentManager().beginTransaction();
                fm1.replace(R.id.fragmentContainerView, next1).commit();

            }
        });
        Button button46 = view.findViewById(R.id.button46);
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment next9 = new NUtrition11Fragment();
                FragmentTransaction fm1 = getActivity().getSupportFragmentManager().beginTransaction();
                fm1.replace(R.id.fragmentContainerView, next9).commit();
            }
        });
        Button button47 = view.findViewById(R.id.button47);
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment next9 = new NUtrition12Fragment();
                FragmentTransaction fm1 = getActivity().getSupportFragmentManager().beginTransaction();
                fm1.replace(R.id.fragmentContainerView, next9).commit();
            }
        });
        Button button48 = view.findViewById(R.id.button48);
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment next9 = new NUtrition13Fragment();
                FragmentTransaction fm1 = getActivity().getSupportFragmentManager().beginTransaction();
                fm1.replace(R.id.fragmentContainerView, next9).commit();
            }
        });
        Button button49 = view.findViewById(R.id.button49);
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment next9 = new NUtrition14Fragment();
                FragmentTransaction fm1 = getActivity().getSupportFragmentManager().beginTransaction();
                fm1.replace(R.id.fragmentContainerView, next9).commit();
            }
        });
        Button button50 = view.findViewById(R.id.button50);
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment next9 = new NUtrition15Fragment();
                FragmentTransaction fm1 = getActivity().getSupportFragmentManager().beginTransaction();
                fm1.replace(R.id.fragmentContainerView, next9).commit();
            }
        });
        return view;
    }
}