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

val HugeIcons.Cuboid: ImageVector
    get() {
        if (_cuboid != null) {
            return _cuboid!!
        }
        _cuboid = ImageVector.Builder(
            name = "Cuboid",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15f, 9.5f)
            horizontalLineTo(5.5f)
            curveTo(4.08579f, 9.5f, 3.37868f, 9.5f, 2.93934f, 9.93934f)
            curveTo(2.5f, 10.3787f, 2.5f, 11.0858f, 2.5f, 12.5f)
            verticalLineTo(15f)
            curveTo(2.5f, 16.4142f, 2.5f, 17.1213f, 2.93934f, 17.5607f)
            curveTo(3.37868f, 18f, 4.08579f, 18f, 5.5f, 18f)
            horizontalLineTo(15f)
            curveTo(16.4142f, 18f, 17.1213f, 18f, 17.5607f, 17.5607f)
            curveTo(18f, 17.1213f, 18f, 16.4142f, 18f, 15f)
            verticalLineTo(12.5f)
            curveTo(18f, 11.0858f, 18f, 10.3787f, 17.5607f, 9.93934f)
            curveTo(17.1213f, 9.5f, 16.4142f, 9.5f, 15f, 9.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.5f, 14f)
            verticalLineTo(11.1569f)
            curveTo(2.5f, 10.3394f, 2.5f, 9.9306f, 2.65224f, 9.56306f)
            curveTo(2.80448f, 9.19552f, 3.09351f, 8.90649f, 3.67157f, 8.32843f)
            lineTo(4.82843f, 7.17157f)
            curveTo(5.40649f, 6.59351f, 5.69552f, 6.30448f, 6.06306f, 6.15224f)
            curveTo(6.4306f, 6f, 6.83935f, 6f, 7.65685f, 6f)
            horizontalLineTo(17.5f)
            curveTo(19.3856f, 6f, 20.3284f, 6f, 20.9142f, 6.58579f)
            curveTo(21.5f, 7.17157f, 21.5f, 8.11438f, 21.5f, 10f)
            verticalLineTo(12.8431f)
            curveTo(21.5f, 13.6606f, 21.5f, 14.0694f, 21.3478f, 14.4369f)
            curveTo(21.1955f, 14.8045f, 20.9065f, 15.0935f, 20.3284f, 15.6716f)
            lineTo(19.1716f, 16.8284f)
            curveTo(18.5935f, 17.4065f, 18.3045f, 17.6955f, 17.9369f, 17.8478f)
            curveTo(17.5694f, 18f, 17.1606f, 18f, 16.3431f, 18f)
            horizontalLineTo(6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.5f, 10f)
            lineTo(21f, 6.5f)
        }
        }.build()

        return _cuboid!!
    }

private var _cuboid: ImageVector? = null
