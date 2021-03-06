/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.presto.spi.resourceGroups;

import java.util.List;

public interface ResourceGroupConfigurationManager
{
    /**
     * Implementations may retain a reference to the group, and re-configure it asynchronously.
     * This method is called, once, when the group is created.
     */
    void configure(ResourceGroup group, SelectionContext context);

    /**
     * This method is called for every query that is submitted, so it should be fast.
     */
    List<ResourceGroupSelector> getSelectors();
}
