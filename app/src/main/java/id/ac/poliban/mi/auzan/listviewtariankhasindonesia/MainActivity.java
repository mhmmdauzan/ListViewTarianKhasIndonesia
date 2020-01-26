package id.ac.poliban.mi.auzan.listviewtariankhasindonesia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Tarian> tarians = new ArrayList<>();
    private ListView lvTarian;
    private BaseAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //koneksikan object dengan view
        lvTarian = findViewById(R.id.listview);

        // ambil data dari TarianData dan berikan ke object tarians
        tarians.addAll(TarianData.getAllTarian());

        //buat object adapter dan kirim data tarians sebagai parameter
        //di konstruktor TarianAdapter
        adapter = new TarianAdapter(tarians);

        //pasang object adapter sebagai adapter lvTarian
        lvTarian.setAdapter(adapter);

        //menambahkan kejadian ketika user mengklik salah satu item
        lvTarian.setOnItemClickListener((parent, view, position, id) ->{
            new AlertDialog.Builder(this)
                    .setTitle("Info")
                    .setMessage(tarians.get(position).toString())
                    .setPositiveButton("OK", null).show();
        });

    }
}
