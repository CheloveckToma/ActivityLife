package com.example.activitylife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Вызывается при создании Активности
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
    }

    // Вызывается после завершения метода onCreate
    // Используется для восстановления состояния
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onRestoreInstanceState()", Toast.LENGTH_LONG).show();
    }

    // Вызывается перед тем, как активность снова становится видимой
    @Override
    public void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
    }

    // Вызывается, когда активность стала используемой
    @Override
    public void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
    }

    // Должен вызываться в начале видимого состояния.
    // На самом деле Android вызывает данный обработчик только
    // для Активностей, восстановленных из неактивного состояния
    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
    }

    // Вызывается перед выходом из активного состояния,
    // позволяя сохранить состояние в объекте savedInstanceState
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onSaveInstanceState()", Toast.LENGTH_LONG).show();
    }

    // Вызывается перед выходом из активного состояния
    @Override
    public void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show();
    }

    // Вызывается перед выходом из видимого состояния
    @Override
    public void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onStop()", Toast.LENGTH_LONG).show();
    }

    // Вызывается перед уничтожением активности
    @Override
    public void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
    }

}
