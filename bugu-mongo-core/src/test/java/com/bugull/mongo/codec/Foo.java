/*
 * Copyright (c) www.bugull.com
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
package com.bugull.mongo.codec;

import com.bugull.mongo.SimpleEntity;
import com.bugull.mongo.annotations.CustomCodec;
import com.bugull.mongo.annotations.Entity;

/**
 *
 * @author Frank Wen(xbwen@hotmail.com)
 */
@Entity
public class Foo extends SimpleEntity {
    
    private String name;
    
    @CustomCodec(encoder = MyEncoder.class, decoder = MyDecoder.class)
    private MyObj myObj;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyObj getMyObj() {
        return myObj;
    }

    public void setMyObj(MyObj myObj) {
        this.myObj = myObj;
    }
    
    
}
