package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.project2.R;

import java.time.Instant;
import java.util.Random;

import javax.xml.transform.Result;

public class MainActivity2 extends AppCompatActivity {
    public static final int count = 0;
    public static final String text = " ";
    private boolean flag = false;
    public static final String FLAG = "FLAG";
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    private TextView textView;
    private TextView textView2;
    private TextView textView3;
    private Button Next;
    private Button done;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    public String str = Random();
    int TrueCount = 0;
    int FalseCount = 0;


    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setupSharedPrefs();
        checkPrefs();
        int countold=TrueCount;

        if(!flag) {
            editor.putInt("count", countold);
            editor.putBoolean(FLAG, true);
            editor.commit();


        }
        Random rand = new Random();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2 = findViewById(R.id.show);
        textView3 = findViewById(R.id.textsuors);
        textView3.setText("Qustion " +" "+ counter +"  "+ "   OF" + " 10");
        textView = findViewById(R.id.text);
        button1 = findViewById(R.id.button1);
        button1.setVisibility(View.GONE);
        button2 = findViewById(R.id.button2);
        button2.setVisibility(View.GONE);
        button3 = findViewById(R.id.button3);
        button3.setVisibility(View.GONE);
        textView2.setText(TrueCount + "");
        Next = findViewById(R.id.Next);
        Next.setText("Start");
        done = findViewById(R.id.done);
        button4 = findViewById(R.id.larn);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
                finish();
            }
        });


        Next.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                button4.setVisibility(View.GONE);
                button3.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                button1.setVisibility(View.VISIBLE);
                Next.setText("Next");


                int x = rand.nextInt(3);
                System.out.println(x);

                textView3.setText("Qustion " + counter + "OF" + " 10");
                String s = Random();
                int rs = result(s);
                if (counter != 10) {

                    textView.setText(s);
                    if (x == 0) {
                        button1.setText(rs + "");
                        button1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if (Integer.parseInt(String.valueOf(button1.getText())) == rs) {
                                    TrueCount++;
                                    textView2.setText("Score :" + TrueCount);
                                }
                            }
                        });
                        int number = rand.nextInt(10);
                        while (number == rs) {
                            number = rand.nextInt(10);
                        }
                        button2.setText(number + "");
                        int number2 = rand.nextInt((20 - 10) + 1) + 10;
                        while (number2 == rs) {
                            number2 = rand.nextInt((20 - 10) + 1) + 10;
                        }
                        button3.setText(number2 + "");


                    }
                    if (x == 1) {
                        button2.setText(rs + "");
                        button2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                if (Integer.parseInt(String.valueOf(button2.getText())) == rs) {
                                    TrueCount++;
                                    textView2.setText("Score :" + TrueCount);
                                }
                            }
                        });
                        int number = rand.nextInt(10);
                        while (number == rs) {
                            number = rand.nextInt(10);
                        }
                        button1.setText(number + "");
                        int number2 = rand.nextInt((20 - 10) + 1) + 10;
                        while (number2 == rs) {
                            number2 = rand.nextInt((20 - 10) + 1) + 10;
                        }
                        button3.setText(number2 + "");

                    }
                    if (x == 2) {
                        button3.setText(rs + "");
                        button3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if (Integer.parseInt(String.valueOf(button3.getText())) == rs) {
                                    TrueCount++;
                                    textView2.setText("Score :" + TrueCount);
                                }
                            }
                        });
                        int number = rand.nextInt(10);
                        while (number == rs) {
                            number = rand.nextInt(10);
                        }
                        button1.setText(number + "");
                        int number2 = rand.nextInt((20 - 10) + 1) + 10;
                        while (number2 == rs) {
                            number2 = rand.nextInt((20 - 10) + 1) + 10;
                        }
                        button2.setText(number2 + "");

                    }
                    counter++;

                } else {
                    finish();
                }


            }

        });




        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    private String Random() {
        String s;
        String arryOfNumbers[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String arryOfoperations[] = {"+", "-", "*", "/"};
        Random rand = new Random();
        int FirstRandom = rand.nextInt(10);
        int SecenddRandom = rand.nextInt(10);
        int operationsRandom = rand.nextInt(4);
        if (arryOfoperations[operationsRandom].equals("-")) {
            if (SecenddRandom > FirstRandom) {
                return s = arryOfNumbers[SecenddRandom] + " " + arryOfoperations[operationsRandom] + " "
                        + arryOfNumbers[FirstRandom];
            }
        }
        while (Integer.parseInt(arryOfNumbers[SecenddRandom]) == 0 && arryOfoperations[operationsRandom].equals("/")) {
            SecenddRandom = rand.nextInt(10);
        }
        return arryOfNumbers[FirstRandom] + " "
                + arryOfoperations[operationsRandom] + " " + arryOfNumbers[SecenddRandom];
    }


    public int result(String s) {
        String Str[] = s.split(" ");
        int FirstNumber = Integer.parseInt(Str[0]);
        int SecendNumber = Integer.parseInt(Str[2]);
        int res = 0;
        String operations = Str[1].trim();

        if (operations.equals("+")) {
            res = FirstNumber + SecendNumber;
        } else if (operations.equals("-")) {
            res = FirstNumber - SecendNumber;


        } else if (operations.equals("*")) {
            res = FirstNumber * SecendNumber;

        } else if (operations.equals("/")) {
            res = FirstNumber / SecendNumber;

        }
        return res;
    }
    private void checkPrefs() {
        flag = prefs.getBoolean(FLAG, false);

        if(flag){

            int countold=prefs.getInt(String.valueOf(count),0);

            countold=TrueCount;
        }
    }

    private void setupSharedPrefs() {
        prefs= PreferenceManager.getDefaultSharedPreferences(this);
        editor = prefs.edit();
    }

}