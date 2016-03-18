package com.j0ach1mmall3.ultimatecosmetics.modules.hearts;


import com.j0ach1mmall3.jlib.inventory.GuiItem;
import com.j0ach1mmall3.ultimatecosmetics.Main;
import com.j0ach1mmall3.ultimatecosmetics.api.storage.CosmeticStorage;
import org.bukkit.potion.PotionEffectType;

/**
 * @author j0ach1mmall3 (business.j0ach1mmall3@gmail.com)
 * @since 23/08/2015
 */
public final class HeartStorage extends CosmeticStorage {
    private final int rows;
    private final Color color;
    private final Effect effect;

    public HeartStorage(Main plugin, String identifier, String permission, GuiItem guiItem, int rows, Color color, Effect effect) {
        super(plugin, identifier, permission, guiItem);
        this.rows = rows > 4 ? 4 : rows < 1 ? 1 : rows;
        this.color = color;
        this.effect = effect;
    }

    public int getRows() {
        return this.rows;
    }

    public Color getColor() {
        return this.color;
    }

    public Effect getEffect() {
        return this.effect;
    }

    public enum Color {
        RED(null),
        GREEN(PotionEffectType.POISON),
        BLACK(PotionEffectType.WITHER),
        YELLOW(PotionEffectType.ABSORPTION);
        private final PotionEffectType potioneffect;

        Color(PotionEffectType potioneffect) {
            this.potioneffect = potioneffect;
        }

        public PotionEffectType getPotionEffect() {
            return this.potioneffect;
        }
    }

    public enum Effect {
        BOUNCING(PotionEffectType.REGENERATION),
        NONE(null);
        private final PotionEffectType potioneffect;

        Effect(PotionEffectType potioneffect) {
            this.potioneffect = potioneffect;
        }

        public PotionEffectType getPotionEffect() {
            return this.potioneffect;
        }
    }
}
