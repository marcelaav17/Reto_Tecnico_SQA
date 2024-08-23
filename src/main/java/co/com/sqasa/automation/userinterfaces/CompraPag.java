package co.com.sqasa.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class CompraPag {
    public static final Target BTN_CAT_AMOR = Target.the(" boton categoria amor").located(By.xpath("/html/body/div[2]/div[6]/section/div/div/main/div[1]/div/div/div[1]/div/div/div/div/div/ul/li[11]/a"));
    public static final Target BTN_PRODUCTO1 = Target.the(" Pedido 1").located(By.xpath("/html/body/div[2]/div[6]/section[2]/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/div/div/h3/a"));
    public static final Target BTN_PRODUCTO2 = Target.the(" Pedido 2").located(By.xpath("/html/body/div[2]/div[6]/section[2]/div/div[1]/div/div/div[2]/div/div[2]/div/div[2]/div/div/h3/a"));
    public static final Target BTN_AÑADIR = Target.the(" añadir al carrito").located(By.xpath("/html/body/div[2]/div[6]/section[2]/div/div/div/div/div[3]/div/div[2]/div/form/button"));
    public static final Target MENSAJE = Target.the(" mensaje final").located(By.xpath("/html/body/div[2]/div[6]/section[2]/div/div/main/div/div/div/div[2]/div/div/div/div[1]/div/a"));
    public static final Target BTN_INICIO = Target.the(" boton menu principal").located(By.xpath("/html/body/div[2]/header/div[2]/div/div/div[2]/nav/div/ul/li[3]/a"));



}
