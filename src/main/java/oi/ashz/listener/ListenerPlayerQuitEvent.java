package oi.ashz.listener;

import oi.ashz.PlayerConnection;
import oi.ashz.utility.Message;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class ListenerPlayerQuitEvent implements Listener {
    private PlayerConnection plugin;
    public ListenerPlayerQuitEvent(PlayerConnection p) {
        this.plugin = p;
    }
    @EventHandler
    public void LPlayerQuitEvent(PlayerQuitEvent e) {
        e.setQuitMessage(null);
        Message.sendNonAdminBroadcast(plugin, Message.notification+
                ChatColor.AQUA+e.getPlayer().getName()+
                ChatColor.GRAY+"님이 서버에서 나가셨습니다");
        Message.sendAdminBroadcast(plugin, Message.notification+
                ChatColor.AQUA+e.getPlayer().getName()+
                ChatColor.GRAY+"님이 서버에서 나가셨습니다 "+
                ChatColor.GRAY+"("+
                ChatColor.YELLOW+e.getPlayer().getWorld().getName()+
                ChatColor.GRAY+","+
                ChatColor.YELLOW+(int)e.getPlayer().getLocation().getX()+
                ChatColor.GRAY+","+
                ChatColor.YELLOW+(int)e.getPlayer().getLocation().getY()+
                ChatColor.GRAY+","+
                ChatColor.YELLOW+(int)e.getPlayer().getLocation().getZ()+
                ChatColor.GRAY+")");
    }
}
