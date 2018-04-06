package com.example.dell.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String strp = new String();
    int count =0;
    int fin2=0;
    int res;
    int mu=0;
    int fin = 0;
    int i1=0,i2=0,i3=0,i4=0;
    int ad=0,sb=0,mul=0,div=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void one(View v) {
        count++;
        if (count > 0) {
            res = 10 * res + 1;
        } else
            res = 1;
        onliclick(null);
    }

    public void two(View v) {
        count++;
        if (count > 0) {
            res = 10 * res + 2;
        } else
            res = 2;
        onliclick(null);
    }

    public void three(View v) {
        count++;
        if (count > 0) {
            res = 10 * res + 3;
        } else
            res = 3;
        onliclick(null);
    }

    public void four(View v) {
        count++;
        if (count > 0) {
            res = 10 * res + 4;
        } else
            res = 4;
        onliclick(null);
    }

    public void five(View v) {
        count++;
        if (count > 0) {
            res = 10 * res + 5;
        } else
            res = 5;
        onliclick(null);
    }

    public void six(View v) {
        count++;
        if (count > 0) {
            res = 10 * res + 6;
        } else
            res = 6;
        onliclick(null);
    }

    public void seven(View v) {
        count++;
        if (count > 0) {
            res = 10 * res + 7;
        } else
            res = 7;
        onliclick(null);
    }

    public void eight(View v) {
        count++;
        if (count > 0) {
            res = 10 * res + 8;
        } else
            res = 8;
        onliclick(null);
    }

    public void nine(View v) {
        count++;
        if (count > 0) {
            res = 10 * res + 9;
        } else
            res = 9;
        onliclick(null);
    }

    public void zero(View v) {
        count++;
        if (count > 0) {
            res = 10 * res + 0;
        } else
            res = 0;
        onliclick(null);
    }

    public void onliclick(View v) {
        TextView t = (TextView) findViewById(R.id.textView4);
            strp =res + "";
        t.setText(strp);
    }

    public void eqal(View v) {
        TextView tt = (TextView) findViewById(R.id.textView2);
        String pp=new String();
        if(ad==1)
        {   if(i1==1) {
            fin2 = fin + res;
            i2 = 2;
            i3 = 2;
            i4 = 2;
             }
            else
                fin2=fin2+res;
            ad=0;
        }
        else if(sb==1)
        {
            if(i2==1) {
                i1 = 2;
                i3 = 2;
                i4 = 2;

                fin2 = fin - res;
            }
            else
                fin2=fin2-res;
            sb=0;
        }
        else if(mul==1)
        {
            if(i3==1) {
                fin2 = fin * res;
                i2 = 2;
                i1 = 2;
                i4 = 2;
            }
            else
                fin2=fin2*res;
            mul=0;
        }
        else if(div==4)
        {
            if(i4==0)
            {
                fin2=fin/res;
                i2 = 2;
                i3 = 2;
                i1 = 2;}
            else
                fin2=fin2/res;
            div=0;
        }
        String str = new String("="+fin2+"");
        tt.setText(str);
        res = 0;
    }

    public void clear(View v){
        res=0;
        fin=0;
        fin2=0;
        i1=0;i2=0;i3=0;i4=0;
        TextView tr=(TextView)findViewById(R.id.textView2);
        tr.setText(" ");
        TextView tr2=(TextView)findViewById(R.id.textView4);
        tr2.setText(" ");
        TextView ttt=(TextView) findViewById(R.id.operation);
        ttt.setText(" ");
    }
    public void backspace(View v){
        res=res/10;
        onliclick(null);
    }
    public void addition(View v)
    {
        String ppp=new String("+");
        TextView tp=(TextView)findViewById(R.id.operation);
        tp.setText(ppp);
        ad=1;
        i1++;
        fin=res;
        res=0;
    }
    public void subs(View v)
    {
        String ppp=new String("-");
        TextView tp=(TextView)findViewById(R.id.operation);
        tp.setText(ppp);
        mu=3;
        i2++;
        fin=res;
        res=0;
        sb=1;
    }
    public void multi(View v)
    {
        String ppp=new String("x");
        TextView tp=(TextView)findViewById(R.id.operation);
        tp.setText(ppp);
        mu=3;
        i3++;
        fin=res;
        res=0;
        mul=1;
    }
    public void divi(View v)
    {
        String ppp=new String("/");
        TextView tp=(TextView)findViewById(R.id.operation);
        tp.setText(ppp);
        mu=3;
        i4++;
        fin=res;
        res=0;
        div=1;
    }
}
