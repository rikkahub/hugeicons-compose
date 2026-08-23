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

val HugeIcons.AiSketch: ImageVector
    get() {
        if (_aiSketch != null) {
            return _aiSketch!!
        }
        _aiSketch = ImageVector.Builder(
            name = "AiSketch",
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
            moveTo(19.5f, 3.9375f)
            verticalLineTo(5.5f)
            moveTo(19.5f, 5.5f)
            verticalLineTo(7.0625f)
            moveTo(19.5f, 5.5f)
            horizontalLineTo(18.25f)
            moveTo(19.5f, 5.5f)
            horizontalLineTo(20.75f)
            moveTo(22f, 5.5f)
            lineTo(20.9156f, 5.13852f)
            curveTo(20.4179f, 4.97263f, 20.0274f, 4.58211f, 19.8615f, 4.08443f)
            lineTo(19.5f, 3f)
            lineTo(19.1385f, 4.08443f)
            curveTo(18.9726f, 4.58211f, 18.5821f, 4.97263f, 18.0844f, 5.13852f)
            lineTo(17f, 5.5f)
            lineTo(18.0844f, 5.86148f)
            curveTo(18.5821f, 6.02737f, 18.9726f, 6.41789f, 19.1385f, 6.91557f)
            lineTo(19.5f, 8f)
            lineTo(19.8615f, 6.91557f)
            curveTo(20.0274f, 6.41789f, 20.4179f, 6.02737f, 20.9156f, 5.86148f)
            lineTo(22f, 5.5f)
            close()
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
            moveTo(2f, 12.8598f)
            curveTo(4.81875f, 10.0939f, 11.44f, 4.44194f, 13.275f, 6.40605f)
            curveTo(15.5938f, 8.88796f, 3.40937f, 15.1646f, 5.28854f, 17.93f)
            curveTo(7.2734f, 20.851f, 14.2146f, 10.5543f, 16.5635f, 12.3982f)
            curveTo(18.9125f, 14.2422f, 10.926f, 18.391f, 12.8052f, 20.696f)
            curveTo(13.5569f, 21.6179f, 15.6239f, 20.235f, 16.5635f, 19.313f)
        }
        }.build()

        return _aiSketch!!
    }

private var _aiSketch: ImageVector? = null
