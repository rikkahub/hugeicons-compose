package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chart03: ImageVector
    get() {
        if (_chart03 != null) {
            return _chart03!!
        }
        _chart03 = ImageVector.Builder(
            name = "Chart03",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 4f)
        verticalLineTo(14f)
        curveTo(3f, 16.8284f, 3f, 18.2426f, 3.87868f, 19.1213f)
        curveTo(4.75736f, 20f, 6.17157f, 20f, 9f, 20f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 14f)
        lineTo(9.25f, 10.75f)
        curveTo(9.89405f, 10.1059f, 10.2161f, 9.78392f, 10.5927f, 9.67766f)
        curveTo(10.8591f, 9.60254f, 11.1409f, 9.60254f, 11.4073f, 9.67766f)
        curveTo(11.7839f, 9.78392f, 12.1059f, 10.1059f, 12.75f, 10.75f)
        curveTo(13.3941f, 11.3941f, 13.7161f, 11.7161f, 14.0927f, 11.8223f)
        curveTo(14.3591f, 11.8975f, 14.6409f, 11.8975f, 14.9073f, 11.8223f)
        curveTo(15.2839f, 11.7161f, 15.6059f, 11.3941f, 16.25f, 10.75f)
        lineTo(20f, 7f)
        }
        }.build()

        return _chart03!!
    }

private var _chart03: ImageVector? = null
