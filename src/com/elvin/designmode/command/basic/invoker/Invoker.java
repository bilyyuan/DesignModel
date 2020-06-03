package com.elvin.designmode.command.basic.invoker;

import com.elvin.designmode.command.basic.command.Command;

public class Invoker {
    Command command;
    
    public Invoker (Command command) {
        this.command = command;
    }
    
    public void action() {
        command.execute();
    }

}
