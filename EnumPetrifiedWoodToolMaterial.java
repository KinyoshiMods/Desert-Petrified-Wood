package net.minecraft.src;

public enum EnumPetrifiedWoodToolMaterial
{
	
//	 WOOD(0, 59, 2.0F, 0, 15),
//   STONE(1, 131, 4.0F, 1, 5),
//   IRON(2, 250, 6.0F, 2, 14),
//   EMERALD(3, 1561, 8.0F, 3, 10),
//   GOLD(0, 32, 12.0F, 0, 22);
//    WOODSPEAR(0, 50, 2.0F, 2, 3),	
//    GRAVELSPEAR(0, 80, 2.5F, 2, 6),	
//    STONESPEAR(1, 150, 3.75F, 2, 10),
//    PETRIFIEDCHERT(2, 380, 6.5F, 3, 14),
//    CHERT(2, 180, 4.0F, 3, 12),
//    BLACKCHERT(2, 300, 5.0F, 3, 18),
//    REDCHERT(3, 450, 6.0F, 3, 22),
//    NETHERQUARTZSPEAR(3, 350, 9.0F, 3, 50),
//    COBALTCHERT(3, 600, 5.3F, 3, 18),
//    GOLDENCHERT(3, 1000, 7.0F, 3, 30);
    PETRIFIEDWOOD(2, 320, 6.2F, 3, 12);
    
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiencyOnProperMaterial;
    private final int damageVsEntity;
    private final int enchantability;

    private EnumPetrifiedWoodToolMaterial(int var3, int var4, float var5, int var6, int var7)
    {
        this.harvestLevel = var3;
        this.maxUses = var4;
        this.efficiencyOnProperMaterial = var5;
        this.damageVsEntity = var6;
        this.enchantability = var7;
    }

    public int getMaxUses()
    {
        return this.maxUses;
    }

    public float getEfficiencyOnProperMaterial()
    {
        return this.efficiencyOnProperMaterial;
    }

    public int getDamageVsEntity()
    {
        return this.damageVsEntity;
    }

    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    public int getEnchantability()
    {
        return this.enchantability;
    }
}
