import javax.swing.*;
import java.util.*;
import java.text.*;

class Test {
    
    // Registro de los solicitantes: arrayList de persona y agregar cada que se crea una nueva
    // Leer fecha maxima (variable local)
    // 
    
    // 1. Leer solicitante: preguntar si desea introducir informacion completa o requerida
    // Crear solicitante
    // Leer gran valor maximo y mandarlo en set de solicitante
    // 2. Validar que el numero de prestamo sea mayor a 0
    // 3. Validar que el valor de prestamo sea mayor a 0
    // 4. Crear metodos sobrecargados para capturar fechas

    // 5. Validar que la fecha de autorizacion sea antes del 20 del mes correspondiente
    // 6. Validar que la fecha de autorizacion sea menor a la fecha maxima
    
    // Menu para preguntar si desea agregar un nuevo solicitante, preguntar si desea crear un nuevo prestamo para el mismo solicitante,
    

    public static void main(String[] args) {
        ArrayList<Persona> solicitantes = new ArrayList<Persona>();
        int crear_solicitante = 0;
        int crear_prestamos = 0;
        Calendar fecha_maxima = Calendar.getInstance();
        Calendar fecha_autorizacion = Calendar.getInstance();
        int index = 0;

        // TextFields para agregar información del solicitante
        JTextField numero_identidad = new JTextField(5);
        JTextField primer_nombre = new JTextField(5);
        JTextField primer_apellido = new JTextField(5);
        JTextField segundo_apellido = new JTextField(5);
        JTextField telefono_casa = new JTextField(5);
        JTextField telefono_movil = new JTextField(5);
        JTextField codigo_postal = new JTextField(5);
        JTextField correo_electronico = new JTextField(5);

        // TextFields para agregar información del préstamo
        JTextField numero_prestamo = new JTextField(5);
        JTextField valor = new JTextField(5);

        while (crear_solicitante != 2) {
            crear_solicitante = JOptionPane.showConfirmDialog(null, "¿Crear solicitante usando sólo información requerida?\nPresiona cancel para ya no crear solicitante(s)","", JOptionPane.YES_NO_CANCEL_OPTION);
            
            if (crear_solicitante == JOptionPane.YES_OPTION) {
                // Mostrar solamente información requerida
                Object[] inputFields = {"Número de identidad:", numero_identidad,
                                        "Primer nombre:", primer_nombre,
                                        "Primer apellido:", primer_apellido,
                                        "Segundo apellido:", segundo_apellido,
                                        "Teléfono de casa:", telefono_casa,
                                        "Teléfono móvil:", telefono_movil};

                int option = JOptionPane.showConfirmDialog(null, inputFields, "Información requerida", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                
                if (option == JOptionPane.OK_OPTION) {
                    // Crear solicitante
                    Persona solicitante = new Persona(Integer.parseInt(numero_identidad.getText()), primer_nombre.getText(), primer_apellido.getText(),
                                                segundo_apellido.getText(), Integer.parseInt(telefono_casa.getText()), Integer.parseInt(telefono_movil.getText()));

                    // Determinar valor máximo de préstamo
                    double valor_maximo = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor máximo de préstamo: (MXN)"));
                    solicitante.establecerValorMaximo(valor_maximo);

                    // Agregar solicitante al registro
                    solicitantes.add(solicitante);

                    System.out.println("Disponible ---->" + solicitante.obtenerValorDisponibleString());
                    System.out.println("Prestado ---->" + solicitante.obtenerValorPrestadoString());

                    JOptionPane.showMessageDialog(null, "Solicitante creado exitosamente.\n" + solicitante.obtenerNombre());

                } else {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                    System.exit(0);
                }

            } else if (crear_solicitante == JOptionPane.NO_OPTION) {
                // Mostrar información completa
                Object[] inputFields = {"Número de identidad:", numero_identidad,
                                        "Primer nombre:", primer_nombre,
                                        "Primer apellido:", primer_apellido,
                                        "Segundo apellido:", segundo_apellido,
                                        "Teléfono de casa:", telefono_casa,
                                        "Teléfono móvil:", telefono_movil,
                                        "Código postal:", codigo_postal,
                                        "Correo electrónico:", correo_electronico};

                int option = JOptionPane.showConfirmDialog(null, inputFields, "Información completa", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

                if (option == JOptionPane.OK_OPTION) {
                    // Crear solicitante
                    Persona solicitante = new Persona(Integer.parseInt(numero_identidad.getText()), primer_nombre.getText(), primer_apellido.getText(),
                                                segundo_apellido.getText(), Integer.parseInt(telefono_casa.getText()), Integer.parseInt(telefono_movil.getText()),
                                                Integer.parseInt(codigo_postal.getText()), correo_electronico.getText());

                    // Determinar valor máximo de préstamo
                    double valor_maximo = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor máximo de préstamo: (MXN)"));
                    solicitante.establecerValorMaximo(valor_maximo);

                    // Agregar solicitante al registro
                    solicitantes.add(solicitante);

                    System.out.println("Disponible ---->" + solicitante.obtenerValorDisponibleString());
                    System.out.println("Prestado ---->" + solicitante.obtenerValorPrestadoString());

                    JOptionPane.showMessageDialog(null, "Solicitante creado exitosamente.\n" + solicitante.obtenerNombre());

                } else {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                    System.exit(0);
                }

            } else {
                // Ya no se crearán más usuarios. Preguntar por información del préstamo
            }
        }
        
        // Crear prestamos
        while (crear_prestamos != 1) {
            int option = 0;

            // Arreglo con textFields a mostrar
            Object[] inputFields = {"Número de préstamo:", numero_prestamo,
                                    "Valor del préstamo: (MXN)", valor};

            // Pop-up para introducir información
            option = JOptionPane.showConfirmDialog(null, inputFields, "Información del préstamo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
            // Seguir mostrando pop-up hasta que el número de préstamo o valor sean mayor a 0
            while (Double.parseDouble(numero_prestamo.getText()) < 0 || Double.parseDouble(valor.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Número de préstamo y valor necesitan ser mayor a 0.");
                option = JOptionPane.showConfirmDialog(null, inputFields, "Información del préstamo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }

            // Obtener nombres de los solicitantes
            String[] nombres = new String[solicitantes.size()];
            for (int i = 0; i < nombres.length; i++) {
                nombres[i] = solicitantes.get(i).obtenerNombre();
            }

            // Mostrar pop-up para seleccionar a solicitante
            String solicitante_prestamo = String.valueOf(JOptionPane.showInputDialog(null, "Selecciona al solicitante",
                                        "Solicitantes", JOptionPane.QUESTION_MESSAGE, null, nombres, nombres[0]));

            // Guardar selección de usuario si desea hacer préstamo con otro solicitante
            int cambiar_solicitante = 0;

            // Seguir mostrando pop-up mientras que el usuario quiera cambiar de solicitante o el préstamo sea menor al disponible
            while (solicitantes.get(index).obtenerValorDisponible() < Double.parseDouble(valor.getText()) && cambiar_solicitante == JOptionPane.YES_OPTION) {
                cambiar_solicitante = JOptionPane.showConfirmDialog(null, "Solicitante no cuenta con saldo disponible.\n¿Intentar con otro solicitante?","", JOptionPane.YES_NO_OPTION);
                
                // Volver a mostrar selección de solicitante
                if (cambiar_solicitante == JOptionPane.YES_OPTION) {
                    solicitante_prestamo = String.valueOf(JOptionPane.showInputDialog(null, "Selecciona al solicitante",
                                            "Solicitantes", JOptionPane.QUESTION_MESSAGE, null, nombres, nombres[0]));

                    for(int i = 0; i < solicitantes.size(); i++) {
                        if(solicitantes.get(i).obtenerNombre().equals(solicitante_prestamo)) {
                            index = i;
                            break;
                        }
                    }

                } else {
                    // Si no desea cambiar de solicitante, mostrar saldos del solicitante
                    JOptionPane.showMessageDialog(null, "Valor disponible: " + solicitantes.get(index).obtenerValorDisponibleString() +
                                                        "\nTotal prestado: " + solicitantes.get(index).obtenerValorPrestadoString());

                    // Salir del programa
                    System.exit(0);
                }
            }

            // Buscar dentro del array al solicitante que el usuario seleccionó
            for(int i = 0; i < solicitantes.size(); i++) {
                if(solicitantes.get(i).obtenerNombre().equals(solicitante_prestamo)) {
                    index = i;
                    break;
                }
            }

            // 
            if (option == JOptionPane.OK_OPTION) {
                // Preguntar por fecha máxima de autorización
                fecha_maxima = capturarFecha();   

                // Preguntar por fecha de autorización
                fecha_autorizacion = capturarFecha(fecha_maxima);  
                
                // Crear prestamo
                Prestamo prestamo = new Prestamo(Integer.parseInt(numero_prestamo.getText()), solicitantes.get(index), Double.parseDouble(valor.getText()), fecha_autorizacion);
                JOptionPane.showMessageDialog(null, "Préstamo creado.\n" + prestamo.toString());



            } else {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                System.exit(0);
            }

            crear_prestamos = JOptionPane.showConfirmDialog(null, "¿Crear nuevo préstamo?","", JOptionPane.YES_NO_OPTION);
        
            if (crear_prestamos == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Valor disponible: " + solicitantes.get(index).obtenerValorDisponibleString() +
                                                        "\nTotal prestado: " + solicitantes.get(index).obtenerValorPrestadoString());

                // Salir del programa
                System.exit(0);

            }
        }
    }

    private static Calendar capturarFecha() {
        Calendar fecha = Calendar.getInstance();

        JTextField anio = new JTextField(5);
        JTextField mes = new JTextField(5);
        JTextField dia = new JTextField(5);

        Object[] inputFields = {"Año:", anio,
                                "Mes:", mes,
                                "Día:", dia};

        int option = JOptionPane.showConfirmDialog(null, inputFields, "Fecha máxima de autorización", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (option == JOptionPane.OK_OPTION) {
            fecha.set(Integer.parseInt(anio.getText()), Integer.parseInt(mes.getText()), Integer.parseInt(dia.getText()));
        }

        return fecha;
    }

    private static Calendar capturarFecha(Calendar fecha_maxima) {
        Calendar fecha = Calendar.getInstance();

        JTextField anio = new JTextField(5);
        JTextField mes = new JTextField(5);
        JTextField dia = new JTextField(5);

        Object[] inputFields = {"Año:", anio,
                                "Mes:", mes,
                                "Día:", dia};

        int option = JOptionPane.showConfirmDialog(null, inputFields, "Fecha de autorización", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (option == JOptionPane.OK_OPTION) {
            fecha.set(Integer.parseInt(anio.getText()), Integer.parseInt(mes.getText()), Integer.parseInt(dia.getText()));
        } else {
            System.exit(0);
        }

        System.out.println("Fecha: " + fecha.get(Calendar.DAY_OF_MONTH));

        while (fecha.after(fecha_maxima) || fecha.get(Calendar.DAY_OF_MONTH) > 20) {
            JOptionPane.showMessageDialog(null, "Fecha mayor a fecha máxima de autorización o día mayor a 20.\nIngresa nuevamente");
            JOptionPane.showConfirmDialog(null, inputFields, "Fecha de autorización", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            

            if (option == JOptionPane.OK_OPTION) {
                fecha.set(Integer.parseInt(anio.getText()), Integer.parseInt(mes.getText()), Integer.parseInt(dia.getText()));
            }
        }

        return fecha;
    }
}