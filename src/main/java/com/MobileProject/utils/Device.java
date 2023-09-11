package com.MobileProject.utils;

public enum Device {

    Pixel2("emulator-5554","11","Pixel 2","Android"),

    //for example adding new device -- below
    Pixel3("emulator-5554","11","Pixel 3","Android");

    public String udid;
    public String version;
    public String deviceName;
    public String platformName;

        Device(String udid, String version, String deviceName, String platformName) {
            this.udid=udid;
            this.version=version;
            this.deviceName=deviceName;
            this.platformName=platformName;
    }
}
