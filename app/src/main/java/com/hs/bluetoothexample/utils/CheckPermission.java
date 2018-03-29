package com.hs.bluetoothexample.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by yqy on 2018/2/2.
 */

public class CheckPermission {
    // 存储相关权限
    public static final int REQUEST_CODE_STORAGE = 0xAAA1;
    // 电话相关权限
    public static final int REQUEST_CODE_PHONE = 0xAAA2;
    // 短信相关权限
    public static final int REQUEST_CODE_SMS = 0xAAA3;
    // 申请所有授权
    public static final int REQUEST_CODE_ALL = 0xAAAA;

    private CheckPermission() {

    }

    public CheckPermission getInstance() {
        return PermissionCheckInstance.instance;
    }

    private static class PermissionCheckInstance {
        static CheckPermission instance = new CheckPermission();
    }

    /**
     * 申请权限
     *
     * @param activity    activity
     * @param permissions 权限列表
     *                    <p/>
     *                    Manifest.permission.WRITE_EXTERNAL_STORAGE
     *                    Manifest.permission.CALL_PHONE
     *                    Manifest.permission.READ_SMS
     *                    Manifest.permission.RECEIVE_SMS
     */
    public void askForPermissions(Activity activity, List<String> permissions, int resquestCode) {
        // 如果不是android6.0以上的系统，则不需要检查是否已经获取授权
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            return;
        }

        for (String permission : permissions) {
            //PackageManager.PERMISSION_GRANTED 已经授予该权限
            //PackageManager.PERMISSION_DENIED 没有授予该权限
            if (ContextCompat.checkSelfPermission(activity, permission) == PackageManager.PERMISSION_GRANTED) {
                permissions.remove(permission);
            }

        }
    }

    public void askForPermissions(Activity activity, String[] permissions, int requestCode) {
        if (null == permissions || permissions.length <= 0) {
            return;
        }
        List<String> list = new ArrayList<>();
        Collections.addAll(list, permissions);
        askForPermissions(activity, list, requestCode);
    }

    /**
     * 校验权限
     *
     * @param context    context
     * @param permission 需要校验的权限
     * @return 是否授予该权限
     * true - 授予
     * false - 还未授予
     */
    public boolean checkPermission(Context context, String permission) {
        // 如果不是android6.0以上的系统，则不需要检查是否已经获取授权
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            return true;
        }
        int verify = ContextCompat.checkSelfPermission(context, permission);
        // PackageManager.PERMISSION_GRANTED    授予权限
        // PackageManager.PERMISSION_DENIED     没有权限
        return verify == PackageManager.PERMISSION_GRANTED;
    }


    /**
     * 请求授权后的回调类
     *
     * @param activity     activity
     * @param requestCode  requestCode
     * @param permissions  权限列表
     * @param grantResults 授权结果
     */

    public void onRequestPermissionsResult(final Activity activity, int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {


    }
}


