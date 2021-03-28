package com.example.myapplicationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
Button button;
EditText number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button=findViewById(R.id.button2);
        number=findViewById(R.id.phone);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = number.getText().toString();
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
              intent.putExtra("number",user);
               startActivity(intent);
            }
        });
    }
}

/*
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".ThirdActivity">

    <TextView
        android:id="@+id/textView8"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        android:text="Verify your phone"
        android:textColor="#000"
        android:textSize="20sp"
        android:textStyle="bold"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView9"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:text="Enter the code from the SMS sent to"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView8" />

    <TextView
        android:id="@+id/checkedTextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="8dp"
        android:hint="Number"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView9" />

    <EditText
        android:id="@+id/editTextTextPersonName2"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_marginTop="55dp"
        android:background="@drawable/shape"
        android:ems="10"
        android:hint="X"
        android:inputType="textPersonName"
        android:paddingHorizontal="20dp"
        app:layout_constraintEnd_toStartOf="@+id/editTextTextPersonName4"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@+id/editTextTextPersonName3"
        app:layout_constraintTop_toBottomOf="@+id/checkedTextView" />

    <EditText
        android:id="@+id/editTextTextPersonName3"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_marginTop="181dp"
        android:background="@drawable/shape"
        android:ems="10"
        android:hint="X"
        android:inputType="textPersonName"
        android:paddingHorizontal="20dp"
        app:layout_constraintEnd_toStartOf="@+id/editTextTextPersonName2"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/editTextTextPersonName4"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_marginTop="55dp"
        android:background="@drawable/shape"
        android:ems="10"
        android:hint="X"
        android:inputType="textPersonName"
        android:paddingHorizontal="20dp"
        app:layout_constraintEnd_toStartOf="@+id/editTextTextPersonName5"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@+id/editTextTextPersonName2"
        app:layout_constraintTop_toBottomOf="@+id/checkedTextView" />

    <EditText
        android:id="@+id/editTextTextPersonName5"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_marginTop="181dp"
        android:background="@drawable/shape"

        android:ems="10"
        android:hint="X"
        android:inputType="textPersonName"
        android:paddingHorizontal="20dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@+id/editTextTextPersonName4"
        app:layout_constraintTop_toTopOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>
 */