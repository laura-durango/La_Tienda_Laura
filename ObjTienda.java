public class ObjTienda {

    private String NombreProducto;
    private int Cantidad;
    public ObjTienda(String nombreProducto,  int cantidad) {
        NombreProducto = nombreProducto;
        Cantidad = cantidad;
    }
    public ObjTienda() {
    }
    public String getNombreProducto() {
        return NombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    
    
}
