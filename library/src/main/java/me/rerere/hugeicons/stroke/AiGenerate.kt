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

val HugeIcons.AiGenerate: ImageVector
    get() {
        if (_aiGenerate != null) {
            return _aiGenerate!!
        }
        _aiGenerate = ImageVector.Builder(
            name = "AiGenerate",
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
            moveTo(13f, 5f)
            horizontalLineTo(9.5f)
            curveTo(6.21252f, 5f, 4.56878f, 5f, 3.46243f, 5.90796f)
            curveTo(3.25989f, 6.07418f, 3.07418f, 6.25989f, 2.90796f, 6.46243f)
            curveTo(2f, 7.56878f, 2f, 9.21252f, 2f, 12.5f)
            curveTo(2f, 15.7875f, 2f, 17.4312f, 2.90796f, 18.5376f)
            curveTo(3.07418f, 18.7401f, 3.25989f, 18.9258f, 3.46243f, 19.092f)
            curveTo(4.56878f, 20f, 6.21252f, 20f, 9.5f, 20f)
            horizontalLineTo(13f)
            curveTo(16.7712f, 20f, 18.6569f, 20f, 19.8284f, 18.8284f)
            curveTo(21f, 17.6569f, 21f, 15.7712f, 21f, 12f)
            verticalLineTo(11.5f)
        }
        }.build()

        return _aiGenerate!!
    }

private var _aiGenerate: ImageVector? = null
