package example.armeria.server;

import java.net.InetSocketAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.linecorp.armeria.server.Server;
import com.linecorp.armeria.server.ServerBuilder;
import com.linecorp.armeria.server.docs.DocService;
import example.armeria.server.annotated.PetApi;
import example.armeria.server.annotated.StoreApi;
import example.armeria.server.annotated.UserApi;


public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        final Server server = newServer(8080);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            server.stop().join();
            logger.info("Server has been stopped.");
        }));

        server.start().join();
        final InetSocketAddress localAddress = server.activePort().get().localAddress();
        final boolean isLocalAddress = localAddress.getAddress().isAnyLocalAddress() ||
            localAddress.getAddress().isLoopbackAddress();
        logger.info("Server has been started. Serving DocService at http://{}:{}/docs",
            isLocalAddress ? "127.0.0.1" : localAddress.getHostString(), localAddress.getPort());
    }

    /**
    * Returns a new {@link Server} instance configured with annotated HTTP services.
    *
    * @param port the port that the server is to be bound to
    */
    static Server newServer(int port) {
        final ServerBuilder sb = Server.builder();
        return sb.http(port)
            .annotatedService("/PetApi", new PetApi())
            .annotatedService("/StoreApi", new StoreApi())
            .annotatedService("/UserApi", new UserApi())
            .serviceUnder("/docs", new DocService())
            .build();
    }
}
