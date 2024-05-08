package es.ujaen.daw.entregavoluntaria.controller;

import es.ujaen.daw.entregavoluntaria.model.Vehiculo;
import es.ujaen.daw.entregavoluntaria.model.dao.VehiculosDAO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.logging.Logger;


@Controller
@RequestMapping("vehiculos")
public class VehiculosController {
    @Autowired
    //@Qualifier("vehiculoDAOMap")
    @Qualifier("vehiculoDAOJPA")
    private VehiculosDAO vehiculoDAO;

    private static final Logger logger = Logger.getLogger(VehiculosController.class.getName());


    public VehiculosController() {

    }

    @GetMapping(path = {"","/listado"})
    public String listado(ModelMap model) {
        List<Vehiculo> vehiculos=vehiculoDAO.buscaTodos();
        model.addAttribute("vehiculos", vehiculos);
        logger.info("Listando vehiculos");
        return "vehiculos/listado";
    }

    @GetMapping("/visualiza")
    public String visualiza(@RequestParam(value="id",defaultValue="0")Integer id, ModelMap model ) {
        model.addAttribute("vehiculo",vehiculoDAO.buscaPorId(id));
        return "vehiculos/visualiza";
    }

    @GetMapping("/visualiza/{id}")
    public String visualizaId(@PathVariable Integer id, ModelMap model ) {
        model.addAttribute("vehiculo",vehiculoDAO.buscaPorId(id));
        return "vehiculos/visualiza";
    }

    @GetMapping("/borra")
    public String borra(@RequestParam(value="id",defaultValue="0")Integer id, ModelMap model) {
        vehiculoDAO.borrar(id);
        model.clear();
        return "redirect:/vehiculos";
    }

    @GetMapping("/registrar")
    public String creaForm(ModelMap model) {
        model.addAttribute("vehiculo",new Vehiculo());
        return "vehiculos/registrar";
    }

    @PostMapping("/registrar")
    public String crea(@ModelAttribute("vehiculo") @Valid Vehiculo vehiculo, BindingResult result, ModelMap model) {
        String view="redirect:listado"; //default view

        if (!result.hasErrors()) {
            vehiculoDAO.crea(vehiculo);
            model.clear();
        }else {
            view="vehiculos/registrar"; //ask for correct data
        }
        return view;
    }

    @GetMapping("/edita")
    public String editaForm(@RequestParam(value="id",defaultValue="0")Integer id, ModelMap model ) {
        model.addAttribute("vehiculo", vehiculoDAO.buscaPorId(id));
        return "vehiculos/edita";
    }

    @PostMapping("/edita")
    public String edita(@ModelAttribute("vehiculo") @Valid Vehiculo vehiculo, BindingResult result, ModelMap model) {
        String view="redirect:visualiza/";
        if (!result.hasErrors()) {
            vehiculoDAO.guarda(vehiculo);
            model.clear();
            view=view+vehiculo.getId();
        } else {
            view="vehiculos/edita"; //ask for correct data
        }
        return view;
    }

}
