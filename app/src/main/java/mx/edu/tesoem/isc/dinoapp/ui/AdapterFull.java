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

public class AdapterFull extends ArrayAdapter<ModeloFull> {
    private List<ModeloFull> mList;
    private Context mContext;
    private int resourceLayout;

    public AdapterFull(@NonNull Context context, int resource, List<ModeloFull> objects) {
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
        ModeloFull modelo = mList.get(position);
        ImageView img = view.findViewById(R.id.imgViewFull);
        img.setImageResource(modelo.getImagen());
        TextView nombre = view.findViewById(R.id.txtNombreFull);
        nombre.setText(modelo.getNombre());
        TextView pronunciacion = view.findViewById(R.id.txtpronunciacionFull);
        pronunciacion.setText(modelo.getPronunciacion());
        TextView significado = view.findViewById(R.id.txtpronunciacionFull);
        significado.setText(modelo.getSignificado());
        TextView dieta = view.findViewById(R.id.txtpronunciacionFull);
        dieta.setText(modelo.getDieta());
        TextView altura = view.findViewById(R.id.txtpronunciacionFull);
        altura.setText(modelo.getAltura());
        TextView periodo = view.findViewById(R.id.txtpronunciacionFull);
        periodo.setText(modelo.getPeriodo());
        TextView mya = view.findViewById(R.id.txtpronunciacionFull);
        mya.setText(modelo.getMya());
        TextView info = view.findViewById(R.id.txtpronunciacionFull);
        info.setText(modelo.getInfo());
        return view;
    }
}
