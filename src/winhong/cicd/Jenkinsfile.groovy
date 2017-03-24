#Main fail
package winhong.cicd


def request = libraryResource 'projects/test.json'


def call(String name = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Hello, ${name}."

}