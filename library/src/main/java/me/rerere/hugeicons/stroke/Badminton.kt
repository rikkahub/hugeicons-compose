package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Badminton: ImageVector
    get() {
        if (_badminton != null) {
            return _badminton!!
        }
        _badminton = ImageVector.Builder(
            name = "Badminton",
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
        moveTo(2.39114f, 21.6387f)
        curveTo(1.81409f, 21.0816f, 1.8854f, 20.1398f, 2.53981f, 19.6752f)
        lineTo(6.17145f, 17.097f)
        curveTo(6.38333f, 16.9465f, 6.6739f, 16.9737f, 6.85404f, 17.1607f)
        curveTo(7.02764f, 17.3409f, 7.0488f, 17.6183f, 6.90454f, 17.8226f)
        lineTo(4.3387f, 21.4558f)
        curveTo(3.88384f, 22.0999f, 2.95883f, 22.1867f, 2.39114f, 21.6387f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 12.5f)
        lineTo(7f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.4291f, 12.5774f)
        curveTo(17.534f, 14.4725f, 13.869f, 14.5529f, 11.6581f, 12.3419f)
        curveTo(9.44711f, 10.131f, 9.52748f, 6.46597f, 11.4226f, 4.57087f)
        curveTo(13.912f, 2.08144f, 18.5975f, 0.980641f, 20.8084f, 3.19159f)
        curveTo(23.0194f, 5.40254f, 21.9186f, 10.088f, 19.4291f, 12.5774f)
        }
        }.build()

        return _badminton!!
    }

private var _badminton: ImageVector? = null
