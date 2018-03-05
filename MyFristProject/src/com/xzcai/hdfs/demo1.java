package com.xzcai.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

public class demo1 {
    FileSystem fs= null;

    @Before
    public void init() throws Exception{
        Configuration conf=new Configuration();
        conf.set("fs.defaultFS","hdfs://192.168.2.254:9000");
        fs= FileSystem.get(new URI("hdfs://192.168.2.254:9000"),conf,"root");
    }

    @Test
    public void testUpload() throws Exception{
        fs.copyFromLocalFile(new Path("H:/test.txt"),new Path("/input"));
    }

    @Test
    public void testLs2() throws Exception {
        FileStatus[] listStatus = fs.listStatus(new Path("/"));
        for(FileStatus file:listStatus){
            System.out.println(file.getPath().getName());
            System.out.println(file.isFile()?"file":"directory");
        }
    }

    @Test
    public void testLs3() throws Exception{
        System.out.println(Configuration.class);
    }



    public static void main(String[] args){

    }
}
