package com.example.advancedscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bsquare,bsqrt, bequal,bpi,bsin,bcos,btan,blog,bln,bplus,bmin,bmul,binv,bfact,bdiv,bb1,bb2,bac,bc;
    TextView tvsec,tvmain;
    String pi = "3.142857";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        blog = findViewById(R.id.blog);
        binv = findViewById(R.id.binv);
        bsquare = findViewById(R.id.bsquare);
        bsqrt = findViewById(R.id.bsqrt);
        bfact = findViewById(R.id.bfact);
        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        bdot = findViewById(R.id.bdot);
        bln = findViewById(R.id.bln);
        bpi = findViewById(R.id.bpi);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bac = findViewById(R.id.bac);
        bc = findViewById(R.id.bc);
        bequal = findViewById(R.id.bequal);

        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);


        //onclick listeners
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText("");
                tvsec.setText("");

            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tvmain.getText().toString();
                val = val.substring(0,val.length()-1);
                tvmain.setText(val);
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"+");
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"-");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"x");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"/");
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tvmain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                tvmain.setText(String.valueOf(r));
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"(");
            }
        });

        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+")");
            }
        });

        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText()+pi);
            }
        });

        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+ "sin");
            }
        });


        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"cos");
            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"tan");
            }
        });

        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"^"+ "(-1)");
            }
        });


        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int val = Integer.parseInt(tvmain.getText().toString());
               int fact = factorial(val);
               tvmain.setText(String.valueOf(fact));
               tvsec.setText(val+ "!");

            }
        });

        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d = Double.parseDouble(tvmain.getText().toString());
                double square = d*d;
                tvmain.setText(String.valueOf(square));
                tvsec.setText(d+ "sq");

            }
        });

        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+ "ln");

            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+ "log");

            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tvmain.getText().toString();
                String replacedstr = val.replace('/','/').replace('x','*');
                double result = eval(replacedstr);
                tvmain.setText(String.valueOf(result));
                tvsec.setText(val);

            }
        });

    }

    //factorial function
    int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }else if( n>1){
            return  n*factorial(n-1);
        }
        return -1;
    }

//eval function
    public double eval(final String str){
        return new Object(){
            int pos =-1,ch;
            void nextChar(){
                ch =(++pos<str.length()) ? str.charAt(pos):-1;
            }

            boolean eat(int charToEat){
                while(ch==' ') nextChar();
                if(ch==charToEat){
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse(){
                nextChar();
                double x = parseExpression();
                if(pos<str.length()) throw new RuntimeException("Unexpected" + (char) ch);
                return x;

            }



            double parseExpression(){
                double x = parseTerm();
                for(;;){
                    if(eat('+')) x +=parseTerm(); //addition
                    else if(eat('-')) x -=parseTerm(); //subtraction
                    else return x;
                }
            }

            double parseTerm(){
                double x = parseFactor();
                for(;;){
                    if(eat('*')) x *=parseFactor(); //multiplication
                    else if(eat('/')) x /=parseFactor(); //division
                    else return x;
                }
            }

            double parseFactor(){
                if ( eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if(eat('(')){
                    x = parseExpression();
                    eat(')');
                } else if((ch>='0' && ch<='9') || ch =='.'){ //numbers
                        while((ch>='0' && ch<='9') || ch =='.') nextChar();
                        x = Double.parseDouble(str.substring(startPos,this.pos));

                }else if(ch>='a' && ch<='z'){ //functions
                    while(ch>='a' && ch<='z') nextChar();
                    String func = str.substring(startPos,this.pos);
                    x = parseFactor();
                    if(func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " );

                } else{
                    throw new RuntimeException("unexpected: " + (char)ch);
                }

                if(eat('^')) x = Math.pow(x, parseFactor()); // exponent
                return x;

            }


        }.parse();
    }


}