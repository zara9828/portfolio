package com.zara.portfolio.ui.information;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.zara.portfolio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InformationFragment extends Fragment {

    public InformationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_information, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rv = view.findViewById(R.id.rv);
        rv.setAdapter(new InformationRecyclerViewAdapter());
    }

    class InformationRecyclerViewAdapter extends RecyclerView.Adapter<InformationViewHolder> {

        @NonNull
        @Override
        public InformationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new InformationViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull InformationViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 25;
        }
    }

    class InformationViewHolder extends RecyclerView.ViewHolder {

        public InformationViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
