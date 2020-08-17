package sg.edu.rp.c346.p12quizd1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Spinner spinner;
    CheckBox english, chinese, malay;
    Button submit;

    ArrayList<String> alCountries;
    ArrayAdapter<String> aaCountries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Declaration Form");

        etName = findViewById(R.id.editTextName);
        spinner = findViewById(R.id.spinnerCountry);
        english = findViewById(R.id.cbEnglish);
        chinese = findViewById(R.id.cbChinese);
        malay = findViewById(R.id.cbMalay);
        submit = findViewById(R.id.buttonSubmit);

        // TODO: Question 3: Do the required initialization of the ArrayList and ArrayAdapter and populating the spinner with the required values
        //Initialise the Array List
        alCountries = new ArrayList<>();
        aaCountries = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,alCountries);

        //Get the string-array and store as an Array
        String[] strCountries = getResources().getStringArray(R.array.myCountries);

        //Convert Array to List and add to the ArrayList
        alCountries.addAll(Arrays.asList(strCountries));


        //Bind the ArrayAdapter to the spinner
        spinner.setAdapter(aaCountries);

        submit.setOnClickListener(new View.OnClickListener() {

            //Inflate the input.xml layout file
            LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View viewDialog = inflater.inflate(R.layout.etName, null);


            //Create  the Dialog builder

            AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);


             myBuilder.setTitle("Form Validation);
             myBuilder.setMessage("Please Choose at least 1 language");
             myBuilder.setCancelable(false);

            //Configure "positive" button
            myBuilder.setPositiveButton("Form Submitted", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    //Extract the text entered by the user



                }


            });






        });


    }
}