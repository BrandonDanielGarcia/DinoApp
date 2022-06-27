package mx.edu.tesoem.isc.dinoapp.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import mx.edu.tesoem.isc.dinoapp.R;

public class Adapter extends ArrayAdapter<Modelo> {
    private List<Modelo> mList;
    private Context mContext;
    private int resourceLayout;

    public Adapter(@NonNull Context context, int resource, List<Modelo> objects) {
        super(context, resource, objects);
        this.mList = objects;
        this.mContext = context;
        this.resourceLayout = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if(view == null){
            view = LayoutInflater.from(mContext).inflate(resourceLayout,null);

        }

        Modelo modelo =  mList.get(position);
        ImageView img = view.findViewById(R.id.imgView);
        img.setImageResource(modelo.getImagen());
        TextView nombre = view.findViewById(R.id.txtnombre);
        nombre.setText(modelo.getNombre());
        TextView pronunciacion = view.findViewById(R.id.txtpronunciacion);
        pronunciacion.setText(modelo.getPronunciacion());
        return view;
    }
}
