package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Snapchat: ImageVector
    get() {
        if (_snapchat != null) {
            return _snapchat!!
        }
        _snapchat = ImageVector.Builder(
            name = "Snapchat",
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
        moveTo(6.57556f, 7.42444f)
        curveTo(6.57556f, 4.42861f, 9.00416f, 2f, 12f, 2f)
        curveTo(14.9958f, 2f, 17.4244f, 4.42861f, 17.4244f, 7.42444f)
        curveTo(17.4244f, 12.1722f, 17.6611f, 14.5456f, 22f, 16.4444f)
        curveTo(19.7778f, 17f, 19.2222f, 17.5556f, 18.6667f, 19.7778f)
        curveTo(14.7778f, 19.7778f, 14.2222f, 22f, 12f, 22f)
        curveTo(9.77778f, 22f, 9.22222f, 19.7778f, 5.33333f, 19.7778f)
        curveTo(4.77778f, 17.5556f, 4.22222f, 17f, 2f, 16.4444f)
        curveTo(6.33889f, 14.5456f, 6.57556f, 12.1722f, 6.57556f, 7.42444f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 16f)
        curveTo(5.82356f, 13.9171f, 5.82356f, 11.9503f, 2.95589f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 16f)
        curveTo(18.1764f, 13.9171f, 18.1764f, 11.9503f, 21.0441f, 9f)
        }
        }.build()

        return _snapchat!!
    }

private var _snapchat: ImageVector? = null
