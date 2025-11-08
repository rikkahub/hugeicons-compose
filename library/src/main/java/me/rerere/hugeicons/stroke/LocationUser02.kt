package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LocationUser02: ImageVector
    get() {
        if (_locationUser02 != null) {
            return _locationUser02!!
        }
        _locationUser02 = ImageVector.Builder(
            name = "LocationUser02",
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
        moveTo(12.9981f, 7f)
        horizontalLineTo(11.0019f)
        curveTo(8.13196f, 7f, 6.19701f, 10.0691f, 7.32753f, 12.828f)
        curveTo(7.48501f, 13.2124f, 7.84633f, 13.4615f, 8.24612f, 13.4615f)
        horizontalLineTo(8.9491f)
        curveTo(9.18605f, 13.4615f, 9.39259f, 13.6302f, 9.45006f, 13.8706f)
        lineTo(10.3551f, 17.6567f)
        curveTo(10.5438f, 18.4462f, 11.222f, 19f, 12f, 19f)
        curveTo(12.778f, 19f, 13.4562f, 18.4462f, 13.6449f, 17.6567f)
        lineTo(14.5499f, 13.8706f)
        curveTo(14.6074f, 13.6302f, 14.814f, 13.4615f, 15.0509f, 13.4615f)
        horizontalLineTo(15.7539f)
        curveTo(16.1537f, 13.4615f, 16.515f, 13.2124f, 16.6725f, 12.828f)
        curveTo(17.803f, 10.0691f, 15.868f, 7f, 12.9981f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 4.5f)
        curveTo(14.5f, 5.88071f, 13.3807f, 7f, 12f, 7f)
        curveTo(10.6193f, 7f, 9.5f, 5.88071f, 9.5f, 4.5f)
        curveTo(9.5f, 3.11929f, 10.6193f, 2f, 12f, 2f)
        curveTo(13.3807f, 2f, 14.5f, 3.11929f, 14.5f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 19f)
        curveTo(19f, 20.6569f, 15.866f, 22f, 12f, 22f)
        curveTo(8.13401f, 22f, 5f, 20.6569f, 5f, 19f)
        }
        }.build()

        return _locationUser02!!
    }

private var _locationUser02: ImageVector? = null
