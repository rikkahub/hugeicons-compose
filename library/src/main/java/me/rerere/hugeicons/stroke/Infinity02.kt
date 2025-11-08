package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Infinity02: ImageVector
    get() {
        if (_infinity02 != null) {
            return _infinity02!!
        }
        _infinity02 = ImageVector.Builder(
            name = "Infinity02",
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
        moveTo(12f, 12f)
        curveTo(12f, 12f, 10.3569f, 15f, 8.7f, 15f)
        curveTo(7.04315f, 15f, 6f, 13.6569f, 6f, 12f)
        curveTo(6f, 10.3431f, 7.04315f, 9f, 8.7f, 9f)
        curveTo(10.3569f, 9f, 12f, 12f, 12f, 12f)
        moveTo(12f, 12f)
        curveTo(12f, 12f, 13.6431f, 15f, 15.3f, 15f)
        curveTo(16.9569f, 15f, 18f, 13.6569f, 18f, 12f)
        curveTo(18f, 10.3431f, 16.9569f, 9f, 15.3f, 9f)
        curveTo(13.6431f, 9f, 12f, 12f, 12f, 12f)
        }

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
        }.build()

        return _infinity02!!
    }

private var _infinity02: ImageVector? = null
