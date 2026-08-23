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

val HugeIcons.AiFile01: ImageVector
    get() {
        if (_aiFile01 != null) {
            return _aiFile01!!
        }
        _aiFile01 = ImageVector.Builder(
            name = "AiFile01",
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
            moveTo(4f, 14f)
            verticalLineTo(9.45584f)
            curveTo(4f, 6.21082f, 4f, 4.58831f, 4.88607f, 3.48933f)
            curveTo(5.06508f, 3.26731f, 5.26731f, 3.06508f, 5.48933f, 2.88607f)
            curveTo(6.58831f, 2f, 8.21082f, 2f, 11.4558f, 2f)
            curveTo(12.1614f, 2f, 12.5141f, 2f, 12.8372f, 2.11401f)
            curveTo(12.9044f, 2.13772f, 12.9702f, 2.165f, 13.0345f, 2.19575f)
            curveTo(13.3436f, 2.34355f, 13.593f, 2.593f, 14.0919f, 3.09188f)
            lineTo(18.8284f, 7.82843f)
            curveTo(19.4065f, 8.40649f, 19.6955f, 8.69552f, 19.8478f, 9.06306f)
            curveTo(20f, 9.4306f, 20f, 9.83935f, 20f, 10.6569f)
            verticalLineTo(14f)
            curveTo(20f, 17.7712f, 20f, 19.6569f, 18.8284f, 20.8284f)
            curveTo(17.6569f, 22f, 15.7712f, 22f, 12f, 22f)
            moveTo(13f, 2.5f)
            verticalLineTo(3f)
            curveTo(13f, 5.82843f, 13f, 7.24264f, 13.8787f, 8.12132f)
            curveTo(14.7574f, 9f, 16.1716f, 9f, 19f, 9f)
            horizontalLineTo(19.5f)
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
            moveTo(6.5f, 17.9375f)
            verticalLineTo(19.5f)
            moveTo(6.5f, 19.5f)
            verticalLineTo(21.0625f)
            moveTo(6.5f, 19.5f)
            horizontalLineTo(5.25f)
            moveTo(6.5f, 19.5f)
            horizontalLineTo(7.75f)
            moveTo(9f, 19.5f)
            lineTo(7.91557f, 19.1385f)
            curveTo(7.41789f, 18.9726f, 7.02737f, 18.5821f, 6.86148f, 18.0844f)
            lineTo(6.5f, 17f)
            lineTo(6.13852f, 18.0844f)
            curveTo(5.97263f, 18.5821f, 5.58211f, 18.9726f, 5.08443f, 19.1385f)
            lineTo(4f, 19.5f)
            lineTo(5.08443f, 19.8615f)
            curveTo(5.58211f, 20.0274f, 5.97263f, 20.4179f, 6.13852f, 20.9156f)
            lineTo(6.5f, 22f)
            lineTo(6.86148f, 20.9156f)
            curveTo(7.02737f, 20.4179f, 7.41789f, 20.0274f, 7.91557f, 19.8615f)
            lineTo(9f, 19.5f)
            close()
        }
        }.build()

        return _aiFile01!!
    }

private var _aiFile01: ImageVector? = null
