package com.example.exampleactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;


import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    private  Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bny,bpi,bdec,bx1y,bmc,bmr,bmadd,bms,bxy,bequal,bplus,b10x,bmin,bmul,bdiv,bperc,binv,bsqrt,bsquare,bfact,bln,blog,bex,btan,bcos,bsin,basin,bacos,batan,bb1,bb2,bc,bac,bplusMinus;


    private  TextView tv1,tv2;

    private double number1 = 0.00, answer = 0.00;
    private int option = 0, number2 = 0;
    DecimalFormat decimalFormat = new DecimalFormat("0.0000");

    private double[] storeAnswerInArray = new double[1];

    @SuppressLint("SetTextI18n")
    public void operations() {
        try{
            switch (option) {
                case 1:
                    answer = number1 + Double.parseDouble(String.valueOf(tv2.getText()));
                    tv1.setText("");

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));

                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;
                case 2:
                    answer = number1 - Double.parseDouble(String.valueOf(tv2.getText()));
                    tv1.setText("");

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;
                case 3:
                    answer = number1 * Double.parseDouble(String.valueOf(tv2.getText()));
                    tv1.setText("");

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;
                case 4:
                    answer = number1/Double.parseDouble(String.valueOf(tv2.getText()));
                    tv1.setText("");

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;
                case 5:
                    if(tv2.getText().toString().equals("")) {
                        answer = number1/100;
                        tv1.setText("");

                        if(answer%1 == 0) {
                            int convertAnswerToInt = (int)answer;
                            tv2.setText(Integer.toString(convertAnswerToInt));
                        }else {
                            String df = decimalFormat.format(answer);
                            tv2.setText(df);
                        }
                    }else {
                        answer = number1%Double.parseDouble(String.valueOf(tv2.getText()));
                        tv1.setText("");

                        if(answer%1 == 0) {
                            int convertAnswerToInt = (int)answer;
                            tv2.setText(Integer.toString(convertAnswerToInt));
                        }else {
                            String df = decimalFormat.format(answer);
                            tv2.setText(df);
                        }
                    }
                    break;

                case 6:
                    answer = Math.sin(Math.toRadians(number1));
                    tv1.setText("");

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;
                case 7:
                    answer = Math.cos(Math.toRadians(number1));

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;
                case 8:
                    answer = Math.tan(Math.toRadians(number1));

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;

                case 9:
                    answer = Math.asin(Math.toRadians(number1));

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;

                case 10:
                    answer = Math.acos(Math.toRadians(number1));

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;

                case 11:
                    answer = Math.atan(Math.toRadians(number1));

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;

                case 12:
                    answer = Math.log10(number1);

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;

                case 13:
                    answer = Math.pow(10, number1);

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;

                case 14:
                    answer = 1/number1;

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;

                case 15:
                    answer = Math.pow(number1, 2);

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;

                case 16:
                    answer = Math.pow(Math.E, number1);

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;

                case 17:
                    answer = Math.log(number1);

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;

                case 18:
                    answer = Math.pow(number1, Double.parseDouble(String.valueOf(tv2.getText())));

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;

                case 19:
                    answer = Math.pow(number1, 1/Double.parseDouble(String.valueOf(tv2.getText())));

                    if(answer%1 == 0) {
                        int convertAnswerToInt = (int)answer;
                        tv2.setText(Integer.toString(convertAnswerToInt));
                    }else {
                        String df = decimalFormat.format(answer);
                        tv2.setText(df);
                    }
                    break;
                case 20:
                    tv2.setText(Integer.toString(Integer.parseInt(String.valueOf(number2), 2)));
                    break;

                case 21:
                    int count = 0;
                    int[] binary = new int[10000];

                    while(number2 > 0) {
                        binary[count++] = number2%2;
                        number2 = number2/2;
                    }

                    for (int x = count - 1; x >= 0; x--) {
                        tv2.setText(tv2.getText() + String.valueOf(binary[x]));
                    }
                    break;

                default:
                    tv1.setText("");
                    tv2.setText("Error");
                    break;
            }
        }catch (Exception exception) {
            tv1.setText("");
            tv2.setText("Error");
        }
    }



    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);



        tv1 = findViewById(R.id.tvsec);
        tv2 = findViewById(R.id.tvmain);

        b0 = (Button)findViewById(R.id.b0);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        b7 = (Button)findViewById(R.id.b7);
        b8 = (Button)findViewById(R.id.b8);
        b9 = (Button)findViewById(R.id.b9);

        bdot = findViewById(R.id.bdot);
        bplusMinus = findViewById(R.id.bplusMinus);
        bac = findViewById(R.id.bac);
        bc = findViewById(R.id.bc);
        bequal = findViewById(R.id.bequal);

        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        bperc = findViewById(R.id.bperc);

        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        basin = findViewById(R.id.basin);
        bacos = findViewById(R.id.bacos);
        batan = findViewById(R.id.batan);

        b10x = findViewById(R.id.b10x);
        binv = findViewById(R.id.binv);
        blog = findViewById(R.id.blog);
        bsquare = findViewById(R.id.bsquare);
        bx1y = findViewById(R.id.bx1y);
        bln = findViewById(R.id.bln);
        bex = findViewById(R.id.bex);
        bxy = findViewById(R.id.bxy);
        bny = findViewById(R.id.bny);
        bdec = findViewById(R.id.bdec);

        bmc = findViewById(R.id.bmc);
        bmadd = findViewById(R.id.bmadd);
        bms  = findViewById(R.id.bms);
        bmr = findViewById(R.id.bmr);



        b0.setOnClickListener(new View.OnClickListener() {
            // @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(tv2.getText().toString().length() < 8) {
                    tv2.setText(tv2.getText() + "0");
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv2.getText().toString().length() < 8) {
                    tv2.setText(tv2.getText() + "1");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv2.getText().toString().length() < 8) {
                    tv2.setText(tv2.getText() + "2");
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv2.getText().toString().length() < 8) {
                    tv2.setText(tv2.getText() + "3");
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv2.getText().toString().length() < 8) {
                    tv2.setText(tv2.getText() + "4");
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv2.getText().toString().length() < 8) {
                    tv2.setText(tv2.getText() + "5");
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv2.getText().toString().length() < 8) {
                    tv2.setText(tv2.getText() + "6");
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv2.getText().toString().length() < 8) {
                    tv2.setText(tv2.getText() + "7");
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv2.getText().toString().length() < 8) {
                    tv2.setText(tv2.getText() + "8");
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv2.getText().toString().length() < 8) {
                    tv2.setText(tv2.getText() + "9");
                }
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().contains(".")) {
                    tv2.setText(tv2.getText() + ".");
                }
            }
        });

        bplusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    number1 = number1 * (-1);

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv2.setText(Integer.toString(convertNumberToInt));
                    }else {
                        tv2.setText(Double.toString(number1));
                    }
                }else {
                    tv2.setText("-");
                }
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText("");
                tv2.setText("");
            }
        });

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bsp = null;

                if(tv2.getText().length() > 0) {
                    StringBuilder stringBuilder = new StringBuilder(tv2.getText());
                    stringBuilder.deleteCharAt(tv2.getText().length() - 1);
                    bsp = stringBuilder.toString();
                    tv2.setText(bsp);
                }
            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 1;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText(Integer.toString(convertNumberToInt) + " + ");
                    }else {
                        tv1.setText(Double.toString(number1) + " + ");
                    }
                }else {
                    tv1.setText("0 +");
                }
            }
        });

        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 2;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText(Integer.toString(convertNumberToInt) + " + ");
                    }
                }else {
                    tv1.setText("0 -");
                }
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 3;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText(Integer.toString(convertNumberToInt) + " × ");
                    }else {
                        tv1.setText(Double.toString(number1) + " × ");
                    }
                }else {
                    tv1.setText("0 ×");
                }
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 4;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText(Integer.toString(convertNumberToInt) + " ÷ ");
                    }else {
                        tv1.setText(Double.toString(number1) + " ÷ ");
                    }
                }else {
                    tv1.setText("0 ÷");
                }
            }
        });

        bperc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 5;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText(Integer.toString(convertNumberToInt) + "%");
                    }else {
                        tv1.setText(Double.toString(number1) + "%");
                    }
                }else {
                    tv1.setText("0%");
                }
            }
        });

        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 6;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText("sin(" + Integer.toString(convertNumberToInt) + ")");
                    }else {
                        tv1.setText("sin(" + Double.toString(number1) + ")");
                    }
                }else {
                    tv1.setText("sin(0)");
                }
            }
        });

        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 7;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText("cos(" + Integer.toString(convertNumberToInt) + ")");
                    }else {
                        tv1.setText("cos(" + Double.toString(number1) + ")");
                    }
                }else {
                    tv1.setText("cos(0)");
                }
            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 8;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText("tan(" + Integer.toString(convertNumberToInt) + ")");
                    }else {
                        tv1.setText("tan(" + Double.toString(number1) + ")");
                    }
                }else {
                    tv1.setText("tan(0)");
                }
            }
        });

        basin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 9;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText("sin1(" + Integer.toString(convertNumberToInt) + ")");
                    }else {
                        tv1.setText("sin1(" + Double.toString(number1) + ")");
                    }
                }else {
                    tv1.setText("sin1(0)");
                }
            }
        });

        bacos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 10;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText("cos1(" + Integer.toString(convertNumberToInt) + ")");
                    }else {
                        tv1.setText("cos1(" + Double.toString(number1) + ")");
                    }
                }else {
                    tv1.setText("cos1(0)");
                }
            }
        });

        batan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 11;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText("tan1(" + Integer.toString(convertNumberToInt) + ")");
                    }else {
                        tv1.setText("tan1(" + Double.toString(number1) + ")");
                    }
                }else {
                    tv1.setText("tan1(0)");
                }
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 12;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText("log10(" + Integer.toString(convertNumberToInt) + ")");
                    }else {
                        tv1.setText("log10(" + Double.toString(number1) + ")");
                    }
                }else {
                    tv1.setText("log10(0)");
                }
            }
        });

        b10x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 13;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText("10^" + Integer.toString(convertNumberToInt));
                    }else {
                        tv1.setText("10^" + Double.toString(number1) );
                    }
                }else {
                    tv1.setText("10^0)");
                }
            }
        });

        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 14;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText("1/" + Integer.toString(convertNumberToInt));
                    }else {
                        tv1.setText("1/" + Double.toString(number1));
                    }
                }else {
                    tv1.setText("1/0");
                }
            }
        });

        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 15;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText(Integer.toString(convertNumberToInt) + "^2");
                    }else {
                        tv1.setText(Double.toString(number1) + "^2");
                    }
                }else {
                    tv1.setText("0^2");
                }
            }
        });

        bex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 16;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText("e^" + Integer.toString(convertNumberToInt));
                    }else {
                        tv1.setText("e^" + Double.toString(number1));
                    }
                }else {
                    tv1.setText("e^");
                }
            }
        });

        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 17;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText("ln(" + Integer.toString(convertNumberToInt) + ")");
                    }else {
                        tv1.setText("ln(" + Double.toString(number1) + ")");
                    }
                }else {
                    tv1.setText("ln(0)");
                }
            }
        });

        bxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 18;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText(Integer.toString(convertNumberToInt) + "^");
                    }else {
                        tv1.setText(Double.toString(number1) + "^");
                    }
                }else {
                    tv1.setText("0^");
                }
            }
        });

        bx1y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number1 = Double.parseDouble(String.valueOf(tv2.getText()));
                    tv2.setText("");
                    option = 19;

                    if(number1%1 == 0) {
                        int convertNumberToInt = (int)number1;
                        tv1.setText(Integer.toString(convertNumberToInt) + "^1/");
                    }else {
                        tv1.setText(Double.toString(number1) + "^1/");
                    }
                }else {
                    tv1.setText("0^1/");
                }
            }
        });

        bdec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("")) {
                    number2 = Integer.parseInt(String.valueOf(tv2.getText()));
                    option = 20;
                    tv2.setText("");

                    tv1.setText(Integer.toString(number2));

                }else {
                    tv1.setText("0");
                }
            }
        });

        bny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(!tv2.getText().toString().equals("")) {
                    number2 = Integer.parseInt(String.valueOf(tv2.getText()));
                    option = 21;
                    tv2.setText("");

                    tv1.setText(Integer.toString(number2));

                }else {
                    tv1.setText("0");
                }
            }
        });

        bmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText (Activity2.this,"Memory erased", Toast.LENGTH_LONG);
                for(int x = 0; x < storeAnswerInArray.length; x++) {
                    storeAnswerInArray[x] = 0;
                    tv2.setText("");
                    tv1.setText("");
                }

            }
        });

        bmadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int x = 0; x < storeAnswerInArray.length; x++) {
                    if(storeAnswerInArray[x] != 0 ) {
                        storeAnswerInArray[x] = storeAnswerInArray[x] + Double.parseDouble(String.valueOf(tv2.getText()));

                        if(storeAnswerInArray[x]%1 == 0) {
                            int convertNumberToInteger = (int)storeAnswerInArray[x];
                            tv1.setText("");
                            tv2.setText(Integer.toString(convertNumberToInteger ));
                        }else {
                            tv1.setText("");
                            tv2.setText(Double.toString(storeAnswerInArray[x]));
                        }
                    }else if(storeAnswerInArray[x] == 0) {
                        if(tv2.getText().toString().equals("")) {
                            tv1.setText("");
                            tv2.setText("Error");
                        }else {
                            storeAnswerInArray[x] = Double.parseDouble(String.valueOf(tv2.getText()));
                        }
                    }
                }
            }
        });

        bms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int x = 0; x < storeAnswerInArray.length; x++) {
                    if(storeAnswerInArray[x] != 0 ) {
                        storeAnswerInArray[x] = storeAnswerInArray[x] - Double.parseDouble(String.valueOf(tv2.getText()));

                        if(storeAnswerInArray[x]%1 == 0) {
                            int convertNumberToInteger = (int)storeAnswerInArray[x];
                            tv1.setText("");
                            tv2.setText(Integer.toString(convertNumberToInteger ));
                        }else {
                            tv1.setText("");
                            tv2.setText(Double.toString(storeAnswerInArray[x]));
                        }
                    }else {
                        tv2.setText("Error");
                    }
                }
            }
        });

        bmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int x = 0; x < storeAnswerInArray.length; x++) {
                    tv2.setText(Double.toString(storeAnswerInArray[x]));

                    if(storeAnswerInArray[x]%1 == 0) {
                        int convertNumberToInteger = (int)storeAnswerInArray[x];
                        tv1.setText("");
                        tv2.setText(Integer.toString(convertNumberToInteger ));
                    }else {
                        tv1.setText("");
                        tv1.setText(Double.toString(storeAnswerInArray[x]));
                    }
                }
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operations();
                tv1.setText("");
                number1 = 0;
                number2 = 0;
                answer = 0;
            }
        });
    }
}