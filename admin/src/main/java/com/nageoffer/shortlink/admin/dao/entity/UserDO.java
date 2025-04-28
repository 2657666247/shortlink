/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nageoffer.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.nageoffer.shortlink.admin.common.database.BaseDO;
import lombok.Data;

/**
 * 用户持久层实体
 * 持久化层（Persistence Layer）的主要功能是负责应用程序与数据库之间的数据交互。
 * 映射数据库表：通过 @TableName("t_user") 注解将类映射到数据库中的 t_user 表。
 * 封装数据结构：定义了用户相关的字段（如 id, username, password 等），用于表示数据库表中的列。
 * 提供数据操作支持：继承自 BaseDO，可能包含通用的创建、更新、删除等时间戳字段或方法。
 * 自动生成 getter 和 setter：通过 @Data 注解简化代码，提供字段的访问和修改方法。
 */
@Data
@TableName("t_user")
public class UserDO extends BaseDO {

    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 注销时间戳
     */
    private Long deletionTime;
}
