package com.renyu.imagelibrary.camera;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;

import com.renyu.commonlibrary.baseact.BaseActivity;
import com.renyu.commonlibrary.commonutils.Utils;
import com.renyu.imagelibrary.R;
import com.renyu.imagelibrary.params.CommonParams;

public class CameraActivity extends BaseActivity {

    String[] permissions={Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.CAMERA};

    @Override
    public void initParams() {

    }

    @Override
    public int initViews() {
        return R.layout.activity_camera;
    }

    @Override
    public void loadData() {

    }

    @Override
    public int setStatusBarColor() {
        return 0;
    }

    @Override
    public int setStatusBarTranslucent() {
        return 1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkPermission(permissions, getResources().getString(R.string.permission_camera), new OnPermissionCheckedListener() {
            @Override
            public void checked(boolean flag) {

            }

            @Override
            public void grant() {
                if (getSupportFragmentManager().getFragments()==null || getSupportFragmentManager().getFragments().size()==0) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CameraFragment()).commit();
                }
            }

            @Override
            public void denied() {

            }
        });
    }

    public void backTo(String filePath) {
        //刷新相册
        Utils.refreshAlbum(this, filePath, CommonParams.IMAGECACHE);
        //返回上一级目录
        Intent intent=getIntent();
        Bundle bundle=new Bundle();
        bundle.putString("path", filePath);
        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);
        finish();
    }
}
