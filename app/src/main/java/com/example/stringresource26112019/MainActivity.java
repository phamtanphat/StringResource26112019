package com.example.stringresource26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEditAccount , mEditPass;
    Button mBtnLogin;
    TextView mTxtDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditAccount = findViewById(R.id.edittextTaikhoan);
        mEditPass = findViewById(R.id.edittextMatkhau);
        mBtnLogin = findViewById(R.id.buttonDangnhap);
        mTxtDisplay = findViewById(R.id.textviewThongtin);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = mEditAccount.getText().toString();
                String pass = mEditPass.getText().toString();

                if (account.equals("phat") && pass.equals("123456")){
                    mTxtDisplay.setText("Tài khoản : "+ account + "\n" +"Mật khẩu : " + pass);
                }else{
                    Toast.makeText(MainActivity.this, "Sai thông tin", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
