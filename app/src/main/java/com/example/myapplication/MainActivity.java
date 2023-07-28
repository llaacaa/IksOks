package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String znak = "X";
    private Button btn00, btn01, btn02, btn10, btn11, btn12, btn20, btn21, btn22, btnRestart;
    private TextView tvP;
    private boolean flag = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvP = findViewById(R.id.pob);

        btn00 = findViewById(R.id.btn00);
        btn01 = findViewById(R.id.btn01);
        btn02 = findViewById(R.id.btn02);

        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);

        btn20 = findViewById(R.id.btn20);
        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);

        btnRestart = findViewById(R.id.btnRestart);



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvP.setText("");
                btn00.setClickable(true);
                btn01.setClickable(true);
                btn02.setClickable(true);
                btn10.setClickable(true);
                btn11.setClickable(true);
                btn12.setClickable(true);
                btn20.setClickable(true);
                btn21.setClickable(true);
                btn22.setClickable(true);

                znak = "X";
                btn00.setText("");
                btn01.setText("");
                btn02.setText("");

                btn10.setText("");
                btn11.setText("");
                btn12.setText("");

                btn20.setText("");
                btn21.setText("");
                btn22.setText("");




            }
        });


        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn00.setClickable(false);
                btn00.setText(znak);
                if (znak.equals("X")) {
                    znak = "O";
                } else {
                    znak = "X";
                }
                initProvera();

            }
        });

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn01.setClickable(false);
                btn01.setText(znak);
                if (znak.equals("X")) {
                    znak = "O";
                } else {
                    znak = "X";
                }
                initProvera();


            }
        });

        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn02.setClickable(false);
                btn02.setText(znak);
                if (znak.equals("X")) {
                    znak = "O";
                } else {
                    znak = "X";
                }
                initProvera();


            }
        });

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn10.setClickable(false);
                btn10.setText(znak);
                if (znak.equals("X")) {
                    znak = "O";
                } else {
                    znak = "X";
                }
                initProvera();


            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn11.setClickable(false);
                btn11.setText(znak);
                if (znak.equals("X")) {
                    znak = "O";
                } else {
                    znak = "X";
                }
                initProvera();


            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn12.setClickable(false);
                btn12.setText(znak);
                if (znak.equals("X")) {
                    znak = "O";
                } else {
                    znak = "X";
                }
                initProvera();


            }
        });

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn20.setClickable(false);
                btn20.setText(znak);
                if (znak.equals("X")) {
                    znak = "O";
                } else {
                    znak = "X";
                }
                initProvera();



            }
        });

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn21.setClickable(false);
                btn21.setText(znak);
                if (znak.equals("X")) {
                    znak = "O";
                } else {
                    znak = "X";
                }
                initProvera();



            }
        });

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn22.setClickable(false);
                btn22.setText(znak);
                if (znak.equals("X")) {
                    znak = "O";
                } else {
                    znak = "X";
                }
                initProvera();



            }
        });

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    }

    private void initProvera() {
        if (btn00.getText().equals("X") && btn01.getText().equals("X") && btn02.getText().equals("X")) {
            tvP.setText("Pobednik je X");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }

        if (btn10.getText().equals("X") && btn11.getText().equals("X") && btn12.getText().equals("X")) {
            tvP.setText("Pobednik je X");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }

        if (btn20.getText().equals("X") && btn21.getText().equals("X") && btn22.getText().equals("X")) {
            tvP.setText("Pobednik je X");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }

        if (btn00.getText().equals("O") && btn01.getText().equals("O") && btn02.getText().equals("O")) {
            tvP.setText("Pobednik je O");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }

        if (btn10.getText().equals("O") && btn11.getText().equals("O") && btn12.getText().equals("O")) {
            tvP.setText("Pobednik je O");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }

        if (btn20.getText().equals("O") && btn21.getText().equals("O") && btn22.getText().equals("O")) {
            tvP.setText("Pobednik je O");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        if (btn00.getText().equals("X") && btn10.getText().equals("X") && btn20.getText().equals("X")) {
            tvP.setText("Pobednik je X");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }

        if (btn01.getText().equals("X") && btn11.getText().equals("X") && btn21.getText().equals("X")) {
            tvP.setText("Pobednik je X");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }

        if (btn02.getText().equals("X") && btn12.getText().equals("X") && btn22.getText().equals("X")) {
            tvP.setText("Pobednik je X");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }
        if (btn00.getText().equals("O") && btn10.getText().equals("O") && btn20.getText().equals("O")) {
            tvP.setText("Pobednik je O");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }

        if (btn01.getText().equals("O") && btn11.getText().equals("O") && btn21.getText().equals("O")) {
            tvP.setText("Pobednik je O");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }

        if (btn02.getText().equals("O") && btn12.getText().equals("O") && btn22.getText().equals("O")) {
            tvP.setText("Pobednik je O");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        if (btn00.getText().equals("X") && btn11.getText().equals("X") && btn22.getText().equals("X")) {
            tvP.setText("Pobednik je X");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }

        if (btn00.getText().equals("O") && btn11.getText().equals("O") && btn22.getText().equals("O")) {
            tvP.setText("Pobednik je O");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }

        if (btn20.getText().equals("X") && btn11.getText().equals("X") && btn02.getText().equals("X")) {
            tvP.setText("Pobednik je X");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }

        if (btn20.getText().equals("O") && btn11.getText().equals("O") && btn02.getText().equals("O")) {
            tvP.setText("Pobednik je O");
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);

        }






    }


}