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

val HugeIcons.Bike: ImageVector
    get() {
        if (_bike != null) {
            return _bike!!
        }
        _bike = ImageVector.Builder(
            name = "Bike",
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
            moveTo(5.5f, 20.75f)
            curveTo(7.433f, 20.75f, 9f, 19.183f, 9f, 17.25f)
            curveTo(9f, 15.317f, 7.433f, 13.75f, 5.5f, 13.75f)
            curveTo(3.567f, 13.75f, 2f, 15.317f, 2f, 17.25f)
            curveTo(2f, 19.183f, 3.567f, 20.75f, 5.5f, 20.75f)
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
            moveTo(18.5f, 20.75f)
            curveTo(20.433f, 20.75f, 22f, 19.183f, 22f, 17.25f)
            curveTo(22f, 15.317f, 20.433f, 13.75f, 18.5f, 13.75f)
            curveTo(16.567f, 13.75f, 15f, 15.317f, 15f, 17.25f)
            curveTo(15f, 19.183f, 16.567f, 20.75f, 18.5f, 20.75f)
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
            moveTo(11.9986f, 19f)
            verticalLineTo(16.433f)
            curveTo(11.9986f, 15.8816f, 11.9986f, 15.6059f, 11.9272f, 15.3484f)
            curveTo(11.8838f, 15.1918f, 11.821f, 15.0411f, 11.7404f, 14.8997f)
            curveTo(11.6079f, 14.6675f, 11.412f, 14.4725f, 11.0201f, 14.0826f)
            lineTo(10.9325f, 13.9955f)
            curveTo(10.7793f, 13.8431f, 10.6398f, 13.7043f, 10.5132f, 13.5763f)
            moveTo(19.9971f, 11f)
            horizontalLineTo(18.6523f)
            curveTo(17.936f, 11f, 17.5778f, 11f, 17.2526f, 10.8836f)
            curveTo(17.1522f, 10.8477f, 17.0548f, 10.8038f, 16.9615f, 10.7522f)
            curveTo(16.6593f, 10.5854f, 16.3532f, 10.4295f, 15.8814f, 9.89313f)
            lineTo(15.6377f, 9.61598f)
            curveTo(14.8646f, 8.73692f, 14.478f, 8.2974f, 14.0073f, 8.12342f)
            curveTo(13.6378f, 7.98687f, 13.2358f, 7.96302f, 12.8526f, 8.0549f)
            curveTo(12.3644f, 8.17197f, 11.9281f, 8.56267f, 11.0554f, 9.34406f)
            curveTo(10.1519f, 10.1531f, 9.70012f, 10.5576f, 9.53345f, 11.0424f)
            curveTo(9.40273f, 11.4226f, 9.39187f, 11.8334f, 9.50232f, 12.2199f)
            curveTo(9.61806f, 12.6249f, 9.92895f, 12.9858f, 10.5132f, 13.5763f)
            moveTo(14.9717f, 9.63338f)
            lineTo(10.5132f, 13.5763f)
            moveTo(10.5132f, 13.5763f)
            lineTo(10.5121f, 13.5772f)
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
            moveTo(18f, 4.75f)
            arcTo(1.5f, 1.5f, 0f, true, false, 15f, 4.75f)
            arcTo(1.5f, 1.5f, 0f, true, false, 18f, 4.75f)
            close()
        }
        }.build()

        return _bike!!
    }

private var _bike: ImageVector? = null
