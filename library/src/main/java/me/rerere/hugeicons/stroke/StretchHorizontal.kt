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

val HugeIcons.StretchHorizontal: ImageVector
    get() {
        if (_stretchHorizontal != null) {
            return _stretchHorizontal!!
        }
        _stretchHorizontal = ImageVector.Builder(
            name = "StretchHorizontal",
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
            moveTo(1.99219f, 7f)
            curveTo(1.99219f, 6.06812f, 1.99219f, 5.60218f, 2.14443f, 5.23463f)
            curveTo(2.34742f, 4.74458f, 2.73676f, 4.35523f, 3.22682f, 4.15224f)
            curveTo(3.59436f, 4f, 4.0603f, 4f, 4.99219f, 4f)
            horizontalLineTo(18.9922f)
            curveTo(19.9241f, 4f, 20.39f, 4f, 20.7576f, 4.15224f)
            curveTo(21.2476f, 4.35523f, 21.637f, 4.74458f, 21.8399f, 5.23463f)
            curveTo(21.9922f, 5.60218f, 21.9922f, 6.06812f, 21.9922f, 7f)
            curveTo(21.9922f, 7.93188f, 21.9922f, 8.39782f, 21.8399f, 8.76537f)
            curveTo(21.637f, 9.25542f, 21.2476f, 9.64477f, 20.7576f, 9.84776f)
            curveTo(20.39f, 10f, 19.9241f, 10f, 18.9922f, 10f)
            horizontalLineTo(4.99219f)
            curveTo(4.0603f, 10f, 3.59436f, 10f, 3.22682f, 9.84776f)
            curveTo(2.73676f, 9.64477f, 2.34742f, 9.25542f, 2.14443f, 8.76537f)
            curveTo(1.99219f, 8.39782f, 1.99219f, 7.93188f, 1.99219f, 7f)
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
            moveTo(1.99219f, 17f)
            curveTo(1.99219f, 16.0681f, 1.99219f, 15.6022f, 2.14443f, 15.2346f)
            curveTo(2.34742f, 14.7446f, 2.73676f, 14.3552f, 3.22682f, 14.1522f)
            curveTo(3.59436f, 14f, 4.0603f, 14f, 4.99219f, 14f)
            horizontalLineTo(18.9922f)
            curveTo(19.9241f, 14f, 20.39f, 14f, 20.7576f, 14.1522f)
            curveTo(21.2476f, 14.3552f, 21.637f, 14.7446f, 21.8399f, 15.2346f)
            curveTo(21.9922f, 15.6022f, 21.9922f, 16.0681f, 21.9922f, 17f)
            curveTo(21.9922f, 17.9319f, 21.9922f, 18.3978f, 21.8399f, 18.7654f)
            curveTo(21.637f, 19.2554f, 21.2476f, 19.6448f, 20.7576f, 19.8478f)
            curveTo(20.39f, 20f, 19.9241f, 20f, 18.9922f, 20f)
            horizontalLineTo(4.99219f)
            curveTo(4.0603f, 20f, 3.59436f, 20f, 3.22682f, 19.8478f)
            curveTo(2.73676f, 19.6448f, 2.34742f, 19.2554f, 2.14443f, 18.7654f)
            curveTo(1.99219f, 18.3978f, 1.99219f, 17.9319f, 1.99219f, 17f)
            close()
        }
        }.build()

        return _stretchHorizontal!!
    }

private var _stretchHorizontal: ImageVector? = null
