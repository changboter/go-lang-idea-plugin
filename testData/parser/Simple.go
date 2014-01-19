package foo

func NewCipher(key []byte) (cipher.Block , error) {
	return c, nil
}

func simpleF() int {
    return 2
}

func complexF1() (re float64, im float64) {
    return -7.0, -4.0
}

func test() {
    switch tag {
        default: s3()
        case 0, 1, 2, 3: s1()
        case 4, 5, 6, 7: s2()
    }

    switch x := f(); {  // missing switch expression means "true"
        case x < 0: return -x
        default: return x
    }
    switch x := f(); 1==1 {  // missing switch expression means "true"
        case x < 0: return -x
        default: return x
    }

    switch {
        case x < y: f1()
        case x < z: f2()
        case x == 4: f3()
    }
}

func emptyFor() {
    for s.accept(decimalDigits) {

    }
}

func emptyIf() {
  if err := q.Send(&Cmd{U: parsed, M: method}); err != nil {
  }
}

func emptyClauses() {
    verb := "1"[0]
    switch verb {
        case 'p':
        default:
    }
}

func (h extraHeader) Write(w io.Writer) {
	for i, v := range []string{h.contentType, h.contentLength, h.connection, h.date, h.transferEncoding} {
		if v != "" {
			w.Write(extraHeaderKeys[i])
			w.Write(colonSpace)
			io.WriteString(w, v)
			w.Write(crlf)
		}
	}
}

func main() {
    if 1 != 1 {
    }
}


var days = [...]string{
	"Sunday",
	"Monday",
	"Tuesday",
	"Wednesday",
	"Thursday",
	"Friday",
	"Saturday",
}