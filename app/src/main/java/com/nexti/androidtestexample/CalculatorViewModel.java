package com.nexti.androidtestexample;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class CalculatorViewModel extends ViewModel {

    @Inject
    CalculatorRepository calculatorRepository;
    private Double firstOperand = null;
    private Double secondOperand = null;
    private OperationEnum operationEnum;
    private Boolean isNewOperand = true;
    private MutableLiveData<String> result = new MutableLiveData<>("0");

    @Inject
    public CalculatorViewModel() {
    }

    public LiveData<String> getResult() {
        return this.result;
    }

    public void onEqualsClicked() {
        secondOperand = Double.parseDouble(result.getValue());
        Double calc = null;
        switch (operationEnum) {
            case ADDITION:
                calc = calculatorRepository.getSum(firstOperand, secondOperand);
                break;
            case SUBTRACTION:
                calc = calculatorRepository.getDifference(firstOperand, secondOperand);
                break;
            case MULTIPLICATION:
                calc = calculatorRepository.getProduct(firstOperand, secondOperand);
                break;
            case DIVISION:
                calc = calculatorRepository.getQuotient(firstOperand, secondOperand);
                break;
            default:
                break;
        }
        if (calc != null) {
            BigDecimal bigDecimal = new BigDecimal(calc);
            if (bigDecimal.toBigInteger().toString().length() + bigDecimal.scale() > 12) {
                result.setValue(bigDecimal.setScale(12 - bigDecimal.toBigInteger().toString().length(), RoundingMode.HALF_UP).toPlainString());
            } else {
                result.setValue(bigDecimal.toPlainString());
            }
            firstOperand = Double.parseDouble(result.getValue());
            secondOperand = null;
            isNewOperand = true;
        }
    }

    public void onDigitClicked(String digit) {
        if (!result.getValue().matches("\\d{12}")) {
            if (isNewOperand || result.getValue().equals("0")) {
                result.setValue(digit);
                isNewOperand = false;
            } else {
                result.setValue(result.getValue() + digit);
            }
        }
    }

    public void onDotClicked() {
        if (!result.getValue().endsWith(".")) {
            result.setValue(result.getValue() + ".");
        }
    }

    public void onSignalClicked() {
        if (result.getValue().equals("0")) {
            return;
        }

        if (result.getValue().startsWith("-")) {
            result.setValue(result.getValue().replace("-", ""));
        } else {
            result.setValue("-" + result.getValue());
        }
    }

    public void onOperatorClicked(OperationEnum operator) {
        operationEnum = operator;
        firstOperand = Double.parseDouble(result.getValue());
        isNewOperand = true;
    }

    public void onClearClicked() {
        result.setValue("0");
        firstOperand = null;
        secondOperand = null;
        isNewOperand = true;
    }
}
