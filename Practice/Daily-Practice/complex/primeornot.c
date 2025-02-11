#include <stdio.h>

typedef long long ll;

// Fast modular exponentiation: (base^exp) % mod
ll powerMod(ll base, ll exp, ll mod) {
    ll result = 1;
    base = base % mod;
    while (exp > 0) {
        if (exp & 1) result = (__int128)result * base % mod; // Avoid overflow
        base = (__int128)base * base % mod;
        exp >>= 1;
    }
    return result;
}

// Miller-Rabin Primality Test
int millerRabin(ll n, ll a) {
    if (n % a == 0) return 0; // If divisible, not prime

    ll d = n - 1;
    int r = 0;
    while (d % 2 == 0) {
        d /= 2;
        r++;
    }

    ll x = powerMod(a, d, n);
    if (x == 1 || x == n - 1) return 1; // Probably prime

    while (r-- > 1) {
        x = (__int128)x * x % n;
        if (x == n - 1) return 1;
    }
    return 0;
}

// Wrapper function to check primality using deterministic bases
int isPrime(ll n) {
    if (n < 2) return 0;
    if (n == 2 || n == 3) return 1;
    if (n % 2 == 0) return 0;

    // Miller-Rabin test using selected bases for 64-bit numbers
    ll bases[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};
    int k = sizeof(bases) / sizeof(bases[0]);

    for (int i = 0; i < k; i++) {
        if (bases[i] >= n) break; // No need to check with large bases
        if (!millerRabin(n, bases[i])) return 0;
    }
    return 1; // Definitely prime
}

int main() {
    int t;
    scanf("%d", &t);

    while (t--) {
        ll n;
        scanf("%lld", &n);
        printf(isPrime(n) ? "YES\n" : "NO\n");
    }
    
    return 0;
}