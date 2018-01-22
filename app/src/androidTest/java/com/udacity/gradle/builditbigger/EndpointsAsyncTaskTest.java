package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.text.TextUtils;

import org.junit.Assert;

import java.util.concurrent.ExecutionException;

/**
 * Created by gemeos_valdeci on 21/01/2018.
 */
public class EndpointsAsyncTaskTest  extends AndroidTestCase {
    public void testEndpointsAsyncTaskEmpty() throws ExecutionException, InterruptedException {
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        String joke = task.execute().get();
        Assert.assertFalse(TextUtils.isEmpty(joke));
    }
}