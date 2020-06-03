package com.elvin.designmode.command.audioplayer.concretecommand;

import com.elvin.designmode.command.audioplayer.command.Command;
import com.elvin.designmode.command.audioplayer.receiver.AudioPlayer;

public class RewindCommand implements Command {

    AudioPlayer myAudio;
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        myAudio.rewind();
    }
    
    public RewindCommand(AudioPlayer audio) {
        // TODO Auto-generated constructor stub
        this.myAudio = audio;
    }
}
