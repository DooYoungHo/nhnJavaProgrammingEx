public class Graduate extends Student {

    public int compareTo(Student s) {
        return this.major.compareTo(s.major);
    }

    // 내부적으로 구현해본 compareTo
    // public int compareTo(Student s) {
    //     if (this.major == null || s.major == null) {
    //         return -123;
    //     }
    
    //     int length = Math.min(this.major.length(), s.major.length());
    
    //     for (int i = 0; i < length; i++) {
    //         if (this.major.charAt(i) != s.major.charAt(i)) {
    //             return this.major.charAt(i) - s.major.charAt(i);
    //         }
    //     }
    
    //     if (this.major.length() != s.major.length()) {
    //         return this.major.length() - s.major.length();
    //     }
    
    //     return 0;
    // }
}
