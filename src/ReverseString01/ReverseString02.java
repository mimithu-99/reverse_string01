package ReverseString01;

public class ReverseString02 {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = "";
        for (int i = str.length() -1; i >= 0 ; i--) {
            result += str.charAt(i);

        }
        System.out.println(result);
    }
}
/*
public class ReverseString02 {
    public static void main(String[] args) {
        String str = "Hello World"; // স্ট্রিং ভেরিয়েবল 'str' তৈরি করা হয় এবং এর মান "Hello World" রাখা হয়েছে।
        String result = ""; // খালি স্ট্রিং ভেরিয়েবল 'result' তৈরি করা হয়।

        for (int i = str.length() - 1; i >= 0 ; i--) { // একটি for লুপ চালানো হয় যা str স্ট্রিংটির শেষ থেকে শুরু করে প্রথম ক্যারেক্টারে পর্যন্ত প্রতিটি ক্যারেক্টারকে উল্টানোর জন্য।
            result += str.charAt(i); // প্রতিটি পজিশনের ক্যারেক্টারকে ভেরিয়েবল 'result' এর শেষে যোগ করা হয়।
        }

        System.out.println(result); // উল্টানো স্ট্রিং 'result' কে প্রিন্ট করা হয়।
    }
}
বিস্তারিত ব্যাখ্যা:
public class ReverseString02 { - এটি একটি পাবলিক ক্লাস ReverseString02 ঘোষণা করে।

public static void main(String[] args) { - এটি মেইন মেথড যা প্রোগ্রামটি চালিয়ে যায়।

String str = "Hello World"; - একটি স্ট্রিং ভেরিয়েবল str তৈরি করা হয় এবং এর মান "Hello World" রাখা হয়।

String result = ""; - একটি খালি স্ট্রিং ভেরিয়েবল result তৈরি করা হয়। এটি পরের লুপের মাধ্যমে উল্টো করা স্ট্রিং সংরক্ষণের জন্য ব্যবহৃত হবে।

for (int i = str.length() - 1; i >= 0 ; i--) { - এই for লুপটি স্ট্রিং str এর শেষ ক্যারেক্টার থেকে শুরু করে প্রথম ক্যারেক্টারে পর্যন্ত প্রতিটি ক্যারেক্টার উল্টো করে স্ট্রিং result তে রাখবে।

i = str.length() - 1 স্ট্রিং str এর শেষ ক্যারেক্টারের ইনডেক্স থেকে লুপটি শুরু হয়।
i >= 0 লুপটি চলতে থাকবে যতক্ষণ পর্যন্ত i 0 বা এর বেশি থাকে।
i-- প্রতিবার লুপ চালানোর পরে i এর মান এক কমিয়ে যাবে।
result += str.charAt(i); - প্রতিবার লুপ চালানোর সময়, স্ট্রিং str এর ইনডেক্স i এর ক্যারেক্টারটি স্ট্রিং result এর শেষে যোগ করা হয়। এটি স্ট্রিং str কে উল্টো করার কাজ সম্পাদন করে।

System.out.println(result); - উল্টা হয়ে পাওয়া স্ট্রিং result কে প্রিন্ট করা হয়।

আউটপুট:
Copy code
dlroW olleH
উপরের কোডটি "Hello World" স্ট্রিংটি উল্টে "dlroW olleH" আউটপুট দেয়।

এই উদাহরণটির মাধ্যমে তুমি প্রোগ্রামিং শুরু করে অত্যন্ত ভালোভাবে উল্টা করা স্ট্রিং তৈরির পদ্ধতিতে সমর্থন পাবে। প্রতিটি কাজের বিস্তারিত ব্যাখ্যা তোমার জন্য প্রয়োজনীয় হবে কারণ তুমি নতুন প্রোগ্রামার।
 */