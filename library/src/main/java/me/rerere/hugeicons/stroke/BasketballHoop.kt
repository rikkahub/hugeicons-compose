package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BasketballHoop: ImageVector
    get() {
        if (_basketballHoop != null) {
            return _basketballHoop!!
        }
        _basketballHoop = ImageVector.Builder(
            name = "BasketballHoop",
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
        moveTo(5f, 17f)
        curveTo(4.37188f, 16.8651f, 3.87905f, 16.6488f, 3.46243f, 16.3018f)
        curveTo(3.25989f, 16.1331f, 3.07418f, 15.9446f, 2.90796f, 15.7391f)
        curveTo(2f, 14.6163f, 2f, 12.9481f, 2f, 9.61164f)
        curveTo(2f, 6.27522f, 2f, 4.60701f, 2.90796f, 3.48419f)
        curveTo(3.07418f, 3.27864f, 3.25989f, 3.09016f, 3.46243f, 2.92147f)
        curveTo(4.56878f, 2f, 6.21252f, 2f, 9.5f, 2f)
        horizontalLineTo(14.5f)
        curveTo(17.7875f, 2f, 19.4312f, 2f, 20.5376f, 2.92147f)
        curveTo(20.7401f, 3.09016f, 20.9258f, 3.27864f, 21.092f, 3.48419f)
        curveTo(22f, 4.60701f, 22f, 6.27522f, 22f, 9.61164f)
        curveTo(22f, 12.9481f, 22f, 14.6163f, 21.092f, 15.7391f)
        curveTo(20.9258f, 15.9446f, 20.7401f, 16.1331f, 20.5376f, 16.3018f)
        curveTo(20.1209f, 16.6488f, 19.6281f, 16.8651f, 19f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 13f)
        horizontalLineTo(7.33333f)
        moveTo(7.33333f, 13f)
        lineTo(8.5f, 22f)
        moveTo(7.33333f, 13f)
        horizontalLineTo(12f)
        moveTo(18f, 13f)
        horizontalLineTo(16.6667f)
        moveTo(16.6667f, 13f)
        lineTo(15.5f, 22f)
        moveTo(16.6667f, 13f)
        horizontalLineTo(12f)
        moveTo(12f, 13f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 10f)
        curveTo(8.05893f, 8.04825f, 9.26181f, 8f, 10.9978f, 8f)
        horizontalLineTo(13.0022f)
        curveTo(14.7382f, 8f, 15.9411f, 8.04825f, 16f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 16.5f)
        horizontalLineTo(16f)
        moveTo(8.44444f, 20f)
        horizontalLineTo(15.5556f)
        }
        }.build()

        return _basketballHoop!!
    }

private var _basketballHoop: ImageVector? = null
