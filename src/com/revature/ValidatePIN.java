package com.revature;

public class ValidatePIN {
    public static boolean validateNumber(String pin){
        Pattern pattern = Pattern.compile("\\d{6}");
        Matcher matcher = pattern.matcher(pin);
        if(matcher.matches())
            return true;
        else
            return false;
    }
}