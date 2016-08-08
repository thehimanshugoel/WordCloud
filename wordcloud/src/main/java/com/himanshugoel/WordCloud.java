package com.himanshugoel;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Himanshu on 04-08-2016.
 */
public class WordCloud extends TextView {
    List<String> data;
    List<Spannable> spannableList;
    Context context;

    public WordCloud(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }


    public void create(final List<String> data) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < data.size(); i++) {
            stringBuilder.append(data.get(i) + " ");
        }

        this.setMovementMethod(LinkMovementMethod.getInstance());
        this.setLinksClickable(false);
        this.setHighlightColor(Color.TRANSPARENT);
        this.setText(stringBuilder, BufferType.SPANNABLE);

        this.data = data;
        int start = 0;
        int end;
        spannableList = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            end = start + data.get(i).length();
            spannableList.add((Spannable) this.getText());
            start = end + 1;
        }
        this.setLineSpacing(0, 0.7f);
    }

    public void setRandomSize(int minSize, int maxSize) {
        int start = 0;
        int end;
        Random random = new Random();
        for (int i = 0; i < spannableList.size(); i++) {
            end = start + data.get(i).length();
            int randomNum = random.nextInt((maxSize - minSize) + 1) + minSize;
            spannableList.get(i).setSpan(new AbsoluteSizeSpan(randomNum), start, end, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
            start = end + 1;
        }
    }

    public void setOnWordClickListener(final WordCloudClick wordCloudClick) {
        int start = 0;
        int end;
        for (int i = 0; i < spannableList.size(); i++) {
            end = start + data.get(i).length();
            final int finalI = i;
            spannableList.get(i).setSpan(new ClickableSpan() {
                @Override
                public void onClick(View widget) {
                    wordCloudClick.onWordClick(widget, finalI);
                }

                @Override
                public void updateDrawState(TextPaint ds) {
                    //I repeat, do not enter anything in this, If you will do that, this will lead to a nuclear war
                }


            }, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

            start = end + 1;
        }

    }

    public void setCloudTextColor(String colorHexValue) {
        int start = 0;
        int end;
        for (int i = 0; i < spannableList.size(); i++) {
            end = start + data.get(i).length();
            spannableList.get(i).setSpan(new ForegroundColorSpan(Color.parseColor(colorHexValue)), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            start = end + 1;
        }
    }

    public void setRandomTextColor() {
        int start = 0;
        int end;
        Random rand = new Random();
        for (int i = 0; i < spannableList.size(); i++) {
            end = start + data.get(i).length();
            final int r = rand.nextInt(256);
            final int g = rand.nextInt(256);
            final int b = rand.nextInt(256);
            spannableList.get(i).setSpan(new ForegroundColorSpan(Color.rgb(r, g, b)), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            start = end + 1;
        }
    }

    public void setRandomFonts() {
        int start = 0;
        int end;
        Random rand = new Random();
        for (int i = 0; i < spannableList.size(); i++) {
            end = start + data.get(i).length();
            final int random = 1 + rand.nextInt(18);
            Typeface typefaceRandom = WordCloudUtils.getFont(context, random);
            spannableList.get(i).setSpan(new CustomTypefaceSpan(typefaceRandom), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            start = end + 1;
        }
    }
}
