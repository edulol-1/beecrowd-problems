fact :: (Integral a) => a -> a
fact x = product [1..x]

main :: IO ()
main = interact $ unlines . map show . map sum . map (map (fact . read)) . map words . lines
