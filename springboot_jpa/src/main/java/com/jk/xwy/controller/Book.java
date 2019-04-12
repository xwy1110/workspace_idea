/**
 * Copyright (C), 2019-2019,
 * FileName: Book
 * Author:   xwy
 * Date:     2019/4/11 20:03
 * History:
 * zwy          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.xwy.controller;

import com.jk.xwy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author Administrator
 * @create 2019/4/11
 * @since 1.0.0
 */
@Controller
public class Book {
        @Autowired
        private BookService bookService;


}

