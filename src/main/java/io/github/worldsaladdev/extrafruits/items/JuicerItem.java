package io.github.worldsaladdev.extrafruits.items;

import net.minecraft.world.item.Item;

public class JuicerItem extends Item {
    public JuicerItem(Properties p_41383_) {
        super(p_41383_);
        p_41383_.craftRemainder(this);
    }
}
