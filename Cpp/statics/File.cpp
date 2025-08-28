#include <iostream>
using namespace std;

class File {
    public:
    static string name;
    static int size;

    public:
    File (string name, int s) {
        File::name = name;
        File::size = ++s;
    }
    
};

int File::size = 100; // Static member initialization
string File::name = "Default"; // Static member initialization

int main() {
    File f1("File1", 1000);
    File f2("File2", 2000);
    f2.name = "Exec";
    f2.size = 900;
    // cout << f1.size << endl; // This will give an error because size is static but not accessible directly
    cout << File::size << endl; // This will also work because size is static and
    return 0;
}