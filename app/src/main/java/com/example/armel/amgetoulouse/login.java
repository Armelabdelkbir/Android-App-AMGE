package com.example.armel.amgetoulouse;

import android.app.Activity;

/**
 * Created by armel on 7/20/2017.
 */

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;



public class login extends Activity {

    public static final int CONNECTION_TIMEOUT=10000;
    public static final int READ_TIMEOUT=15000;
    private EditText etUsername;
    private EditText etPassword;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.login);
        // Get Reference to variables
        etUsername = (EditText) findViewById(R.id.user1);
        etPassword = (EditText) findViewById(R.id.mdp1);

        TextView reg = (TextView)findViewById(R.id.reg);
        reg.setOnClickListener(new OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent nxt = new Intent(getApplicationContext(),registration.class);
                startActivity(nxt);
            }
        });
    }
    // lorsqu'on clique le boutton Entrer
    public void checkLogin(View arg0) {

        // Extraction du text des deux champs username et password
        final String username = etUsername.getText().toString();
        final String password = etPassword.getText().toString();
        String type="login";

        // Initialisation de AsyncLogin() avec le username et le password
        AsyncLogin asyncLogin =new AsyncLogin(this);
        asyncLogin.execute(type,username,password);


} private class AsyncLogin extends AsyncTask<String,Void,String> {

    Context context;
    AlertDialog alertDialog;
        private ProgressDialog dialog;
        private ProgressDialog pDialog;


        AsyncLogin (Context ctx) {
        context = ctx;
    }
        @Override
        protected void onPreExecute() {

            //alertDialog = new AlertDialog.Builder(context).create();

            //alertDialog.setTitle("Login Status");


                /*super.onPreExecute();
                pdia = new ProgressDialog(context);
                pdia.setMessage("Loading...");
                pdia.show();*/

            alertDialog = new AlertDialog.Builder(context).create();

            alertDialog.setTitle("Login Status");
            super.onPreExecute();
            pDialog = new ProgressDialog(login.this,ProgressDialog.THEME_HOLO_DARK);
            pDialog.setMessage("Loading User ...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(false);
            pDialog.show();

        }
    @Override
    protected String doInBackground(String... params) {
        String type = params[0];
        String login_url ="http://amge.000webhostapp.com/amge/login.php";//adress Ip or 10.0.2.2
        String register_url ="http://amge.000webhostapp.com/amge/register.php";
        if(type.equals("login")) {
            try {
                String user_name = params[1];
                String password = params[2];
                URL url = new URL(login_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("user_name","UTF-8")+"="+URLEncoder.encode(user_name,"UTF-8")+"&"
                        +URLEncoder.encode("password","UTF-8")+"="+URLEncoder.encode(password,"UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String result="";
                String line="";
                while((line = bufferedReader.readLine())!= null) {
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return result;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }//registration
        else if(type.equals("register")){try {
            String username = params[1];
            String email = params[2];
            String tel = params[3];
            String mdp = params[4];
            URL url = new URL(register_url);
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            String post_data = URLEncoder.encode("username","UTF-8")+"="+URLEncoder.encode(username,"UTF-8")+"&"+URLEncoder.encode("email","UTF-8")+"="+URLEncoder.encode(email,"UTF-8")+"&"+URLEncoder.encode("tel","UTF-8")+"="+URLEncoder.encode(tel,"UTF-8")+"&"+URLEncoder.encode("mdp","UTF-8")+"="+URLEncoder.encode(mdp,"UTF-8");
            bufferedWriter.write(post_data);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
            String result="";
            String line="";
            while((line = bufferedReader.readLine())!= null) {
                result += line;
            }
            bufferedReader.close();
            inputStream.close();
            httpURLConnection.disconnect();
            return result;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        }
        return null;
    }





    @Override
    protected void onPostExecute(String result) {


        alertDialog.setMessage(result);

        pDialog.dismiss();
        if(result!=null && result.equals("ok")){
            Intent intent = new Intent(login.this,membre.class);
            startActivity(intent);
            login.this.finish();

            //login was successfully done
        } else if(result!=null && result.equals("membre")) {
            Intent intent = new Intent(login.this,registration.class);
            startActivity(intent);
            login.this.finish();

        }
else {
            alertDialog.setMessage(result);
            alertDialog.show();
        }


        }}}

