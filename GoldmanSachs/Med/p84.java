//Roman to Integer(LC 13)

package GoldmanSachs.Med;

class p84{
    public int romanToInt(String s) {
        int f = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char c = (i < s.length() - 1) ? s.charAt(i + 1) : 'F';

            if (ch == 'I') {
                if (c == 'V') {
                    f += 4;
                    i++;
                } else if (c == 'X') {
                    f += 9;
                    i++;
                } else {
                    f += 1;
                }
            } else if (ch == 'X') {
                if (c == 'L') {
                    f += 40;
                    i++;
                } else if (c == 'C') {
                    f += 90;
                    i++;
                } else {
                    f += 10;
                }
            } else if (ch == 'C') {
                if (c == 'D') {
                    f += 400;
                    i++;
                } else if (c == 'M') {
                    f += 900;
                    i++;
                } else {
                    f += 100;
                }
            } else if (ch == 'V') {
                f += 5;
            } else if (ch == 'L') {
                f += 50;
            } else if (ch == 'D') {
                f += 500;
            } else if (ch == 'M') {
                f += 1000;
            }
        }
        return f;
    }
}