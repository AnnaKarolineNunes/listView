package br.com.crusoandroid.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] itens = {
            "Angra dos Reis",
            "Caldas Novas","Campos do Jordão","Costa do Sauipe","Ilhéus",
            "Porto Seguro","Tiradentes","PRaga","Santiago","Zurique",
            "Caribe","Buenos Aires","Budapeste","Cancun","Aruba"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        //Criar adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String >(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        //Adicionar adaptador a lista
        listLocais.setAdapter(adaptador);

        //Adicionar clique na lista
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                @Override
                public void onItemClick(AdapterView<?>adapterView, View view,int i, long l){
                    String valorSelecionado = listLocais.getItemAtPosition(i).toString();
                    Toast.makeText(getApplicationContext(), valorSelecionado, Toast.LENGTH_SHORT).show();
                }
            }
        );
    }
}