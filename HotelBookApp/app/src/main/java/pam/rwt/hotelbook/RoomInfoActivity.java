package pam.rwt.hotelbook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class RoomInfoActivity extends AppCompatActivity {
    Calendar myCalendar;
    EditText editText,edCheckout,edNum;
    String name, email,phone,address,numberofperson,roomType;
    Spinner spinnerType;
    Button btnPreview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_info);


        Intent i=getIntent();
        name=i.getStringExtra("name");
        email=i.getStringExtra("email");
        phone=i.getStringExtra("phone");
        address=i.getStringExtra("address");
        roomType=i.getStringExtra("roomType");
        numberofperson=i.getStringExtra("numberofperson");


        myCalendar = Calendar.getInstance();

        editText=(EditText) findViewById(R.id.edCheckin);
        edCheckout=(EditText) findViewById(R.id.edCheckout);
        spinnerType=findViewById(R.id.spinnerType);
        btnPreview=findViewById(R.id.btnPreview);
        edNum=findViewById(R.id.edName);

        //spinnerType.setSelection(MainActivity.roomType);
        //spinnerType.setSelection(MainActivity.roomType);
        btnPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().equals("")){
                    Toast.makeText(RoomInfoActivity.this,"Please enter checkin date", Toast.LENGTH_SHORT).show();
                }
                else if(edCheckout.getText().toString().equals("")){
                    Toast.makeText(RoomInfoActivity.this,"Please enter checkout date", Toast.LENGTH_SHORT).show();
                }
                if(edNum.getText().toString().equals("")){
                    Toast.makeText(RoomInfoActivity.this,"Please enter number of rooms you want to book", Toast.LENGTH_SHORT).show();
                }
                if(spinnerType.getSelectedItem().toString().contains("Select")){
                    Toast.makeText(RoomInfoActivity.this,"Please enter room type", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(RoomInfoActivity.this, FinalActivity.class);
                    i.putExtra("name", name);
                    i.putExtra("address", address);
                    i.putExtra("phone", phone);
                    i.putExtra("numberofperson", numberofperson);
                    i.putExtra("email", email);
                    i.putExtra("roomType", spinnerType.getSelectedItem().toString());
                    i.putExtra("checkin", editText.getText().toString());
                    i.putExtra("checkout", edCheckout.getText().toString());
                    i.putExtra("num", edNum.getText().toString());
                    startActivity(i);
                }
            }
        });


        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                myCalendar.set(Calendar.YEAR,year);
                myCalendar.set(Calendar.MONTH, month);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel(myCalendar,editText);
            }
        };
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(RoomInfoActivity.this,date,myCalendar.get(Calendar.YEAR),myCalendar.get(Calendar.MONTH),myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });


        DatePickerDialog.OnDateSetListener date2 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                myCalendar.set(Calendar.YEAR,year);
                myCalendar.set(Calendar.MONTH, month);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel(myCalendar,edCheckout);
            }
        };
        edCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(RoomInfoActivity.this,date2,myCalendar.get(Calendar.YEAR),myCalendar.get(Calendar.MONTH),myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

    }

    private void updateLabel(Calendar myCalendar, EditText editText){
        String myFormat="MM/dd/yy";
        SimpleDateFormat dateFormat=new SimpleDateFormat(myFormat, Locale.US);
        editText.setText(dateFormat.format(myCalendar.getTime()));
    }
}