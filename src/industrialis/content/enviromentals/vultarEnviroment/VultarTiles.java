 package industrialis.content.enviromentals.vultarEnviroment;

 import industrialis.content.*;
 import mindustry.content.*;
 import mindustry.type.*;
 import mindustry.world.*;
 import mindustry.graphics.*;
 import mindustry.world.draw.*;
 import mindustry.world.meta.*;
 import mindustry.world.blocks.environment.*;
 import mindustry.entities.effect.*;
 import arc.graphics.gl.*;
 import arc.graphics.*;
 import arc.math.*;

 import static mindustry.type.ItemStack.*;

 public class VultarTiles {
    public static Block
          //floors
          redRockFloor, basaltFloor, moltenTinTile, moltenScrappedMetalTile, ancientPlates,
          ancientPlatesDamaged, moltenLeadTile, moltenIronTile, moltenGoldTile, moltenCopperTile,
          //walls
          redRockwall, redRockWallLarge, basaltWall, BasaltWallLarge, ancientMetal,
          //decor
          redRockyBoulder, basaltRockyBoulder;
    public static void load() {

     //Floor-Region
     redRockFloor = new Floor("red-rock-floor") {{
       variants = 3;
     }};

     basaltFloor = new Floor("basalt-floor"){{
       itemDrop = IndustrialItems.basalt;
       playerUnmineable = true;
       variants = 3;
     }};

     ancientPlates = new Floor("ancient-plates"){{
      variants = 1;
     }};

     ancientPlatesDamaged = new Floor("ancient-plates-damaged"){{
      variants = 3;
     }};

     moltenTinTile = new Floor("molten-tin-tile"){{
       drownTime = 100f;
       status = StatusEffects.melting;
       statusDuration = 240f;
       speedMultiplier = 0.19f;
       variants = 1;
       liquidDrop = IndustrialLiquids.moltenTin;
       isLiquid = true;
       cacheLayer = CacheLayer.tar;
       attributes.set(Attribute.heat, 0.85f);
       emitLight = true;
       lightColor = Color.valueOf("969696");
       lightRadius = 40f;
     }};

     moltenCopperTile = new Floor("molten-copper-tile"){{
      drownTime = 100f;
      status = StatusEffects.melting;
      statusDuration = 240f;
      speedMultiplier = 0.19f;
      variants = 1;
      liquidDrop = IndustrialLiquids.moltenCopper;
      isLiquid = true;
      cacheLayer = CacheLayer.slag;
      attributes.set(Attribute.heat, 0.85f);
      emitLight = true;
      lightColor = Color.valueOf("e17416");
      lightRadius = 40f;
     }};

     moltenGoldTile = new Floor("molten-gold-tile"){{
      drownTime = 100f;
      status = StatusEffects.melting;
      statusDuration = 240f;
      speedMultiplier = 0.19f;
      variants = 1;
      liquidDrop = IndustrialLiquids.moltenGold;
      isLiquid = true;
      cacheLayer = CacheLayer.slag;
      attributes.set(Attribute.heat, 0.85f);
      emitLight = true;
      lightColor = Color.valueOf("ffae11");
      lightRadius = 40f;
     }};

     moltenIronTile = new Floor("molten-iron-tile"){{
      drownTime = 100f;
      status = StatusEffects.melting;
      statusDuration = 240f;
      speedMultiplier = 0.19f;
      variants = 1;
      liquidDrop = IndustrialLiquids.moltenIron;
      isLiquid = true;
      cacheLayer = CacheLayer.slag;
      attributes.set(Attribute.heat, 0.85f);
      emitLight = true;
      lightColor = Color.valueOf("ff2d00");
      lightRadius = 40f;
     }};

     moltenLeadTile = new Floor("molten-lead-tile"){{
      drownTime = 100f;
      status = StatusEffects.melting;
      statusDuration = 240f;
      speedMultiplier = 0.19f;
      variants = 1;
      liquidDrop = IndustrialLiquids.moltenLead;
      isLiquid = true;
      cacheLayer = CacheLayer.slag;
      attributes.set(Attribute.heat, 0.85f);
      emitLight = true;
      lightColor = Color.valueOf("7349b0");
      lightRadius = 40f;
     }};

     moltenScrappedMetalTile = new Floor("molten-scrapped-metal-tile"){{
      drownTime = 100f;
      status = StatusEffects.melting;
      statusDuration = 240f;
      speedMultiplier = 0.19f;
      variants = 1;
      liquidDrop = IndustrialLiquids.moltenScrappedMetal;
      isLiquid = true;
      cacheLayer = CacheLayer.tar;
      attributes.set(Attribute.heat, 0.85f);
      emitLight = true;
      lightColor = Color.valueOf("090909");
      lightRadius = 40f;
     }};
     //Floor-EndRegion

     //Wall-Region
     redRockwall = new StaticWall("red-rock-wall"){{
      redRockFloor.asFloor().wall = this;
      variants = 2;
     }};

     basaltWall = new StaticWall("basalt-wall"){{
      basaltFloor.asFloor().wall = this;
      variants = 2;
     }};

     ancientMetal = new StaticWall("ancient-metal"){{
      ancientPlates.asFloor().wall = ancientPlatesDamaged.asFloor().wall = this;
      variants = 2;
     }};
     //Wall-EndRegion

     //Decor-Region
     redRockyBoulder = new Prop("red-rocky-boulder"){{
      variants = 2;
      redRockFloor.asFloor().decoration = this;
     }};

     basaltRockyBoulder = new Prop("basaltic-rocky-boulder"){{
      variants = 2;
      basaltFloor.asFloor().decoration = this;
     }};
     //Decor-EndRegion
    }
 }