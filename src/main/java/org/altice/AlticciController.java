package org.altice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alticci/{n:\\d+}")
public class AlticciController {

    private static AlticciService service = new AlticciService();

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public int alticci(int n) {
        return service.a(n);
    }
}
