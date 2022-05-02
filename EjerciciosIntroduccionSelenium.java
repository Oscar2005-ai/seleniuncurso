import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class EjerciciosIntroduccionSelenium {

    @Test
    public void bbcMundoTest(){

        //Ejercicio 3
        //Crear un método llamado bbcMundTest
        //Ingresar al sitio https://www.bbc.com/mundo
        //Mostrar la cantidad de <h1>
        //Imprimir títulos h1
        //Mostrar la cantidad de <h2>
        //Imprimir títulos h2

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/mundo");
        driver.manage().window().maximize();

        List<WebElement> listh1 = driver.findElements(By.tagName("h1"));
        System.out.println("La cantidad de elemntos H1 es " + listh1.size());

        System.out.println("---- Elementos H1 ----");

        for (WebElement elementoh1: listh1){
            System.out.println("---> " + elementoh1.getText());
        }

        List<WebElement> listh2 = driver.findElements(By.tagName("h2"));
        System.out.println("La cantidad de elementos H2 es: " + listh2.size());

        System.out.println("--- Elementos H2 ---");

        for (WebElement elementoh2: listh2){
            System.out.println("---> " + elementoh2.getText());
        }

    }

    //Crear un método llamado bbcMundoLinks
    //Ingresar al sitio https://www.bbc.com/mundo
    //Mostrar el texto de todos los links

    @Test
    public void bbcMundoLinks(){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/mundo");

        System.out.println("--- Links ---");

        List<WebElement>listLinks = driver.findElements(By.tagName("a"));

        for (WebElement elementosLinks : listLinks){
            System.out.println("---> " + elementosLinks.getText());
        }
    }

    //Ejercicio 5
    //Crear un método llamado bbcMundoListas
    //Ingresar al sitio https://www.bbc.com/mundo
    //Mostrar todos los elementos li y su texto

    @Test
    public void bbcMundoListas(){
        String URL =  " https://www.bbc.com/mundo" ;
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        List<WebElement> listas = driver.findElements(By.tagName("li"));

        for (WebElement li: listas){
            System.out.println("Elemento li : " + li.getText());

        }
    }

    //Crear un método llamado spotifyTitleTest
    //Debe inicializar https://www.spotify.com
    //Validar que el título del sitio sea Escuchar es todo – Spotify. Si lo es, debe indicar “Test Passed!!” sino, debe mostrar “Test failed”.

    @Test

    public void spotifyTitleTest(){
        String URL = " https://www.spotify.com ";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        String tittle = driver.getTitle();

        if(tittle.equals("Listening is everything - Spotify")){
            System.out.println("Test Passed!!");
        }
        else{
            System.out.println(tittle);
            System.out.println("Test failed");
        }

    }

    //Ejercicio 7
    //Crear un método llamado getWindowsSizeTest
    //Abrir el explorador con google.com
    //Obtener y mostrar el ancho y alto de la página
    //Setear un nuevo tamaño de pantalla 1024x768

    @Test

    public void getWindowsSizeTest(){

        String URL = "https://www.google.com";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);

        //height --> Alto
        // width --> Ancho

        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();

        System.out.println("La altura actual es: " + height);
        System.out.println("El ancho actual es: " + width);

        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);
        System.out.println("Actualizando el ancho y el largo... ");

        height = driver.manage().window().getSize().getHeight();
        width = driver.manage().window().getSize().getWidth();

        System.out.println("La altura actual es : " + height);
        System.out.println("El ancho actual es:  " + width);


    }
}
