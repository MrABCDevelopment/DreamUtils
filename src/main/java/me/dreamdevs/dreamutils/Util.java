package me.dreamdevs.dreamutils;

import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.*;

@UtilityClass
public class Util {

	private final @Getter static Random random = new Random();

	public static boolean chance(double chance) {
		return Math.random() < chance;
	}

	public static int randomSlot(int max) {
		return random.nextInt(max);
	}

	public static void sendPluginMessage(String message) {
		Bukkit.getConsoleSender().sendMessage(ColourUtil.colorize(message));
	}

	public static void tryCreateFile(@NotNull File file) {
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (Exception e) {
				// To do nothing
			}
		}
	}

}