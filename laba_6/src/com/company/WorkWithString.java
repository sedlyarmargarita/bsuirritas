package com.company;

import java.io.*;

class WorkWithString {

    String data;
    String filename;
    String choice;
    String choice2;
    RandomAccessFile fio;
    BufferedReader in;

    public WorkWithString() throws UnsupportedEncodingException {
        this.in = new BufferedReader(new InputStreamReader(System.in, "Cp1251"));
    }

    public void runConsole() throws IOException {
        while (true) {
            printMenu();
            choice = in.readLine();
            if (choice.compareTo("1") == 0) {
                textIntoFile();
            } else if (choice.compareTo("2") == 0) {
                printRedactMenu();
                choice2 = in.readLine();
                if (choice2.compareTo("1") == 0) {
                    addStart();
                } else if (choice2.compareTo("2") == 0) {
                    addEnd();
                } else if (choice2.compareTo("3") == 0) {
                    addRandom();
                }
            } else if (choice.compareTo("3") == 0) {
                textFromfile();
            } else if (choice.compareTo("4") == 0) {
                return;
            }
        }
    }

    public void printMenu() {
        System.out.println("Enter your choice:");
        System.out.println("1.Enter text & put it to the file");
        System.out.println("2.Edit text in file");
        System.out.println("3.Read text from the file & do some actions");
        System.out.println("4.Exit");
    }

    public void textIntoFile() throws IOException {
        System.out.println("Enter text:");
        data = in.readLine();
        System.out.println("Enter file name:");
        filename = in.readLine();
        fio = new RandomAccessFile(new File(filename), "rw");
        fio.writeBytes(data);
        fio.close();
        System.out.println("Your text is in file.");
    }

    public void printRedactMenu() {
        System.out.println("Select action:");
        System.out.println("1 - put text in the beginning of the file");
        System.out.println("2 - put text in the end of the file");
        System.out.println("3 - put text in the arbitrary position of the file");
    }

    public void addStart() throws IOException {
        System.out.println("Enter file name:");
        filename = in.readLine();
        fio = new RandomAccessFile(new File(filename), "rw");
        data = fio.readLine();
        System.out.println("Enter string to put in the beginning of the file:");
        String s;
        s = in.readLine();
        fio.seek(0);
        fio.writeBytes(s);
        fio.seek(s.length());
        fio.writeBytes(data);
        fio.close();
        System.out.println("String is in the beginning of the file.");
    }

    public void addEnd() throws IOException {
        System.out.println("Enter file name:");
        filename = in.readLine();
        fio = new RandomAccessFile(new File(filename), "rw");
        data = fio.readLine();
        System.out.println("Enter string to put in the end of the file:");
        String s;
        s = in.readLine();
        fio.seek(fio.length());
        fio.writeBytes(s);
        fio.close();
        System.out.println("String is in the end of the file.");
    }

    public void addRandom() throws IOException {
        System.out.println("Enter file name:");
        filename = in.readLine();
        fio = new RandomAccessFile(new File(filename), "rw");
        System.out.println("Enter string to put information in a certain position in file:");
        String s;
        s = in.readLine();
        System.out.println("Enter the position in file:");
        int n;
        n = Integer.parseInt(in.readLine());
        fio.seek(n);
        data = fio.readLine();
        fio.seek(n);
        fio.writeBytes(s);
        fio.writeBytes(data);
        fio.close();
        System.out.println("String is in file.");
    }

    public void textFromfile() throws IOException {
        System.out.println("Enter file name:");
        filename = in.readLine();
        fio = new RandomAccessFile(new File(filename), "r");
        data = fio.readLine();
        fio.close();
        System.out.println("The information from the file: " + data);
        int gaps = 0, consonants = 0, letters = 0;
        char ch;
        for (int i = 0; i < data.length(); i++) {
            ch = Character.toLowerCase(data.charAt(i));
            if (Character.isWhitespace(ch)) {
                gaps++;
            }
            if ((ch == 'b') || (ch == 'c') || (ch == 'd') || (ch == 'f') || (ch == 'g') || (ch == 'h') || (ch == 'j') || (ch == 'k') || (ch == 'l') || (ch == 'm') || (ch == 'n') || (ch == 'p') || (ch == 'q') || (ch == 'r') || (ch == 's') || (ch == 't') || (ch == 'v') || (ch == 'w') || (ch == 'x') || (ch == 'z')) {
                consonants++;
            }
            letters++;
        }
        System.out.println("The amount of gaps - " + gaps + "\nThe amount of consonants - " + consonants + "\nThe amount of letters - " + (letters - gaps));
    }

    public static void main(String args[]) throws UnsupportedEncodingException, IOException {
        WorkWithString n = new WorkWithString();
        n.runConsole();
    }
}