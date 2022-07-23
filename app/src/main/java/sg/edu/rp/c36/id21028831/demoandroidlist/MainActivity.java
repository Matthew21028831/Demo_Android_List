package sg.edu.rp.c36.id21028831.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

//public class MainActivity extends AppCompatActivity {
//    ArrayList<String> androids;
//    ListView lvAndroid;
//    ArrayAdapter<String> aaAndroid;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        lvAndroid=findViewById(R.id.androids);
//
//        androids=new ArrayList<>();
//        androids.add("Pie - 9.0");
//        androids.add("Oreo - 8.0-8.1");
//        androids.add("Nougat - 7.0-7.1.2");
//        androids.add("Marshmallow - 6.0-6.0.1");
//        androids.add("Lollipop - 5.0-5.1.1");
//        androids.add("Kitkat - 4.4-4.4.4");
//        androids.add("Jelly Bean - 4.1-4.3.1");
//
//        aaAndroid=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, androids);
//        lvAndroid.setAdapter(aaAndroid);
//    }
//}

public class MainActivity extends AppCompatActivity {

    ListView lvAndroid;
    ArrayList<AndroidVersion> androids;
//    ArrayAdapter<AndroidVersion> aaAndroid;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroid = findViewById(R.id.androids);
        androids = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        androids.add(item1);
        androids.add(item2);
        androids.add(item3);

//        aaAndroid = new ArrayAdapter<>(this,
//                android.R.layout.simple_list_item_1, androids);

        adapter=new CustomAdapter(this,R.layout.row,androids);

//        lvAndroid.setAdapter(aaAndroid);

        lvAndroid.setAdapter(adapter);
    }
}
