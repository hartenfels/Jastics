package semantics.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;


public class Nothing extends Conceptual {
  public JsonElement toJson() {
    return new JsonPrimitive(false);
  }

  @Override
  public String toString() {
    return "⊥";
  }
}
