 #include<iostream>
    using namespace std;
void perfectCube(int N)
{

    int cube;

    for (int i; i <= N; i++) {
        cube = i * i * i;
        if (cube == N) {
           cout << "Yes";
    
        }

        else if (cube > N) {
             
        
        }
    }
}
 
int main()
{
    int N ;
    cin>>N;
    perfectCube(N);
}