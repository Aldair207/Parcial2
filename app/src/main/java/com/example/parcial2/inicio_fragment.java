package com.example.parcial2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.parcial2.User.User;
import com.example.parcial2.Useradapter.Useradapter;
import com.example.parcial2.User.User;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link inicioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class inicioFragment extends Fragment {
    RecyclerView rcv_usuarios;
    List<User> listauser= new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public inicioFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment inicioFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static inicioFragment newInstance(String param1, String param2) {
        inicioFragment fragment = new inicioFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view = inflater.inflate(R.layout.fragment_inicio, container, false);
        inflater.inflate(R.layout.fragment_inicio, container, false);

        rcv_usuarios= view.findViewById(R.id.rcv_usuarios);
        User usu1 = new User("https://cdn.aglty.io/scotiabank-chile/sitio-publico/2024/iniciativa-mujeres/planes-lidera-mujer.png", "Mariana","Mujer de 18 años - Ing. sistemas");
        User usu2 = new User("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFHPmPXafZyy3z2iVjXPHHLEvDikIuXdVJkA&s", "Melany","Mujer de 20 - Nutricion y dietetica");
        User usu3 = new User("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDyWUJheU49hdWcpy7ZVuZM67u0zBI9LaGnw&s", "Nawall","Mujer de 19 años - Arquitectura");
        User usu4 = new User("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROD285HtkxcKYlcVrxZ32_l6f6l7CcHbvMMg&s", "Amanda","Mujer de 18 años - Medicina");

        listauser.add(usu1);
        listauser.add(usu2);
        listauser.add(usu3);
        listauser.add(usu4);

        rcv_usuarios. setLayoutManager(new LinearLayoutManager(getActivity()));
        rcv_usuarios.setAdapter(new Useradapter(listauser));
        return view;

    }
}