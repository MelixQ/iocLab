package ru.kuznetsovMD.iocLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;
import ru.kuznetsovMD.iocLab.task1.HelloService;
import ru.kuznetsovMD.iocLab.task14.ConfigService;
import ru.kuznetsovMD.iocLab.task15.NotificationService;
import ru.kuznetsovMD.iocLab.task15.ServiceConfiguration;
import ru.kuznetsovMD.iocLab.task16.CustomObject;
import ru.kuznetsovMD.iocLab.task17.DevConfig;
import ru.kuznetsovMD.iocLab.task17.ProdConfig;
import ru.kuznetsovMD.iocLab.task19.ShoppingCart;
import ru.kuznetsovMD.iocLab.task2.GreetingService;
import ru.kuznetsovMD.iocLab.task20.DemoServiceForScan;
import ru.kuznetsovMD.iocLab.task21.PaymentServiceConsumer;
import ru.kuznetsovMD.iocLab.task22.Car;
import ru.kuznetsovMD.iocLab.task24.CircularServiceA;
import ru.kuznetsovMD.iocLab.task25.ScanClient;
import ru.kuznetsovMD.iocLab.task26.CachedService;
import ru.kuznetsovMD.iocLab.task27.AsyncService;
import ru.kuznetsovMD.iocLab.task3.User;
import ru.kuznetsovMD.iocLab.task3.UserService;
import ru.kuznetsovMD.iocLab.task4.Product;
import ru.kuznetsovMD.iocLab.task4.ProductService;
import ru.kuznetsovMD.iocLab.task5.Order;
import ru.kuznetsovMD.iocLab.task5.OrderService;
import ru.kuznetsovMD.iocLab.task6.AppConfig;
import ru.kuznetsovMD.iocLab.task7.FuelServiceConsumer;
import ru.kuznetsovMD.iocLab.task9.PrototypeService;
import ru.kuznetsovMD.iocLab.task9.SingletonService;

@SpringBootApplication
@EnableAsync
@EnableCaching
@ImportResource("classpath:beans.xml")
@Import(AppConfig.class)
public class IocLabApplication implements CommandLineRunner {
	@Autowired private HelloService helloService;
	@Autowired private GreetingService greetingService;
	@Autowired private UserService userService;
	@Autowired private ProductService productService;
	@Autowired private OrderService orderService;
	@Autowired private FuelServiceConsumer consumerService;
	@Autowired private ru.kuznetsovMD.iocLab.task8.UserService xmlUserService;
	@Autowired private SingletonService singletonBean;
	@Autowired private PrototypeService prototypeBean;
	@Autowired private ConfigService configService;
	@Autowired private NotificationService notificationService;
	private CustomObject customObject;
	@Autowired private ShoppingCart collectionService;
	@Autowired private DemoServiceForScan demoService;
	@Autowired private PaymentServiceConsumer primaryConsumer;
	@Autowired private Car car;
	@Autowired private CircularServiceA circularServiceA;
	@Autowired private ScanClient componentScanClient;
	@Autowired private CachedService cacheService;
	@Autowired private AsyncService asyncService;

	@Autowired(required = false) private DevConfig devConfig;
	@Autowired(required = false) private ProdConfig prodConfig;

	public static void main(String[] args) {
		SpringApplication.run(IocLabApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("=== Testing Spring IoC/DI Tasks ===");

		helloService.sayHello();
		greetingService.greet();
		userService.registerUser(new User());
		productService.saveProduct(new Product("test"));
		orderService.placeOrder(new Order());
		consumerService.consumeFuel();
		xmlUserService.registerUser(new User());
		singletonBean.doSomething();
		prototypeBean.doSomething();
		configService.getAppConfig();
		notificationService.configure(new ServiceConfiguration());
		System.out.println("16. CustomObject: " + customObject.getName());
		collectionService.showCart();
		System.out.println("20. DemoService: " + demoService.greet());
		primaryConsumer.process();
		System.out.println("22. Car: " + car.drive());
		System.out.println("24. Circular: " + circularServiceA.callB());
		componentScanClient.useScanService();
		System.out.println("26. CacheService: " + cacheService.expensiveOp(20));
		System.out.println("26. CacheService (cached): " + cacheService.expensiveOp(20));
		asyncService.getResult().thenAccept(result -> System.out.println("27. Async: " + result));

		if (devConfig != null) System.out.println("17. Dev Config: " + devConfig.databaseService());
		if (prodConfig != null) System.out.println("17. Prod Config: " + prodConfig.databaseService());

		System.out.println("=== All tasks completed ===");
	}
}
