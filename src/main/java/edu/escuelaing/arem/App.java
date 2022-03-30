package edu.escuelaing.arem;

/**
 * Hello world!
 *
 */
import com.google.gson.Gson;

import static spark.Spark.*;
public class App 
{

    private static Gson gson = new Gson();

    public static void main( String[] args )
    {
        port(4568);
        get("/:operar/:numero", (req, res) -> operar(req.params(":operar"),req.params(":numero")));
    }


    public static String operar(String operar ,String numero){
        System.out.println("entre");
        Sqrt sqrt = new Sqrt(Double.parseDouble(numero), operar);
        sqrt.operar();
        return gson.toJson(sqrt);
    }
}
