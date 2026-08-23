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

val HugeIcons.Tongue01: ImageVector
    get() {
        if (_tongue01 != null) {
            return _tongue01!!
        }
        _tongue01 = ImageVector.Builder(
            name = "Tongue01",
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
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
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
            moveTo(15.5f, 15.8658f)
            lineTo(14.5f, 18f)
            curveTo(15.9945f, 17.4012f, 17f, 16.2819f, 17f, 15f)
            horizontalLineTo(7f)
            curveTo(7f, 16.2819f, 8.0055f, 17.4012f, 9.5f, 18f)
            lineTo(8.5f, 15.8658f)
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
            moveTo(9.5f, 15f)
            verticalLineTo(19.5f)
            curveTo(9.5f, 20.8807f, 10.6193f, 22f, 12f, 22f)
            curveTo(13.3807f, 22f, 14.5f, 20.8807f, 14.5f, 19.5f)
            verticalLineTo(15f)
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
            moveTo(6.5f, 8.8f)
            curveTo(6.84205f, 8.31422f, 7.38662f, 8f, 8f, 8f)
            curveTo(8.61338f, 8f, 9.15795f, 8.31422f, 9.5f, 8.8f)
            moveTo(14.5f, 8.8f)
            curveTo(14.842f, 8.31422f, 15.3866f, 8f, 16f, 8f)
            curveTo(16.6134f, 8f, 17.158f, 8.31422f, 17.5f, 8.8f)
        }
        }.build()

        return _tongue01!!
    }

private var _tongue01: ImageVector? = null
