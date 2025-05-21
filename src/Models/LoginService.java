package Models;

import Models.Usuario;
import Utils.HashUtil;
import java.util.ArrayList;
import java.util.List;

public class LoginService {
    private List<Usuario> usuariosRegistrados;

    public LoginService() {
        this.usuariosRegistrados = new ArrayList<>();

        usuariosRegistrados.add(new Usuario("admin", HashUtil.sha256("1234")));
        usuariosRegistrados.add(new Usuario("cajero", HashUtil.sha256("5678")));
    }

    public boolean autenticar(String username, String password) {
        String hashIngresado = HashUtil.sha256(password);
        for (Usuario usuario : usuariosRegistrados) {
            if (usuario.getUsername().equals(username) &&
                usuario.getPassword().equals(hashIngresado)) {
                return true;
            }
        }
        return false;
    }
}
