package semantics.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import semantics.KnowBase;


public class Nothing extends Conceptual {
  public JsonElement toJson() {
    return new JsonPrimitive(false);
  }

  @Override
  public String toString() {
    return "⊥";
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof Nothing;
  }
}
