import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path(value="/customers")
public class Rest {

  @GET
  @Produces("text/json")
  public String get() {
    return "Hell0 world";
  }

  @PUT
  @Consumes("text/json")
  public void put(String content) {

  }
}