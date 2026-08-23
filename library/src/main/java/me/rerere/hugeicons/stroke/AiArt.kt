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

val HugeIcons.AiArt: ImageVector
    get() {
        if (_aiArt != null) {
            return _aiArt!!
        }
        _aiArt = ImageVector.Builder(
            name = "AiArt",
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
            moveTo(20.2941f, 8.49964f)
            curveTo(20.7487f, 9.57553f, 21f, 10.7582f, 21f, 11.9996f)
            curveTo(21f, 16.9702f, 16.9706f, 20.9996f, 12f, 20.9996f)
            curveTo(10.7586f, 20.9996f, 9.57589f, 20.7483f, 8.5f, 20.2937f)
            moveTo(5.29182f, 17.9998f)
            curveTo(3.86662f, 16.4075f, 3f, 14.3048f, 3f, 11.9996f)
            curveTo(3f, 8.51699f, 4.97812f, 5.49635f, 7.8721f, 4f)
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
            moveTo(3.79165f, 15.8775f)
            curveTo(2.13121f, 18.56f, 1.52414f, 20.7282f, 2.39946f, 21.602f)
            curveTo(3.93971f, 23.1395f, 9.48663f, 20.087f, 14.7889f, 14.784f)
            curveTo(20.0911f, 9.48095f, 23.1408f, 3.93558f, 21.6005f, 2.39804f)
            curveTo(21.3306f, 2.12854f, 20.9375f, 2.00006f, 20.4442f, 2f)
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
            moveTo(14.5f, 2.9375f)
            verticalLineTo(4.5f)
            moveTo(14.5f, 4.5f)
            verticalLineTo(6.0625f)
            moveTo(14.5f, 4.5f)
            horizontalLineTo(13.25f)
            moveTo(14.5f, 4.5f)
            horizontalLineTo(15.75f)
            moveTo(17f, 4.5f)
            lineTo(15.9156f, 4.13852f)
            curveTo(15.4179f, 3.97263f, 15.0274f, 3.58211f, 14.8615f, 3.08443f)
            lineTo(14.5f, 2f)
            lineTo(14.1385f, 3.08443f)
            curveTo(13.9726f, 3.58211f, 13.5821f, 3.97263f, 13.0844f, 4.13852f)
            lineTo(12f, 4.5f)
            lineTo(13.0844f, 4.86148f)
            curveTo(13.5821f, 5.02737f, 13.9726f, 5.41789f, 14.1385f, 5.91557f)
            lineTo(14.5f, 7f)
            lineTo(14.8615f, 5.91557f)
            curveTo(15.0274f, 5.41789f, 15.4179f, 5.02737f, 15.9156f, 4.86148f)
            lineTo(17f, 4.5f)
            close()
        }
        }.build()

        return _aiArt!!
    }

private var _aiArt: ImageVector? = null
