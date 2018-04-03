package akademiasovy.PSC.resources;


import akademiasovy.PSC.db.SqlSelects;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/posta")
public class Locations {

    @GET
    @Path("/city/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPSCfromCity(@PathParam("city")String city){

        List<String> ZipList = new SqlSelects().getZipCodeFromCity(city);

        boolean b = false;
        String result = "[";
        for (String temp : ZipList) {
            if (b == true) {
                result += ',';
            } else
                b = true;
            result += "\"" + temp + "\"";
        }
        result += "]";
        return  result;
    }

    @GET
    @Path("/psc/{psc}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCityFromPSC(@PathParam("psc")String zip){
        List<String> CityList = new SqlSelects().getCityFromZipCode(zip);

        boolean b = false;
        String result = "[";
        for (String temp : CityList) {
            if (b == true) {
                result += ',';
            } else
                b = true;
            result += "\"" + temp + "\"";
        }
        result += "]";
        return  result;
    }

}
