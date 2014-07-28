/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (C) 2014 Junbo and/or its affiliates. All rights reserved.
 */
package test.protobuf.tool;

import com.googlecode.protobuf.format.JsonFormat;
import test.protobuf.tool.protos.GooglePlayProtos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * The Main class.
 */
public class Main {

    public static void main(String[] args) {
        GooglePlayProtos.Person person = GooglePlayProtos.Person.newBuilder().setEmail("123@esad.com").setId(1).setName("abc").build();

        try {
            GooglePlayProtos.TocResponse tocResponse = GooglePlayProtos.TocResponse.parseFrom(new FileInputStream(new File("tocresponse.data")));
            String jsonFormat = JsonFormat.printToString(tocResponse);
            System.out.print(jsonFormat);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //person.set
        //GooglePlayProtos.Person john =
          //      GooglePlayProtos.Person.newBuilder()
    }


}
