package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromeTest {
    
    private LongestPalindrome subject = new LongestPalindrome();

    @Test
    void LongestPalindromeFrom_cbbd() {
        assertEquals("bb", subject.longestPalindrome("cbbd"));
    }

    @Test
    void LongestPalindromeFrom_ac() {
        assertEquals("a", subject.longestPalindrome("ac"));
    }

    @Test
    void LongestPalindromeFrom_abba() {
        assertEquals("abba", subject.longestPalindrome("abba"));
    }

    @Test
    void LongestPalindromeFrom_abb() {
        assertEquals("bb", subject.longestPalindrome("abb"));
    }

    @Test
    void LongestPalindromeFrom_ababab() {
        assertEquals("ababa", subject.longestPalindrome("ababab"));
    }

    @Test
    void LongestPalindromeFrom_babad() {
        assertEquals("bab", subject.longestPalindrome("babad"));
    }

    @Test
    void long_test() {
        assertEquals("gykrkyg",
                subject.longestPalindrome("zudfweormatjycujjirzjpyrmaxurectxrtqedmmgergwdvjmjtstdhcihacqnothgttgqfywcpgnuvwglvfiuxteopoyizgehkwuvvkqxbnufkcbodlhdmbqyghkojrgokpwdhtdrwmvdegwycecrgjvuexlguayzcammupgeskrvpthrmwqaqsdcgycdupykppiyhwzwcplivjnnvwhqkkxildtyjltklcokcrgqnnwzzeuqioyahqpuskkpbxhvzvqyhlegmoviogzwuiqahiouhnecjwysmtarjjdjqdrkljawzasriouuiqkcwwqsxifbndjmyprdozhwaoibpqrthpcjphgsfbeqrqqoqiqqdicvybzxhklehzzapbvcyleljawowluqgxxwlrymzojshlwkmzwpixgfjljkmwdtjeabgyrpbqyyykmoaqdambpkyyvukalbrzoyoufjqeftniddsfqnilxlplselqatdgjziphvrbokofvuerpsvqmzakbyzxtxvyanvjpfyvyiivqusfrsufjanmfibgrkwtiuoykiavpbqeyfsuteuxxjiyxvlvgmehycdvxdorpepmsinvmyzeqeiikajopqedyopirmhymozernxzaueljjrhcsofwyddkpnvcvzixdjknikyhzmstvbducjcoyoeoaqruuewclzqqqxzpgykrkygxnmlsrjudoaejxkipkgmcoqtxhelvsizgdwdyjwuumazxfstoaxeqqxoqezakdqjwpkrbldpcbbxexquqrznavcrprnydufsidakvrpuzgfisdxreldbqfizngtrilnbqboxwmwienlkmmiuifrvytukcqcpeqdwwucymgvyrektsnfijdcdoawbcwkkjkqwzffnuqituihjaklvthulmcjrhqcyzvekzqlxgddjoir"));
    }
}