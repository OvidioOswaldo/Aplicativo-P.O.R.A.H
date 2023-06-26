package com.ovidiooswaldo.projetoporah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface{

    ArrayList<PacienteModel> PacienteModel = new ArrayList<>();

    int[] PacientesImages = {R.drawable.ic_baseline_restaurant_menu_24, R.drawable.ic_baseline_restaurant_menu_24, R.drawable.ic_baseline_pregnant_woman_24, R.drawable.ic_baseline_restaurant_menu_24, R.drawable.ic_baseline_restaurant_menu_24, R.drawable.ic_baseline_pets_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);

        setUpPacientesModel();

        AA_RecyclerViewAdapter adapter = new AA_RecyclerViewAdapter(this,
                PacienteModel);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Button button = findViewById(R.id.botao_com_id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Projeto da Organização da Alimentação Humana", Toast.LENGTH_SHORT).show();
                openNextActivity();
            }
        });
    }

    private void setUpPacientesModel(){
        String[] PacientesNames = getResources().getStringArray(R.array.todos_pacientes);
        String[] Diagnosticos = getResources().getStringArray(R.array.diagnosticos);

        for (int i = 0; i<PacientesNames.length; i++){
            PacienteModel.add(new PacienteModel(PacientesNames[i],
                    Diagnosticos[i],
                    PacientesImages[i]));
        }
    }

    private void openNextActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    public void onItemClick(int position) {

    }
}