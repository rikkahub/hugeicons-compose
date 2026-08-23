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

val HugeIcons.VoiceComment: ImageVector
    get() {
        if (_voiceComment != null) {
            return _voiceComment!!
        }
        _voiceComment = ImageVector.Builder(
            name = "VoiceComment",
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
            moveTo(15f, 4f)
            verticalLineTo(7.5f)
            lineTo(17f, 6f)
            horizontalLineTo(19f)
            curveTo(19.9428f, 6f, 20.4142f, 6f, 20.7071f, 5.70711f)
            curveTo(21f, 5.41421f, 21f, 4.94281f, 21f, 4f)
            curveTo(21f, 3.05719f, 21f, 2.58579f, 20.7071f, 2.29289f)
            curveTo(20.4142f, 2f, 19.9428f, 2f, 19f, 2f)
            horizontalLineTo(17f)
            curveTo(16.0572f, 2f, 15.5858f, 2f, 15.2929f, 2.29289f)
            curveTo(15f, 2.58579f, 15f, 3.05719f, 15f, 4f)
            close()
        }
        }.build()

        return _voiceComment!!
    }

private var _voiceComment: ImageVector? = null
