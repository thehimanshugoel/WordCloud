package com.wordcloud;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Nidhi on 06-08-2016.
 */
public class WordCloudUtils {
    public static Typeface getFont(Context context, int type) {
        try {

            if (type == Constants.FONT_TYPE_REGULAR) {

                return Typeface.createFromAsset(context.getAssets(), "fonts/open-sans.regular.ttf");
            }
            if (type == Constants.FONT_TYPE_THIN) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/open-sans.light.ttf");
            }
            if (type == Constants.FONT_TYPE_AMATIC) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/AmaticSC-Regular.ttf");
            }
            if (type == Constants.FONT_TYPE_ANKELCALLIG) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/ankecallig-fg.ttf");
            }
            if (type == Constants.FONT_TYPE_CHALKDUSTER) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Chalkduster.ttf");

            }
            if (type == Constants.FONT_TYPE_CONJITRS) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/ConJitrs.ttf");
            }
            if (type == Constants.FONT_TYPE_EAGER) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/eager___.ttf");
            }
            if (type == Constants.FONT_TYPE_EDOSZ) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/edosz.ttf");
            }
            if (type == Constants.FONT_TYPE_INDIEFLOWER) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/IndieFlower.ttf");
            }

            if (type == Constants.FONT_TYPE_KRANKy) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Kranky.ttf");
            }
            if (type == Constants.FONT_TYPE_LONDON) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/London.ttf");
            }
            if (type == Constants.FONT_TYPE_LUCKIESTGUY) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/LuckiestGuy.ttf");
            }
            if (type == Constants.FONT_TYPE_PERMANENTMARKER) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/PermanentMarker.ttf");
            }
            if (type == Constants.FONT_TYPE_RIBEYE) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Ribeye-Regular.ttf");
            }
            if (type == Constants.FONT_TYPE_ROCKSALT) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/RockSalt.ttf");
            }
            if (type == Constants.FONT_TYPE_ZEYADA) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Zeyada.ttf");

            }
            if (type == Constants.FONT_TYPE_WOOD) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/FanwoodText-Italic.ttf");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
