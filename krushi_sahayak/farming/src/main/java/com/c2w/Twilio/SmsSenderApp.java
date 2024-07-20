package com.c2w.Twilio;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSenderApp
{
    // Twilio credentials
    public static final String ACCOUNT_SID = "AC4091eb5f393a1475554f2c61e7e6d73f";
    public static final String AUTH_TOKEN = "b2f20db5a97ba530f16e456232ead814";
    public static final String TWILIO_NUMBER = "+14172443777";

    public static void sendSms(String to, String message) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message.creator( new PhoneNumber(to),new PhoneNumber(TWILIO_NUMBER),message).create();
    }
}
