 package industrialis.content.enviromentals.vultarEnviroment;

 import industrialis.content.*;
 import mindustry.content.*;
 import mindustry.graphics.*;
 import mindustry.type.*;
 import mindustry.world.*;
 import mindustry.world.draw.*;
 import mindustry.world.meta.*;
 import mindustry.graphics.CacheLayer.*;
 import mindustry.world.blocks.environment.*;
 import mindustry.entities.effect.*;
 import arc.graphics.*;
 import arc.math.*;

 import static mindustry.type.ItemStack.*;

 public class VultarOres {
  public static Block
          tinOre, goldOre, ironOre, mineralLead, mineralCopper, mineralCoal;

  public static void load() {

   mineralCopper = new OreBlock("mineral-copper-ore", IndustrialItems.copperRod);

   tinOre = new OreBlock("tin-ore", IndustrialItems.tin);

   mineralLead = new OreBlock("mineral-lead-ore", IndustrialItems.leadClump);

   goldOre = new OreBlock("gold-ore", IndustrialItems.gold);

   mineralCoal = new OreBlock("mineral-coal-ore", IndustrialItems.mineralCoal);

   ironOre = new OreBlock("iron-ore", IndustrialItems.iron);
  }
 }