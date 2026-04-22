#include <iostream>
using namespace std;

// Node structure
struct Node {
    int data;
    Node* left;
    Node* right;
};

// Create new node
Node* createNode(int value) {
    Node* newNode = new Node();
    newNode->data = value;
    newNode->left = newNode->right = NULL;
    return newNode;
}

// Insert node in BST
Node* insert(Node* root, int value) {
    if (root == NULL)
        return createNode(value);

    if (value < root->data)
        root->left = insert(root->left, value);
    else if (value > root->data)
        root->right = insert(root->right, value);

    return root;
}

// Search in BST
bool search(Node* root, int key) {
    if (root == NULL)
        return false;

    if (root->data == key)
        return true;
    else if (key < root->data)
        return search(root->left, key);
    else
        return search(root->right, key);
}

// Inorder traversal (Left, Root, Right)
void inorder(Node* root) {
    if (root != NULL) {
        inorder(root->left);
        cout << root->data << " ";
        inorder(root->right);
    }
}

// Main function
int main() {
    Node* root = NULL;
    int choice, value;

    do {
        cout << "\n1. Insert\n2. Search\n3. Display (Inorder)\n4. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch(choice) {
            case 1:
                cout << "Enter value to insert: ";
                cin >> value;
                root = insert(root, value);
                break;

            case 2:
                cout << "Enter value to search: ";
                cin >> value;
                if (search(root, value))
                    cout << "Element found\n";
                else
                    cout << "Element not found\n";
                break;

            case 3:
                cout << "BST (Inorder): ";
                inorder(root);
                cout << endl;
                break;

            case 4:
                cout << "Exiting...\n";
                break;

            default:
                cout << "Invalid choice\n";
        }
    } while(choice != 4);

    return 0;
}