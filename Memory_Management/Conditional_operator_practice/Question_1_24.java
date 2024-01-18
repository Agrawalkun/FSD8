package Memory_Management.Conditional_operator_practice;

public class Question_1_24 {
    public static void main(String[] args) {
        int h = 23;
        int y = 67;
        if (h == y) {
            if (y != 0) {
                System.out.println(0);

            } else if (h <= 3) {
                System.out.println(h);
            } else if (h >= y) {
                System.out.println(y);
            } else if (h == 3) {
                System.out.println(3);
                if (y == 3) {
                    System.out.println(3);
                } else if (y != 0) {
                    System.out.println(0);
                } else if (h != 0) {
                    System.out.println(h);
                }
            }
            if (h <= y) {
                System.out.println(y);
            }
        }
        if (h < y) {
            if (h != 0) {
                if (y > h) {
                    if (y != 0) {
                        if (h == 6) {
                            System.out.println(6);
                            if (y != 0) {
                                if (y == 5) {
                                    if (h <= 0) {
                                        if (y != 5) {
                                            if (h != 65) {
                                                System.out.println(y);
                                            } else if (y < h) {
                                                System.out.println(h);
                                            }

                                        }

                                    }

                                } else if (h != 54) {
                                    if (y == 0) {
                                        System.out.println(y);
                                    } else if (h > y) {
                                        if (h < y) {
                                            System.out.println(h);
                                            if (y != 0) {
                                                System.out.println(y);

                                            } else if (y == 43) {
                                                System.out.println(67);
                                            }
                                        } else if (h == y) {
                                            System.out.println(h + y);
                                        }
                                    }
                                    System.out.println(y + 0);
                                }
                            }
                        }
                    } else if (y == 78) {
                        System.out.println("ek tu hi yaar mera ");
                    }
                }
            }
        }
    }
}
