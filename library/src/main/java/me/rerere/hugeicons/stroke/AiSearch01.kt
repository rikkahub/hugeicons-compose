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

val HugeIcons.AiSearch01: ImageVector
    get() {
        if (_aiSearch01 != null) {
            return _aiSearch01!!
        }
        _aiSearch01 = ImageVector.Builder(
            name = "AiSearch01",
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
            moveTo(17f, 17f)
            lineTo(21f, 21f)
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
            moveTo(12f, 3.06189f)
            curveTo(11.6724f, 3.02104f, 11.3387f, 3f, 11f, 3f)
            curveTo(6.58172f, 3f, 3f, 6.58172f, 3f, 11f)
            curveTo(3f, 15.4183f, 6.58172f, 19f, 11f, 19f)
            curveTo(15.4183f, 19f, 19f, 15.4183f, 19f, 11f)
            curveTo(19f, 10.6613f, 18.979f, 10.3276f, 18.9381f, 10f)
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
            moveTo(17.5f, 2.9375f)
            verticalLineTo(4.5f)
            moveTo(17.5f, 4.5f)
            verticalLineTo(6.0625f)
            moveTo(17.5f, 4.5f)
            horizontalLineTo(16.25f)
            moveTo(17.5f, 4.5f)
            horizontalLineTo(18.75f)
            moveTo(20f, 4.5f)
            lineTo(18.9156f, 4.13852f)
            curveTo(18.4179f, 3.97263f, 18.0274f, 3.58211f, 17.8615f, 3.08443f)
            lineTo(17.5f, 2f)
            lineTo(17.1385f, 3.08443f)
            curveTo(16.9726f, 3.58211f, 16.5821f, 3.97263f, 16.0844f, 4.13852f)
            lineTo(15f, 4.5f)
            lineTo(16.0844f, 4.86148f)
            curveTo(16.5821f, 5.02737f, 16.9726f, 5.41789f, 17.1385f, 5.91557f)
            lineTo(17.5f, 7f)
            lineTo(17.8615f, 5.91557f)
            curveTo(18.0274f, 5.41789f, 18.4179f, 5.02737f, 18.9156f, 4.86148f)
            lineTo(20f, 4.5f)
            close()
        }
        }.build()

        return _aiSearch01!!
    }

private var _aiSearch01: ImageVector? = null
