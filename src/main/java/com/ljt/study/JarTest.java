package com.ljt.study;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * @author LiJingTang
 * @date 2023-04-03 09:30
 */
public class JarTest {

    public static void main(String[] args) {
        while (true) {
            System.out.println(LocalDateTime.now());

            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            if (StringUtils.isNoneBlank(args)) {
                System.out.println(Arrays.toString(args));
            }
        }
    }

}
