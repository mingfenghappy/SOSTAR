package com.renyu.commonlibrary.views.wheelview;

import android.support.v4.app.FragmentManager;

/**
 * Created by renyu on 2017/2/22.
 */

public class WheelViewUtils {

    public static void showDate(FragmentManager manager, String title, String cancelTitle, String okTitle, ActionSheetFragment.OnOKListener onOKListener, ActionSheetFragment.OnCancelListener onCancelListener) {
        ActionSheetFragment.build(manager).setChoice(ActionSheetFragment.CHOICE.DATE)
                .setTitle(title).setOkTitle(okTitle).setCancelTitle(cancelTitle).setOnOKListener(onOKListener)
                .setOnCancelListener(onCancelListener).show();
    }

    public static void showTime(FragmentManager manager, String title, String cancelTitle, String okTitle, ActionSheetFragment.OnOKListener onOKListener, ActionSheetFragment.OnCancelListener onCancelListener) {
        ActionSheetFragment.build(manager).setChoice(ActionSheetFragment.CHOICE.TIME)
                .setTitle(title).setOkTitle(okTitle).setCancelTitle(cancelTitle).setOnOKListener(onOKListener)
                .setOnCancelListener(onCancelListener).show();
    }

    public static void showCamera(FragmentManager manager, String title, String[] items, ActionSheetFragment.OnItemClickListener onItemClickListener, String cancelTitle, ActionSheetFragment.OnCancelListener onCancelListener) {
        ActionSheetFragment.build(manager).setChoice(ActionSheetFragment.CHOICE.CAMERA)
                .setTitle(title).setListItems(items, onItemClickListener).setCancelTitle(cancelTitle)
                .setOnCancelListener(onCancelListener).show();
    }
}
