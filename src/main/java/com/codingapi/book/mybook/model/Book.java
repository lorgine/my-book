package com.codingapi.book.mybook.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lorne
 * @date 2018/9/14
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private String title;

    private String content;
}