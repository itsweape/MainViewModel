package com.example.arsitektur;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<Integer> _result = new MutableLiveData<>();
    public MutableLiveData<Integer> result = _result;

    //ketika button click manggil method ini
    public void calculate(String width, String height, String length){
        int result = Integer.parseInt(width) * Integer.parseInt(height) * Integer.parseInt(length);
        _result.setValue(result);
    }
}
