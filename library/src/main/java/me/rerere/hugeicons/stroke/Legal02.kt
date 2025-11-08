package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Legal02: ImageVector
    get() {
        if (_legal02 != null) {
            return _legal02!!
        }
        _legal02 = ImageVector.Builder(
            name = "Legal02",
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
        moveTo(14.0011f, 9.79802f)
        lineTo(4.39343f, 10.4919f)
        curveTo(3.10421f, 10.585f, 2.00109f, 9.66574f, 2.0011f, 8.49837f)
        curveTo(2.00111f, 7.331f, 3.10426f, 6.41176f, 4.39348f, 6.50485f)
        lineTo(14.0011f, 7.19851f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.001f, 13.9983f)
        lineTo(13.0011f, 13.9984f)
        moveTo(21.0011f, 2.99835f)
        lineTo(13.0012f, 2.99842f)
        moveTo(20.0012f, 2.99836f)
        lineTo(14.0013f, 2.99841f)
        curveTo(14.0013f, 2.99841f, 13.5012f, 5.95993f, 13.5012f, 8.49838f)
        curveTo(13.5012f, 11.0369f, 14.0011f, 13.9984f, 14.0011f, 13.9984f)
        lineTo(20.001f, 13.9983f)
        curveTo(20.001f, 13.9983f, 20.5011f, 11.0368f, 20.5011f, 8.49832f)
        curveTo(20.5011f, 5.95988f, 20.0012f, 2.99836f, 20.0012f, 2.99836f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0011f, 21.0016f)
        horizontalLineTo(21.9989f)
        moveTo(13.2258f, 21.0016f)
        curveTo(13.7773f, 20.0142f, 14.1892f, 18.1245f, 16.1412f, 18.0186f)
        curveTo(16.7209f, 17.9872f, 17.3108f, 17.9872f, 17.8906f, 18.0186f)
        curveTo(19.8426f, 18.1245f, 20.2564f, 20.0142f, 20.8079f, 21.0016f)
        }
        }.build()

        return _legal02!!
    }

private var _legal02: ImageVector? = null
