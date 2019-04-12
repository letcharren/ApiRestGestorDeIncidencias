package Controller;

import static Utils.JsonUtils.json;
import static spark.Spark.*;

import Model.Incidente;
import Model.Proyecto;
import Model.Usuario;
import Utils.StandardResponse;
import Utils.StatusResponse;
import com.google.gson.Gson;
import com.sun.xml.internal.ws.wsdl.writer.UsingAddressing;

import java.util.Collection;

public class ApiGestorIncidencias {
    public static void main(String[] args) {
        port(8080);

        path("/usuario", () -> {

            get("" ,(req,res)-> {
                Collection<Usuario> usuarios =  UsuarioController.getUsuarios(req,res);
                return new StandardResponse(StatusResponse.SUCCESS,new Gson().toJsonTree(usuarios, Usuario.class));
            },json());
            get("/:id" ,(req,res)-> {
                Usuario usuario = UsuarioController.getUsuario(req,res);
                res.type("application/json");
                StandardResponse body= new StandardResponse(StatusResponse.SUCCESS);
                if (res.status()==200){
                    res.status(200);
                    body.setData(new Gson().toJsonTree(usuario));
                }else{
                    res.status(404);
                    body.setMessage("Usuario no encontrado");
                }
                return body;
            },json());
            post("" ,(req,res)-> {
                Usuario usuario = UsuarioController.createUsuario(req,res);
                res.type("application/json");
                StandardResponse body= new StandardResponse(StatusResponse.SUCCESS);
                if (res.status()==201){
                    body.setData(new Gson().toJsonTree(usuario));
                }else{
                    body.setMessage("Usuario no creado");
                }
                return body;
            },json());
            put("" ,(req,res)-> {
                Usuario usuario = UsuarioController.setUsuario(req,res);
                res.type("application/json");
                StandardResponse body= new StandardResponse(StatusResponse.SUCCESS);
                if (res.status()==200){
                    body.setData(new Gson().toJsonTree(usuario));
                }else{
                    body.setMessage("Id usuario no encontrado");
                }
                return body;
            },json());
            delete("/:id" ,(req,res)-> {
                Boolean deleteOK = UsuarioController.deleteUsuario(req,res);
                res.type("application/json");
                StandardResponse body= new StandardResponse(StatusResponse.SUCCESS);
                if (res.status()==200){
                    body.setMessage("Usuario eliminado correctamente");
                }else{
                    body.setMessage("Id usuario no encontrado, no se pudo eliminar el mismo");
                }
                return body;
            },json());
        });

        path("/proyecto", () -> {

            get("" ,(req,res)-> ProyectoController.getProyectos(req,res),json());
            get("/:id" ,(req,res)-> ProyectoController.getProyecto(req,res),json());
            post("" ,(req,res)-> ProyectoController.createProyecto(req,res),json());
            put("" ,(req,res)-> ProyectoController.setProyecto(req,res),json());
            delete("/:id" ,(req,res)-> ProyectoController.deleteProyeccto(req,res),json());
        });

        path("/incidente", () -> {

            get("" ,(req,res)-> IncidenteController.getIncidentes(req,res),json());
            get("/:id" ,(req,res)-> IncidenteController.getIncidente(req,res),json());
            post("" ,(req,res)-> IncidenteController.createIncedente(req,res),json());
            put("" ,(req,res)-> IncidenteController.setIncidente(req,res),json());
        });

    }
}
