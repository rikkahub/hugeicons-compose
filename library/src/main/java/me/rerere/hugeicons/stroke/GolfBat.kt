package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GolfBat: ImageVector
    get() {
        if (_golfBat != null) {
            return _golfBat!!
        }
        _golfBat = ImageVector.Builder(
            name = "GolfBat",
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
        moveTo(7.47095f, 17.263f)
        lineTo(12f, 20.9742f)
        curveTo(11.6197f, 21.3637f, 11.255f, 21.7646f, 10.7178f, 21.9214f)
        curveTo(10.4486f, 22f, 10.1597f, 22f, 9.58202f, 22f)
        horizontalLineTo(6.64577f)
        curveTo(5.12431f, 22f, 3.69593f, 21.514f, 3.15891f, 19.9348f)
        curveTo(2.65447f, 18.4514f, 3.35188f, 15.9891f, 5.23816f, 16f)
        curveTo(5.93452f, 16.0041f, 6.44666f, 16.4237f, 7.47095f, 17.263f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 21f)
        lineTo(16.5f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.6206f, 3.42288f)
        lineTo(16.1333f, 9.00001f)
        curveTo(16.0557f, 9.29111f, 16.1934f, 9.59668f, 16.4628f, 9.73142f)
        curveTo(16.7642f, 9.8821f, 17.1308f, 9.77111f, 17.298f, 9.47856f)
        lineTo(20.1617f, 4.46705f)
        curveTo(20.5954f, 3.70809f, 20.2263f, 2.7421f, 19.397f, 2.46568f)
        curveTo(18.6397f, 2.21323f, 17.8263f, 2.65152f, 17.6206f, 3.42288f)
        }
        }.build()

        return _golfBat!!
    }

private var _golfBat: ImageVector? = null
