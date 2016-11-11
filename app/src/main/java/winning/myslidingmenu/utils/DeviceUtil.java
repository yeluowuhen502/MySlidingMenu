package winning.myslidingmenu.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.DisplayMetrics;
import android.view.View;

import java.io.IOException;


public class DeviceUtil {

    /**
     * @param context 上下文
     * @return int
     * @brief 获取手机屏幕尺寸 宽度
     */
    public static int getMetricsWidth(Context context) {
        // String str = "";
        DisplayMetrics dm = new DisplayMetrics();
        dm = context.getResources().getDisplayMetrics();
        int screenWidth = dm.widthPixels;// 屏幕高（像素，如：800px）
        return screenWidth;
    }

}
