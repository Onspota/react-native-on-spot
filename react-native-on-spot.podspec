require "json"

package = JSON.parse(File.read(File.join(__dir__, "package.json")))

Pod::Spec.new do |s|
  s.name         = "react-native-on-spot"
  s.version      = package["version"]
  s.summary      = package["description"]
  s.description    = package['description']
  s.homepage     = "https://github.com/github_account/react-native-on-spot"
  s.license      = "MIT"
  # s.license    = { :type => "MIT", :file => "FILE_LICENSE" }
  s.authors      = { "Your Name" => "yourname@email.com" }
  s.platforms    = { :ios => "11.0" }
  s.source       = { :git => "https://github.com/github_account/react-native-on-spot.git", :tag => "#{s.version}" }

  s.source_files = "ios/**/*.{h,m,swift}"
  s.requires_arc = true

  s.dependency "React"
  s.dependency "OnSpotSdk"
#   s.dependency 'AFNetworking', '~> 3'
  # ...
  # s.dependency "..."
end

