/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
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
package com.alibaba.nacossync;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author <a href="mailto:zpf.073@gmail.com">nkorange</a>
 */

@RunWith(SpringRunner.class)
//@SpringBootTest(classes = com.alibaba.nacossync.NacosSyncMain.class,
//    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StarterTest {

    @Before
    public void init() throws Exception {

    }

    @Test
    public void test() {
        System.out.println("=======================");
    }
}