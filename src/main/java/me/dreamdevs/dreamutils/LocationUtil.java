package me.dreamdevs.dreamutils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class LocationUtil {

	public static Location getStringLocation(@NotNull String location) {
		try {
			String[] params = location.split(":");
			int x = Integer.parseInt(params[0]);
			int y = Integer.parseInt(params[1]);
			int z = Integer.parseInt(params[2]);
			String world = params[3];
			return new Location(Bukkit.getWorld(world),x,y,z);
		} catch (Exception e) {

		}
		return null;
	}

	public static String getLocationString(@NotNull Location location) {
		return location.getBlockX()+":"+location.getBlockY()+":"+location.getBlockZ()+":"
				+ Objects.requireNonNull(location.getWorld()).getName();
	}

}