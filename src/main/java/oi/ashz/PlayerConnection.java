package oi.ashz;

import oi.ashz.listener.ListenerPlayerJoinEvent;
import oi.ashz.listener.ListenerPlayerQuitEvent;
import oi.ashz.utility.Message;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerConnection extends JavaPlugin {
    public String pluginName = "PlayerConnection";

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new ListenerPlayerJoinEvent(this), this);
        this.getServer().getPluginManager().registerEvents(new ListenerPlayerQuitEvent(this), this);
        Message.sendConsoleMessage(this, Message.notification + "starting plugin: "+this.pluginName);
    }
    @Override
    public void onDisable() {
        Message.sendConsoleMessage(this, Message.warning + "ending plugin: "+this.pluginName);
    }
}