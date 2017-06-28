package kr.edcan.rxandroidexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservableAll;

public class MainActivity extends AppCompatActivity {
    private TextView textHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textHello = (TextView) findViewById(R.id.text_hello);

//        Observable.just(textHello.getText().toString())
//                .map(str -> str + " Rx!")
//                .subscribe(text -> textHello.setText(text));

        Observable.range(1, 9)
                .map(i -> i + " * " + 3 + " = " + (i*3) + "\n")
                .subscribe(textHello::append);
    }
}
