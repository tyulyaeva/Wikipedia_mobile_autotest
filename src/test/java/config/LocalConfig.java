package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:localEmulator.properties"
})
public interface LocalConfig extends Config {
    @Key("platformVersion")
    String getPlatformVersion();

    @Key("platformName")
    String getPlatformName();

    @Key("deviceName")
    String getDeviceName();

    @Key("localServerUrl")
    String getServerUrl();
}
