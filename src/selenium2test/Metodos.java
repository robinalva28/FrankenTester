package selenium2test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;
//IMPORTADAS LIBRERIAS DE SELENIUM Y DE NAVEGADORES(LINUX)<--PROBAR CON WINDOWS A VER SI FUNCIONA   
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.opera.OperaDriver;

public class Metodos {

    //DECLARACION DE PROPIEDADES
    private static WebDriver driver = null;
    private File archivo;
    public Date fecha = new java.util.Date();
    File datos;
    String asercion, linea, fila[];
    ;
    BufferedReader contenido;
    String texto;

    //**********************METODOS DE EJECICION TEST************************
    public void cartelito(int frase) {
        JOptionPane.showMessageDialog(null, frase);
    }

    public void cartelito(String frase) {
        JOptionPane.showMessageDialog(null, frase);
    }

    public void segundos(int espera) {
        try {
            Thread.sleep(espera * 1000);
        } catch (InterruptedException mensaje) {
            cartelito("Error en el Sleep: " + mensaje);
        }
    }

    //METODO QUE BUSCA ALGUNA ASERCION EN EL TEST con un texto
    public void asercion(String textCorrecto) {
        asercion = driver.getPageSource();

        if (asercion.indexOf(textCorrecto) >= 0) {
            //todo ok
        } else {
            cartelito("Cuidado Error");
        }
    }

    //METODO QUE MODIFICA LA PANTALLA CON PÁRAMETROS FULL Y MAX
    public void pantalla(String varsize) {
        if ("full".equals(varsize)) {
            driver.manage().window().fullscreen();
        }
        if ("max".equals(varsize)) {
            driver.manage().window().maximize();
        }
    }

    //CIERRA EL NAVEGADOR
    public void cerrar() {
        driver.close();
    }

    //***********************AUTOMATIZACION********************************
    //opcion 1-PARA CHROME 2- PARA FIREFOX 3- PARA OPERA (3 no funciona)   
    public void cargarDrivers(int nav) {

        switch (nav) {
            case 1:
                //INICIALIZO LOS DRIVERS DEL CHROME
                System.setProperty("webdriver.chrome.driver", "chromedriver");
                driver = new ChromeDriver();
                break;
            case 2:
                //INICIALIZO LOS DRIVERS DEL FIREFOX
                System.setProperty("webdriver.gecko.driver", "geckodriver");
                driver = new FirefoxDriver();
                break;
            case 3:
                //INICIALIZO LOS DRIVERS DEL OPERA(NO FUNCIONAN NUNCA)
//                System.setProperty("webdriver.opera.driver", "operadriver");
//                driver = new OperaDriver();
//                break;
            default:
                break;
        }
    }
    //*********lee MI ARCHIVO TXT DONDE VAN LOS DATOS CON LOS QUE SE TESTEAN

    //METODO QUE INICIALIZA EL NAVEGADOR SELECCIONADO PARA TESTEAR
    public void seleniumTestNav(String url, String[] datos) {

        driver.get(url);

        //AUTOMATIZACION GENERADA CON EL SELENIUM IDE EN EL NAVEGADOR
        for (int i = 0; i < datos.length; i++) {
            for (int j = 1; j < datos.length; j++) {

                driver.findElement(By.id("usuario")).sendKeys(datos[i]);
                driver.findElement(By.id("clave")).sendKeys(datos[j]);

                segundos(1);

                driver.findElement(By.id("Ingresar")).click();
                asercion("Ingreso INCorrecto");

                driver.findElement(By.id("Volver")).click();
            }
        }
        driver.close();
    }

    //*****************************ARCHIVOS DE TEXTO TXT******************************
    //***********METODO QUE CREA MI ARCHIVO DE TEXTO QUE DOCUMENTA LOS TESTS
    public void crearArchivoTxt() {

        //**************CREO EL ARCHIVO DE TEXTO        
        archivo = new File("sitiosTesteados.txt");

        try {
            if (archivo.createNewFile()) {
                //se creo el archivo
            }
        } catch (IOException ex) {
            System.err.println("Error, " + ex);
        }
    }

    //METODO QUE AGREGA URL Y FECHA AL ARCHIVO TXT
    public void addSitioADoc(String url) throws IOException {
        try (FileWriter escritor = new FileWriter("sitiosTesteados.txt", true)) {
            escritor.write(url + "," + fecha + "\r\n");
            escritor.close();
        }
    }

    //************METODO QUE LIMPIA MI LISTA
    public void limpiarLista() {

        int opcion = JOptionPane.showConfirmDialog(null, "Desea eliminar la lista?", "CONFIRME! YA!", JOptionPane.YES_NO_OPTION);

        if (JOptionPane.YES_OPTION == opcion) {
            if (archivo.exists()) {
                archivo.delete();
                crearArchivoTxt();
            } else {
                //No pasa nada por haber seleccionado la opcion NO.
            }
        }
    }
}
