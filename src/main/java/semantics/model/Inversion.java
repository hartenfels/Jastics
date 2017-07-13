package semantics.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import semantics.KnowBase;
import static semantics.KnowBase.toTaggedArray;


public class Inversion extends Base implements Roleish {
  private final Roleish r;

  public Inversion(Roleish r) {
    this.r = r;
  }

  @Override
  public void checkSignature(KnowBase kb) {
    r.checkSignature(kb);
  }

  @Override
  public JsonElement toJson() {
    return toTaggedArray("i", r.toJson());
  }

  @Override
  public boolean containsUnknown() {
    return r.containsUnknown();
  }

  @Override
  public Roleish stripUnknownRole() {
    return containsUnknown() ? new Top() : this;
  }

  @Override
  public String toString() {
    return String.format("%s⁻", r);
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Inversion) {
      return r.equals(((Inversion) o).r);
    }
    return false;
  }
}
