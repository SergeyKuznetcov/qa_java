package com.example.lionTests;

import com.example.Feline;
import com.example.Lion;
import com.example.constants.Constants;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.constants.Constants.FELINE_KIND;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {
    @Mock
    private Feline feline;

    @Test
    public void createLionWithWrongSexTest() {
        Assert.assertThrows(Exception.class, () -> new Lion(null, feline));
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(Constants.LION_DEFAULT_SEX, feline);
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(Constants.LION_DEFAULT_SEX, feline);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood(FELINE_KIND);
    }
}
