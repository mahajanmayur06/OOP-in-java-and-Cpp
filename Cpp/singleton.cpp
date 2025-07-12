#include <iostream>
#include <mutex>
using namespace std;

class Singleton {
private:
    static Singleton* instance;
    static mutex mtx; // for thread safety

    // Private Constructor
    Singleton() {
        cout << "Singleton Constructor Called\n";
    }

    // Delete copy constructor and assignment operator
    Singleton(const Singleton&) = delete;
    Singleton& operator=(const Singleton&) = delete;

public:
    static Singleton* getInstance() {
        // Double-checked locking
        if (instance == nullptr) {
            lock_guard<mutex> lock(mtx); // Lock only if needed
            if (instance == nullptr) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    void showMessage() {
        cout << "Hello from Singleton instance!\n";
    }
};

// Initialize static members
Singleton* Singleton::instance = nullptr;
mutex Singleton::mtx;

// ---------- Usage ----------
int main() {
    Singleton* s1 = Singleton::getInstance();
    s1->showMessage();

    Singleton* s2 = Singleton::getInstance();
    cout << "s1 and s2 are the same instance: " << (s1 == s2) << endl;

    return 0;
}
