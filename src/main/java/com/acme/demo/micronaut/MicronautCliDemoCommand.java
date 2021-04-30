package com.acme.demo.micronaut;

import io.micronaut.configuration.picocli.PicocliRunner;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "micronaut-cli-demo", description = "Demo Micronaut CLI",
        mixinStandardHelpOptions = true)
public class MicronautCliDemoCommand implements Runnable {
    public static void main(String[] args) throws Exception {
        PicocliRunner.run(MicronautCliDemoCommand.class, args);
    }

    public void run() {
        System.out.println("Hello world!");
    }
}
