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
package org.springframework.social.twitter.api.impl.common.utils;

import java.util.ArrayList;
import java.util.List;


/**
 * Convenience utility class for cursor related functionality
 * @author Jeremy Appel
 */
public class CursorUtils {
	
	private CursorUtils() {}
	
	public static List<List<Long>> chunkList(List<Long> list, int chunkSize) {
		List<List<Long>> chunkedList = new ArrayList<List<Long>>();
		int start = 0;
		while (start < list.size()) {
			int end = Math.min(chunkSize + start, list.size());
			chunkedList.add(list.subList(start, end));
			start = end;
		}
		return chunkedList;
	}
}