package org.tony.script.model;

import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class StarWarsObj extends org.tony.model.StarWarsObj{
    public static int extractIdFromUrl(URL url) {
        Pattern idPattern = Pattern.compile("(\\d+)");
        Matcher idMatch = idPattern.matcher(String.valueOf(url));
        idMatch.find();
        return Integer.parseInt(idMatch.group(0));
    }
}
