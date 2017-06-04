import java.util.Set;

public class Types knows "music.rdf" {
  public static void genericTypes() {
    Set<«:MusicArtist»> s1 = do-query(":MusicArtist");
    Set<«:MusicArtist» ⊔ «:RadioStation»> s2 = do-query(":MusicArtist" ⊔ ":RadioStation");
    Set<«:RadioStation» ⊔ «:MusicArtist»> s3 = do-query(":MusicArtist" ⊔ ":RadioStation");
  }

  public static void wildcardTypes() {
    Set<? extends «:MusicArtist»> s1 = do-query(":MusicArtist");
    Set<? extends «:MusicArtist» ⊔ «:RadioStation»> s2 = do-query(":MusicArtist" ⊔ ":RadioStation");
    Set<? extends «:RadioStation» ⊔ «:MusicArtist»> s3 = do-query(":MusicArtist" ⊔ ":RadioStation");
  }
}