package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PuntoDeVenta {
    private final Inventario inventario;
    private final Map<String, ItemVenta> itemsVenta; // Código producto -> ItemVenta
    
    public PuntoDeVenta(Inventario inventario) {
        this.inventario = inventario;
        this.itemsVenta = new HashMap<>();
    }
    
    public static class ItemVenta {
        private final String codigo;
        private final String nombre;
        private final double precioUnitario;
        private int cantidad;
        
        public ItemVenta(String codigo, String nombre, double precioUnitario, int cantidad) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precioUnitario = precioUnitario;
            this.cantidad = cantidad;
        }
        
        // Getters
        public String getCodigo() { return codigo; }
        public String getNombre() { return nombre; }
        public double getPrecioUnitario() { return precioUnitario; }
        public int getCantidad() { return cantidad; }
        public double getSubtotal() { return precioUnitario * cantidad; }
        
        // Setter para cantidad
        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }
    }
    
    public String[] buscarProducto(String codigo) {
        Inventario.Producto producto = inventario.buscarPorCodigo(codigo);
        if(producto != null && producto.getStock() > 0) {
            return new String[]{
                producto.getNombre(),
                String.valueOf(producto.getPrecio())
            };
        }
        return null;
    }
    
    public boolean agregarProductoAVenta(String codigo, int cantidad) {
        Inventario.Producto producto = inventario.buscarPorCodigo(codigo);
        if(producto == null || producto.getStock() < cantidad || cantidad <= 0) {
            return false;
        }
        
        if(itemsVenta.containsKey(codigo)) {
            ItemVenta item = itemsVenta.get(codigo);
            item.setCantidad(item.getCantidad() + cantidad);
        } else {
            itemsVenta.put(codigo, new ItemVenta(
                codigo,
                producto.getNombre(),
                producto.getPrecio(),
                cantidad
            ));
        }
        return true;
    }
    
    public boolean eliminarProductoDeVenta(String codigo) {
        return itemsVenta.remove(codigo) != null;
    }
    
    public boolean actualizarCantidadProducto(String codigo, int nuevaCantidad) {
        if(!itemsVenta.containsKey(codigo) || nuevaCantidad <= 0) {
            return false;
        }
        
        Inventario.Producto producto = inventario.buscarPorCodigo(codigo);
        if(producto == null || producto.getStock() < nuevaCantidad) {
            return false;
        }
        
        itemsVenta.get(codigo).setCantidad(nuevaCantidad);
        return true;
    }
    
    public double getTotalVenta() {
        return itemsVenta.values().stream()
            .mapToDouble(ItemVenta::getSubtotal)
            .sum();
    }
    
    public int finalizarVenta(String fecha, int idCliente, Ventas ventasManager) {
        if(itemsVenta.isEmpty() || fecha == null || fecha.trim().isEmpty() || idCliente <= 0) {
            return -1;
        }
        
        // 1. Actualizar inventario
        for(ItemVenta item : itemsVenta.values()) {
            inventario.actualizarProducto(
                item.getCodigo(),
                null,
                -item.getCantidad(),
                null
            );
        }
        
        // 2. Crear la venta
        List<String> productosVendidos = new ArrayList<>(itemsVenta.keySet());
        double total = getTotalVenta();
        int ventaId = ventasManager.agregarVenta(fecha, idCliente, productosVendidos, total);
        
        // 3. Limpiar carrito
        itemsVenta.clear();
        
        return ventaId;
    }
    
    public List<ItemVenta> getItemsVenta() {
        return new ArrayList<>(itemsVenta.values());
    }
    
    public void cancelarVenta() {
        itemsVenta.clear();
    }
    
    public int getCantidadProducto(String codigo) {
        return itemsVenta.containsKey(codigo) ? itemsVenta.get(codigo).getCantidad() : 0;
    }
}