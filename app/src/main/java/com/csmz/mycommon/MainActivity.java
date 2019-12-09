package com.csmz.mycommon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.csmz.mycommon.listview.MainAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private List<String> mData;
    private MainAdapter mMainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = findViewById(R.id.listView);
        getData();
    }

    public void getData() {

        mData = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            mData.add("" + i);
        }

        mMainAdapter = new MainAdapter(getApplicationContext(), mData,R.layout.main_list_item);
        mListView.setAdapter(mMainAdapter);

    }
}
