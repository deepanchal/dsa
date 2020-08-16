#include <iostream>
#include <stack>
using namespace std;

class Solution
{
public:
    bool isValid(string s)
    {
        if (s.empty())
            return true;
        if (s.size() % 2 != 0 || s[0] == ')' || s[0] == '}' || s[0] == ']')
            return false;

        std::stack<char> pstack;

        for (int i = 0; i < s.size(); i++)
        {
            if (s[i] == '(' || s[i] == '{' || s[i] == '[')
            {
                pstack.push(s[i]);
            }

            if ((s[i] == ')' || s[i] == '}' || s[i] == ']') && !pstack.empty())
            {
                if (pstack.top() == '(' && s[i] == ')')
                {
                    pstack.pop();
                    std::cout << "Popped ()" << std::endl;
                }
                else if (pstack.top() == '{' && s[i] == '}')
                {
                    pstack.pop();
                    std::cout << "Popped {}" << std::endl;
                }
                else if (pstack.top() == '[' && s[i] == ']')
                {
                    pstack.pop();
                    std::cout << "Popped []" << std::endl;
                }
            }
        }

        return pstack.empty();
    }
};