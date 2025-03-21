package PRG_ED_Mockups_I;

/*  Àngel Semperem García*/
    public class Cliente {
        protected String idCliente;
        protected String direccion;
        protected String nombre;
        protected String correoElectronico;

        // Getters y Setters con validaciones
        public String getIdCliente() {
            return idCliente;
        }

        public void setIdCliente(String idCliente) {
            this.idCliente = idCliente;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCorreoElectronico() {
            return correoElectronico;
        }

        public void setCorreoElectronico(String correoElectronico) {
            this.correoElectronico = correoElectronico;
        }

        // Método para mostrar la información del cliente
        public void mostrarClienteToXML() {
            System.out.println();
            System.out.println("        <cliente>\n          ");
            System.out.println("               <idcliente>" + idCliente + "</idcliente>\n");
            System.out.println("               <nombre>" + nombre + "</nombre>\n");
            System.out.println("               <direccion>" + direccion + "</direccion>\n");
            System.out.println("               <correoelectronico>" + correoElectronico + "</correoelectronico>\n");
            System.out.println("        </cliente>");
        }
    }
