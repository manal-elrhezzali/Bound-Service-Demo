package me.elrhezzalimanal.boundservicesbound;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Random;

public class SampleService extends Service {
//    public SampleService() {
//    }

    private IBinder binder = new LocalBinder();

    public int getRandom() {
        return random.nextInt();
    }

    //generate a random number and we will pass it to the activity that calls the service
    private Random random = new Random();

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return binder;
    }

    public class LocalBinder extends Binder {
        SampleService getService() {
            return SampleService.this;
        }
    }
}