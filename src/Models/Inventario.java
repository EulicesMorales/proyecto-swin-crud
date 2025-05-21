package Models;

import java.util.ArrayList;
import java.util.List;

public final class Inventario {
    private List<Producto> productos;
    
    public Inventario() {
    productos = new ArrayList<>();
    
    
    agregarProducto("MED-001", "Acetaminofén 500mg", 100, 2000.00);
    agregarProducto("MED-002", "Ibuprofeno 400mg", 80, 4500.00);
    agregarProducto("MED-003", "Omeprazol 20mg", 60, 3000.00);
    agregarProducto("MED-004", "Jarabe para la tos infantil", 40, 2500.00);
    agregarProducto("MED-005", "Alcohol antiséptico 70%", 50, 3500.00);
    agregarProducto("MED-006", "Termómetro digital", 20, 900.00);
    agregarProducto("MED-007", "Gasas estériles (paquete x10)", 30, 1500.00);
    agregarProducto("MED-008", "Vendas elásticas", 25, 3200.00);
    agregarProducto("MED-009", "Paracetamol infantil 120mg/5ml", 40, 2300.00);
    agregarProducto("MED-010", "Tapabocas desechables (paquete x10)", 100, 1000.00);
}

    
    public static class Producto {
        private String codigo;
        private String nombre;
        private int stock;
        private double precio;
        
        public Producto(String codigo, String nombre, int cantidad, double precio) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.stock = cantidad;
            this.precio = precio;
        }
        
        // Getters
        public String getCodigo() { return codigo; }
        public String getNombre() { return nombre; }
        public int getStock() { return stock; }
        public double getPrecio() { return precio; }
    }
    
    /**
     * Agrega un nuevo producto al inventario
     * @return true si se agregó correctamente
     */
    public boolean agregarProducto(String codigo, String nombre, int stock, double precio) {
        // Validaciones
        if(codigo == null || codigo.trim().isEmpty()) {
            System.out.println("Error: El código es requerido");
            return false;
        }
        
        if(nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: El nombre es requerido");
            return false;
        }
        
        if(stock < 0) {
            System.out.println("Error: La cantidad no puede ser negativa");
            return false;
        }
        
        if(precio <= 0) {
            System.out.println("Error: El precio debe ser mayor a cero");
            return false;
        }
        
        // Verificar código único
        for(Producto p : productos) {
            if(p.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Error: Ya existe un producto con este código");
                return false;
            }
        }
        
        productos.add(new Producto(codigo, nombre, stock, precio));
        System.out.println("Producto agregado correctamente! Código: " + codigo);
        return true;
    }
    
    /**
     * Elimina un producto por código
     * @return true si se eliminó correctamente
     */
    public boolean eliminarProducto(String codigo) {
        int tamañoInicial = productos.size();
        productos.removeIf(p -> p.getCodigo().equalsIgnoreCase(codigo));
        
        if(productos.size() < tamañoInicial) {
            System.out.println("Producto eliminado correctamente! Código: " + codigo);
            return true;
        }
        System.out.println("Error: No se encontró producto con código " + codigo);
        return false;
    }
    
    /**
     * Actualiza un producto existente
     */
    public boolean actualizarProducto(String codigo, String nuevoNombre, Integer nuevoStock, Double nuevoPrecio) {
        for(Producto p : productos) {
            if(p.getCodigo().equalsIgnoreCase(codigo)) {
                if(nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
                    p.nombre = nuevoNombre;
                }
                if(nuevoStock != null && nuevoStock >= 0) {
                    p.stock = nuevoStock;
                }
                if(nuevoPrecio != null && nuevoPrecio > 0) {
                    p.precio = nuevoPrecio;
                }
                System.out.println("Producto actualizado correctamente! Código: " + codigo);
                return true;
            }
        }
        System.out.println("Error: No se encontró producto con código " + codigo);
        return false;
    }
    
    public List<Producto> obtenerTodos() {
        return new ArrayList<>(productos);
    }
    
    public Producto buscarPorCodigo(String codigo) {
        for(Producto p : productos) {
            if(p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }
    
    
}