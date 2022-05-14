package com.example.shaalgo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

/**
 * @author Ravi badami
 */

public class MainActivity extends AppCompatActivity {
    private RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnSHA(View v){
        EditText etInput=(EditText) findViewById(R.id.etInput);
        TextView tvOutput=(TextView)findViewById(R.id.tvOutPut);
        tvOutput.setSelected(true);


        RadioGroup rg= (RadioGroup) findViewById(R.id.rg);
        int check=rg.getCheckedRadioButtonId();
        RadioButton rb=(RadioButton) findViewById(check);


        byte[] inputData=etInput.getText().toString().getBytes();
        byte[] outputData=new byte[0];

        try {
            outputData=sha.encryptSHA(inputData,rb.getText().toString());

        }
        catch (Exception e){
            e.printStackTrace();

        }
        BigInteger shaData = new BigInteger(1,outputData);
        tvOutput.setText(shaData.toString(16));
    }
}