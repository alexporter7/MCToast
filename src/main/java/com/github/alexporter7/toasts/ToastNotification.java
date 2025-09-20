package com.github.alexporter7.toasts;

public class ToastNotification {

    private String title;
    private String text;
    private int durationTicks;

    public ToastNotification(String title, String text, int durationTicks) {
        this.title = title;
        this.text = text;
        this.durationTicks = durationTicks;
    }

}
