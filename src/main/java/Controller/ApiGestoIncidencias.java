package Controller;

import static Utils.JsonUtils.json;
import static spark.Spark.*;

import Model.Incidente;
import Model.Proyecto;
import com.google.gson.Gson;
public class ApiGestoIncidencias {
    public static void main(String[] args) {
        port(8080);

        path("/usuario", () -> {

            get("" ,(req,res)-> UsuarioController.getUsuarios(req,res),json());
            get("/:id" ,(req,res)-> UsuarioController.getUsuario(req,res),json());
            post("" ,(req,res)-> UsuarioController.createUsuario(req,res),json());
            put("" ,(req,res)-> UsuarioController.setUsuario(req,res),json());
            delete("/:id" ,(req,res)-> UsuarioController.deleteUsuario(req,res),json());
        });

        path("/proyecto", () -> {

            get("/proyecto" ,(req,res)-> ProyectoController.getProyectos(req,res),json());
            get("/proyecto/:id" ,(req,res)-> ProyectoController.getProyecto(req,res),json());
            post("/proyecto" ,(req,res)-> ProyectoController.createProyecto(req,res),json());
            put("/proyecto" ,(req,res)-> ProyectoController.setProyecto(req,res),json());
            delete("/proyecto/:id" ,(req,res)-> ProyectoController.deleteProyeccto(req,res),json());
        });

        path("/incidente", () -> {

            get("" ,(req,res)-> IncidenteController.getIncidentes(req,res),json());
            get("/:id" ,(req,res)-> IncidenteController.getIncidente(req,res),json());
            post("" ,(req,res)-> IncidenteController.createIncedente(req,res),json());
            put("" ,(req,res)-> IncidenteController.setIncidente(req,res),json());
        });

    }
}
