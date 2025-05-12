// vars/envInfo.groovy
def call(String env) {
    if (env == "prod") {
        echo "🔥 Production Environment - EXTRA CAUTION! 🔥"
    } else if (env == "staging") {
        echo "🚧 Staging Environment - Testing Zone"
    } else {
        echo "🧪 Unknown Environment: ${env}"
    }
}
