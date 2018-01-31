package riobener.divisionanalysis;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button num0;
    Button result;
    Button clear;
    TextView numField;
    Toast toast;
    Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setObjects();
        makeClickableObjects();

        intent = new Intent(this,ResultActivity.class);




    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.number1:
                numField.setText(numField.getText()+ num1.getText().toString());
                break;
            case R.id.number2:
                numField.setText(numField.getText()+ num2.getText().toString());
                break;
            case R.id.number3:
                numField.setText(numField.getText()+ num3.getText().toString());
                break;
            case R.id.number4:
                numField.setText(numField.getText()+ num4.getText().toString());
                break;
            case R.id.number5:
                numField.setText(numField.getText()+ num5.getText().toString());
                break;
            case R.id.number6:
                numField.setText(numField.getText()+ num6.getText().toString());
                break;
            case R.id.number7:
                numField.setText(numField.getText()+ num7.getText().toString());
                break;
            case R.id.number8:
                numField.setText(numField.getText()+ num8.getText().toString());
                break;
            case R.id.number9:
                numField.setText(numField.getText()+ num9.getText().toString());
                break;
            case R.id.number0:
                if(numField.getText()==""){
                    toast = Toast.makeText(getApplicationContext(),"Нельзя начинать число с нуля!!!",Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    numField.setText(numField.getText()+ num0.getText().toString());

                }


                break;
            case R.id.Clear:
                numField.setText("");
                break;
            case R.id.result:
                if(numField.getText()=="") {
                    toast = Toast.makeText(getApplicationContext(), "Не оставляйте поле ввода пустым!", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    intent.putExtra("con",Integer.parseInt(numField.getText().toString()));
                    startActivity(intent);
                    break;

                }

        }
    }

    private void setObjects(){
        num1 = (Button)findViewById(R.id.number1);
        num2 = (Button)findViewById(R.id.number2);
        num3 = (Button)findViewById(R.id.number3);
        num4 = (Button)findViewById(R.id.number4);
        num5 = (Button)findViewById(R.id.number5);
        num6 = (Button)findViewById(R.id.number6);
        num7 = (Button)findViewById(R.id.number7);
        num8 = (Button)findViewById(R.id.number8);
        num9 = (Button)findViewById(R.id.number9);
        num0 = (Button)findViewById(R.id.number0);
        clear = (Button)findViewById(R.id.Clear);
        result = (Button)findViewById(R.id.result);
        numField = (TextView)findViewById(R.id.MainField);
    }
    private void makeClickableObjects(){
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        num0.setOnClickListener(this);
        clear.setOnClickListener(this);
        result.setOnClickListener(this);
    }
}
