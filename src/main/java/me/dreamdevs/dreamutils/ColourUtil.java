package me.dreamdevs.dreamutils;

import lombok.experimental.UtilityClass;
import net.md_5.bungee.api.ChatColor;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@UtilityClass
public final class ColourUtil {

	public static String colorize(@NotNull String string) {
		Pattern pattern = Pattern.compile("#[a-fA-F0-9]{6}");
		for (Matcher matcher = pattern.matcher(string); matcher.find(); matcher = pattern.matcher(string)) {
			String color = string.substring(matcher.start(), matcher.end());
			string = string.replace(color, ChatColor.of(color) + ""); // You're missing this replacing
		}
		string = ChatColor.translateAlternateColorCodes('&', string); // Translates any & codes too
		return string;
	}

	public static List<String> colouredLore(String... lore) {
		return Optional.ofNullable(lore).map(ColourUtil::colouredLore).orElse(new ArrayList<>());
	}

	public static List<String> colouredLore(List<String> lore) {
		return Optional.ofNullable(lore).map(strings -> strings.stream().map(ColourUtil::colorize).collect(Collectors.toList())).orElse(new ArrayList<>());
	}

}