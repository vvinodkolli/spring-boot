/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.bootstrap.actuate.autoconfigure;

import org.junit.Test;
import org.springframework.bootstrap.actuate.endpoint.health.HealthEndpoint;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * @author Dave Syer
 */
public class HealthConfigurationTests {

	private AnnotationConfigApplicationContext context;

	@Test
	public void testTraceConfiguration() throws Exception {
		this.context = new AnnotationConfigApplicationContext();
		this.context.register(HealthConfiguration.class);
		this.context.refresh();
		assertNotNull(this.context.getBean(HealthEndpoint.class));
	}
}
