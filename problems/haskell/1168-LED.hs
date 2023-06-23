solve :: [String] -> [String]
solve = map (\s -> numLeds s ++ " leds")
  where numLeds c = show $ sum $ map (aux) c
  
aux :: Char -> Int      
aux '1' = 2
aux '2' = 5
aux '3' = 5
aux '4' = 4
aux '5' = 5
aux '6' = 6
aux '7' = 3
aux '8' = 7
aux '9' = 6
aux '0' = 6
main :: IO()

main = interact $ unlines . solve . tail . words 
