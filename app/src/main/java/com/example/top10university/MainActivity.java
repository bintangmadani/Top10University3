package com.example.top10university;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.lang.reflect.Array;
import java.util.ArrayList;

// 1.Main Activity
// 2.Adapter
// 3.Data Activity
// 4.POJO
// 5.POJOData (Sumber Data)
// 6.Profile

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvUniversitas;
    private ArrayList<Universitas> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvUniversitas = findViewById(R.id.rv_universitas);
        rvUniversitas.setHasFixedSize(true);

        list.addAll(DataUniversity.getLishData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvUniversitas.setLayoutManager(new LinearLayoutManager(this));
        ListUniversitasAdapter listUniversitasAdapter = new ListUniversitasAdapter(list);
        rvUniversitas.setAdapter(listUniversitasAdapter);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent moveIntent = new Intent(MainActivity.this, About.class);
                startActivity(moveIntent);
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
}
