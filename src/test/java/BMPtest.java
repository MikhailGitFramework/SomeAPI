import net.lightbody.bmp.proxy.ProxyServer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Proxy;


public class BMPtest {
@BeforeMethod
    public void setup() throws Exception {
    ProxyServer server = new ProxyServer(4444);
    server.start();
    Proxy proxy = server.seleniumProxy();
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability(CapabilityType.PROXY,proxy);
    WebDriver driver = new ChromeDriver(caps);

}
//sdsdfsdvxcxcvxzvzdfsf

}
