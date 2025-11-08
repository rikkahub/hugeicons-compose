package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Crown02: ImageVector
    get() {
        if (_crown02 != null) {
            return _crown02!!
        }
        _crown02 = ImageVector.Builder(
            name = "Crown02",
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
        moveTo(5f, 20f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.99998f, 12f)
        curveTo(6.89541f, 12f, 5.99998f, 11.1046f, 5.99998f, 10f)
        curveTo(5.99998f, 9.78893f, 6.03267f, 9.5855f, 6.09328f, 9.39449f)
        lineTo(3.53967f, 7.22321f)
        curveTo(3.17186f, 6.91046f, 2.61752f, 6.9284f, 2.27193f, 7.26423f)
        curveTo(2.02704f, 7.5022f, 1.93883f, 7.85285f, 2.04312f, 8.17377f)
        lineTo(4.54281f, 15.6353f)
        curveTo(4.81592f, 16.4505f, 5.57947f, 17f, 6.43922f, 17f)
        horizontalLineTo(17.5608f)
        curveTo(18.4205f, 17f, 19.1841f, 16.4505f, 19.4572f, 15.6353f)
        lineTo(21.9569f, 8.17377f)
        curveTo(22.0612f, 7.85285f, 21.973f, 7.5022f, 21.7281f, 7.26423f)
        curveTo(21.3825f, 6.9284f, 20.8281f, 6.91046f, 20.4603f, 7.22321f)
        lineTo(17.9067f, 9.39452f)
        curveTo(17.9673f, 9.58552f, 18f, 9.78894f, 18f, 10f)
        curveTo(18f, 11.1046f, 17.1045f, 12f, 16f, 12f)
        curveTo(14.8954f, 12f, 14f, 11.1046f, 14f, 10f)
        curveTo(14f, 9.36285f, 14.2979f, 8.79529f, 14.7621f, 8.42904f)
        lineTo(12.6923f, 3.46154f)
        curveTo(12.5758f, 3.18205f, 12.3028f, 3f, 12f, 3f)
        curveTo(11.6972f, 3f, 11.4241f, 3.18205f, 11.3077f, 3.46154f)
        lineTo(9.23788f, 8.42904f)
        curveTo(9.70204f, 8.79529f, 9.99998f, 9.36285f, 9.99998f, 10f)
        curveTo(9.99998f, 11.1046f, 9.10455f, 12f, 7.99998f, 12f)
        }
        }.build()

        return _crown02!!
    }

private var _crown02: ImageVector? = null
