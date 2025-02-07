package com.example.appalaktiki;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.widget.Toast;

import java.util.Locale;

public class LocaleHelper {
    public static String English = "en";
    public static String FRENCH = "fr";
    public static String GREEK = "el";

    public  static Context updateRes(Context context, String lang) {
        if (context == null) {
            Toast.makeText(context, "L bozo", Toast.LENGTH_SHORT).show();
            return null;
        } else {
            Locale locale = new Locale(lang);
            Locale.setDefault(locale);
            Configuration configuration = context.getResources().getConfiguration();
            configuration.setLayoutDirection(locale);
            return context.createConfigurationContext(configuration);
        }
    }



    public static String setLanguage(Context context, String lang, int input)
    {    return updateRes(context,lang).getString(input);


    }
}
