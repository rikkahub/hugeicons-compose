package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.YogaBall: ImageVector
    get() {
        if (_yogaBall != null) {
            return _yogaBall!!
        }
        _yogaBall = ImageVector.Builder(
            name = "YogaBall",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.8527f, 4.71739f)
        curveTo(18.0384f, 9.42192f, 13.9368f, 13f, 8.99957f, 13f)
        curveTo(6.34739f, 13f, 3.93635f, 11.9675f, 2.14648f, 10.2825f)
        moveTo(21.8096f, 10.0501f)
        curveTo(19.6928f, 14.7377f, 14.9772f, 18f, 9.49957f, 18f)
        curveTo(7.13533f, 18f, 4.91304f, 17.3922f, 2.98041f, 16.3244f)
        moveTo(3.65427f, 6.48834f)
        curveTo(4.84805f, 7.43477f, 6.35781f, 7.99996f, 7.99957f, 7.99996f)
        curveTo(11.3811f, 7.99996f, 14.2027f, 5.60217f, 14.8567f, 2.41406f)
        }
        }.build()

        return _yogaBall!!
    }

private var _yogaBall: ImageVector? = null
