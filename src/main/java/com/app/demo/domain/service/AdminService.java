package com.app.demo.domain.service;


import com.app.demo.persistence.entity.Admin;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    public boolean validateAdmin(String username, String password) {
        // Aquí puedes implementar la lógica de validación de administrador
        // Por ahora, vamos a asumir que hay un usuario de administrador fijo "admin" con contraseña "admin123"
        return username.equals("admin") && password.equals("admin123");
    }
}
