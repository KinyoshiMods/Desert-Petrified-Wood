/** code generated by Kinyoshi */
package net.minecraft.src;

import java.util.Random;

public class WorldGenPetrifiedWood extends WorldGenerator
{
	
    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {	
    	//cluster size
        for (int var6 = 0; var6 < 1 + var2.nextInt(3); ++var6)
        {
            int var7 = var3 + var2.nextInt(16);
            int var8 = var4;
            int var9 = var5 + var2.nextInt(16);

    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
 //   public boolean canBlockStay(World par1World, int par2, int par3, int par4)
 //   {
 //       return par1World.getBlockMaterial(par2, par3 - 1, par4) == Material.sand && par1World.getBlockMetadata(par2, par3 - 1, par4) == 0 : false;
//    }
//
     if (var1.isAirBlock(var7, var4, var9) && (var1.getBlockMaterial(var7 - 1, var4 - 1, var9) == Material.sand || var1.getBlockMaterial(var7 + 1, var4 - 1, var9) == Material.sand || var1.getBlockMaterial(var7, var4 - 1, var9 - 1) == Material.sand || var1.getBlockMaterial(var7, var4 - 1, var9 + 1) == Material.sand))
            {
            	//block height

                for (int var11 = 0; var11 < 1 + var2.nextInt(1); ++var11)
                {
                    if (mod_DesertPetrifiedWood.BlockPetrifiedWood.canBlockStay(var1, var7, var8 + var11, var9))
                    {
                        var1.setBlock(var7, var8 + var11, var9, mod_DesertPetrifiedWood.BlockPetrifiedWood.blockID);
                    }
                }
            }
        }
        

        return true;

    }
}