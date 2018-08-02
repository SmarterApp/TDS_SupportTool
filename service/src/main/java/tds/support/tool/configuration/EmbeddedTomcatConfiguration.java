package tds.support.tool.configuration;

import com.google.common.collect.Sets;
import org.apache.catalina.connector.Connector;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

/**
 * Configures embedded Tomcat server to listen on an additional port in order to enable internal rest endpoints
 * that do not need to be secured.
 *
 * Adapted from https://tech.asimio.net/2016/12/15/Configuring-Tomcat-to-Listen-on-Multiple-ports-using-Spring-Boot.html
 */
@Configuration
public class EmbeddedTomcatConfiguration {

	@Value("${server.port}")
	private String serverPort;

	@Value("${management.port:${server.port}}")
	private String managementPort;

	@Value("${internalClientPort:null}")
	private String internalClientPort;

	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
		Connector[] additionalConnectors = this.additionalConnector();
		if (additionalConnectors != null && additionalConnectors.length > 0) {
			tomcat.addAdditionalTomcatConnectors(additionalConnectors);
		}
		return tomcat;
	}

	private Connector[] additionalConnector() {
		if (StringUtils.isBlank(internalClientPort) || internalClientPort.equals("null")) {
			return null;
		}

		Set<String> defaultPorts = Sets.newHashSet(this.serverPort, this.managementPort);
		List<String> ports = Collections.singletonList(internalClientPort);

		List<Connector> result = new ArrayList<>();
		for (String port : ports) {
			if (!defaultPorts.contains(port)) {
				Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
				connector.setScheme("http");
				connector.setPort(Integer.valueOf(port));
				result.add(connector);
			}
		}
		return result.toArray(new Connector[] {});
	}
}
