package com.ravi.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.ravi.loginscreen.Myadapter1.MyViewHolder.tv1;

public class RecyclerActivity extends AppCompatActivity {

    public RecyclerView r1,r2,r3,r4;
    public RecyclerView.Adapter adapter,adapter1,adapter2,adapter3;

    List<String> l1  = new ArrayList<>();
    List<String> l2  = new ArrayList<>();
    List<String> l3  = new ArrayList<>();
    List<String> l4  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        l1.add("ufuf");


        l3.add("ehshd");
        l3.add("vdve");
        l3.add("gegs");
        l3.add("ehshd");
        l3.add("vdve");
        
        r1 = findViewById(R.id.rcv1);
        r2 = findViewById(R.id.rcv2);
        r3 = findViewById(R.id.rcv3);
        r4 = findViewById(R.id.rcv4);

        r1.setHasFixedSize(true);
        adapter = new Myadapter1(this,l1);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        r1.setLayoutManager(llm);
        r1.setAdapter(adapter);

        r1.addOnItemTouchListener(new RecyclerItemClickListener(RecyclerActivity.this,r1, new RecyclerItemClickListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                if (l1.size() > 0) {
                    Toast.makeText(RecyclerActivity.this, l1.get(position), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        r2.setHasFixedSize(true);
        adapter1 = new Myadapter1(this,l2);
        LinearLayoutManager llm1 = new LinearLayoutManager(this);
        r2.setLayoutManager(llm1);
        r2.setAdapter(adapter1);
        r2.addOnItemTouchListener(new RecyclerItemClickListener(RecyclerActivity.this,r1, new RecyclerItemClickListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                if (l2.size() > 0) {
                    Toast.makeText(RecyclerActivity.this, l2.get(position), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        r3.setHasFixedSize(true);
        adapter2 = new Myadapter1(this,l3);
        LinearLayoutManager llm2 = new LinearLayoutManager(this);
        r3.setLayoutManager(llm2);
        r3.setAdapter(adapter2);

        r3.addOnItemTouchListener(new RecyclerItemClickListener(RecyclerActivity.this,r1, new RecyclerItemClickListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                if (l3.size() > 0) {
                    Toast.makeText(RecyclerActivity.this, l3.get(position), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        r4.setHasFixedSize(true);
        adapter3 = new Myadapter1(this,l4);
        LinearLayoutManager llm3 = new LinearLayoutManager(this);
        r4.setLayoutManager(llm3);
        r4.setAdapter(adapter3);

        r4.addOnItemTouchListener(new RecyclerItemClickListener(RecyclerActivity.this,r1, new RecyclerItemClickListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                if (l4.size() > 0) {
                    Toast.makeText(RecyclerActivity.this, l4.get(position), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        TextView tv1 = findViewById(R.id.size1);
        tv1.setText(String.valueOf(l1.size()));
        TextView tv2 = findViewById(R.id.size2);
        tv2.setText(String.valueOf(l2.size()));
        TextView tv3 = findViewById(R.id.size3);
        tv3.setText(String.valueOf(l3.size()));
        TextView tv4 = findViewById(R.id.size4);
        tv4.setText(String.valueOf(l4.size()));





    }
}
