package com.example.try_fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu2,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle menu item clicks
        int id = item.getItemId();

        if (id == R.id.setting) {
            Toast.makeText(MainActivity3.this, "Comming Soon..", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.help) {
            Toast.makeText(MainActivity3.this, "Comming Soon..", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.Profile) {
            Toast.makeText(MainActivity3.this, "Comming Soon..", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.Logout) {
            Toast.makeText(MainActivity3.this, "Comming Soon..", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    ImageButton imageButton44;
    EditText  EnteredID_U;
    Button insert, update, delete, view;
    Database DB;
    ImageButton imageButton43;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        FragmentManager fragmentManager=getSupportFragmentManager();
        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        EnteredID_U= findViewById(R.id.userID_FK);
        insert = findViewById(R.id.btnInsert);
        update = findViewById(R.id.btnUpdate);
        //delete = findViewById(R.id.btnDelete);
        view = findViewById(R.id.btnView);
        DB = new Database(this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String EnteredID_UTXT = EnteredID_U.getText().toString();


                Boolean check_insert_data = DB.insertuserdataU(EnteredID_UTXT);
                if(check_insert_data==true){
                    Toast.makeText(MainActivity3.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                    Log.d("OUTPUT", "New Entry Inserted");}
                else
                {Toast.makeText(MainActivity3.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();
                    Log.d("OUTPUT", "New Entry  Not Inserted");}
            }        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toolbar toolbar =findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);

                String EnteredID_UTXT = EnteredID_U.getText().toString();



                Boolean check_update_data = DB.updateuserdataU(EnteredID_UTXT );
                if(check_update_data==true){
                    new  Database(MainActivity3.this).User_EdumpCursorInLogCat();
                    Toast.makeText(MainActivity3.this, "Entry Entered", Toast.LENGTH_SHORT).show();
                    Log.d("OUTPUT", " Entry Updated");}
                else
                { Toast.makeText(MainActivity3.this, "New Entry Not Entered", Toast.LENGTH_SHORT).show();
                    Log.d("OUTPUT", " Entry not updated");}

            }
        });
//        delete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String VaccinenameTXT = Vaccinename.getText().toString();
//                Boolean check_delete_data = DB.deletedata(VaccinenameTXT);
//                if(check_delete_data){
//                    Toast.makeText(status_database_U.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
//                    Log.d("OUTPUT", " Entry deleted");}
//                else{
//                    Toast.makeText(status_database_U.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();
//                    Log.d("OUTPUT", " Entry not deleted");}
//            }        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new  Database(MainActivity3.this).Vaccine_SdumpCursorInLogCat();
                Cursor res = DB.getdata_U();
                if(res.getCount()==0){
                    Toast.makeText(MainActivity3.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()){

                    buffer.append("EnteredID : " + res.getString(0) + "\n");
                    buffer.append("Vaccine_name : " + res.getString(1) + "\n");
                    buffer.append("Status :" + res.getString(2) + "\n\n");

                }

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity3.this);
                builder.setCancelable(true);
                builder.setTitle("Vaccine Status");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });

        imageButton44=findViewById(R.id.imageButton44);
        imageButton44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this,MainActivity.class));


            }
        });
        imageButton43 = findViewById(R.id.imageButton43);
        imageButton43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this,MainActivity5.class));


            }
        });
    }

}
