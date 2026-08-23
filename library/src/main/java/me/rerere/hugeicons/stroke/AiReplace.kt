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

val HugeIcons.AiReplace: ImageVector
    get() {
        if (_aiReplace != null) {
            return _aiReplace!!
        }
        _aiReplace = ImageVector.Builder(
            name = "AiReplace",
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
            moveTo(8f, 20f)
            curveTo(6.13623f, 20f, 5.20435f, 20f, 4.46927f, 19.6955f)
            curveTo(3.48915f, 19.2895f, 2.71046f, 18.5108f, 2.30448f, 17.5307f)
            curveTo(2f, 16.7956f, 2f, 15.8638f, 2f, 14f)
            verticalLineTo(10f)
            curveTo(2f, 8.13623f, 2f, 7.20435f, 2.30448f, 6.46927f)
            curveTo(2.71046f, 5.48915f, 3.48915f, 4.71046f, 4.46927f, 4.30448f)
            curveTo(5.20435f, 4f, 6.13623f, 4f, 8f, 4f)
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
            moveTo(22f, 10f)
            verticalLineTo(14f)
            curveTo(22f, 15.8638f, 22f, 16.7956f, 21.6955f, 17.5307f)
            curveTo(21.2895f, 18.5108f, 20.5108f, 19.2895f, 19.5307f, 19.6955f)
            curveTo(18.7956f, 20f, 17.8638f, 20f, 16f, 20f)
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
            moveTo(12f, 2f)
            verticalLineTo(22f)
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
            moveTo(19.5f, 2.9375f)
            verticalLineTo(4.5f)
            moveTo(19.5f, 4.5f)
            verticalLineTo(6.0625f)
            moveTo(19.5f, 4.5f)
            horizontalLineTo(18.25f)
            moveTo(19.5f, 4.5f)
            horizontalLineTo(20.75f)
            moveTo(22f, 4.5f)
            lineTo(20.9156f, 4.13852f)
            curveTo(20.4179f, 3.97263f, 20.0274f, 3.58211f, 19.8615f, 3.08443f)
            lineTo(19.5f, 2f)
            lineTo(19.1385f, 3.08443f)
            curveTo(18.9726f, 3.58211f, 18.5821f, 3.97263f, 18.0844f, 4.13852f)
            lineTo(17f, 4.5f)
            lineTo(18.0844f, 4.86148f)
            curveTo(18.5821f, 5.02737f, 18.9726f, 5.41789f, 19.1385f, 5.91557f)
            lineTo(19.5f, 7f)
            lineTo(19.8615f, 5.91557f)
            curveTo(20.0274f, 5.41789f, 20.4179f, 5.02737f, 20.9156f, 4.86148f)
            lineTo(22f, 4.5f)
            close()
        }
        }.build()

        return _aiReplace!!
    }

private var _aiReplace: ImageVector? = null
