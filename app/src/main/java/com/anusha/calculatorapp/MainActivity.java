package com.anusha.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonAdd,buttonSubstract
         ,buttonMul,buttonDiv,buttonC,buttonEqual;
 EditText ed1;
    char temp;
public int num1,num2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=  findViewById(R.id.button0);
        button1= findViewById(R.id.button1);
        button2=  findViewById(R.id.button2);
        button3=  findViewById(R.id.button3);
        button4=  findViewById(R.id.button4);
        button5= findViewById(R.id.button5);
        button6=  findViewById(R.id.button6);
        button7=  findViewById(R.id.button7);
        button8= findViewById(R.id.button8);
        button9= findViewById(R.id.button9);
        buttonAdd=  findViewById(R.id.buttonAdd);
        buttonSubstract= findViewById(R.id.buttonSubstract);
        buttonMul=  findViewById(R.id.buttonMul);
        buttonDiv=  findViewById(R.id.buttonDiv);
        buttonC= findViewById(R.id.buttonC);
        buttonEqual=  findViewById(R.id.buttonEqual);
        ed1 =  findViewById(R.id.edText);

        ed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(ed1.getText() + "");
                temp = '+';
                ed1.setText(null);

            }
        });

        buttonSubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(ed1.getText() + "");
                temp = '-';
                ed1.setText(null);

            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(ed1.getText() + "");
                temp = '*';
                ed1.setText(null);

            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(ed1.getText() + "");
                temp = '/';
                ed1.setText(null);

            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");

            }
        });

buttonEqual.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        //ed1.setText(null);
        num2 = Integer.parseInt(ed1.getText() + "");
        switch (temp) {
            case '+':
            Calculatorclass ca = new Calculatorclass(num1, num2);
            result = ca.Add();
            //tvview.setText(ca.add());
                ed1.setText(result + "");
                break;

            case '-':
                Calculatorclass cs = new Calculatorclass(num1, num2);
                result = cs.Substract();
                //tvview.setText(cs.Substract());
                ed1.setText(result + "");
                break;

            case '*':
                Calculatorclass cm = new Calculatorclass( num1, num2);
                result = cm.Mul();
                //tvview.setText(cm.Mul());
                ed1.setText(result + "");
                break;

            case '/':
                Calculatorclass cd = new Calculatorclass(num1, num2);
                result = cd.Div();
                //tvview.setText(cd.Div());
                ed1.setText(result + "");
                break;
        }
    }
});

    }
}
