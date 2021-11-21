module.exports = {
    entry: "./index.tsx",
    output: {
        path: __dirname,
        filename: "build.js",
    },
    module: {
        rules: [
            {
                test: /\.tsx?$/,
                use: ['ts-loader']
            }
        ],
    },
    resolve: {
        modules: ['node_modules'],
        extensions: ['.ts', '.tsx', '.js', '.jsx']
    }
};