package industrialis.content.enviromentals.vultarEnviroment;

import arc.graphics.*;
import arc.math.*;
import arc.math.geom.*;
import arc.util.*;
import arc.util.noise.*;
import mindustry.ai.*;
import mindustry.content.*;
import mindustry.game.*;
import mindustry.maps.generators.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;

public class VultarPlanetGenerator extends PlanetGenerator{
    Block[] terrain = {VultarTiles.regolith, Blocks.regolith, Blocks.regolith, Blocks.regolith, Blocks.yellowStone, Blocks.rhyolite, Blocks.rhyolite, Blocks.carbonStone};

    @Override
    public Color getColor(Vec3 position){
        Block block = getBlock(position);

        return Tmp.c1.set(block.mapColor).a(1f - block.albedo);
    }
}