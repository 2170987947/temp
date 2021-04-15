package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/15 20:25
 */
public class BackupFacade {

    private SmsManager sms;
    private SongsManager songs;
    private ContactManager contact;
    private PhotoManager photo;

    public BackupFacade() {
        sms = new SmsManager();
        songs = new SongsManager();
        contact = new ContactManager();
        photo = new PhotoManager();
    }

    public void oneKeyBackup() {
        sms.oneKeyBackup();
        songs.oneKeyBackup();
        contact.oneKeyBackup();
        photo.oneKeyBackup();
    }
}
