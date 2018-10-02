/**
 * @(#)User.java, 2018-09-26.
 * <p>
 * Copyright 2018 Stalary.
 */
package com.stalary.easydoc.test;

/**
 * User
 * @description 用户对象
 * @field name 姓名
 * @field age 年龄
 */

import com.stalary.easydoc.annotation.Model;
import lombok.Data;

/**
 * <model>user</model>
 * <description>用户对象</description>
 * <field>
 *     <name>用户名</name>
 *     <age>年龄</age>
 * </field>
 */
@Model
@Data
public class User {

    private String name;

    private Integer age;
}