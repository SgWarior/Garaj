package lapolina.md;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {
    private Button paket, cups, fireWorks , plasticBox, factory;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    DocumentReference cup166DbObject = db.collection("/Garaj/Stock/allCups/cups/Cup166/").document("6RQ7K5AGdGcA3qAbkF3u");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        listnerSet();

    }

    private void init(){
        paket = findViewById(R.id.paket);
        cups = findViewById(R.id.cups);
        fireWorks = findViewById(R.id.fireWorks);
        plasticBox= findViewById(R.id.plasticBox);
        factory = findViewById(R.id.factory);

    }

    private void listnerSet(){
        View.OnClickListener mainlistner = v -> {
        switch (v.getId()){
            case R.id.paket:
                Intent intentPaket = new Intent(MainActivity.this, paketActivity.class);
                startActivity(intentPaket);break;
            case R.id.cups:
                Intent intentCups = new Intent(MainActivity.this, cupsActivity.class);
                startActivity(intentCups);break;
            case R.id.fireWorks:
                Intent intentFireWorks = new Intent(MainActivity.this, fireWorksActivity.class);
                startActivity(intentFireWorks);break;
            case R.id.plasticBox:
                Intent intentPlasticBox = new Intent(MainActivity.this, plasticBox.class);
                startActivity(intentPlasticBox);break;
            case R.id.factory:
                Intent intentFactory = new Intent(MainActivity.this, factoryActivity.class);
                startActivity(intentFactory);
        }
    };
        paket.setOnClickListener(mainlistner);
        cups.setOnClickListener(mainlistner);
        fireWorks.setOnClickListener(mainlistner);
        plasticBox.setOnClickListener(mainlistner);
        factory.setOnClickListener(mainlistner);

    }
}
