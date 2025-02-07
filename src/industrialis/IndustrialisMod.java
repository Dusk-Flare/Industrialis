package industrialis;

import industrialis.content.*;
import mindustry.mod.Mod;

public class IndustrialisMod extends Mod{

    public IndustrialisMod(){
        //I am not done yet, quit poking around!
    }

    @Override
    public void loadContent(){
        IndustrialItems.load();
        IndustrialLiquids.load();
        IndustrialUnits.load();
        IndustrialBlocks.load();
        IndustrialEnv.load();
    }
}
