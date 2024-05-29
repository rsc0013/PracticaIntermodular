/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intermodular3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Rafa
 */
public class ConexionBBDD {
     // Configuración de la conexión a la base de datos MySQL
    String url = "jdbc:mysql://localhost:3306/practica_intermodular";
    String usuario = "root";
    String contraseña = "Med@c";

    // Sentencias SQL
    String sqlMercurio = "SELECT * FROM Planetas where nombre ='Mercurio' ";
    String sqlVenus = "SELECT * FROM Planetas where nombre ='Venus' ";
    String sqlTierra = "SELECT * FROM Planetas where nombre ='Tierra' ";
    String sqlMarte = "SELECT * FROM Planetas where nombre ='Marte' ";
    String sqlJupiter = "SELECT * FROM Planetas where nombre ='Júpiter' ";
    String sqlSaturno = "SELECT * FROM Planetas where nombre ='Saturno' ";
    String sqlUrano = "SELECT * FROM Planetas where nombre ='Urano' ";
    String sqlNeptuno = "SELECT * FROM Planetas where nombre ='Neptuno' ";

    //Métodos especiales Planetas
    public ArrayList<String> consultarMarte() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlMarte = "SELECT * FROM Planetas where nombre ='Marte' ";

            ResultSet resultados = statement.executeQuery(sqlMarte);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String estrella = resultados.getString("estrella");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String num_satelites = resultados.getString("num_satelites");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(estrella);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(num_satelites);
                array.add(fecha_creacion);
               
            }
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;
    }
    
    public ArrayList<String> consultarTierra() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlTierra = "SELECT * FROM Planetas where nombre = 'Tierra' ";

            ResultSet resultados = statement.executeQuery(sqlTierra);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String estrella = resultados.getString("estrella");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String num_satelites = resultados.getString("num_satelites");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(estrella);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(num_satelites);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    
    public ArrayList<String> consultarMercurio() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlMercurio = "SELECT * FROM Planetas where nombre ='Mercurio' ";

            ResultSet resultados = statement.executeQuery(sqlMercurio);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String estrella = resultados.getString("estrella");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String num_satelites = resultados.getString("num_satelites");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(estrella);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(num_satelites);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    
    public ArrayList<String> consultarVenus() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlVenus = "SELECT * FROM Planetas where nombre = 'Venus' ";

            ResultSet resultados = statement.executeQuery(sqlVenus);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String estrella = resultados.getString("estrella");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String num_satelites = resultados.getString("num_satelites");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(estrella);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(num_satelites);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    
    public ArrayList<String> consultarJupiter() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlJupiter = "SELECT * FROM Planetas where nombre ='Júpiter' ";

            ResultSet resultados = statement.executeQuery(sqlJupiter);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String estrella = resultados.getString("estrella");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String num_satelites = resultados.getString("num_satelites");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(estrella);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(num_satelites);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    
    public ArrayList<String> consultarSaturno() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlSaturno = "SELECT * FROM Planetas where nombre ='Saturno' ";

            ResultSet resultados = statement.executeQuery(sqlSaturno);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String estrella = resultados.getString("estrella");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String num_satelites = resultados.getString("num_satelites");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(estrella);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(num_satelites);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    public ArrayList<String> consultarUrano(){
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlUrano = "SELECT * FROM Planeta where nombre = 'Urano' ";

            ResultSet resultados = statement.executeQuery(sqlUrano);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String estrella = resultados.getString("estrella");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String num_satelites = resultados.getString("num_satelites");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(estrella);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(num_satelites);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    
    public ArrayList<String> consultarNeptuno() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlNeptuno = "SELECT * FROM Planetas where nombre ='Neptuno' ";

            ResultSet resultados = statement.executeQuery(sqlNeptuno);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String estrella = resultados.getString("estrella");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String num_satelites = resultados.getString("num_satelites");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(estrella);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(num_satelites);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    
    // Metodos especiales Satelites
    
    public ArrayList<String> consultarLuna() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlLuna = "SELECT * FROM Satelites where nombre ='Luna' ";

            ResultSet resultados = statement.executeQuery(sqlLuna);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String planeta = resultados.getString("planeta");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(planeta);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    
    public ArrayList<String> consultarFobos() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlFobos = "SELECT * FROM Satelites where nombre ='Fobos' ";

            ResultSet resultados = statement.executeQuery(sqlFobos);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String planeta = resultados.getString("planeta");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(planeta);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    public ArrayList<String> consultarDeimos() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlDeimos = "SELECT * FROM Satelites where nombre ='Deimos' ";

            ResultSet resultados = statement.executeQuery(sqlDeimos);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String planeta = resultados.getString("planeta");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(planeta);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    
    public ArrayList<String> consultarIo() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlIo = "SELECT * FROM Satelites where nombre ='Io' ";

            ResultSet resultados = statement.executeQuery(sqlIo);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String planeta = resultados.getString("planeta");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(planeta);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    
    public ArrayList<String> consultarEuropa() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlEuropa = "SELECT * FROM Satelites where nombre ='Europa' ";

            ResultSet resultados = statement.executeQuery(sqlEuropa);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String planeta = resultados.getString("planeta");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(planeta);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    public ArrayList<String> consultarGanimedes() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlGanimedes = "SELECT * FROM Satelites where nombre ='Ganimedes' ";

            ResultSet resultados = statement.executeQuery(sqlGanimedes);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String planeta = resultados.getString("planeta");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(planeta);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    
    public ArrayList<String> consultarCalisto() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlCalisto = "SELECT * FROM Satelites where nombre ='Calisto' ";

            ResultSet resultados = statement.executeQuery(sqlCalisto);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String planeta = resultados.getString("planeta");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(planeta);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    
    public ArrayList<String> consultarTitan() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlTitan = "SELECT * FROM Satelites where nombre ='Titan' ";

            ResultSet resultados = statement.executeQuery(sqlTitan);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String planeta = resultados.getString("planeta");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(planeta);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    
    public ArrayList<String> consultarEncelado() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlEncelado = "SELECT * FROM Satelites where nombre ='Encelado' ";

            ResultSet resultados = statement.executeQuery(sqlEncelado);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String planeta = resultados.getString("planeta");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(planeta);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    
    public ArrayList<String> consultarTitania() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlTitania = "SELECT * FROM Satelites where nombre ='Titania' ";

            ResultSet resultados = statement.executeQuery(sqlTitania);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String planeta = resultados.getString("planeta");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(planeta);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    
    public ArrayList<String> consultarOberon() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlOberon = "SELECT * FROM Satelites where nombre ='Oberon' ";

            ResultSet resultados = statement.executeQuery(sqlOberon);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String planeta = resultados.getString("planeta");
                String radio = resultados.getString("radio");  
                String distancia = resultados.getString("distancia");
                String periodo = resultados.getString("periodo");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha_creacion = resultados.getString("fecha_creacion");
               
                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(planeta);
                array.add(radio);
                array.add(distancia);
                array.add(periodo);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha_creacion);
               
            }
               
                // Cerrar recursos
                statement.close();

                conexion.close();
            }catch (SQLException e) {
            e.printStackTrace();
        }
            //5. Return array

            return array;

    }
    
    
    
}
