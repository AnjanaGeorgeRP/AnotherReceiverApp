package sg.edu.rp.c346.anotherreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by 16003771 on 10/8/2017.
 */

public class AnotherBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast my_toast = Toast.makeText(context,"Received in AnotherBroadcastReceiver",Toast.LENGTH_LONG);
        my_toast.show();
    }
}
