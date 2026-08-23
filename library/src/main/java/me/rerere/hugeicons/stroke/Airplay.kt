package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Airplay: ImageVector
    get() {
        if (_airplay != null) {
            return _airplay!!
        }
        _airplay = ImageVector.Builder(
            name = "Airplay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5.5f, 17f)
            curveTo(3.52684f, 16.7534f, 2f, 15.0665f, 2f, 13.0222f)
            verticalLineTo(10.0155f)
            curveTo(2f, 7.20036f, 2f, 5.79279f, 2.67412f, 4.78166f)
            curveTo(2.96596f, 4.34393f, 3.34096f, 3.9681f, 3.77772f, 3.67561f)
            curveTo(4.78661f, 3f, 6.19108f, 3f, 9f, 3f)
            horizontalLineTo(15f)
            curveTo(17.8089f, 3f, 19.2134f, 3f, 20.2223f, 3.67561f)
            curveTo(20.659f, 3.9681f, 21.034f, 4.34393f, 21.3259f, 4.78166f)
            curveTo(22f, 5.79279f, 22f, 7.20036f, 22f, 10.0155f)
            verticalLineTo(13.0222f)
            curveTo(22f, 15.0665f, 20.4732f, 16.7534f, 18.5f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.9007f, 17.6437f)
            lineTo(13.4686f, 16.0924f)
            curveTo(12.7808f, 15.3472f, 12.4369f, 14.9746f, 11.999f, 14.9746f)
            curveTo(11.5612f, 14.9746f, 11.2173f, 15.3472f, 10.5294f, 16.0924f)
            lineTo(9.09741f, 17.6437f)
            curveTo(7.76897f, 19.0829f, 7.10475f, 19.8024f, 7.36698f, 20.4014f)
            curveTo(7.62921f, 21.0003f, 8.60848f, 21.0003f, 10.567f, 21.0003f)
            horizontalLineTo(13.4311f)
            curveTo(15.3896f, 21.0003f, 16.3689f, 21.0003f, 16.6311f, 20.4014f)
            curveTo(16.8933f, 19.8024f, 16.2291f, 19.0829f, 14.9007f, 17.6437f)
            close()
        }
        }.build()

        return _airplay!!
    }

private var _airplay: ImageVector? = null
