package com.example.lionTests;

import com.example.Alex;
import com.example.Feline;
import com.example.constants.Constants;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AlexTests {
    @Mock
    Feline feline;

    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex(feline);
        Assert.assertEquals(Constants.ALEX_FRIENDS, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Alex alex = new Alex(feline);
        Assert.assertEquals(Constants.ALEX_PLACE_OF_LIVING, alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() throws Exception {
        Alex alex = new Alex(feline);
        alex.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(Constants.ALEX_KITTENS_COUNT);
    }

    @Test
    public void createAlexTest() throws Exception {
        Alex alex = new Alex(feline);
        Assert.assertTrue(alex.doesHaveMane());
    }
}
