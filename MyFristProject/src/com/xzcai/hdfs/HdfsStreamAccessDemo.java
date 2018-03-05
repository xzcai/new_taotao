package com.xzcai.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.junit.Before;

import java.net.URI;

public class HdfsStreamAccessDemo {
    FileSystem fs= null;

    @Before
    public void init() throws Exception{
        Configuration conf=new Configuration();
        conf.set("fs.defaultFS","hdfs://192.168.2.254:9000");
        fs= FileSystem.get(new URI("hdfs://192.168.2.254:9000"),conf,"root");
    }
}
