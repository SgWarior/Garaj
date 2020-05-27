package lapolina.md;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;

public class Unit {
  ImageButton plus;
  ImageButton minus;
  private Integer counter;
  private TextView counterView;
  private TextView stockView;
  private CheckBox checkBox ;


    public Unit(View plus, View minus, View counterView, View stockView, CheckBox checkBox) {
        counter = 0;
        this.plus = (ImageButton) plus;
        this.minus= (ImageButton) minus;
        setPlus_listener();
        setMinus_listener();
        this.counterView = (TextView) counterView;
        this.stockView = (TextView) counterView;
        this.checkBox = checkBox;
    }

    public void setStock(int dbData){
        stockView.setText(dbData);
    }

    private void setPlus_listener (){
        View.OnClickListener listener = v -> counter = plusButton(counter, counterView,checkBox);
        plus.setOnClickListener(listener);}
    private void setMinus_listener (){
        View.OnClickListener listiner = v -> counter = minusButton(counter, counterView,checkBox);
        minus.setOnClickListener(listiner);}

    private int plusButton(int x, TextView view, CheckBox checkBox){
        if (x<99 && !checkBox.isChecked()) {
            x++;
            String y = Integer.toString(x);
            view.setTextSize(30);
            view.setText(y);
        }
        return x;
    }
    private int minusButton(int x, TextView view, CheckBox checkBox){
        if (x>0&& !checkBox.isChecked()) {
            x--;
            String y = Integer.toString(x);
            view.setTextSize(30);
            view.setText(y);
        } return x;
    }
}