package me.StevenLawson.TotalFreedomMod.Commands;

import org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.BOTH)
@CommandParameters(description = "About the server", usage = "/<command>", aliases = "about")
public class Command_about extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.sendMessage(ChatColor.AQUA + "Welcome to StormFreedom");
        sender.sendMessage(ChatColor.AQUA + "The Owners are xTJG35x and Captain_Redeye");
        sender.sendMessage(ChatColor.DARK_GREEN + "Our mod (StormFreedomMod) was created by xEpson");
        sender.sendMessage(ChatColor.DARK_GREEN + "xEpson is the Lead Developer of StormFreedom");
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "If you'd like to apply for admin, type /ai");
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "StormFreedomMod is based of the TotalFreedomMod");
        sender.sendMessage(ChatColor.RED + "But this mod includes more features and flexibility, therefore, more ranks, and more commands");
        sender.sendMessage(ChatColor.RED + "For more info on about this mod, please contact xEpson");
        sender.sendMessage(ChatColor.DARK_PURPLE + "If you want Developer, please PM xEpson on forums");
        sender.sendMessage(ChatColor.DARK_PURPLE + "and explain what would make you a good developer");
        sender.sendMessage(ChatColor.BLUE + "and why do you want developer");
        sender.sendMessage(ChatColor.BLUE + "You cannot get Lead-Developer as xEpson already is");
        sender.sendMessage(ChatColor.DARK_RED + "---ABOUT CUSTOM COMMANDS---");
        sender.sendMessage(ChatColor.BLUE + "xEpson coded these commands: /lag /about /chocolate. And more to come.");
        sender.sendMessage(ChatColor.BLUE + "xEpson also coded this command, PM him on forums for more info");

        return true;
    }
}

