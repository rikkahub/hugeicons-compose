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

val HugeIcons.Camera03: ImageVector
    get() {
        if (_camera03 != null) {
            return _camera03!!
        }
        _camera03 = ImageVector.Builder(
            name = "Camera03",
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
            moveTo(7f, 7f)
            lineTo(7.89443f, 5.21114f)
            curveTo(8.43234f, 4.13531f, 8.7013f, 3.5974f, 9.18461f, 3.2987f)
            curveTo(9.66791f, 3f, 10.2693f, 3f, 11.4721f, 3f)
            horizontalLineTo(12.5279f)
            curveTo(13.7307f, 3f, 14.3321f, 3f, 14.8154f, 3.2987f)
            curveTo(15.2987f, 3.5974f, 15.5677f, 4.13531f, 16.1056f, 5.21115f)
            lineTo(17f, 7f)
            curveTo(18.8692f, 7f, 19.8038f, 7f, 20.5f, 7.40192f)
            curveTo(20.9561f, 7.66523f, 21.3348f, 8.04394f, 21.5981f, 8.5f)
            curveTo(22f, 9.19615f, 22f, 10.1308f, 22f, 12f)
            verticalLineTo(15f)
            curveTo(22f, 17.8284f, 22f, 19.2426f, 21.1213f, 20.1213f)
            curveTo(20.2426f, 21f, 18.8284f, 21f, 16f, 21f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 21f, 3.75736f, 21f, 2.87868f, 20.1213f)
            curveTo(2f, 19.2426f, 2f, 17.8284f, 2f, 15f)
            verticalLineTo(12f)
            curveTo(2f, 10.1308f, 2f, 9.19615f, 2.40192f, 8.5f)
            curveTo(2.66523f, 8.04394f, 3.04394f, 7.66523f, 3.5f, 7.40192f)
            curveTo(4.19615f, 7f, 5.13077f, 7f, 7f, 7f)
            close()
            moveTo(7f, 7f)
            horizontalLineTo(12f)
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
            moveTo(15.5f, 14f)
            curveTo(15.5f, 15.933f, 13.933f, 17.5f, 12f, 17.5f)
            curveTo(10.067f, 17.5f, 8.5f, 15.933f, 8.5f, 14f)
            curveTo(8.5f, 12.067f, 10.067f, 10.5f, 12f, 10.5f)
            curveTo(13.933f, 10.5f, 15.5f, 12.067f, 15.5f, 14f)
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
            moveTo(19.125f, 10f)
            horizontalLineTo(19f)
            moveTo(19.25f, 10f)
            curveTo(19.25f, 10.1381f, 19.1381f, 10.25f, 19f, 10.25f)
            curveTo(18.8619f, 10.25f, 18.75f, 10.1381f, 18.75f, 10f)
            curveTo(18.75f, 9.86193f, 18.8619f, 9.75f, 19f, 9.75f)
            curveTo(19.1381f, 9.75f, 19.25f, 9.86193f, 19.25f, 10f)
            close()
        }
        }.build()

        return _camera03!!
    }

private var _camera03: ImageVector? = null
