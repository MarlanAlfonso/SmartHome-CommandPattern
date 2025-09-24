public class Main {
    public static void main(String[] args) {
        // Receivers
        Light livingRoomLight = new Light("Living Room Light");
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer("Home Speaker");

        // Commands
        LightOnCommand lightOn = new LightOnCommand(livingRoomLight, 80);
        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
        SetBrightnessCommand setDim30 = new SetBrightnessCommand(livingRoomLight, 30);

        ThermostatIncreaseTempCommand tempUp = new ThermostatIncreaseTempCommand(thermostat, 2.0);
        ThermostatDecreaseTempCommand tempDown = new ThermostatDecreaseTempCommand(thermostat, 1.0);

        MusicPlayCommand playChill = new MusicPlayCommand(musicPlayer, "Chill Vibes");
        MusicStopCommand stopMusic = new MusicStopCommand(musicPlayer);
        VolumeUpCommand volUp = new VolumeUpCommand(musicPlayer);
        VolumeDownCommand volDown = new VolumeDownCommand(musicPlayer);

        // Invoker
        RemoteControl remote = new RemoteControl();
        remote.setCommand("LIGHT_ON", lightOn);
        remote.setCommand("LIGHT_OFF", lightOff);
        remote.setCommand("LIGHT_DIM_30", setDim30);
        remote.setCommand("TEMP_UP", tempUp);
        remote.setCommand("TEMP_DOWN", tempDown);
        remote.setCommand("PLAY_MUSIC", playChill);
        remote.setCommand("STOP_MUSIC", stopMusic);
        remote.setCommand("VOLUME_UP", volUp);
        remote.setCommand("VOLUME_DOWN", volDown);

        // Demo
        remote.press("LIGHT_ON");
        remote.press("LIGHT_DIM_30");
        remote.press("PLAY_MUSIC");
        remote.press("VOLUME_UP");
        remote.press("TEMP_UP");
        remote.undo();
        remote.press("STOP_MUSIC");
        remote.press("LIGHT_OFF");
        remote.undo();
    }
}
