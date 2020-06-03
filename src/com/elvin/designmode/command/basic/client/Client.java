package com.elvin.designmode.command.basic.client;

import com.elvin.designmode.command.basic.command.Command;
import com.elvin.designmode.command.basic.concretecommand.ConcreteCommand;
import com.elvin.designmode.command.basic.invoker.Invoker;
import com.elvin.designmode.command.basic.receiver.Receiver;

public class Client {
    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
