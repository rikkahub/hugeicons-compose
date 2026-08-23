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

val HugeIcons.AiVoice01: ImageVector
    get() {
        if (_aiVoice01 != null) {
            return _aiVoice01!!
        }
        _aiVoice01 = ImageVector.Builder(
            name = "AiVoice01",
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
            moveTo(12f, 2f)
            curveTo(9.79086f, 2f, 8f, 3.79086f, 8f, 6f)
            verticalLineTo(11f)
            curveTo(8f, 13.2091f, 9.79086f, 15f, 12f, 15f)
            curveTo(14.2091f, 15f, 16f, 13.2091f, 16f, 11f)
            verticalLineTo(10f)
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
            moveTo(19f, 12f)
            curveTo(18.7174f, 15.3914f, 15.8824f, 18f, 12.4792f, 18f)
            horizontalLineTo(11.5208f)
            curveTo(8.11765f, 18f, 5.28262f, 15.3914f, 5f, 12f)
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
            moveTo(12f, 18f)
            verticalLineTo(22f)
            moveTo(12f, 22f)
            horizontalLineTo(15f)
            moveTo(12f, 22f)
            horizontalLineTo(9f)
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
            moveTo(16.5f, 2.9375f)
            verticalLineTo(4.5f)
            moveTo(16.5f, 4.5f)
            verticalLineTo(6.0625f)
            moveTo(16.5f, 4.5f)
            horizontalLineTo(15.25f)
            moveTo(16.5f, 4.5f)
            horizontalLineTo(17.75f)
            moveTo(19f, 4.5f)
            lineTo(17.9156f, 4.13852f)
            curveTo(17.4179f, 3.97263f, 17.0274f, 3.58211f, 16.8615f, 3.08443f)
            lineTo(16.5f, 2f)
            lineTo(16.1385f, 3.08443f)
            curveTo(15.9726f, 3.58211f, 15.5821f, 3.97263f, 15.0844f, 4.13852f)
            lineTo(14f, 4.5f)
            lineTo(15.0844f, 4.86148f)
            curveTo(15.5821f, 5.02737f, 15.9726f, 5.41789f, 16.1385f, 5.91557f)
            lineTo(16.5f, 7f)
            lineTo(16.8615f, 5.91557f)
            curveTo(17.0274f, 5.41789f, 17.4179f, 5.02737f, 17.9156f, 4.86148f)
            lineTo(19f, 4.5f)
            close()
        }
        }.build()

        return _aiVoice01!!
    }

private var _aiVoice01: ImageVector? = null
