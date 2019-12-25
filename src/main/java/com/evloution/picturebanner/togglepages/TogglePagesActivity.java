package com.evloution.picturebanner.togglepages;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

import com.evloution.picturebanner.R;
import com.evloution.picturebanner.togglepages.fragment.DataBarFragment;
import com.evloution.picturebanner.togglepages.fragment.DataPieFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Evloution
 * @date 2019-12-25
 * @email 15227318030@163.com
 * @description
 */
public class TogglePagesActivity extends FragmentActivity {

    @BindView(R.id.togglepages_one_btn)
    Button togglepagesOneBtn;
    @BindView(R.id.togglepages_two_btn)
    Button togglepagesTwoBtn;
    private Fragment fragment = new Fragment();
    private DataBarFragment dataBarFragment;
    private DataPieFragment dataPieFragment;
    private FragmentManager fm;
    private FragmentTransaction ft;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_togglepages);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

        dataBarFragment = new DataBarFragment();
        dataPieFragment = new DataPieFragment();
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        ft.add(R.id.togglepages_framelayout, dataBarFragment).commit();
        fragment = dataBarFragment;
    }

    @OnClick({R.id.togglepages_one_btn, R.id.togglepages_two_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.togglepages_one_btn:
                switchFragment(dataBarFragment);
                break;
            case R.id.togglepages_two_btn:
                switchFragment(dataPieFragment);
                break;
        }
    }

    /**
     * fragment 切换方法
     *
     * @param targetFragment
     * @return
     */
    private FragmentTransaction switchFragment(Fragment targetFragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (!targetFragment.isAdded()) {
            transaction.hide(fragment).add(R.id.togglepages_framelayout, targetFragment).commit();
        } else {
            transaction.hide(fragment).show(targetFragment).commit();
        }
        fragment = targetFragment;
        return transaction;
    }
}
