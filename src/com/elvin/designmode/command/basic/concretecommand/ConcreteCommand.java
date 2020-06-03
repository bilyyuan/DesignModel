package com.elvin.designmode.command.basic.concretecommand;

import com.elvin.designmode.command.basic.command.Command;
import com.elvin.designmode.command.basic.receiver.Receiver;

public class ConcreteCommand implements Command {

    Receiver receiver;
    public ConcreteCommand(Receiver receiver) {
        // TODO Auto-generated constructor stub
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        receiver.action();
    }
    
}
