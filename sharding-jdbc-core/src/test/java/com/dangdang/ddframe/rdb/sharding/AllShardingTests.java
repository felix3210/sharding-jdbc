/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package com.dangdang.ddframe.rdb.sharding;

import com.dangdang.ddframe.rdb.sharding.api.AllApiTests;
import com.dangdang.ddframe.rdb.sharding.config.AllConfigTests;
import com.dangdang.ddframe.rdb.sharding.constant.AllConstantsTests;
import com.dangdang.ddframe.rdb.sharding.executor.AllExecutorTests;
import com.dangdang.ddframe.rdb.sharding.hint.AllHintTests;
import com.dangdang.ddframe.rdb.sharding.jdbc.AllJDBCTests;
import com.dangdang.ddframe.rdb.sharding.keygen.AllKeygenTests;
import com.dangdang.ddframe.rdb.sharding.merger.AllMergerTests;
import com.dangdang.ddframe.rdb.sharding.metrics.AllMetricsTests;
import com.dangdang.ddframe.rdb.sharding.parsing.AllParsingTests;
import com.dangdang.ddframe.rdb.sharding.routing.AllRoutingTests;
import com.dangdang.ddframe.rdb.sharding.util.AllUtilTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    AllConstantsTests.class,
    AllApiTests.class,
    AllConfigTests.class,
    AllParsingTests.class,
    AllRoutingTests.class,
    AllMergerTests.class,
    AllExecutorTests.class,
    AllJDBCTests.class,
    AllHintTests.class,
    AllKeygenTests.class,
    AllUtilTests.class,
    AllMetricsTests.class
    })
public class AllShardingTests {
}
