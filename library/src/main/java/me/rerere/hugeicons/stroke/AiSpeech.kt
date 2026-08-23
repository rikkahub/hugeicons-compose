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

val HugeIcons.AiSpeech: ImageVector
    get() {
        if (_aiSpeech != null) {
            return _aiSpeech!!
        }
        _aiSpeech = ImageVector.Builder(
            name = "AiSpeech",
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
            moveTo(12f, 7f)
            verticalLineTo(17f)
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
            moveTo(16f, 11f)
            lineTo(16f, 19f)
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
            moveTo(20f, 11f)
            lineTo(20f, 14f)
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
            moveTo(8f, 3f)
            verticalLineTo(21f)
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
            moveTo(4f, 9f)
            verticalLineTo(15f)
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
            moveTo(18.5f, 3.9375f)
            verticalLineTo(5.5f)
            moveTo(18.5f, 5.5f)
            verticalLineTo(7.0625f)
            moveTo(18.5f, 5.5f)
            horizontalLineTo(17.25f)
            moveTo(18.5f, 5.5f)
            horizontalLineTo(19.75f)
            moveTo(21f, 5.5f)
            lineTo(19.9156f, 5.13852f)
            curveTo(19.4179f, 4.97263f, 19.0274f, 4.58211f, 18.8615f, 4.08443f)
            lineTo(18.5f, 3f)
            lineTo(18.1385f, 4.08443f)
            curveTo(17.9726f, 4.58211f, 17.5821f, 4.97263f, 17.0844f, 5.13852f)
            lineTo(16f, 5.5f)
            lineTo(17.0844f, 5.86148f)
            curveTo(17.5821f, 6.02737f, 17.9726f, 6.41789f, 18.1385f, 6.91557f)
            lineTo(18.5f, 8f)
            lineTo(18.8615f, 6.91557f)
            curveTo(19.0274f, 6.41789f, 19.4179f, 6.02737f, 19.9156f, 5.86148f)
            lineTo(21f, 5.5f)
            close()
        }
        }.build()

        return _aiSpeech!!
    }

private var _aiSpeech: ImageVector? = null
