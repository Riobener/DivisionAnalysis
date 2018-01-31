package riobener.divisionanalysis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity  {
    TextView tv;

    Intent intent;
    String sclStr;
    int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        sclStr = "";
        tv = (TextView)findViewById(R.id.txtRes);


        intent = this.getIntent();
        n = intent.getIntExtra("con",1);


            DevisionOp(n);









    }
    private void DevisionOp(int num){
        for(int i = 1; i<=num;i++){
            if(i==num){
                sclStr+= num+" / "+i+" = "+num/i;
            }else if(num%i==0){
                sclStr+= num+" / "+i+" = "+num/i +"\n"+"\n";

            }




        }
        tv.setMovementMethod(new ScrollingMovementMethod());

        tv.setText(sclStr);
    }



}
