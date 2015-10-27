package me.StevenLawson.TotalFreedomMod.Commands;

import org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.StevenLawson.TotalFreedomMod.TFM_Util;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.BOTH)
@CommandParameters(description = "Shows how much u love choc", usage = "/<command>", aliases = "legendary")
public class Command_legendary extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        TFM_Util.bcastMsg(ChatColor.GOLD + sender.getName() + ": Guys!");
        TFM_Util.bcastMsg(ChatColor.GOLD + sender.getName() + ": I found out something!");
        TFM_Util.bcastMsg(ChatColor.GOLD + sender.getName() + ": Captain_Redye is the most Legendary person in the universe!"); 
        
        
        

        return true;
    }
}