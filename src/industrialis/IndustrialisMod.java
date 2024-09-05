package industrialis;

import arc.*;
import arc.util.*;
import industrialis.content.*;
import mindustry.content.Planets;
import mindustry.game.EventType.*;
import mindustry.game.Schematic;
import mindustry.game.Schematics;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class IndustrialisMod extends Mod{

    public IndustrialisMod(){
        //I am not done yet, quit poking around!
    }

    @Override
    public void loadContent(){
        IndustrialItems.load();
        IndustrialLiquids.load();
    }
}
