package com.example.recyclerview;

public class Model {

    private String textView1;
    private String textView2;
    private String textView3;
    private String textView4;

    Model(String textView1, String textView2, String textView3, String textView4) {
        this.textView1 = textView1;
        this.textView2 = textView2;
        this.textView3 = textView3;
        this.textView4 = textView4;}

    public String getTextView1() {
        return textView1;
    }

    public String getTextView2() {
        return textView2;
    }

    public String getTextView3() {
        return textView3;
    }

    public String getTextView4() {
        return textView4;
    }
}
