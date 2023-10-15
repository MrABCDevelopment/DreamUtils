package me.dreamdevs.dreamutils;

import lombok.Getter;
import me.dreamdevs.dreamutils.inventory.handler.ItemMenuListener;
import org.bukkit.plugin.java.JavaPlugin;

public class DreamCore {

	private static @Getter JavaPlugin plugin;

	public static void loadCore(JavaPlugin hook) {
		plugin = hook;

		ItemMenuListener.getInstance().register(plugin);
	}

}