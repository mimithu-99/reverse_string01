package ReverseString01;

public class ReverseString01 {
    public static void main(String[] args) {
        String m = "Hello";
        String s = "";

        for (int i = m.length() -1; i >= 0 ; i--) {
            s = s + m.charAt(i);

        }
        System.out.println(s);
        }
    }
/*
public class ReverseString01 { // এই লাইনটি একটি পাবলিক ক্লাস ঘোষণা করছে যার নাম ReverseString01।
    public static void main(String[] args) { // এটি মেইন মেথড। এটি প্রোগ্রামের প্রবেশ পয়েন্ট যেখানে কার্যক্রম শুরু হয়।
        String m = "Hello"; // এই লাইনটি 'm' নামে একটি স্ট্রিং ভেরিয়েবল তৈরি করছে এবং এটিতে "Hello" মান রাখছে।
        String s = ""; // এই লাইনটি 's' নামে একটি খালি স্ট্রিং ভেরিয়েবল তৈরি করছে।

        for (int i = m.length() - 1; i >= 0; i--) { // এটি একটি for লুপ যা 'i' ভেরিয়েবলটি দিয়ে শুরু হচ্ছে, যা স্ট্রিং 'm'-এর শেষ ক্যারেক্টারের ইনডেক্স (m.length() - 1) থেকে শুরু হয় এবং 0 পর্যন্ত চলবে।
            s = s + m.charAt(i); // এই লাইনটি স্ট্রিং 'm'-এর ইনডেক্স 'i'-এর ক্যারেক্টারটি 's' স্ট্রিংয়ের শেষে যোগ করছে।
        }

        System.out.println(s); // এই লাইনটি স্ট্রিং 's' কে প্রিন্ট করছে, যেটি উল্টো করা স্ট্রিং।
    }
}
এখন, এই কোডটি কীভাবে কাজ করে তা ধাপে ধাপে ব্যাখ্যা করছি:

public class ReverseString01 { – এটি একটি ক্লাস ঘোষণা করছে যার নাম ReverseString01।
public static void main(String[] args) { – এটি মেইন মেথড যা প্রোগ্রাম চালানোর জন্য ব্যবহৃত হয়।
String m = "Hello"; – একটি স্ট্রিং ভেরিয়েবল m তৈরি করছে এবং এটিতে "Hello" মান রাখছে।
String s = ""; – একটি খালি স্ট্রিং ভেরিয়েবল s তৈরি করছে।
for (int i = m.length() - 1; i >= 0; i--) { – এটি একটি for লুপ যা স্ট্রিং 'm' এর শেষ ক্যারেক্টারের ইনডেক্স থেকে শুরু করে প্রথম ক্যারেক্টার পর্যন্ত প্রতিটি ক্যারেক্টারকে উল্টোভাবে নেয়।
m.length() - 1 মানে স্ট্রিং 'm'-এর শেষ ইনডেক্স (উদাহরণ: "Hello" এর জন্য 4 কারণ ইনডেক্স 0 থেকে শুরু হয়)।
i >= 0 মানে লুপটি চলতে থাকবে যতক্ষণ পর্যন্ত 'i' 0 বা এর বেশি থাকে।
i-- মানে প্রতিবার লুপ চালানোর পর 'i' ১ করে কমবে।
s = s + m.charAt(i); – এই লাইনটি স্ট্রিং 'm'-এর বর্তমান ইনডেক্স 'i' এর ক্যারেক্টারটি স্ট্রিং 's' এর শেষে যোগ করে।
প্রথমবার লুপ চালানোর সময়, 'i' হবে 4 এবং 'm.charAt(i)' হবে 'o', তাই 's' হবে "o"।
দ্বিতীয়বার লুপ চালানোর সময়, 'i' হবে 3 এবং 'm.charAt(i)' হবে 'l', তাই 's' হবে "ol"।
তৃতীয়বার লুপ চালানোর সময়, 'i' হবে 2 এবং 'm.charAt(i)' হবে 'l', তাই 's' হবে "oll"।
চতুর্থবার লুপ চালানোর সময়, 'i' হবে 1 এবং 'm.charAt(i)' হবে 'e', তাই 's' হবে "olle"।
পঞ্চমবার লুপ চালানোর সময়, 'i' হবে 0 এবং 'm.charAt(i)' হবে 'H', তাই 's' হবে "olleH"।
System.out.println(s); – এই লাইনটি স্ট্রিং 's' কে প্রিন্ট করে, যেটি এখন উল্টো করা "Hello"।
আউটপুট:

olleH
এই কোডটি "Hello" স্ট্রিংটি উল্টো করে "olleH" আউটপুট দেয়।

আশা করি, এই বিশদ ব্যাখ্যা তোমার জন্য কোডটি বুঝতে সহজ করবে।
 */
