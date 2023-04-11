package DP.Template;

public abstract class MusicAppLoader {

    void Load(){
        InstallLogo();
        InstallMusicList();
        CleaningTempFile();
    }

    public abstract void InstallLogo();
    public abstract void InstallMusicList();

    public void CleaningTempFile(){
        System.out.println("Cleaning all temporay file");
    }
}
