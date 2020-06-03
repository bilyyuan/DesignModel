package com.elvin.designmode.command.audioplayer.receiver;

/**
 * Do the real work.
 * @author spring
 *
 */
public class AudioPlayer {
    
    public void play() {
        System.out.println("Play");
    }
    
    public void rewind() {
        System.out.println("Rewind");
    }
    
    public void stop() {
        System.out.println("Stop");
    }
}