package com.funburak.hytale;

import com.funburak.hytale.commands.HelloCommand;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

import javax.annotation.Nonnull;

public class HytalePlugin extends JavaPlugin {

    public HytalePlugin(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        super.setup();
        this.getCommandRegistry().registerCommand(new HelloCommand("hello", "An example command", false));
    }
}
