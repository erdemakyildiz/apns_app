package com.erdemaky.apns;

import javapns.Push;
import javapns.communication.exceptions.CommunicationException;
import javapns.communication.exceptions.KeystoreException;
import javapns.notification.PushedNotification;
import javapns.notification.PushedNotifications;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author Erdem Akyıldız
 */
public class PushMessage extends Thread {

    private static final Logger Log = LoggerFactory.getLogger(PushMessage.class);
    
    private String message;
    private int badge;
    private String sound;
    private Object keystore;
    private String password;
    private boolean production;
    private Object devices;

    public PushMessage(String message, int badge, String sound, Object keystore, String password, boolean production, Object devices) {
        this.message = message;
        this.badge = badge;
        this.sound = sound;
        this.keystore = keystore;
        this.password = password;
        this.production = production;
        this.devices = devices;
    }

    @Override
    public synchronized void start() {
        try {
            PushedNotifications notifications = Push.combined(message, badge, sound, keystore, password, production, devices);

            for (PushedNotification notification : notifications) {
                if (notification.isSuccessful()) {
                    Log.info("Push notification sent successfully to: " + notification.getDevice().getToken());
                } else {
                    Exception theProblem = notification.getException();
                    Log.error(theProblem.getMessage(), theProblem);
                }
            }
        } catch (KeystoreException | CommunicationException e) {
            Log.error(e.getMessage(), e);
        }
    }

}
