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

val HugeIcons.Tablet02: ImageVector
    get() {
        if (_tablet02 != null) {
            return _tablet02!!
        }
        _tablet02 = ImageVector.Builder(
            name = "Tablet02",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.5f, 2f)
            horizontalLineTo(9.5f)
            curveTo(6.67157f, 2f, 5.25736f, 2f, 4.37868f, 2.87868f)
            curveTo(3.5f, 3.75736f, 3.5f, 5.17157f, 3.5f, 8f)
            verticalLineTo(16f)
            curveTo(3.5f, 18.8284f, 3.5f, 20.2426f, 4.37868f, 21.1213f)
            curveTo(5.25736f, 22f, 6.67157f, 22f, 9.5f, 22f)
            horizontalLineTo(14.5f)
            curveTo(17.3284f, 22f, 18.7426f, 22f, 19.6213f, 21.1213f)
            curveTo(20.5f, 20.2426f, 20.5f, 18.8284f, 20.5f, 16f)
            verticalLineTo(8f)
            curveTo(20.5f, 5.17157f, 20.5f, 3.75736f, 19.6213f, 2.87868f)
            curveTo(18.7426f, 2f, 17.3284f, 2f, 14.5f, 2f)
            close()
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
            moveTo(10f, 4.5f)
            horizontalLineTo(14f)
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
            moveTo(12.125f, 19f)
            horizontalLineTo(12f)
            moveTo(12.25f, 19f)
            curveTo(12.25f, 19.1381f, 12.1381f, 19.25f, 12f, 19.25f)
            curveTo(11.8619f, 19.25f, 11.75f, 19.1381f, 11.75f, 19f)
            curveTo(11.75f, 18.8619f, 11.8619f, 18.75f, 12f, 18.75f)
            curveTo(12.1381f, 18.75f, 12.25f, 18.8619f, 12.25f, 19f)
            close()
        }
        }.build()

        return _tablet02!!
    }

private var _tablet02: ImageVector? = null
