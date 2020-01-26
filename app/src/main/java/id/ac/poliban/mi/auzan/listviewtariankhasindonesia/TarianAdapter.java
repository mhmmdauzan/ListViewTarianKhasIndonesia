package id.ac.poliban.mi.auzan.listviewtariankhasindonesia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class TarianAdapter extends BaseAdapter {
    private List<Tarian> data = new ArrayList<>();

    public TarianAdapter(List<Tarian> data) {
        //parameter konstruktor berupa data object List dari kelas Tarian
        this.data = data;
    }

    @Override
    public int getCount() {
        //kembalikan Jumlah item dalam data
        return  data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_tari;
        TextView tv_tarian_name;
        TextView tv_tarian_description;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_tarian,parent,false);

        //deklarasikan View
        img_tari = convertView.findViewById(R.id.img_tari);
        tv_tarian_name = convertView.findViewById(R.id.tv_tarian_name);
        tv_tarian_description = convertView.findViewById(R.id.tv_tarian_description);

        //isi data
        Glide.with(parent.getContext())
                .load(data.get(position).getTari())
                .apply(new RequestOptions().override(60, 60))
                .into(img_tari);
        tv_tarian_name.setText(data.get(position).getTarianName());
        tv_tarian_description.setText(data.get(position).getTarianDesc());
        return convertView;
    }
}
