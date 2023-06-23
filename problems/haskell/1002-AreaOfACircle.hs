import Text.Printf (printf)

getArea :: Double -> Double
getArea r = 3.14159 * (r*r)

main :: IO ()
main = do
    input <- getLine
    let radio = read input :: Double
    let area = getArea radio
    putStrLn ("A=" ++ (printf "%.4g" area))
