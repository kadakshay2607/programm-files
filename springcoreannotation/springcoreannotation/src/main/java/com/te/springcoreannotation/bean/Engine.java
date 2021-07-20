package com.te.springcoreannotation.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data

public class Engine implements Serializable {
 private int cc;
 private String fueltype;
}
