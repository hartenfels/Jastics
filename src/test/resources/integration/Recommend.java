import java.util.Set;
import static semantics.Individuals.getSorted;


public class Recommend knows "wine.rdf" {
  private static «:Wine» getWineFor(«:Winery» winery) {
    try {
      return («:Wine») getSorted(winery.«:hasMaker»⁻).get(0);
    }
    catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  private static String recommendFor(«:Wine» wine) {
    switch-type (wine) {
        «:RedWine»   _ { return "\uD83C\uDF57"; } // poultry leg
        «:WhiteWine» _ { return "\uD83D\uDC1F"; } // fish
        «:RoseWine»  _ { return "\u2753";       } // question mark ornament
        default        { return "stay away!";   }
    }
  }

  public static void main(String[] args) {
    for («:Winery» winery : getSorted(do-query(":Winery"))) {
      «:Wine» wine = getWineFor(winery);
      String  food = wine == null ? "not a winery at all" : recommendFor(wine);
      System.out.format("%25s: %s\n", winery.getName(), food);
    }
  }
}


/*
 *>                  Bancroft: 🐟
 *>                  Beringer: not a winery at all
 *>        ChateauChevalBlanc: 🍗
 *>             ChateauDYchem: 🐟
 *>        ChateauDeMeursault: 🐟
 *>   ChateauLafiteRothschild: 🍗
 *>      ChateauMargauxWinery: 🍗
 *>             ChateauMorgon: 🍗
 *>           ClosDeLaPoussie: 🐟
 *>             ClosDeVougeot: 🍗
 *>           CongressSprings: 🐟
 *>                   Corbans: 🐟
 *>          CortonMontrachet: 🐟
 *>                   Cotturi: 🍗
 *>                    DAnjou: ❓
 *>                     Elyse: 🍗
 *>                    Forman: 🍗
 *>                     Foxen: 🐟
 *>               GaryFarrell: 🍗
 *>                   Handley: not a winery at all
 *>              KalinCellars: 🐟
 *>            KathrynKennedy: 🍗
 *>                LaneTanner: 🍗
 *>                 Longridge: 🍗
 *>                  Marietta: 🍗
 *>               McGuinnesso: 🍗
 *>         MountEdenVineyard: 🐟
 *>                 Mountadam: 🐟
 *>            PageMillWinery: 🍗
 *>                PeterMccoy: 🐟
 *>         PulignyMontrachet: 🐟
 *> SantaCruzMountainVineyard: 🍗
 *>           SaucelitoCanyon: 🍗
 *>          SchlossRothermel: 🐟
 *>             SchlossVolrad: 🐟
 *>              SeanThackrey: 🍗
 *>                    Selaks: 🐟
 *>              SevreEtMaine: 🐟
 *>               StGenevieve: 🐟
 *>                 Stonleigh: 🐟
 *>                    Taylor: 🍗
 *>                   Ventana: 🐟
 *>             WhitehallLane: 🍗
 */
