/*
 * Copyright 2014 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.twitter.api.advertising;

import org.springframework.social.twitter.api.TwitterObject;


/**
 * Data discovery for targeting criterias based in behavior taxonomies.
 * 
 * @author Hudson Mendes
 */
public class TargetingCriteriaDiscoveryForBehaviorTaxonomies extends TwitterObject {
    private final String createdAt;
    private final String id;
    private final String name;
    private final String parentId;
    private final String updatedAt;

    public TargetingCriteriaDiscoveryForBehaviorTaxonomies(
    		String createdAt,
    		String id,
    	    String name,
    	    String parentId,
    	    String updatedAt) {

        this.createdAt = createdAt;
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.updatedAt = updatedAt;
    }

	public String getCreatedAt() {
		return createdAt;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getParentId() {
		return parentId;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

    
}
