package Controller;

import Model.Incidente;
import Model.Usuario;
import Utils.StandardResponse;
import spark.Request;
import spark.Response;

import java.util.Collection;

public class UsuarioController {

    /**
     * one implementation ArtistDao to connect to db
     */
    private static UsuarioController instance;

    /**
     * Constructor
     */
    private  UsuarioController(){
    }

    /**
     *  Method return SingletonInstance of ArtistController
     */
    public static UsuarioController getInstance() {
        if (instance==null){
            instance=new UsuarioController();
        }
        return instance;
    }

    public static Collection<Usuario> getUsuarios(Request req, Response res) {

        return null;
    }

    public static Usuario getUsuario(Request req, Response res) {

        return null;
    }

    public static Usuario createUsuario(Request req, Response res) {

        return null;
    }

    public static Usuario setUsuario(Request req, Response res) {

        return null;
    }

    public static boolean deleteUsuario(Request req, Response res) {

        return false;
    }

    /*public static Collection<Usuario> getUsuarios(Req) {
        return null;
    }*/

}
