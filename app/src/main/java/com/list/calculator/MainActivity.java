package com.list.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    EditText editText;

    float mValueOne, mValueTwo;

    boolean Addition, mSubtract, Multiplication, Division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       button0 = findViewById(R.id.button0);
       button1 = findViewById(R.id.button1);
       button2 = findViewById(R.id.button2);
       button3 = findViewById(R.id.button3);
       button4 = findViewById(R.id.button4);
       button5 = findViewById(R.id.button5);
       button6 = findViewById(R.id.button6);
       button7 = findViewById(R.id.button7);
       button8 = findViewById(R.id.button8);
       button9 = findViewById(R.id.button9);
       button10 = findViewById(R.id.button10);
       buttonAdd = findViewById(R.id.buttonadd);
       buttonC = findViewById(R.id.buttonC);
       buttonDivision = findViewById(R.id.buttondiv);
       buttonEqual = findViewById(R.id.buttoneql);
       buttonMul = findViewById(R.id.buttonmul);
       buttonSub = findViewById(R.id.buttonsub);
       editText = findViewById(R.id.edt1);


      button1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              editText.setText(editText.getText() + "1");
          }
      });

      button2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              editText.setText(editText.getText() + "2");
          }
      });

      button3.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              editText.setText(editText.getText() + "3");
          }
      });

      button4.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              editText.setText(editText.getText() + "4");
          }
      });

      button5.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              editText.setText(editText.getText() + "5");

          }
      });

      button6.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              editText.setText(editText.getText() + "6");
          }
      });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    mValueOne = Float.parseFloat(editText.getText() + "");
                    Addition = true;
                    editText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                mSubtract = true;
                editText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                Multiplication = true;
                editText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                Division = true;
                editText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(editText.getText() + "");

                if (Addition == true) {
                    editText.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }

                if (mSubtract == true) {
                    editText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (Multiplication == true) {
                    editText.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    editText.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });
    }
}