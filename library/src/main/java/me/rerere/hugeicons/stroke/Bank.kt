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

val HugeIcons.Bank: ImageVector
    get() {
        if (_bank != null) {
            return _bank!!
        }
        _bank = ImageVector.Builder(
            name = "Bank",
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
            moveTo(12.125f, 5.75f)
            horizontalLineTo(12f)
            moveTo(12.25f, 5.75f)
            curveTo(12.25f, 5.88807f, 12.1381f, 6f, 12f, 6f)
            curveTo(11.8619f, 6f, 11.75f, 5.88807f, 11.75f, 5.75f)
            curveTo(11.75f, 5.61193f, 11.8619f, 5.5f, 12f, 5.5f)
            curveTo(12.1381f, 5.5f, 12.25f, 5.61193f, 12.25f, 5.75f)
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
            moveTo(5f, 9f)
            verticalLineTo(19f)
            moveTo(9f, 9f)
            verticalLineTo(19f)
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
            moveTo(15f, 9f)
            verticalLineTo(19f)
            moveTo(19f, 9f)
            verticalLineTo(19f)
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
            moveTo(21.3518f, 9f)
            horizontalLineTo(2.64822f)
            curveTo(2.29022f, 9f, 2f, 8.70651f, 2f, 8.34447f)
            curveTo(2f, 8.12259f, 2.11099f, 7.91577f, 2.29495f, 7.79485f)
            lineTo(8.73007f, 3.56485f)
            curveTo(10.3171f, 2.52162f, 11.1107f, 2f, 12f, 2f)
            curveTo(12.8893f, 2f, 13.6829f, 2.52162f, 15.2699f, 3.56485f)
            lineTo(21.7051f, 7.79485f)
            curveTo(21.889f, 7.91577f, 22f, 8.12259f, 22f, 8.34447f)
            curveTo(22f, 8.70651f, 21.7098f, 9f, 21.3518f, 9f)
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
            moveTo(21.0397f, 20.2929f)
            lineTo(20.3519f, 19.5858f)
            curveTo(20.0707f, 19.2968f, 19.9301f, 19.1522f, 19.7514f, 19.0761f)
            curveTo(19.5726f, 19f, 19.3738f, 19f, 18.9762f, 19f)
            horizontalLineTo(5.02382f)
            curveTo(4.62621f, 19f, 4.4274f, 19f, 4.24863f, 19.0761f)
            curveTo(4.06987f, 19.1522f, 3.92929f, 19.2968f, 3.64814f, 19.5858f)
            lineTo(2.9603f, 20.2929f)
            curveTo(2.25356f, 21.0194f, 1.9002f, 21.3827f, 2.02456f, 21.6913f)
            curveTo(2.14893f, 22f, 2.64867f, 22f, 3.64814f, 22f)
            horizontalLineTo(20.3519f)
            curveTo(21.3513f, 22f, 21.8511f, 22f, 21.9754f, 21.6913f)
            curveTo(22.0998f, 21.3827f, 21.7464f, 21.0194f, 21.0397f, 20.2929f)
            close()
        }
        }.build()

        return _bank!!
    }

private var _bank: ImageVector? = null
