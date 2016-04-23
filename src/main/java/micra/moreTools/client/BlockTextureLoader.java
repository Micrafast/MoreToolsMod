package micra.moreTools.client;

import micra.moreTools.blocks.BlocksLoader;

/**
 * Created by Administrator on 2016/3/22 0022.
 */
public class BlockTextureLoader {
    public BlockTextureLoader(){
        BlocksLoader.LoadTextures(BlocksLoader.blockWerniumOre, "moretools:wernium_ore");
        BlocksLoader.LoadTextures(BlocksLoader.blockChromiumOre, "moretools:chromium_ore");
        BlocksLoader.LoadTextures(BlocksLoader.blockChromiumBlock, "moretools:chromium_block");
        BlocksLoader.LoadTextures(BlocksLoader.blockStainlessSteelBlock, "moretools:stainless_steel_block");
    }
}
