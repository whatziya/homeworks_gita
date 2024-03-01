package lesson_9.App;

import java.util.Arrays;

public class Device {
    private int deviceSize;
    private App[] runningAppsList;
    private App[] apps;
    private int installedApps = 0;
    private int runningApps = 0;

    public Device(int deviceSize) {
        this.deviceSize = deviceSize;
        this.apps = new App[deviceSize];
        this.runningAppsList = new App[deviceSize];
    }

    public boolean install(App app) {
        if (installedApps >= deviceSize) {
            return false; // Device storage is full
        }

        for (App installedApp : apps) {
            if (installedApp != null && installedApp.getName().equals(app.getName())) {
                return false; // App with the same name already installed
            }
        }

        apps[installedApps++] = app;
        deviceSize -= app.getSize(); // Update remaining device size
        return true;
    }

    public void showApps() {
        for (int i = 0; i < installedApps; i++) {
            System.out.println(apps[i].toString());
        }
    }

    public boolean uninstall(App app) {
        for (int i = 0; i < installedApps; i++) {
            if (apps[i] != null && app.getName().equals(apps[i].getName())) {
                if (apps[i] == runningAppsList[i]) {
                    runningAppsList[i] = null; // Remove app from running list if running
                    runningApps--;
                }

                for (int j = i; j < installedApps - 1; j++) {
                    apps[j] = apps[j + 1];
                }
                apps[installedApps - 1] = null;
                installedApps--;
                deviceSize += app.getSize(); // Update device size
                return true;
            }
        }
        return false; // App not found
    }

    public void run(App app) {
        for (int i = 0; i < installedApps; i++) {
            if (apps[i] != null && app.getName().equals(apps[i].getName())) {
                runningAppsList[runningApps++] = app;
                System.out.println(app.toString());
                return;
            }
        }
        System.out.println("App not found or installed");
    }

    public void info() {
        System.out.println(Arrays.toString(runningAppsList));
    }

}
