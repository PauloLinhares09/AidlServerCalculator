package br.com.packapps.aidlservercalculator;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyServiceAidl extends Service {

    MyIBind myIBind = new MyIBind();

    public MyServiceAidl() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return myIBind;
    }

    public class MyIBind extends IMyAidlInterface.Stub{

        @Override
        public double soma(double a, double b) throws RemoteException {
            return (a + b);
        }
    }
}
