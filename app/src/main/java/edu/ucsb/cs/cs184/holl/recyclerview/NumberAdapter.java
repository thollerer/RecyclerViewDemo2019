package edu.ucsb.cs.cs184.holl.recyclerview;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by holl on 5/5/19.
 */

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.ViewHolder>{
    @Override @NonNull
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_entry, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.setInt(position);
        holder.layoutWithTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.layoutWithTextView.getContext(), "Holder: " + holder.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 1000;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private static int count = 0;
        private int id;

        View layoutWithTextView;
        ViewHolder(View view) {
            super(view);
            this.layoutWithTextView = view;
            id = ++count;
        }
        void setInt(int number) {
            ((TextView) layoutWithTextView.findViewById(R.id.textView)).setText(number + "");
        }

        @Override @NonNull
        public String toString() {
            return id + "/" + count;
        }
    }
}
