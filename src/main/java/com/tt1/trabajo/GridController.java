package com.tt1.trabajo;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import utils.ConsumidorOpenAPI;

@Controller
public class GridController {
	private final ConsumidorOpenAPI consumidorAPI;
    private final Logger logger;
    public GridController(ConsumidorOpenAPI consumidorAPI, Logger logger) {
        this.consumidorAPI = consumidorAPI;
        this.logger = logger;
    }

    @GetMapping("/grid")
    public String obtenerGrid(@RequestParam(name = "tok") Integer token, Model model) {
        String respuestaTexto = consumidorAPI.obtenerGridDesdeVM(token, "usuarioPrueba");
        logger.info(respuestaTexto);
        try {
            String[] lineas = respuestaTexto.split("\n");
            int size = Integer.parseInt(lineas[0].trim());
            String[][] grid = new String[size][size];
            // Pintamos todo de blanco
            for(int i = 0; i < size; i++) {
                for(int j = 0; j < size; j++) {
                    grid[i][j] = "white";
                }
            }
            
            // Pintamos por encima los colores
            for(int i = 1; i < lineas.length; i++) {
                String[] partes = lineas[i].trim().split(",");
                if(partes.length == 4) {
                    int y = Integer.parseInt(partes[1].trim());
                    int x = Integer.parseInt(partes[2].trim());
                    String color = partes[3].trim();
                    grid[y][x] = color; 
                }
            }
            model.addAttribute("grid", grid);
        } catch (Exception e) {
            logger.error("Error procesando los datos para la vista: " + e.getMessage());
            model.addAttribute("error", "No se pudo procesar la cuadrícula.");
        }
        return "grid"; 
    }
    
    
}
