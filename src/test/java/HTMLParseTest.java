import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLParseTest {

    @Test
    public void shouldParseCasaLeyTable() {
        //WebDriver driver = new ChromeDriver();
        //driver.get("http://servicios.casaley.com.mx/control_citas/Login.php");
        //String innerHtml = driver.findElement(By.tagName("table")).getAttribute("innerHTML");
        String innerHtml = "<table width=\"370\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "      <!-- fwtable fwsrc=\"inicio_sesion.png\" fwpage=\"P&aacute;gina 1\" fwbase=\"inicio_sesion.gif\" fwstyle=\"Dreamweaver\" fwdocid = \"1713343522\" fwnested=\"0\" -->\n" +
                "      <tbody><tr>\n" +
                "        <td><img src=\"img/spacer.gif\" width=\"113\" height=\"1\" border=\"0\" alt=\"\"></td>\n" +
                "        <td><img src=\"img/spacer.gif\" width=\"242\" height=\"1\" border=\"0\" alt=\"\"></td>\n" +
                "        <td><img src=\"img/spacer.gif\" width=\"15\" height=\"1\" border=\"0\" alt=\"\"></td>\n" +
                "        <td><img src=\"img/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\"></td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td colspan=\"3\"><img name=\"inicio_sesion_r1_c1\" src=\"img/inicio_sesion_r1_c1.gif\" width=\"370\" height=\"26\" border=\"0\" id=\"inicio_sesion_r1_c1\" alt=\"\"></td>\n" +
                "        <td><img src=\"img/spacer.gif\" width=\"1\" height=\"26\" border=\"0\" alt=\"\"></td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td><img name=\"inicio_sesion_r2_c1\" src=\"img/inicio_sesion_r2_c1.gif\" width=\"113\" height=\"271\" border=\"0\" id=\"inicio_sesion_r2_c1\" alt=\"\"></td>\n" +
                "        <td><form id=\"form1\" name=\"form1\" method=\"post\" action=\"valida.php\" autocomplete=\"off\">\n" +
                "            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\n" +
                "              <tbody><tr>\n" +
                "                <td><div align=\"right\">usuario :&nbsp;</div></td>\n" +
                "                <td><input type=\"text\" name=\"usuario\" id=\"usuario\" autocomplete=\"off\"></td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td><div align=\"right\">password :&nbsp;</div></td>\n" +
                "                <td><input type=\"password\" name=\"password\" id=\"password\" autocomplete=\"off\"></td>\n" +
                "              </tr>\n" +
                "            </tbody></table>\n" +
                "          <div align=\"center\"><a href=\"recuperar_pass.php\">Olvido su contraseña?<br>\n" +
                "                  <br>\n" +
                "              </a>\n" +
                "                                <input type=\"submit\" name=\"button\" id=\"button\" value=\"Enviar\">\n" +
                "                \n" +
                "            </div>\n" +
                "          <label></label>\n" +
                "        </form></td>\n" +
                "        <td><img name=\"inicio_sesion_r2_c3\" src=\"img/inicio_sesion_r2_c3.gif\" width=\"15\" height=\"271\" border=\"0\" id=\"inicio_sesion_r2_c3\" alt=\"\"></td>\n" +
                "        <td><img src=\"img/spacer.gif\" width=\"1\" height=\"271\" border=\"0\" alt=\"\"></td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td colspan=\"3\"><img name=\"inicio_sesion_r3_c1\" src=\"img/inicio_sesion_r3_c1.gif\" width=\"370\" height=\"13\" border=\"0\" id=\"inicio_sesion_r3_c1\" alt=\"\"></td>\n" +
                "        <td><img src=\"img/spacer.gif\" width=\"1\" height=\"13\" border=\"0\" alt=\"\"></td>\n" +
                "      </tr>\n" +
                "    </tbody></table>";
        //System.out.println(innerHtml);
        Document table = Jsoup.parse(innerHtml);
        Elements tds = table.select("td");
        //tds.stream().forEach(elem -> elem);System.out.println();
    }
}
