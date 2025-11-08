package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.OpenCaption: ImageVector
    get() {
        if (_openCaption != null) {
            return _openCaption!!
        }
        _openCaption = ImageVector.Builder(
            name = "OpenCaption",
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
        moveTo(2f, 10.5f)
        curveTo(2f, 7.18361f, 2f, 5.52541f, 3.0528f, 4.41834f)
        curveTo(3.22119f, 4.24128f, 3.40678f, 4.07752f, 3.60746f, 3.92894f)
        curveTo(4.86213f, 3f, 6.74142f, 3f, 10.5f, 3f)
        horizontalLineTo(13.5f)
        curveTo(17.2586f, 3f, 19.1379f, 3f, 20.3925f, 3.92894f)
        curveTo(20.5932f, 4.07752f, 20.7788f, 4.24128f, 20.9472f, 4.41834f)
        curveTo(22f, 5.52541f, 22f, 7.18361f, 22f, 10.5f)
        curveTo(22f, 13.8164f, 22f, 15.4746f, 20.9472f, 16.5817f)
        curveTo(20.7788f, 16.7587f, 20.5932f, 16.9225f, 20.3925f, 17.0711f)
        curveTo(19.1379f, 18f, 17.2586f, 18f, 13.5f, 18f)
        horizontalLineTo(10.5f)
        curveTo(6.74142f, 18f, 4.86213f, 18f, 3.60746f, 17.0711f)
        curveTo(3.40678f, 16.9225f, 3.22119f, 16.7587f, 3.0528f, 16.5817f)
        curveTo(2f, 15.4746f, 2f, 13.8164f, 2f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 7.5f)
        horizontalLineTo(10f)
        curveTo(9.06812f, 7.5f, 8.60218f, 7.5f, 8.23463f, 7.65224f)
        curveTo(7.74458f, 7.85523f, 7.35523f, 8.24458f, 7.15224f, 8.73463f)
        curveTo(7f, 9.10218f, 7f, 9.56812f, 7f, 10.5f)
        curveTo(7f, 11.4319f, 7f, 11.8978f, 7.15224f, 12.2654f)
        curveTo(7.35523f, 12.7554f, 7.74458f, 13.1448f, 8.23463f, 13.3478f)
        curveTo(8.60218f, 13.5f, 9.06812f, 13.5f, 10f, 13.5f)
        horizontalLineTo(10.5f)
        moveTo(17f, 7.5f)
        horizontalLineTo(16.5f)
        curveTo(15.5681f, 7.5f, 15.1022f, 7.5f, 14.7346f, 7.65224f)
        curveTo(14.2446f, 7.85523f, 13.8552f, 8.24458f, 13.6522f, 8.73463f)
        curveTo(13.5f, 9.10218f, 13.5f, 9.56812f, 13.5f, 10.5f)
        curveTo(13.5f, 11.4319f, 13.5f, 11.8978f, 13.6522f, 12.2654f)
        curveTo(13.8552f, 12.7554f, 14.2446f, 13.1448f, 14.7346f, 13.3478f)
        curveTo(15.1022f, 13.5f, 15.5681f, 13.5f, 16.5f, 13.5f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 21f)
        horizontalLineTo(22f)
        }
        }.build()

        return _openCaption!!
    }

private var _openCaption: ImageVector? = null
