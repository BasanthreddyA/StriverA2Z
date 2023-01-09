
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int i,n,sum=0;
    cin>>n;
    vector<int>v(n);
    for(i=0;i<n;i++){
        cin>>v[i];
    }
     for(i=0;i<n;i++){
        sum+=v[i];
    }
    
    cout<<sum;

    return 0;
}
