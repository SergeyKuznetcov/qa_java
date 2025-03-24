package com.example.felineTests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.constants.Constants.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

    @Spy
    private final Feline feline = Mockito.spy(Feline.class);

    @Test
    public void getFamily() {
        Assert.assertEquals(FELINE_FAMILY, feline.getFamily());
    }

    @Test
    public void eatMeatTest() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood(FELINE_KIND);
    }

    @Test
    public void getKittensTest() {
        Assert.assertEquals(DEFAULT_FELINE_KITTENS_COUNT, feline.getKittens());
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void getKittensWithParamTest() {
        Assert.assertEquals(CUSTOM_FELINE_KITTENS_COUNT, feline.getKittens(CUSTOM_FELINE_KITTENS_COUNT));
    }
}
