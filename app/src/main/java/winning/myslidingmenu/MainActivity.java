package winning.myslidingmenu;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import winning.myslidingmenu.databinding.ActivityMainBinding;
import winning.myslidingmenu.fragment.LeftFragment;
import winning.myslidingmenu.utils.DeviceUtil;
import winning.myslidingmenu.utils.LogUtil;


public class MainActivity extends SlidingFragmentActivity {
    private ActivityMainBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        setBehindContentView(R.layout.leftlayout);
        //模式设置
        SlidingMenu slidingMenu = getSlidingMenu();
        slidingMenu.setMode(SlidingMenu.LEFT);
        //设置触摸范围
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        slidingMenu.setBehindOffset(200);
        slidingMenu.setDeviceDistance(DeviceUtil.getMetricsWidth(MainActivity.this));

        slidingMenu.setOnScaleListenet(new SlidingMenu.OnScaleListenet() {
            @Override
            public void onScale(double scale) {
                LogUtil.d("slidingtest", scale+"");
            }
        });
        initFragment();
    }

    private void initFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.ll_left,new LeftFragment(),"LEFTTAG");
        fragmentTransaction.commit();
    }
}
