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

val HugeIcons.CopyPlus: ImageVector
    get() {
        if (_copyPlus != null) {
            return _copyPlus!!
        }
        _copyPlus = ImageVector.Builder(
            name = "CopyPlus",
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
            moveTo(14f, 7f)
            verticalLineTo(13f)
            moveTo(17.005f, 9.995f)
            lineTo(11.005f, 9.995f)
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
            moveTo(7f, 11f)
            verticalLineTo(9f)
            curveTo(7f, 5.70017f, 7f, 4.05025f, 8.02513f, 3.02513f)
            curveTo(9.05025f, 2f, 10.7002f, 2f, 14f, 2f)
            curveTo(17.2998f, 2f, 18.9497f, 2f, 19.9749f, 3.02513f)
            curveTo(21f, 4.05025f, 21f, 5.70017f, 21f, 9f)
            verticalLineTo(11f)
            curveTo(21f, 14.2998f, 21f, 15.9497f, 19.9749f, 16.9749f)
            curveTo(18.9497f, 18f, 17.2998f, 18f, 14f, 18f)
            curveTo(10.7002f, 18f, 9.05025f, 18f, 8.02513f, 16.9749f)
            curveTo(7f, 15.9497f, 7f, 14.2998f, 7f, 11f)
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
            moveTo(3f, 6f)
            verticalLineTo(15f)
            curveTo(3f, 18.2998f, 3f, 19.9497f, 4.02513f, 20.9749f)
            curveTo(5.05025f, 22f, 6.70017f, 22f, 10f, 22f)
            horizontalLineTo(17f)
        }
        }.build()

        return _copyPlus!!
    }

private var _copyPlus: ImageVector? = null
