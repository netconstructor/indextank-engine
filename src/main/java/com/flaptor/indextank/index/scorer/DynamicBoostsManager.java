/*
 * Copyright (c) 2011 LinkedIn, Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.flaptor.indextank.index.scorer;

import java.io.Serializable;

@Deprecated
public class DynamicBoostsManager {

    @Deprecated
    static class DynamicBoosts implements Boosts, Serializable {
        private static final long serialVersionUID = 1L;
        
        float[] boosts;
    	int timestamp;
    	
		@Override
		public float getBoost(int boostIndex) {
			return boosts[boostIndex];
		}

		/*@Override
		public int getBoostCount() {
			return boosts.length;
		}*/

		@Override
		public int getTimestamp() {
			return timestamp;
		}

    }
    

}
