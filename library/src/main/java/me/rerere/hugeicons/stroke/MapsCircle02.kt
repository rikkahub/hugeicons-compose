package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MapsCircle02: ImageVector
    get() {
        if (_mapsCircle02 != null) {
            return _mapsCircle02!!
        }
        _mapsCircle02 = ImageVector.Builder(
            name = "MapsCircle02",
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
        moveTo(14.5f, 9.5f)
        horizontalLineTo(14.509f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 6f)
        curveTo(16.3941f, 6f, 18f, 7.61319f, 18f, 9.57031f)
        curveTo(18f, 11.5586f, 16.368f, 12.9539f, 14.8605f, 13.9027f)
        curveTo(14.7506f, 13.9665f, 14.6264f, 14f, 14.5f, 14f)
        curveTo(14.3736f, 14f, 14.2494f, 13.9665f, 14.1395f, 13.9027f)
        curveTo(12.6348f, 12.9446f, 11f, 11.5655f, 11f, 9.57031f)
        curveTo(11f, 7.61319f, 12.6059f, 6f, 14.5f, 6f)
        }

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
        moveTo(9f, 15f)
        lineTo(5f, 19f)
        moveTo(15f, 21f)
        lineTo(3f, 9f)
        }
        }.build()

        return _mapsCircle02!!
    }

private var _mapsCircle02: ImageVector? = null
