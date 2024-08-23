package co.com.sqasa.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class EliminarPag {
    public static final Target BTN_PRODUCTO2 = Target.the(" Pedido 2").located(By.xpath("/html/body/div[2]/div[6]/section[2]/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/div/div/h3/a"));
    public static final Target BTN_CAT_CUMPLE = Target.the(" boton categoria amor").located(By.xpath("/html/body/div[2]/header/div[2]/div/div/div[2]/nav/div/ul/li[4]/a"));
    public static final Target BTN_ELIMINAR = Target.the(" boton eliminar producto de carrito").located(By.xpath("/html/body/div[2]/div[6]/section[2]/div/div/main/div/div/div/div[2]/div/div/div/div[2]/form/div/table/tbody/tr[1]/td[6]/a/i"));
    public static final Target MENSAJE2 = Target.the(" mensaje final").located(By.xpath("/html/body/div[2]/div[6]/section[2]/div/div/main/div/div/div/div[2]/div/div/div/div/div/a"));


}
