package mx.edu.tesoem.isc.dinoapp;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import mx.edu.tesoem.isc.dinoapp.ui.Adapter;
import mx.edu.tesoem.isc.dinoapp.ui.Modelo;

public class dinosFragment extends Fragment implements AdapterView.OnItemClickListener {
    List<Modelo> list = new ArrayList<>();
    Adapter mAdapter;
    Fragment fgi;
    FragmentTransaction cambiofrgmento;

    private ListView mListView;
    private DinosViewModel mViewModel;

    public static dinosFragment newInstance() {
        return new dinosFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        fgi = new AllosaurusFrag();
        View v= inflater.inflate(R.layout.dinos_fragment, container, false);
        mListView = v.findViewById(R.id.listView);
        mListView.setOnItemClickListener(this);
        list.add(new Modelo("Allosaurus","AL-oh-sore-us",R.drawable.allosaurus));
        list.add(new Modelo("Apatosaurus","ah-PAT-oh-sore-us",R.drawable.apatosaurus));
        list.add(new Modelo("Brachiosaurus","BRAK-ee-oh-sore-us",R.drawable.brachiosaurus));
        list.add(new Modelo("Dracorex","dray-ko-rex",R.drawable.dracorex));
        list.add(new Modelo("Elasmosaurus","ee-LAZ-mo-sore-us",R.drawable.elasmosaurus));
        list.add(new Modelo("Giraffatitan","ji-raf-e-tie-tan",R.drawable.giraffatitan));
        list.add(new Modelo("Indosuchus","in-doh-sook-us",R.drawable.indosuchus));
        list.add(new Modelo("Jingshanosaurus","jing-shahn-oh-sore-us",R.drawable.jingshanosaurus));
        list.add(new Modelo("Khaan","kahn",R.drawable.khaan));
        list.add(new Modelo("Minmi","min-mie",R.drawable.minmi));
        list.add(new Modelo("Ouranosaurus","oo-RAH-noh-sore-us",R.drawable.ouranosaurus));
        list.add(new Modelo("Parasaurolophus","PARR-eh-saw-ROL-off-us / PARR-eh-sawr-eh-LOH-fus",R.drawable.parasaurolophus));
        list.add(new Modelo("Spinosaurus","SPINE-oh-SORE-us",R.drawable.spinosaurus));
        list.add(new Modelo("Tyrannosaurus","tie-RAN-oh-sore-us",R.drawable.tyrannosaurus));
        list.add(new Modelo("Utahraptor","YOO-tah-RAP-tor",R.drawable.utahraptor));
        list.add(new Modelo("Vulcanodon","vul-ka-oh-don",R.drawable.vulcanodon));
        list.add(new Modelo("Xenoceratops","ZEE-no-SEH-ruh-tops",R.drawable.xenoceratops));
        list.add(new Modelo("Zephyrosaurus","ZEF-ear-ro-SORE-us",R.drawable.zephyrosaurus));
        mAdapter = new Adapter(getActivity(),R.layout.dino_row1,list);
        mListView.setAdapter(mAdapter);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(DinosViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        // Crear fragmento de tu clase
        /*Fragment fragment = new AllosaurusFrag();
// Obtener el administrador de fragmentos a través de la actividad
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
// Definir una transacción
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
// Remplazar el contenido principal por el fragmento
        fragmentTransaction.replace(R.id.nav_host_fragment_content_main, fragment);

        //fragmentTransaction.addToBackStack(null);
// Cambiar
        fragmentTransaction.commit();*/

        Toast.makeText(getActivity(), "Objeto seleccionado numero: "+ (i+1),Toast.LENGTH_SHORT).show();


    }

}