/*
 * Copyright 2014 the original author or authors.
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
package org.springframework.social.twitter.api.impl.advertising;

import org.springframework.social.twitter.api.advertising.StatsOfAccountQuery;
import org.springframework.social.twitter.api.advertising.StatsSnapshot;
import org.springframework.social.twitter.api.impl.AbstractTwitterQueryForStatsBuilder;
import org.springframework.util.MultiValueMap;

/**
 * Builder related to {@link StatsSnapshot} data that generates a map (key, value)
 * that can be posted into the twitter api endpoint.
 * 
 * @author Hudson Mendes
 */
public class StatsOfAccountQueryBuilder extends AbstractTwitterQueryForStatsBuilder<StatsOfAccountQuery> implements StatsOfAccountQuery {

	@Override
	protected void makeParameters(MultiValueMap<String, Object> map) {
		// nothing to add here
	}
	
}
