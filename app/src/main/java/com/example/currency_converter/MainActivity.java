package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner sp1, sp2;
    EditText ed1;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = findViewById(R.id.spnfrom);
        sp2 = findViewById(R.id.spnto);
        ed1 = findViewById(R.id.amounttxt);
        btn = findViewById(R.id.conbtn);

        String[] from = new String[]{"USD, EUR,ZWL"};
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        sp1.setAdapter(ad);

        String[] to = new String[]{"USD, EUR, CAD ,ZAR ,MWK ,AUD ,RUB ,JPY, SAR, CHF, ZWL"};
        ArrayAdapter<String> ad1 = new ArrayAdapter< >(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, to);
        sp1.setAdapter(ad1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double out;
                String error = "Please use ZWL, USD, EURO on from";

                Double amount = Double.parseDouble(ed1.getText().toString());
                if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem() == "CAD")
                {
                   out = amount * 70.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem() == "ZWL")
                {
                    out = amount * 10215.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem() == "EUR")
                {
                    out = amount * 15.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem() == " ZAR")
                {
                    out = amount * 5.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem() == "MWK")
                {
                    out = amount * 105.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem() == "AUD ")
                {
                    out = amount * 1.60;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem() == "RUB")
                {
                    out = amount * 25.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem() == "JPY")
                {
                    out = amount * 1.540;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem() == " SAR")
                {
                    out = amount * 5.6540;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem() == "CHF")
                {
                    out = amount * 0.9650;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem() == "USD")
                {
                    out = amount * 1.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("ZWL") && sp2.getSelectedItem() == "ZWL")
                {
                    out = amount;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("ZWL") && sp2.getSelectedItem() == "EUR")
                {
                    out = amount / 15.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("ZWL") && sp2.getSelectedItem() == " ZAR")
                {
                    out = amount / 5.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("ZWL") && sp2.getSelectedItem() == "MWK")
                {
                    out = amount / 105.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("ZWL") && sp2.getSelectedItem() == "AUD ")
                {
                    out = amount / 1.60;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("ZWL") && sp2.getSelectedItem() == "RUB")
                {
                    out = amount / 25.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("ZWL") && sp2.getSelectedItem() == "JPY")
                {
                    out = amount / 1.540;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("ZWL") && sp2.getSelectedItem() == " SAR")
                {
                    out = amount / 5.6540;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("ZWL") && sp2.getSelectedItem() == "CHF")
                {
                    out = amount / 0.9650;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("ZWL") && sp2.getSelectedItem() == "USD")
                {
                    out = amount / 10215.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem() == "ZWL")
                {
                    out = amount * 20215.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem() == "EUR")
                {
                    out = amount;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem() == " ZAR")
                {
                    out = amount * 15.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem() == "MWK")
                {
                    out = amount * 205.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem() == "AUD ")
                {
                    out = amount * 2.60;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem() == "RUB")
                {
                    out = amount * 35.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem() == "JPY")
                {
                    out = amount * 2.540;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem() == " SAR")
                {
                    out = amount * 5.6540;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem() == "CHF")
                {
                    out = amount * 1.9650;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem() == "USD")
                {
                    out = amount * 1.650;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }
                else {
                    out = 0.0;
                    Toast.makeText(getApplicationContext(), Double.toString(out),Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}