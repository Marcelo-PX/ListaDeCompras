package br.com.up.listadecompras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

public class AddProductActivity extends AppCompatActivity {

    private TextInputEditText inputEditTextName;
    private TextInputEditText inputEditTextQuant;
    private TextInputEditText inputEditTextDescr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        inputEditTextName =  findViewById(R.id.input_text_name);
        inputEditTextQuant =  findViewById(R.id.input_text_quant);
        inputEditTextDescr =  findViewById(R.id.input_text_descr);

        String textProductName = inputEditTextName.getText().toString();
        String textProductQuant = inputEditTextQuant.getText().toString();
        String textProductDescr = inputEditTextDescr.getText().toString();



    }
}