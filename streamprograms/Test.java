package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Test {

    public static void main(String[] args) {

        String mobile = "9665202391";
        int len;
        if (mobile != null) {
            len = mobile.length();
        } else {
            len = 0;
        }
        if (mobile != null && len == 10) {
            String secureKey = "53063aae-06e9-466b-82a0-34e3e5d509cd";

            String templateid = "1107169176001382786";
            String message = "Thank you for visiting at Civil Secretariet. Your MR No. is TJ/2023/10003. You are scheduled to visit Dr. Akshay Jain. He/she will attend you shortly. SmartPHC Sangli -Techjivaa -Techjivaa";
            if (true) {
                callSmsService(message, mobile, templateid);
            }
        }
    }


    public static String callSmsService(String message1, String mobile1, String templatedId) {
        // Username that is to be used for submission
        String username;
        // password that is to be used along with username
        String password;
        // Message content that is to be transmitted
        String message;
        /**
         * What type of the message that is to be sent *
         * <ul>
         * <li>0:means plain text</li>
         * <li>1:means flash</li>
         * <li>2:means Unicode (Message content should be in Hex)</li>
         * <li>6:means Unicode Flash (Message content should be in Hex)</li>
         * </ul>
         */
        String type;
        /**
         * Require DLR or not
         * <ul>
         * <li>0:means DLR is not Required</li>
         * <li>1:means DLR is Required</li>
         * </ul>
         */
        String dlr;
        /**
         * Route Mobile Limited © 2017. All rights reserved 12
         * Destinations to which message is to be sent for submitting more
         * than one * destination at once destinations should be comma separated
         * Like
         * 91999000123,91999000124
         */
        String destination;
        // Sender Id to be used for submitting the message
        String source;
        // To what server you need to connect to for submission
        String server;
        String tempid;
        String entityid;
        // Port that is to be used like 8080 or 8000
        int port;

        username = "medimaze";
        password = "Og3[Ff5]";
        message = message1;
        dlr = "1";
        type = "0";
        destination = mobile1;
        source = "TJVSPL";
        server = "sms6.rmlconnect.net";
        port = 8080;
        tempid = templatedId;
        entityid = "1101601320000068999";

        try {
// Url that will be called to submit the message
            URL sendUrl = new URL("http://" + server + ":" + port + "/bulksms/bulksms");
            HttpURLConnection httpConnection = (HttpURLConnection) sendUrl
                    .openConnection();
// This method sets the method type to POST so that
// will be send as a POST request
            httpConnection.setRequestMethod("POST");
// This method is set as true which we intend to send
// input to the server
            httpConnection.setDoInput(true);
// This method implies that we intend to receive data from server.
            httpConnection.setDoOutput(true);
// Implies do not use cached data
            httpConnection.setUseCaches(false);
// Data that will be sent over the stream to the server.
            DataOutputStream dataStreamToServer = new DataOutputStream(
                    httpConnection.getOutputStream());
            dataStreamToServer.writeBytes("username="
                    + URLEncoder.encode(username, "UTF-8") + "&password="
                    + URLEncoder.encode(password, "UTF-8") + "&type="
                    + URLEncoder.encode(type, "UTF-8") + "&dlr="
                    + URLEncoder.encode(dlr, "UTF-8") + "&destination="
                    + URLEncoder.encode(destination, "UTF-8") + "&source="
                    + URLEncoder.encode(source, "UTF-8") + "&message="
                    + URLEncoder.encode(message, "UTF-8") + "&tempid="
                    + URLEncoder.encode(tempid, "UTF-8") + "&entityid="
                    + URLEncoder.encode(entityid, "UTF-8"));
            dataStreamToServer.flush();
            dataStreamToServer.close();
// Here take the output value of the server.
            BufferedReader dataStreamFromUrl = new BufferedReader(
                    new InputStreamReader(httpConnection.getInputStream()));
            String dataFromUrl = "", dataBuffer = "";
// Writing information from the stream to the buffer
            while ((dataBuffer =
                    dataStreamFromUrl.readLine()) != null) {
                dataFromUrl += dataBuffer;
            }
/**
 * Now dataFromUrl variable contains the Response received from the
 * server so we can parse the response and process it accordingly.
 */
            dataStreamFromUrl.close();
            System.out.println("Response: " + dataFromUrl);
            return dataFromUrl;
        } catch (Exception ex) {
            ex.printStackTrace();
            return "error";
        }

    }
}
