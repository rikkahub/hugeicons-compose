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

val HugeIcons.Merge: ImageVector
    get() {
        if (_merge != null) {
            return _merge!!
        }
        _merge = ImageVector.Builder(
            name = "Merge",
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
            moveTo(15.996f, 6.99996f)
            curveTo(15.996f, 6.99996f, 13.05f, 3.00001f, 11.996f, 3f)
            curveTo(10.9419f, 2.99999f, 7.99599f, 7f, 7.99599f, 7f)
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
            moveTo(11.9964f, 3.5f)
            verticalLineTo(11.3431f)
            curveTo(11.9964f, 12.1606f, 11.9964f, 12.5694f, 11.8442f, 12.9369f)
            curveTo(11.6919f, 13.3045f, 11.4029f, 13.5935f, 10.8248f, 14.1716f)
            lineTo(3.99609f, 21f)
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
            moveTo(14.4961f, 15.5f)
            lineTo(19.9961f, 21f)
        }
        }.build()

        return _merge!!
    }

private var _merge: ImageVector? = null
