package com.nexti.androidtestexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    private MaterialCardView cvEquals;
    private MaterialCardView cvClear;
    private MaterialCardView cvSignal;
    private MaterialCardView cvAddition;
    private MaterialCardView cvSubtraction;
    private MaterialCardView cvMultiplication;
    private MaterialCardView cvDivision;
    private MaterialCardView cvDot;
    private MaterialCardView cv0;
    private MaterialCardView cv1;
    private MaterialCardView cv2;
    private MaterialCardView cv3;
    private MaterialCardView cv4;
    private MaterialCardView cv5;
    private MaterialCardView cv6;
    private MaterialCardView cv7;
    private MaterialCardView cv8;
    private MaterialCardView cv9;
    private TextView tvResult;
    private CalculatorViewModel calculatorViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cvEquals = findViewById(R.id.cv_equals);
        cvClear = findViewById(R.id.cv_clear);
        cvSignal = findViewById(R.id.cv_signal);
        cvAddition = findViewById(R.id.cv_addition);
        cvSubtraction = findViewById(R.id.cv_subtraction);
        cvMultiplication = findViewById(R.id.cv_multiplication);
        cvDivision = findViewById(R.id.cv_division);
        cvDot = findViewById(R.id.cv_dot);
        cv0 = findViewById(R.id.cv_0);
        cv1 = findViewById(R.id.cv_1);
        cv2 = findViewById(R.id.cv_2);
        cv3 = findViewById(R.id.cv_3);
        cv4 = findViewById(R.id.cv_4);
        cv5 = findViewById(R.id.cv_5);
        cv6 = findViewById(R.id.cv_6);
        cv7 = findViewById(R.id.cv_7);
        cv8 = findViewById(R.id.cv_8);
        cv9 = findViewById(R.id.cv_9);
        tvResult = findViewById(R.id.tv_result);

        calculatorViewModel = new ViewModelProvider(this).get(CalculatorViewModel.class);
        calculatorViewModel.getResult().observe(this, s -> tvResult.setText(s));

        cvEquals.setOnClickListener(v -> calculatorViewModel.onEqualsClicked());
        cvClear.setOnClickListener(v -> calculatorViewModel.onClearClicked());
        cvSignal.setOnClickListener(v -> calculatorViewModel.onSignalClicked());
        cvAddition.setOnClickListener(v -> calculatorViewModel.onOperatorClicked(OperationEnum.ADDITION));
        cvSubtraction.setOnClickListener(v -> calculatorViewModel.onOperatorClicked(OperationEnum.SUBTRACTION));
        cvMultiplication.setOnClickListener(v -> calculatorViewModel.onOperatorClicked(OperationEnum.MULTIPLICATION));
        cvDivision.setOnClickListener(v -> calculatorViewModel.onOperatorClicked(OperationEnum.DIVISION));
        cvDot.setOnClickListener(v -> calculatorViewModel.onDotClicked());
        cv0.setOnClickListener(v -> calculatorViewModel.onDigitClicked("0"));
        cv1.setOnClickListener(v -> calculatorViewModel.onDigitClicked("1"));
        cv2.setOnClickListener(v -> calculatorViewModel.onDigitClicked("2"));
        cv3.setOnClickListener(v -> calculatorViewModel.onDigitClicked("3"));
        cv4.setOnClickListener(v -> calculatorViewModel.onDigitClicked("4"));
        cv5.setOnClickListener(v -> calculatorViewModel.onDigitClicked("5"));
        cv6.setOnClickListener(v -> calculatorViewModel.onDigitClicked("6"));
        cv7.setOnClickListener(v -> calculatorViewModel.onDigitClicked("7"));
        cv8.setOnClickListener(v -> calculatorViewModel.onDigitClicked("8"));
        cv9.setOnClickListener(v -> calculatorViewModel.onDigitClicked("9"));
    }
}