package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LocationOffline04: ImageVector
    get() {
        if (_locationOffline04 != null) {
            return _locationOffline04!!
        }
        _locationOffline04 = ImageVector.Builder(
            name = "LocationOffline04",
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
        moveTo(18f, 18f)
        curveTo(16.5648f, 19.4833f, 14.6122f, 20.7255f, 12.927f, 21.7567f)
        curveTo(12.6445f, 21.9162f, 12.325f, 22f, 12f, 22f)
        curveTo(11.675f, 22f, 11.3555f, 21.9162f, 11.073f, 21.7567f)
        curveTo(7.2039f, 19.3616f, 3f, 15.9137f, 3f, 10.9258f)
        curveTo(3f, 8.83373f, 3.75496f, 7.02961f, 5f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 3.22795f)
        curveTo(8.83379f, 2.44855f, 10.3757f, 2f, 12f, 2f)
        curveTo(16.8706f, 2f, 21f, 6.03298f, 21f, 10.9258f)
        curveTo(21f, 12.6174f, 20.514f, 14.1373f, 19.7199f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }
        }.build()

        return _locationOffline04!!
    }

private var _locationOffline04: ImageVector? = null
