package edu.ucsb.cs.cs184.holl.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView view = findViewById(R.id.recyclerView);
        int numColumns = 5;

        //  set up RecyclerView as a 5 column grid of elements:
        view.setLayoutManager(new GridLayoutManager(this, numColumns));

        // Alternatively, just one vertical scrollable centered list of elements:
        // view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        NumberAdapter adapter = new NumberAdapter();
        view.setAdapter(adapter);
    }
}
