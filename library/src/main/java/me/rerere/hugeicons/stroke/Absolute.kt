package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Absolute: ImageVector
    get() {
        if (_absolute != null) {
            return _absolute!!
        }
        _absolute = ImageVector.Builder(
            name = "Absolute",
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
        moveTo(17.725f, 2.5f)
        curveTo(19.1145f, 2.65381f, 20.0498f, 3.00143f, 20.7479f, 3.78705f)
        curveTo(22f, 5.19617f, 22f, 7.46411f, 22f, 12f)
        curveTo(22f, 16.5359f, 22f, 18.8038f, 20.7479f, 20.213f)
        curveTo(20.0498f, 20.9986f, 19.1145f, 21.3462f, 17.725f, 21.5f)
        moveTo(6.27501f, 21.5f)
        curveTo(4.88551f, 21.3462f, 3.95021f, 20.9986f, 3.25212f, 20.213f)
        curveTo(2f, 18.8038f, 2f, 16.5359f, 2f, 12f)
        curveTo(2f, 7.46411f, 2f, 5.19617f, 3.25212f, 3.78705f)
        curveTo(3.95021f, 3.00143f, 4.88551f, 2.65381f, 6.27501f, 2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.56055f, 8.01026f)
        curveTo(9.09055f, 7.95026f, 10.0505f, 8.04027f, 10.6505f, 9.09026f)
        curveTo(11.2805f, 10.3503f, 12.8405f, 13.8603f, 13.2305f, 14.6703f)
        curveTo(13.6505f, 15.5403f, 14.1905f, 16.1403f, 16.4105f, 15.9903f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9998f, 8f)
        curveTo(14.7998f, 7.98571f, 12.9998f, 10.7f, 11.9998f, 12f)
        curveTo(10.8998f, 13.5f, 9.00977f, 16.1f, 7.00977f, 16f)
        }
        }.build()

        return _absolute!!
    }

private var _absolute: ImageVector? = null
