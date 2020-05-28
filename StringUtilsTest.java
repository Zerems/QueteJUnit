package fr.wildcodeschool.unittesting;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    @Test
    //test lorsque aucune valeurs n'est rentrée:null/
    public void testVowels1(){
        Assert.assertNull(StringUtils.vowels(""));
    }
    @Test
    //test pour voir si la voyelle "y" est pris en compte:/
    public void testVowels2(){
        String testVowels = "Allons y";;
        Assert.assertEquals("Aoy",StringUtils.vowels(testVowels));
    }
    @Test
    //test pour vérifier si les espaces renvoi une zone vide:/
    public void emptyZone(){
        String testZone = "   ";//space x3
        Assert.assertEquals("",StringUtils.vowels(testZone));
    }
    @Test
    //test pour vérifier si 'espace'+ chaine de caractère renvoi les voyelles:/
    public void spaceAndString(){
        String testZone2 = "agtro   i";//space x3 + caractères
        Assert.assertEquals("aoi",StringUtils.vowels(testZone2));
    }
    @Test
    //test pour vérifier que la méthode 'uniqueVowels', ne renvoi pas d'occurence:/
    public void notDouble(){
        String testDoublons = "Rick Hzari";
        Assert.assertEquals("ia", StringUtils.uniqueVowels(testDoublons));
    }
    @Test
    //Test pour vérifier que la méthode 'uniqueVowels', renvoi un message d'erreur si pas de voyelles:/
    public void withOutVowels(){
        String testWithOut = "ZkjTrS";
        Assert.assertEquals("", StringUtils.uniqueVowels(testWithOut));
    }
    @Test
    //test lorsque aucune valeurs n'est rentrée:null/
    public void testUniqueVowels1() {
        Assert.assertNull(StringUtils.uniqueVowels(""));
    }


}

