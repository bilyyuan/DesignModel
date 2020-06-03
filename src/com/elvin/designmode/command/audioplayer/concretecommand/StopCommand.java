package com.elvin.designmode.command.audioplayer.concretecommand;

import com.elvin.designmode.command.audioplayer.command.Command;
import com.elvin.designmode.command.audioplayer.receiver.AudioPlayer;

public class StopCommand implements Command {

    AudioPlayer myAudio;
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        myAudio.stop();
    }
    
    public StopCommand(AudioPlayer audio) {
        // TODO Auto-generated constructor stub
        this.myAudio = audio;
    }

}
