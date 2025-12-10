package com.myprojecticaro.poc_designe_patterns.Behavioral.command;

import java.util.LinkedList;
import java.util.Queue;

/**
 * The Invoker stores and executes commands. It can support queues,
 * scheduling, logging, retries, etc.
 */
public class CommandInvoker {

    private final Queue<Command> queue = new LinkedList<>();

    public void addCommand(Command command) {
        queue.add(command);
    }

    public void executeAll() {
        while (!queue.isEmpty()) {
            Command command = queue.poll();
            command.execute();
        }
    }
}
