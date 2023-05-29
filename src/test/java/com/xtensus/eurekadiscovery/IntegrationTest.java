package com.xtensus.eurekadiscovery;

import com.xtensus.eurekadiscovery.EurekaDiscoveryApp;
import com.xtensus.eurekadiscovery.config.AsyncSyncConfiguration;
import com.xtensus.eurekadiscovery.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { EurekaDiscoveryApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
