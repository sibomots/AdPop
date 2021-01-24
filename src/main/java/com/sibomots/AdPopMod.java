package com.sibomots.adpop;

import com.sibomots.adpop.AdPopMeta;

import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.plugin.Plugin;

import javax.inject.Inject;

// import java.io.File;
// import java.io.IOException;
// import java.net.URL;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.util.Random;
// import java.util.concurrent.TimeUnit;
// 
// import ninja.leaping.configurate.commented.CommentedConfigurationNode;
// import ninja.leaping.configurate.hocon.HoconConfigurationLoader;
// import ninja.leaping.configurate.loader.ConfigurationLoader;
// 
//import org.slf4j.Logger;
//import org.spongepowered.api.Game;
//import org.spongepowered.api.Sponge;
// import org.spongepowered.api.command.CommandException;
// import org.spongepowered.api.command.CommandResult;
// import org.spongepowered.api.command.args.GenericArguments;
// import org.spongepowered.api.command.spec.CommandSpec;
// import org.spongepowered.api.config.ConfigDir;
// import org.spongepowered.api.config.DefaultConfig;
// import org.spongepowered.api.entity.living.player.Player;
//import org.spongepowered.api.event.Listener;
//import org.spongepowered.api.event.game.GameReloadEvent;
//import org.spongepowered.api.event.game.state.GameStartedServerEvent;
//import org.spongepowered.api.event.game.state.GameStoppingServerEvent;
//import org.spongepowered.api.plugin.Plugin;
// import org.spongepowered.api.scheduler.Task;
// import org.spongepowered.api.text.Text;
// import org.spongepowered.api.text.Text.Builder;
// import org.spongepowered.api.text.action.TextActions;
// import org.spongepowered.api.text.serializer.TextSerializers;
// 
//import com.google.inject.Inject;


@Plugin(id = AdPopMeta.ID, 
        name = AdPopMeta.NAME, 
        version = AdPopMeta.VERSION, 
        authors= AdPopMeta.AUTHOR,
        description = AdPopMeta.ABOUT)
public class AdPopMod 
{
    private final Logger logger;

    @Inject
    public AdPopMod(Logger logger)
    {
          this.logger = logger;
    }

    @Listener
    public void onPreInit(GamePreInitializationEvent evnt)
    {
       this.logger.info("Loading " + AdPopMeta.NAME 
                        + " Version " + AdPopMeta.VERSION);
       // delegate the initialization
    }
} 
