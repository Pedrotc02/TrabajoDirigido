package es.ujaen.daw.entregavoluntaria.controller;

import es.ujaen.daw.entregavoluntaria.model.Vehiculo;
import es.ujaen.daw.entregavoluntaria.model.dao.VehiculosDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;


@Controller
@RequestMapping("/vehiculos")
public class VehiculosController {
//    @Autowired
//    @Qualifier("vehiculoDAOMap")
//    private VehiculosDAO vehiculoDAO;
//
//    private static final Logger logger = Logger.getLogger(VehiculosController.class.getName());
//
//
//    public VehiculosController() {
//
//    }
//
//    @ModelAttribute
//    private void configView(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
//        //Common variables for Views
//        //model.addAttribute("srvUrl", request.getContextPath()+request.getServletPath()+"/clientes");
//        //model.addAttribute("imgUrl", request.getContextPath()+"/images");
//        //model.addAttribute("mediosPago", mediosPago.buscaTodos().toArray());
//    }
//
//    @GetMapping(path = {"","/listado"})
//    public String listado(ModelMap model) {
//        List<Vehiculo> clientes=vehiculoDAO.buscaTodos();
//        model.addAttribute("vehiculos", clientes);
//        logger.info("Listando vehiculos");
//        return "vehiculos/listado_jstl";
//    }
//
//    @GetMapping("/visualiza")
//    public String visualiza(@RequestParam(value="id",defaultValue="0")Integer id, ModelMap model ) {
//        model.addAttribute("vehiculo",vehiculoDAO.buscaPorId(id));
//        return "vehiculos/visualiza";
//    }
//
//    @GetMapping("/visualiza/{id}")
//    public String visualizaId(@PathVariable Integer id, ModelMap model ) {
//        model.addAttribute("vehiculo",vehiculoDAO.buscaPorId(id));
//        return "vehiculos/visualiza";
//    }
//
//    @GetMapping("/borra")
//    public String borra(@RequestParam(value="id",defaultValue="0")Integer id, ModelMap model) {
//        vehiculoDAO.borrar(id);
//        model.clear();
//        return "redirect:/vehiculos";
//    }
//
//    @GetMapping("/crea")
//    public String creaForm(ModelMap model) {
//        model.addAttribute("cliente",new Vehiculo());
//        return "vehiculos/crea";
//    }
//
//    @PostMapping("/crea")
//    public String crea(@ModelAttribute("vehiculo") @Valid Vehiculo vehiculo, BindingResult result, ModelMap model) {
//        String view="redirect:listado"; //default view
//
//        if (!result.hasErrors()) {
//            vehiculoDAO.crea(vehiculo);
//            model.clear();
//        }else {
//            view="vehiculos/crea"; //ask for correct data
//        }
//        return view;
//    }
//
//    @GetMapping("/edita")
//    public String editaForm(@RequestParam(value="id",defaultValue="0")Integer id, ModelMap model ) {
//        model.addAttribute("vehiculo", vehiculoDAO.buscaPorId(id));
//        return "vehiculos/edita";
//    }
//
//    @PostMapping("/edita")
//    public String edita(@ModelAttribute("vehiculo") @Valid Vehiculo vehiculo, BindingResult result, ModelMap model) {
//        String view="redirect:visualiza/";
//        if (!result.hasErrors()) {
//            vehiculoDAO.guarda(vehiculo);
//            model.clear();
//            view=view+vehiculo.getId();
//        } else {
//            view="vehiculos/edita"; //ask for correct data
//        }
//        return view;
//    }

}
