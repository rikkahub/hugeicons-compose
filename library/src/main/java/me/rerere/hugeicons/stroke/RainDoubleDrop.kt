package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RainDoubleDrop: ImageVector
    get() {
        if (_rainDoubleDrop != null) {
            return _rainDoubleDrop!!
        }
        _rainDoubleDrop = ImageVector.Builder(
            name = "RainDoubleDrop",
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
        moveTo(2f, 13.3424f)
        curveTo(2f, 9.9951f, 4.73825f, 6.68726f, 6.66022f, 4.77778f)
        curveTo(7.70404f, 3.74074f, 9.29597f, 3.74074f, 10.3398f, 4.77778f)
        curveTo(12.2617f, 6.68726f, 15f, 9.9951f, 15f, 13.3424f)
        curveTo(15f, 16.6243f, 12.5386f, 20f, 8.5f, 20f)
        curveTo(4.46142f, 20f, 2f, 16.6243f, 2f, 13.3424f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 20f)
        curveTo(19.5386f, 20f, 22f, 16.6243f, 22f, 13.3424f)
        curveTo(22f, 9.9951f, 19.2617f, 6.68726f, 17.3398f, 4.77778f)
        curveTo(16.296f, 3.74074f, 14.704f, 3.74074f, 13.6602f, 4.77778f)
        }
        }.build()

        return _rainDoubleDrop!!
    }

private var _rainDoubleDrop: ImageVector? = null
