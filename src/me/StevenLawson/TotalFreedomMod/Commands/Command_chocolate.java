package me.StevenLawson.TotalFreedomMod.Commands;

import org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.BOTH)
@CommandParameters(description = "Shows how much u love choc", usage = "/<command>", aliases = "chocolate")
public class Command_chocolate extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.sendMessage(ChatColor.AQUA + "[Random Guy] How much do you love chocolate");
        sender.sendMessage(ChatColor.AQUA + "[ME]  WUV IT");
        sender.sendMessage(ChatColor.DARK_GREEN + "[Random Guy] YOU DO?!?");
        sender.sendMessage(ChatColor.DARK_GREEN + "[ME] YES!!");
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "[ME] GIVE ME SOME");
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "[Random Guy] *Gives Chocolate*");
        sender.sendMessage(ChatColor.RED + "[ME] *Eats it*");
        sender.sendMessage(ChatColor.RED + "[ME] YUM YUM!");
        sender.sendMessage(ChatColor.DARK_PURPLE + "[Random Guy] Its so yum, give me some");
        sender.sendMessage(ChatColor.DARK_PURPLE + "[ME] No fuck off, its mine.");
        sender.sendMessage(ChatColor.DARK_PURPLE + "[ME] *Walks Away*");
        sender.sendMessage(ChatColor.BLUE + "[Random Guy] RUDE! damn kids...");
        sender.sendMessage(ChatColor.BLUE + "This Command Was Made By xEpson");

        return true;
    }
}
