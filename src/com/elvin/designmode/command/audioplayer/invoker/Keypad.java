package com.elvin.designmode.command.audioplayer.invoker;

import com.elvin.designmode.command.audioplayer.command.Command;

public class Keypad {
    Command playCommand;
    Command rewindComand;
    Command stopCommand;

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public void setRewindCommand(Command rewindComand) {
        this.rewindComand = rewindComand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

}
