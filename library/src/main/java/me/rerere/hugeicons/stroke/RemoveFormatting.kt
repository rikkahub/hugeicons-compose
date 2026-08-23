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

val HugeIcons.RemoveFormatting: ImageVector
    get() {
        if (_removeFormatting != null) {
            return _removeFormatting!!
        }
        _removeFormatting = ImageVector.Builder(
            name = "RemoveFormatting",
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
            moveTo(3.99219f, 6.5f)
            lineTo(4.23786f, 5.88583f)
            curveTo(4.6032f, 4.97248f, 4.78587f, 4.5158f, 5.16679f, 4.2579f)
            curveTo(5.54772f, 4f, 6.03976f, 4f, 7.02385f, 4f)
            curveTo(10.8174f, 4f, 13.6161f, 4f, 17.2987f, 4f)
            curveTo(17.7227f, 4f, 17.9348f, 4f, 18.0894f, 4.03298f)
            curveTo(18.877f, 4.2009f, 19.3915f, 4.96078f, 19.2549f, 5.75442f)
            curveTo(19.2281f, 5.91026f, 19.1495f, 6.10684f, 18.9922f, 6.5f)
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
            moveTo(4.49219f, 20f)
            horizontalLineTo(10.4922f)
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
            moveTo(12.4922f, 4f)
            lineTo(7.49219f, 20f)
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
            moveTo(14.9922f, 15f)
            lineTo(19.9922f, 20f)
            moveTo(14.9922f, 20f)
            lineTo(19.9922f, 15f)
        }
        }.build()

        return _removeFormatting!!
    }

private var _removeFormatting: ImageVector? = null
