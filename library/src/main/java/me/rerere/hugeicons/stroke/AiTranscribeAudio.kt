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

val HugeIcons.AiTranscribeAudio: ImageVector
    get() {
        if (_aiTranscribeAudio != null) {
            return _aiTranscribeAudio!!
        }
        _aiTranscribeAudio = ImageVector.Builder(
            name = "AiTranscribeAudio",
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
            moveTo(13f, 3f)
            horizontalLineTo(11f)
            curveTo(7.22876f, 3f, 5.34315f, 3f, 4.17157f, 4.17157f)
            curveTo(3f, 5.34315f, 3f, 7.22876f, 3f, 11f)
            verticalLineTo(13.5f)
            curveTo(3f, 16.7875f, 3f, 18.4312f, 3.90796f, 19.5376f)
            curveTo(4.07418f, 19.7401f, 4.25989f, 19.9258f, 4.46243f, 20.092f)
            curveTo(5.56878f, 21f, 7.21252f, 21f, 10.5f, 21f)
            horizontalLineTo(12.5f)
            curveTo(13.8956f, 21f, 14.5933f, 21f, 15.1611f, 20.8278f)
            curveTo(16.4395f, 20.44f, 17.44f, 19.4395f, 17.8278f, 18.1611f)
            curveTo(18f, 17.5933f, 18f, 16.8956f, 18f, 15.5f)
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
            moveTo(18f, 2.5f)
            verticalLineTo(6.5f)
            moveTo(17f, 3f)
            verticalLineTo(6f)
            curveTo(17f, 6.55228f, 17.4477f, 7f, 18f, 7f)
            curveTo(18.5523f, 7f, 19f, 6.55228f, 19f, 6f)
            verticalLineTo(3f)
            curveTo(19f, 2.44772f, 18.5523f, 2f, 18f, 2f)
            curveTo(17.4477f, 2f, 17f, 2.44772f, 17f, 3f)
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
            moveTo(18f, 10f)
            verticalLineTo(12f)
            moveTo(18f, 10f)
            curveTo(19.8638f, 10f, 21.556f, 8.72523f, 22f, 7f)
            moveTo(18f, 10f)
            curveTo(16.1361f, 10f, 14.444f, 8.72523f, 14f, 7f)
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
        }.build()

        return _aiTranscribeAudio!!
    }

private var _aiTranscribeAudio: ImageVector? = null
