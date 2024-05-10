package com.app.demo.api.controller;
import com.app.demo.domain.dto.AdminDTO;
import com.app.demo.domain.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping(value = "/login")
    public boolean login(@RequestBody AdminDTO adminDTO) {
        // Llama al método correcto en AdminService para validar el inicio de sesión del administrador
        // Retorna true si el inicio de sesión es exitoso, de lo contrario, retorna false
        return adminService.validateAdmin(adminDTO.getUsername(), adminDTO.getPassword());
    }

    // Otros endpoints relacionados con la gestión de administradores, si es necesario
}
