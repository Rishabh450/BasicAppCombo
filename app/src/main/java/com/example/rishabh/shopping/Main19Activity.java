package com.example.rishabh.shopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class Main19Activity extends AppCompatActivity {
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        final ListView listView=findViewById(R.id.listre);
        final ArrayList arrayList=new ArrayList(asList("Unstoppable- Dino James [Official Music Video]","2019: The Year of the Cricket World Cup!","Narendra Modi takes oath for the second term of Prime Minister","Stranger Things 3 Trailer","Why's Opposition Making It About Religion? - The Debate With Arnab Goswami","Kabir Singh - Not A Movie Review","Steve Jobs' 2005 Stanford Commencement Address","Horror Movies - Jaspreet Singh Stand-Up Comedy","FilterCopy - Types Of Shoppers","Afreen Afreen, Rahat Fateh Ali Khan & Momina Mustehsan, Episode 2, Coke Studio Season 9","India's Manushi Chhillar Wins Miss World 2017 Crown"));
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position)
                {
                    case 0: s="https://www.youtube.com/watch?v=iSallxKpm8Y";
                        break;
                    case 1: s="https://www.youtube.com/watch?v=qoXSGsxZRgc";
                        break;
                    case 2: s="https://www.youtube.com/watch?v=x1dHCQB4ey8";
                        break;
                    case 3: s="https://www.youtube.com/watch?v=XcnHOQ-cHa0";
                        break;
                    case 4: s="https://www.youtube.com/watch?v=wtS76YeEkK0";
                        break;
                    case 5: s="https://www.youtube.com/watch?v=C-lRyevxevA&t=85s";
                        break;
                    case 6: s="https://www.youtube.com/watch?v=UF8uR6Z6KLc&t=361s";
                        break;
                    case 7: s="https://www.youtube.com/watch?v=rat1rQlc0Pk&t=93s";
                        break;
                    case 8: s="https://www.youtube.com/watch?v=v_krH1BVvwM";
                        break;
                    case 9: s="https://www.youtube.com/watch?v=kw4tT7SCmaY&list=RDkw4tT7SCmaY&start_radio=1";
                        break;
                    case 10: s="https://www.youtube.com/watch?v=lq_TnBy7EWk";
                        break;
                }
                Intent i=new Intent(Main19Activity.this,Main20Activity.class);
                i.putExtra("Website",s);
                startActivity(i);




            }
        });
    }
}
