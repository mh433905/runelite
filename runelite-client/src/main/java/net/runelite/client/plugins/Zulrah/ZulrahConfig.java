package net.runelite.client.plugins.zulrah;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(
	keyName = "zulrah",
	name = "Zulrah",
	description = "Configuration for the zulrah plugin"
)
public interface ZulrahConfig extends Config
{
	@ConfigItem(
		keyName = "enabled",
		name = "Enabled",
		description = "Configures whether or not zulrah overlays are displayed"
	)
	default boolean enabled()
	{
		return true;
	}
}