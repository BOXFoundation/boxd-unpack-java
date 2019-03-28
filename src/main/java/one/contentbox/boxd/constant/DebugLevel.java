package one.contentbox.boxd.constant;

import java.util.ArrayList;
import java.util.List;

public class DebugLevel {

    public final static List<String> levels = new ArrayList<String>(){
        {
            add("debug");
            add("info");
            add("warning");
            add("error");
            add("fatal");
        }
    };
}
