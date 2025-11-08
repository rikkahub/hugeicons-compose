package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Flag01: ImageVector
    get() {
        if (_flag01 != null) {
            return _flag01!!
        }
        _flag01 = ImageVector.Builder(
            name = "Flag01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.0249f, 21f)
        curveTo(5.04385f, 19.2643f, 5.04366f, 17.5541f, 5.0366f, 15.9209f)
        moveTo(5.0366f, 15.9209f)
        curveTo(5.01301f, 10.4614f, 4.91276f, 5.86186f, 5.19475f, 4.04271f)
        curveTo(5.5611f, 1.67939f, 9.39301f, 3.82993f, 13.9703f, 5.59842f)
        lineTo(16.0328f, 6.48729f)
        curveTo(17.5508f, 7.1415f, 19.7187f, 8.30352f, 18.7662f, 9.66084f)
        curveTo(18.3738f, 10.22f, 17.56f, 10.8596f, 16.0575f, 11.567f)
        lineTo(5.0366f, 15.9209f)
        }
        }.build()

        return _flag01!!
    }

private var _flag01: ImageVector? = null
