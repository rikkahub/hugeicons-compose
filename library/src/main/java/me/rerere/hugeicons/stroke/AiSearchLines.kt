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

val HugeIcons.AiSearchLines: ImageVector
    get() {
        if (_aiSearchLines != null) {
            return _aiSearchLines!!
        }
        _aiSearchLines = ImageVector.Builder(
            name = "AiSearchLines",
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
            moveTo(18f, 10.5f)
            verticalLineTo(13.5f)
            curveTo(18f, 16.7875f, 18f, 18.4312f, 17.092f, 19.5376f)
            curveTo(16.9258f, 19.7401f, 16.7401f, 19.9258f, 16.5376f, 20.092f)
            curveTo(15.4312f, 21f, 13.7875f, 21f, 10.5f, 21f)
            curveTo(7.21252f, 21f, 5.56878f, 21f, 4.46243f, 20.092f)
            curveTo(4.25989f, 19.9258f, 4.07418f, 19.7401f, 3.90796f, 19.5376f)
            curveTo(3f, 18.4312f, 3f, 16.7875f, 3f, 13.5f)
            verticalLineTo(11f)
            curveTo(3f, 7.22876f, 3f, 5.34315f, 4.17157f, 4.17157f)
            curveTo(5.34315f, 3f, 7.22876f, 3f, 11f, 3f)
            horizontalLineTo(12.5f)
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
            moveTo(7f, 17f)
            horizontalLineTo(14f)
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
            moveTo(7f, 13f)
            horizontalLineTo(11f)
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
            moveTo(18.5f, 2.9375f)
            verticalLineTo(4.5f)
            moveTo(18.5f, 4.5f)
            verticalLineTo(6.0625f)
            moveTo(18.5f, 4.5f)
            horizontalLineTo(17.25f)
            moveTo(18.5f, 4.5f)
            horizontalLineTo(19.75f)
            moveTo(21f, 4.5f)
            lineTo(19.9156f, 4.13852f)
            curveTo(19.4179f, 3.97263f, 19.0274f, 3.58211f, 18.8615f, 3.08443f)
            lineTo(18.5f, 2f)
            lineTo(18.1385f, 3.08443f)
            curveTo(17.9726f, 3.58211f, 17.5821f, 3.97263f, 17.0844f, 4.13852f)
            lineTo(16f, 4.5f)
            lineTo(17.0844f, 4.86148f)
            curveTo(17.5821f, 5.02737f, 17.9726f, 5.41789f, 18.1385f, 5.91557f)
            lineTo(18.5f, 7f)
            lineTo(18.8615f, 5.91557f)
            curveTo(19.0274f, 5.41789f, 19.4179f, 5.02737f, 19.9156f, 4.86148f)
            lineTo(21f, 4.5f)
            close()
        }
        }.build()

        return _aiSearchLines!!
    }

private var _aiSearchLines: ImageVector? = null
