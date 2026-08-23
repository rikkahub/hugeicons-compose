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

val HugeIcons.Import: ImageVector
    get() {
        if (_import != null) {
            return _import!!
        }
        _import = ImageVector.Builder(
            name = "Import",
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
            moveTo(12f, 14.5f)
            lineTo(12f, 2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 2.56348f)
            curveTo(6.03242f, 2.67731f, 4.78634f, 2.99652f, 3.89124f, 3.89162f)
            curveTo(2.5f, 5.28286f, 2.5f, 7.52203f, 2.5f, 12.0004f)
            curveTo(2.5f, 16.4787f, 2.5f, 18.7179f, 3.89124f, 20.1091f)
            curveTo(5.28249f, 21.5004f, 7.52166f, 21.5004f, 12f, 21.5004f)
            curveTo(16.4783f, 21.5004f, 18.7175f, 21.5004f, 20.1088f, 20.1091f)
            curveTo(21.5f, 18.7179f, 21.5f, 16.4787f, 21.5f, 12.0004f)
            curveTo(21.5f, 7.52203f, 21.5f, 5.28286f, 20.1088f, 3.89162f)
            curveTo(19.2137f, 2.99652f, 17.9676f, 2.67731f, 16f, 2.56348f)
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
            moveTo(16f, 11.5f)
            curveTo(16f, 11.5f, 13.054f, 15.5f, 12f, 15.5f)
            curveTo(10.9459f, 15.5f, 8f, 11.5f, 8f, 11.5f)
        }
        }.build()

        return _import!!
    }

private var _import: ImageVector? = null
