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

val HugeIcons.FlameKindling: ImageVector
    get() {
        if (_flameKindling != null) {
            return _flameKindling!!
        }
        _flameKindling = ImageVector.Builder(
            name = "FlameKindling",
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
            moveTo(12f, 15f)
            curveTo(14.7614f, 15f, 17f, 12.8174f, 17f, 10.125f)
            curveTo(17f, 9.475f, 17f, 8.175f, 15.6667f, 6.55f)
            curveTo(15.6667f, 6.55f, 15.6003f, 8.40484f, 14.2842f, 8.13653f)
            curveTo(12.1554f, 7.70256f, 14.9034f, 3.62692f, 11f, 2f)
            curveTo(11f, 5.25f, 7f, 6.225f, 7f, 10.125f)
            curveTo(7f, 12.8174f, 9.23858f, 15f, 12f, 15f)
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
            moveTo(4f, 22f)
            lineTo(20f, 17f)
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
            moveTo(20f, 22f)
            lineTo(3.99997f, 17f)
        }
        }.build()

        return _flameKindling!!
    }

private var _flameKindling: ImageVector? = null
