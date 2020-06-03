package com.elvin.designmode.command.audioplayer.client;

import com.elvin.designmode.command.audioplayer.command.Command;
import com.elvin.designmode.command.audioplayer.concretecommand.PlayCommand;
import com.elvin.designmode.command.audioplayer.concretecommand.RewindCommand;
import com.elvin.designmode.command.audioplayer.concretecommand.StopCommand;
import com.elvin.designmode.command.audioplayer.receiver.AudioPlayer;

public class Julia {
public static void main(String[] args) {
    
    // Receiver
    AudioPlayer audioPlayer = new AudioPlayer();
    
    // Command and concreteCommand
    Command playcommand = new PlayCommand(audioPlayer);
    Command rewindCommand = new RewindCommand(audioPlayer);
    Command stopcommand = new StopCommand(audioPlayer);
    
    playcommand.execute();
    rewindCommand.execute();
    stopcommand.execute();
    
    rewindCommand.execute();
    stopcommand.execute();
}
}
