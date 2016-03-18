package com.j0ach1mmall3.ultimatecosmetics.modules.auras;

import com.j0ach1mmall3.ultimatecosmetics.Main;
import com.j0ach1mmall3.ultimatecosmetics.api.CosmeticType;
import com.j0ach1mmall3.ultimatecosmetics.api.Cosmetic;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * @author j0ach1mmall3 (business.j0ach1mmall3@gmail.com)
 * @since 6/03/2016
 */
public final class AurasRunnable extends BukkitRunnable {
    private final AurasModule module;

    public AurasRunnable(AurasModule module) {
        this.module = module;
    }

    @Override
    public void run() {
        for (Cosmetic cosmetic : ((Main) this.module.getParent()).getApi().getCosmetics(CosmeticType.AURA)) {
            for(Player p : Bukkit.getOnlinePlayers()) {
                ((Aura) cosmetic).setGlowing(p);
            }
        }
    }
}
