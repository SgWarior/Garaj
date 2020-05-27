package lapolina.md;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class paketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket);
        init();

        CheckBox acepter = findViewById(R.id.aceptButton);
        Button send_comanda = findViewById(R.id.send_comanda);

        acepter.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) send_comanda.setBackgroundColor(Color.YELLOW);
            else send_comanda.setBackgroundColor(Color.RED);
        });
        send_comanda.setOnClickListener(v -> {
            if(acepter.isChecked()){
                send_comanda.setBackgroundColor(Color.GREEN);
            send_comanda.setText("Заявка Отправленна");
            acepter.setClickable(false);}
        });


    }
    private void init() {
        Unit p14_32 = new Unit(findViewById(R.id.p14_32_plus), findViewById(R.id.p14_32_minus), findViewById(R.id.img_counter14_32), findViewById(R.id.stock14_32), findViewById(R.id.aceptButton));
        Unit m210 = new Unit(findViewById(R.id.m210_plus), findViewById(R.id.m210_minus), findViewById(R.id.img_counter_m210), findViewById(R.id.stock_m210), findViewById(R.id.aceptButton));
        Unit p50ban = new Unit(findViewById(R.id.p50_plus), findViewById(R.id.p50_minus), findViewById(R.id.img_counter_50b), findViewById(R.id.stock_50b), findViewById(R.id.aceptButton));
        Unit p1lei = new Unit(findViewById(R.id.p1lei_plus), findViewById(R.id.p1lei_minus), findViewById(R.id.img_counter_1lei), findViewById(R.id.stock_1lei), findViewById(R.id.aceptButton));
        Unit bnw = new Unit(findViewById(R.id.bnw_plus), findViewById(R.id.bnw_minus), findViewById(R.id.img_counter_bnw), findViewById(R.id.stock_bnw), findViewById(R.id.aceptButton));
        Unit manusi = new Unit(findViewById(R.id.manusi_plus), findViewById(R.id.manusi_minus), findViewById(R.id.img_counter_manusi), findViewById(R.id.stock_manusi), findViewById(R.id.aceptButton));
    }

}
