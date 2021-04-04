package com.project.Sendsms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class sendSMS {

   public void sendNewSms () {

       // Construct data
       String apiKey = "apikey=" + "RcxHWpRquys-FpiPJR2uIAByGyn29oiIR5IweejKI5";
       String message = "&message=" + "Greetings from Simplifying Tech! Have a nice day!";
       String sender = "&sender=" + "TXTLCL";
       String numbers = "&numbers=" + "212+664847911";

       System.out.println("Construct data");
       try {
           // Send data
           HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
           String data = apiKey + numbers + message + sender;
           conn.setDoOutput(true);
           conn.setRequestMethod("POST");
           conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
           conn.getOutputStream().write(data.getBytes("UTF-8"));

           System.out.println("send data");

           BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
           StringBuffer stringBuffer = new StringBuffer();
           String line;
           while ((line = rd.readLine()) != null) {
               stringBuffer.append(line).append("\n");
           }
           System.out.println(stringBuffer.toString());
           rd.close();



       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
