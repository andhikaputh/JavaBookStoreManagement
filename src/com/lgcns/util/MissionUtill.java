package com.lgcns.util;
import java.util.Locale;
import java.text.NumberFormat;
public class MissionUtill {
    public static String moneyFormat(int price) {
        //NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.KOREA);//Mata uang Korea Selatan
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));//ubah ke mata uang Indonesia
        return nf.format( price );
    }
}
