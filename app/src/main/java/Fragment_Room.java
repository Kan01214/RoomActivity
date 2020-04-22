import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.roomactivity.R;

import java.util.ArrayList;

public class Fragment_Room extends AppCompatActivity {
    EditText hoten, dienthoai,email,cmnd,diachi;
    Button reset,send;
    Spinner room;
    Spinner adult;
    Spinner child;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        khachhang();
        room();
        adult();
        child();
        XácNhận();
        Thôngbáo();
    }

    private void khachhang(){
        hoten      =(EditText)findViewById(R.id.edithoten);
        dienthoai  =(EditText)findViewById(R.id.editdienthoai);
        email      = (EditText) findViewById(R.id.editemail);
        cmnd       =(EditText)findViewById(R.id.editcmnd);
        diachi     = (EditText) findViewById(R.id.editdiachi);
        reset=(Button)findViewById(R.id.reset);
        send =(Button)findViewById(R.id.send);
    }

    private void room(){
        room =(Spinner)findViewById(R.id.spinnerroom);
        ArrayList<String> arrayRoom = new ArrayList<String>();
        arrayRoom.add("Standard");
        arrayRoom.add("Deluxe");
        arrayRoom.add("Superio");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayRoom);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        room.setAdapter(arrayAdapter);
    }

    private  void adult(){
        adult =(Spinner)findViewById(R.id.spinnersonguoilon);
        ArrayList<String> arrayAdult = new ArrayList<String>();
        arrayAdult.add("1");
        arrayAdult.add("2");
        arrayAdult.add("3");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayAdult);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adult.setAdapter(arrayAdapter);

    }

    private  void child(){
        child =(Spinner)findViewById(R.id.spinnersotreem);
        ArrayList<String> arrayChild = new ArrayList<String>();
        arrayChild.add("1");
        arrayChild.add("2");
        arrayChild.add("3");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayChild);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        child.setAdapter(arrayAdapter);
    }

    private void XácNhận(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Confirm");
        builder.setMessage("Are you sure?");

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                // Do nothing but close the dialog

                dialog.dismiss();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                // Do nothing
                dialog.dismiss();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }

    private void Thôngbáo(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Thông báo");
        alertDialog.setIcon(R.mipmap.ic_launcher);
        alertDialog.setMessage("Đặt Phòng Thành Công");
        alertDialog.setPositiveButton("Thoát", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.show();
    }
}

