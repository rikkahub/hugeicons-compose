package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Drooling: ImageVector
    get() {
        if (_drooling != null) {
            return _drooling!!
        }
        _drooling = ImageVector.Builder(
            name = "Drooling",
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
        moveTo(10f, 8.5f)
        horizontalLineTo(8.70711f)
        curveTo(8.25435f, 8.5f, 7.82014f, 8.67986f, 7.5f, 9f)
        moveTo(14f, 8.5f)
        horizontalLineTo(15.2929f)
        curveTo(15.7456f, 8.5f, 16.1799f, 8.67986f, 16.5f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 21.1679f)
        curveTo(14.7751f, 21.7031f, 13.4222f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        curveTo(22f, 14.4292f, 21.1338f, 16.6562f, 19.6934f, 18.3888f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 15f)
        curveTo(8.91212f, 16.2144f, 10.3643f, 17f, 12f, 17f)
        curveTo(13.6357f, 17f, 15.0879f, 16.2144f, 16f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 16f)
        curveTo(16.9444f, 16.4782f, 20.5737f, 17.4805f, 19.9229f, 20.5384f)
        curveTo(19.5873f, 22.0505f, 17.8294f, 22.33f, 16.875f, 21.6496f)
        curveTo(14.5772f, 20.0116f, 16.875f, 18.4f, 15f, 16f)
        }
        }.build()

        return _drooling!!
    }

private var _drooling: ImageVector? = null
