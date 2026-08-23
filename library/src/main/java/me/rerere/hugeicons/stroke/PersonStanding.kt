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

val HugeIcons.PersonStanding: ImageVector
    get() {
        if (_personStanding != null) {
            return _personStanding!!
        }
        _personStanding = ImageVector.Builder(
            name = "PersonStanding",
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
            moveTo(13.4922f, 4.5f)
            curveTo(13.4922f, 5.32843f, 12.8206f, 6f, 11.9922f, 6f)
            curveTo(11.1638f, 6f, 10.4922f, 5.32843f, 10.4922f, 4.5f)
            curveTo(10.4922f, 3.67157f, 11.1638f, 3f, 11.9922f, 3f)
            curveTo(12.8206f, 3f, 13.4922f, 3.67157f, 13.4922f, 4.5f)
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
            moveTo(3.99219f, 5.5f)
            lineTo(5.85885f, 6.9f)
            curveTo(6.91616f, 7.69298f, 7.44481f, 8.08947f, 8.06061f, 8.29473f)
            curveTo(8.67641f, 8.5f, 9.33722f, 8.5f, 10.6589f, 8.5f)
            horizontalLineTo(13.3255f)
            curveTo(14.6472f, 8.5f, 15.308f, 8.5f, 15.9238f, 8.29473f)
            curveTo(16.5396f, 8.08947f, 17.0682f, 7.69298f, 18.1255f, 6.9f)
            lineTo(19.9922f, 5.5f)
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
            moveTo(10.4922f, 8.5f)
            verticalLineTo(13.0146f)
            curveTo(10.4922f, 13.7552f, 10.4922f, 14.1255f, 10.425f, 14.4875f)
            curveTo(10.3577f, 14.8495f, 10.2248f, 15.1952f, 9.95895f, 15.8864f)
            lineTo(7.99219f, 21f)
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
            moveTo(13.4922f, 8.5f)
            verticalLineTo(13.0146f)
            curveTo(13.4922f, 13.7552f, 13.4922f, 14.1255f, 13.5594f, 14.4875f)
            curveTo(13.6266f, 14.8495f, 13.7596f, 15.1952f, 14.0254f, 15.8864f)
            lineTo(15.9922f, 21f)
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
            moveTo(10.4922f, 14.5f)
            horizontalLineTo(13.4922f)
        }
        }.build()

        return _personStanding!!
    }

private var _personStanding: ImageVector? = null
