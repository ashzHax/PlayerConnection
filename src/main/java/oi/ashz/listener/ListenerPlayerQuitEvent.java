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
    public boolean LPlayerQuitEvent(PlayerQuitEvent e) {
        e.setQuitMessage(null);
        Message.sendBroadcast(plugin, Message.warning+
                ChatColor.AQUA+e.getPlayer().getName()+
                ChatColor.GRAY+"님이 서버에서 나가셨습니다");
        Message.sendAdminMessage(plugin, Message.notification+
                ChatColor.GRAY+"Player Quit Location:"+
                ChatColor.GRAY+"\n    - world: "+ChatColor.YELLOW+e.getPlayer().getWorld().getName()+
                ChatColor.GRAY+"\n    - x: "+ChatColor.YELLOW+e.getPlayer().getLocation().getX()+
                ChatColor.GRAY+"\n    - y: "+ChatColor.YELLOW+e.getPlayer().getLocation().getY()+
                ChatColor.GRAY+"\n    - z: "+ChatColor.YELLOW+e.getPlayer().getLocation().getZ());
        return true;
    }
}
